package org.nasdanika.ledger.app;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.CDOTransactionContextProviderComponent;
import org.nasdanika.cdo.security.Realm;
import org.nasdanika.cdo.security.LoginPasswordCredentials;

public class LedgerCDOTransactionContextProviderComponent extends CDOTransactionContextProviderComponent<LoginPasswordCredentials> {

	@SuppressWarnings("unchecked")
	@Override
	protected Realm<LoginPasswordCredentials> getSecurityRealm(CDOTransaction view) {
		String resourcePath = "ledger";
		if (view.hasResource(resourcePath)) {
			CDOResource res = view.getResource(resourcePath);
			if (res!=null) {
				for (EObject e: res.getContents()) {
					if (e instanceof Realm) {
						return (Realm<LoginPasswordCredentials>) e;
					}
				}
			}
		}
		return null;
	}

}
