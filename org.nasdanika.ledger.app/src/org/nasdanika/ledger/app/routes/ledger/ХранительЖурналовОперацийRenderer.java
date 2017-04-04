package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.ХранительЖурналовОпераций;

/**
 * @generated
 */
public interface ХранительЖурналовОперацийRenderer<T extends ХранительЖурналовОпераций>
		extends ЭлементМоделиRenderer<T> {
	/**
	 * @generated
	 */
	ХранительЖурналовОперацийRenderer<ХранительЖурналовОпераций> INSTANCE = new ХранительЖурналовОперацийRenderer<ХранительЖурналовОпераций>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ХранительЖурналовОперацийRenderer<T>() {

			@Override
			public ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> getMasterResourceProvider(
					CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
				return masterResourceProvider;
			}

		};
	}

	/**
	 * @generated
	 */
	@Override
	default LinkedList<Class<?>> getResourceBundleClasses(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		LinkedList<Class<?>> ret = new LinkedList<>();
		ret.add(ХранительЖурналовОперацийRenderer.class);
		ret.addAll(ЭлементМоделиRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
