package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Пользователь;

/**
 * @generated
 */
public interface ПользовательRenderer<T extends Пользователь> extends ХранительЖурналовОперацийRenderer<T> {
	/**
	 * @generated
	 */
	ПользовательRenderer<Пользователь> INSTANCE = new ПользовательRenderer<Пользователь>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ПользовательRenderer<T>() {

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
		ret.add(ПользовательRenderer.class);
		ret.addAll(ХранительЖурналовОперацийRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

	@Override
	default List<EStructuralFeature> getVisibleFeatures(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj,
			FeaturePredicate predicate) throws Exception {
		List<EStructuralFeature> visibleFeatures = ХранительЖурналовОперацийRenderer.super.getVisibleFeatures(context,
				obj, predicate);
		visibleFeatures.remove(SecurityPackage.Literals.PRINCIPAL__MEMBER_OF);
		visibleFeatures.remove(SecurityPackage.Literals.PRINCIPAL__PERMISSIONS);
		visibleFeatures.remove(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH);
		visibleFeatures.remove(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ);
		return visibleFeatures;
	}

}
