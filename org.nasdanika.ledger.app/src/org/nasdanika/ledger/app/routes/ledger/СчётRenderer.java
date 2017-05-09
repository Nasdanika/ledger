package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Счёт;

/**
 * @generated
 */
public interface СчётRenderer<T extends Счёт> extends ЭлементМоделиRenderer<T> {
	/**
	 * @generated
	 */
	СчётRenderer<Счёт> INSTANCE = new СчётRenderer<Счёт>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new СчётRenderer<T>() {

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
		ret.add(СчётRenderer.class);
		ret.addAll(ЭлементМоделиRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

	/**
	 * Убирает либо суб-счета либо проводки в зависимости от того счёт группа или нет.
	 */
	@Override
	default List<EStructuralFeature> getVisibleFeatures(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj,
			FeaturePredicate predicate) throws Exception {

		List<EStructuralFeature> visibleFeatures = ЭлементМоделиRenderer.super.getVisibleFeatures(context, obj,
				predicate);
		visibleFeatures.remove(
				obj.isГруппа() ? LedgerPackage.Literals.СЧЁТ__ПРОВОДКИ : LedgerPackage.Literals.СЧЁТ__СУБ_СЧЕТА);
		return visibleFeatures;
	}

}
