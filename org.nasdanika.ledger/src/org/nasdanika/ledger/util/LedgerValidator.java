/**
 */
package org.nasdanika.ledger.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.nasdanika.ledger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.ledger.LedgerPackage
 * @generated
 */
public class LedgerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LedgerValidator INSTANCE = new LedgerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.ledger";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Элемент Модели'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ЭЛЕМЕНТ_МОДЕЛИ__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LedgerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ:
				return validateЭлементМодели((ЭлементМодели)value, diagnostics, context);
			case LedgerPackage.КОММЕНТАРИЙ:
				return validateКомментарий((Комментарий)value, diagnostics, context);
			case LedgerPackage.ИЗОБРАЖЕНИЕ:
				return validateИзображение((Изображение)value, diagnostics, context);
			case LedgerPackage.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ:
				return validateСсылкаНаИзображение((СсылкаНаИзображение)value, diagnostics, context);
			case LedgerPackage.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ:
				return validateВстроенноеИзображение((ВстроенноеИзображение)value, diagnostics, context);
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР:
				return validateУчётныйЦентр((УчётныйЦентр)value, diagnostics, context);
			case LedgerPackage.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ:
				return validateХранительЖурналовОпераций((ХранительЖурналовОпераций)value, diagnostics, context);
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ:
				return validateПользователь((Пользователь)value, diagnostics, context);
			case LedgerPackage.ОРГАНИЗАЦИЯ:
				return validateОрганизация((Организация)value, diagnostics, context);
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ:
				return validateЖурналОпераций((ЖурналОпераций)value, diagnostics, context);
			case LedgerPackage.СЧЁТ:
				return validateСчёт((Счёт)value, diagnostics, context);
			case LedgerPackage.АКТИВ:
				return validateАктив((Актив)value, diagnostics, context);
			case LedgerPackage.СВОЙСТВО_АКТИВА:
				return validateСвойствоАктива((СвойствоАктива)value, diagnostics, context);
			case LedgerPackage.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА:
				return validateЗначениеСвойстваАктива((ЗначениеСвойстваАктива)value, diagnostics, context);
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА:
				return validateИсточникКурсаАктива((ИсточникКурсаАктива)value, diagnostics, context);
			case LedgerPackage.ФИКСИРОВАННЫЙ_КУРС:
				return validateФиксированныйКурс((ФиксированныйКурс)value, diagnostics, context);
			case LedgerPackage.ВЫЧИСЛИТЕЛЬ_КУРСА:
				return validateВычислительКурса((ВычислительКурса)value, diagnostics, context);
			case LedgerPackage.ОПЕРАЦИЯ:
				return validateОперация((Операция)value, diagnostics, context);
			case LedgerPackage.ПРОВОДКА:
				return validateПроводка((Проводка)value, diagnostics, context);
			case LedgerPackage.СУБЪЕКТ:
				return validateСубъект((Субъект)value, diagnostics, context);
			case LedgerPackage.КУРС_АКТИВА:
				return validateКурсАктива((КурсАктива)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateЭлементМодели(ЭлементМодели элементМодели, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)элементМодели, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)элементМодели, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(элементМодели, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Элемент Модели</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateЭлементМодели_validate(ЭлементМодели элементМодели, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return элементМодели.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateКомментарий(Комментарий комментарий, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)комментарий, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateИзображение(Изображение изображение, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)изображение, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateСсылкаНаИзображение(СсылкаНаИзображение ссылкаНаИзображение, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)ссылкаНаИзображение, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateВстроенноеИзображение(ВстроенноеИзображение встроенноеИзображение, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)встроенноеИзображение, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateУчётныйЦентр(УчётныйЦентр учётныйЦентр, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)учётныйЦентр, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)учётныйЦентр, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(учётныйЦентр, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateХранительЖурналовОпераций(ХранительЖурналовОпераций хранительЖурналовОпераций, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)хранительЖурналовОпераций, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)хранительЖурналовОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(хранительЖурналовОпераций, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateПользователь(Пользователь пользователь, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)пользователь, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)пользователь, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(пользователь, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateОрганизация(Организация организация, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)организация, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)организация, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(организация, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateЖурналОпераций(ЖурналОпераций журналОпераций, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)журналОпераций, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)журналОпераций, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(журналОпераций, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateСчёт(Счёт счёт, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)счёт, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)счёт, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(счёт, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateАктив(Актив актив, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)актив, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)актив, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(актив, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateСвойствоАктива(СвойствоАктива свойствоАктива, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)свойствоАктива, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateЗначениеСвойстваАктива(ЗначениеСвойстваАктива значениеСвойстваАктива, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)значениеСвойстваАктива, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateИсточникКурсаАктива(ИсточникКурсаАктива источникКурсаАктива, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)источникКурсаАктива, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateФиксированныйКурс(ФиксированныйКурс фиксированныйКурс, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)фиксированныйКурс, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateВычислительКурса(ВычислительКурса вычислительКурса, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)вычислительКурса, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateОперация(Операция операция, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)операция, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)операция, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(операция, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateПроводка(Проводка проводка, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)проводка, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)проводка, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(проводка, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateСубъект(Субъект субъект, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)субъект, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)субъект, diagnostics, context);
		if (result || diagnostics != null) result &= validateЭлементМодели_validate(субъект, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateКурсАктива(КурсАктива курсАктива, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LedgerValidator
