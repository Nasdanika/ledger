package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.Diagnostic;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Пользователь;

/**
 * @generated
 */
public interface ОперацияRenderer<T extends Операция> extends ЭлементМоделиRenderer<T> {
	/**
	 * @generated
	 */
	ОперацияRenderer<Операция> INSTANCE = new ОперацияRenderer<Операция>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ОперацияRenderer<T>() {

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
		ret.add(ОперацияRenderer.class);
		ret.addAll(ЭлементМоделиRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

	/**
	 * Автоматически устанавливаем создателя операции.
	 */
	@Override
	default boolean setEditableFeatures(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context,
			T obj, Consumer<Diagnostic> diagnosticConsumer) throws Exception {
		for (Principal p : context.getPrincipals()) {
			if (p instanceof Пользователь) {
				obj.setСоздатель((Пользователь) p);
			}
		}
		return ЭлементМоделиRenderer.super.setEditableFeatures(context, obj, diagnosticConsumer);
	}

}
