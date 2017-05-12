package org.nasdanika.ledger.app.routes.ledger;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.RenderAnnotation;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.Renderer.TypedElementLocation;

/**
 * Base interface for renderers defined in the package.
 * @generated
 */
public interface RendererBase<T extends EObject>
		extends Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> {

	/**
	* @generated
	*/
	default LinkedList<Class<?>> getResourceBundleClasses(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		LinkedList<Class<?>> ret = new LinkedList<>();
		ret.add(RendererBase.class);
		ret.addAll(Renderer.super.getResourceBundleClasses(context));
		return ret;

	}

	/**
	 * По умолчанию много-ссылки показываются в табз.
	 */
	@Override
	default org.nasdanika.cdo.web.routes.app.Renderer.TypedElementLocation getTypedElementLocation(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, 
			ETypedElement typedElement) throws Exception {
		
		String typedElementLocationAnnotation = getRenderAnnotation(context, typedElement, RenderAnnotation.TYPED_ELEMENT_LOCATION);
		if (typedElementLocationAnnotation == null && typedElement instanceof EReference && typedElement.isMany()) {
			return TypedElementLocation.item;
		}
		
		return Renderer.super.getTypedElementLocation(context, typedElement);
	}

}
