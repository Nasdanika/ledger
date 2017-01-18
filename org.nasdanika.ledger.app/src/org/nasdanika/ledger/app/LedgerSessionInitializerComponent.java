package org.nasdanika.ledger.app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.core.CoreUtil.TokenSource;
import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.УчётныйЦентр;
import org.osgi.service.component.ComponentContext;

public class LedgerSessionInitializerComponent implements CDOSessionInitializer {
	
	private List<String> initialContent = new ArrayList<>();
	
	public void activate(ComponentContext componentContext) {
		Object ic = componentContext.getProperties().get("initial-content");
		TokenSource pts = token -> System.getProperties().get(token);
		if (ic instanceof String) {
			initialContent.add(CoreUtil.interpolate((String) ic, pts));
		} else if (ic instanceof String[]) {
			for (String ice: (String[]) ic) {
				initialContent.add(CoreUtil.interpolate(ice, pts));
			}
		}		
	}	
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(LedgerPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			String resourceName = "/ledger";
			if (!transaction.hasResource(resourceName) ) {
				CDOResource cRes = transaction.createResource("/ledger");
				
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

				resourceSet.getPackageRegistry().put(LedgerPackage.eNS_URI, LedgerPackage.eINSTANCE);

				for (String ic: initialContent) {
					File file = new File(ic);
					if (file.isFile()) {												
						URI uri = URI.createFileURI(file.getAbsolutePath());
						Resource resource = resourceSet.getResource(uri, true);
						System.out.println("Loaded " + uri);
		
						// Retrieve contents
						for (EObject eObject : resource.getContents()) {
							cRes.getContents().add(EcoreUtil.copy(eObject));
						}
					} else {
						System.err.println("Initial content file does not exist or not a file: "+file.getAbsolutePath());
					}
				}
			}
			
			transaction.commit();
			transaction.close();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
