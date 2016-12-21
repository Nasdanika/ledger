package org.nasdanika.ledger.app;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.CDOTransactionContextProviderComponent;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.LoginPasswordCredentials;

public class LedgerCDOTransactionContextProviderComponent extends CDOTransactionContextProviderComponent<LoginPasswordCredentials> {

	@SuppressWarnings("unchecked")
	@Override
	protected ProtectionDomain<LoginPasswordCredentials> getProtectionDomain(CDOTransaction view) {
		String resourcePath = "Ledger";
		if (view.hasResource(resourcePath)) {
			CDOResource res = view.getResource(resourcePath);
			if (res!=null) {
				for (EObject e: res.getContents()) {
					if (e instanceof ProtectionDomain) {
						return (ProtectionDomain<LoginPasswordCredentials>) e;
					}
				}
			}
		}
		return null;
	}

}
