package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.ИсточникКурсаАктива;

/**
 * @generated
 */
public interface ИсточникКурсаАктиваRenderer<T extends ИсточникКурсаАктива> extends RendererBase<T> {
	/**
	 * @generated
	 */
	ИсточникКурсаАктиваRenderer<ИсточникКурсаАктива> INSTANCE = new ИсточникКурсаАктиваRenderer<ИсточникКурсаАктива>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ИсточникКурсаАктиваRenderer<T>() {

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
		ret.add(ИсточникКурсаАктиваRenderer.class);
		ret.addAll(RendererBase.super.getResourceBundleClasses(context));
		return ret;
	}

}
