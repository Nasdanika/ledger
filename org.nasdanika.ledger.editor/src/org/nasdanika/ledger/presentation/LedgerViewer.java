package org.nasdanika.ledger.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * Viewer which uses a form to edit bounded context generator model information.
 * @author Pavel Vlasov
 *
 */
public class LedgerViewer extends Viewer {
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		super.addSelectionChangedListener(listener);
		treeViewer.addSelectionChangedListener(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		super.removeSelectionChangedListener(listener);
		treeViewer.removeSelectionChangedListener(listener);
	}
	
	private LedgerForm ledgerForm;
	private TreeViewer treeViewer;

	public LedgerViewer(LedgerForm ledgerForm) {
		this.ledgerForm = ledgerForm;
		this.treeViewer = new TreeViewer(ledgerForm.getTree());
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			private ScrolledForm formComposite;
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (formComposite != null) {
					formComposite.dispose();
				}

				if (event.getSelection() instanceof StructuredSelection
						&& ((StructuredSelection) event.getSelection()).size() == 1
						&& ((StructuredSelection) event.getSelection()).getFirstElement() instanceof EObject) {
					
					formComposite = ledgerForm.getToolkit().createScrolledForm(ledgerForm.getElementFormComposite()); 
					formComposite.getBody().setLayout(new GridLayout());
					try {
						ECPSWTViewRenderer.INSTANCE.render(formComposite.getBody(), (EObject) ((StructuredSelection) event.getSelection()).getFirstElement());
					} catch (ECPRendererException e) {
						Label lblNewLabel = new Label(formComposite.getBody(), SWT.NONE);
						ledgerForm.getToolkit().adapt(lblNewLabel, true, true);
						lblNewLabel.setText("Error rendering form: "+e);
						
					}
					ledgerForm.getElementFormComposite().layout();
				}
			}
		});
	}
	
	@Override
	public Control getControl() {
		return ledgerForm;
	}
	
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	@Override
	public Object getInput() {
		return treeViewer.getInput();
	}

	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}

	@Override
	public void refresh() {
		treeViewer.refresh();
	}

	@Override
	public void setInput(Object input) {
		treeViewer.setInput(input);
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		treeViewer.setSelection(selection);
	}
	
	

}
