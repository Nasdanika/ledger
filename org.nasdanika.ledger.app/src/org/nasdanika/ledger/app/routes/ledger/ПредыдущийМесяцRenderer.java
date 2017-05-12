package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.ПредыдущийМесяц;

/**
 * @generated
 */
public interface ПредыдущийМесяцRenderer<T extends ПредыдущийМесяц> extends ОтчётныйПериодRenderer<T> {
	/**
	 * @generated
	 */
	ПредыдущийМесяцRenderer<ПредыдущийМесяц> INSTANCE = new ПредыдущийМесяцRenderer<ПредыдущийМесяц>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ПредыдущийМесяцRenderer<T>() {

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
		ret.add(ПредыдущийМесяцRenderer.class);
		ret.addAll(ОтчётныйПериодRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
