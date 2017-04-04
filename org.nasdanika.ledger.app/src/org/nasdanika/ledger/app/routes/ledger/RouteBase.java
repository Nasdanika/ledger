package org.nasdanika.ledger.app.routes.ledger;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Route;
import org.osgi.framework.FrameworkUtil;

/**
 * Base class for routes defined in the package.
 * @generated
 */
public class RouteBase<T extends EObject>
		extends Route<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> implements RendererBase<T> {
	/**
	 * @generated
	 */
	protected RouteBase() throws Exception {
		super(FrameworkUtil.getBundle(CDOTransactionHttpServletRequestContext.class).getBundleContext());

	}

}
