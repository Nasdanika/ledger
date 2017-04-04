package org.nasdanika.ledger.app.routes.ledger;

import org.nasdanika.cdo.security.Guest;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;

public interface GuestRenderer extends RendererBase<Guest> {

	
	GuestRenderer INSTANCE = new GuestRenderer() {};	
	
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, Guest> chain(ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider) throws Exception {
		return new GuestRenderer() {
			
			@Override
			public ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> getMasterResourceProvider(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
				return masterResourceProvider;
			}
			
		};
	}	

}