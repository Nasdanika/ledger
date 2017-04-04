package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.ВычислительКурса;

/**
 * @generated
 */
public interface ВычислительКурсаRenderer<T extends ВычислительКурса> extends ИсточникКурсаАктиваRenderer<T> {
	/**
	 * @generated
	 */
	ВычислительКурсаRenderer<ВычислительКурса> INSTANCE = new ВычислительКурсаRenderer<ВычислительКурса>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ВычислительКурсаRenderer<T>() {

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
		ret.add(ВычислительКурсаRenderer.class);
		ret.addAll(ИсточникКурсаАктиваRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
