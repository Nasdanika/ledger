package org.nasdanika.ledger.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.УчётныйЦентр;

public class LedgerSessionInitializerComponent implements CDOSessionInitializer {
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(LedgerPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			CDOResource cRes = transaction.getOrCreateResource("/ledger");
			if (cRes.getContents().isEmpty()) {
				УчётныйЦентр учётныйЦентр = LedgerFactory.eINSTANCE.createУчётныйЦентр();
				учётныйЦентр.setНаименование("Митрофановна");
				cRes.getContents().add(учётныйЦентр);
				// Create initial content
				// TODO - Ledger rootElement = LedgerFactory.eINSTANCE.createLedger();
				// TODO - configure root and add sub-elements
				// TODO - cRes.getContents().add(rootElement);
			}
			
			transaction.commit();
			transaction.close();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
