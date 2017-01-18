package org.nasdanika.ledger.presentation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.LoginPasswordRealm;

public abstract class SetPasswordAction extends Action implements ISelectionChangedListener {
	
	private TransactionalEditingDomain editingDomain;

	public void setEditingDomain(TransactionalEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}
	
	private ArrayList<LoginPasswordHashUser> selectedLoginPasswordHashUsers;

	public SetPasswordAction(String name) {
		super(name);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
	    if (event.getSelection() instanceof IStructuredSelection) {
	      setEnabled(updateSelection((IStructuredSelection) event.getSelection()));
	    } else {
	      setEnabled(false);
	    }
	}
	
	public boolean updateSelection(IStructuredSelection selection) {
		selectedLoginPasswordHashUsers = new ArrayList<>();
		for (Iterator<?> objects = selection.iterator(); objects.hasNext();) {
			Object object = AdapterFactoryEditingDomain.unwrap(objects.next());
			if (object instanceof LoginPasswordHashUser) {
				selectedLoginPasswordHashUsers.add((LoginPasswordHashUser) object);
			} else if (object instanceof Resource) {
				for (EObject c: ((Resource) object).getContents()) {
					if (c instanceof LoginPasswordHashUser) {
						selectedLoginPasswordHashUsers.add((LoginPasswordHashUser) c);						
					}
				}
			} else {
				return false;
			}
		}
		return !selectedLoginPasswordHashUsers.isEmpty();
	}	
	
	@Override
	public void run() {
		if (!selectedLoginPasswordHashUsers.isEmpty()) {
			IWorkbench workbench = PlatformUI.getWorkbench();
			Shell shell = workbench.getModalDialogShellProvider().getShell();
			
		    InputDialog id = new InputDialog(shell, "Set password",  "New password", null, null);
	        if (id.open() == Window.OK) {
	        	
	        	RecordingCommand setPasswordCommand = new RecordingCommand(editingDomain, "Set password") {
					
					@Override
					protected void doExecute() {
						for (LoginPasswordHashUser lphu: selectedLoginPasswordHashUsers) {
							((LoginPasswordRealm) lphu.getRealm()).setPasswordHash(lphu, id.getValue());
						}
					}
					
				};
				editingDomain.getCommandStack().execute(setPasswordCommand);
	        }																		
		}
	}

}
