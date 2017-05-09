package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;

/**
 * @generated
 */
public interface АктивRenderer<T extends Актив> extends ЭлементМоделиRenderer<T> {
	/**
	 * @generated
	 */
	АктивRenderer<Актив> INSTANCE = new АктивRenderer<Актив>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new АктивRenderer<T>() {

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
		ret.add(АктивRenderer.class);
		ret.addAll(ЭлементМоделиRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

	@Override
	default List<EStructuralFeature> getVisibleFeatures(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj,
			org.nasdanika.cdo.web.routes.app.Renderer.FeaturePredicate predicate) throws Exception {
		List<EStructuralFeature> visibleFeatures = ЭлементМоделиRenderer.super.getVisibleFeatures(context, obj,
				predicate);
		visibleFeatures.remove(
				obj.isГруппа() ? LedgerPackage.Literals.АКТИВ__ПРОВОДКИ : LedgerPackage.Literals.АКТИВ__СУБ_АКТИВЫ);
		return visibleFeatures;
	}

}
