package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.Diagnostic;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.Пользователь;

/**
 * @generated
 */
public interface КомментарийRenderer<T extends Комментарий> extends RendererBase<T> {
	/**
	 * @generated
	 */
	КомментарийRenderer<Комментарий> INSTANCE = new КомментарийRenderer<Комментарий>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new КомментарийRenderer<T>() {

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
		ret.add(КомментарийRenderer.class);
		ret.addAll(RendererBase.super.getResourceBundleClasses(context));
		return ret;
	}

	@Override
	default boolean setEditableFeatures(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context,
			T obj, Consumer<Diagnostic> diagnosticConsumer) throws Exception {
		for (Principal p : context.getPrincipals()) {
			if (p instanceof Пользователь) {
				obj.setАвтор((Пользователь) p);
			}
		}
		return RendererBase.super.setEditableFeatures(context, obj, diagnosticConsumer);
	}

}
