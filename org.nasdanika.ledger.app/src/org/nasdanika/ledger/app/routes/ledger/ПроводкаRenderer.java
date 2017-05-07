package org.nasdanika.ledger.app.routes.ledger;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.html.FieldContainer;
import org.nasdanika.html.Modal;
import org.nasdanika.html.Select;
import org.nasdanika.html.UIElement;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Проводка;

/**
 * @generated
 */
public interface ПроводкаRenderer<T extends Проводка> extends ЭлементМоделиRenderer<T> {
	/**
	 * @generated
	 */
	ПроводкаRenderer<Проводка> INSTANCE = new ПроводкаRenderer<Проводка>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ПроводкаRenderer<T>() {

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
		ret.add(ПроводкаRenderer.class);
		ret.addAll(ЭлементМоделиRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

	/**
	 * Счёт и актив привязаны к KnockoutJS модели чтобы список астивов содержал активы поддерживаемые счётом.
	 */
	@Override
	default <TE extends ETypedElement> UIElement<?> renderTypedElementControl(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj, TE typedElement,
			Collection<TE> typedElements, Object value, FieldContainer<?> fieldContainer, Modal docModal,
			List<ValidationResult> validationResults, boolean helpTooltip) throws Exception {

		UIElement<?> control = ЭлементМоделиRenderer.super.renderTypedElementControl(context, obj, typedElement,
				typedElements, value, fieldContainer, docModal, validationResults, helpTooltip);

		if (LedgerPackage.Literals.ПРОВОДКА__СЧЁТ == typedElement) {
			((Select) control).knockout().bind("value", "счёт", "\'" + value + "\'");
		} else if (LedgerPackage.Literals.ПРОВОДКА__АКТИВ == typedElement) {
			((Select) control)
				.knockout().bind("options", "активыСчёта", null)
				.knockout().bind("optionsText", "'name'", null)
				.knockout().bind("optionsValue", "'cdoId'", null);
		}

		return control;
	}

}
