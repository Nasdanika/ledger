/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.html.Theme;
import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ВстроенноеИзображение;
import org.nasdanika.ledger.ВычислительКурса;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.ЗначениеСвойстваАктива;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.КурсАктива;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Организация;
import org.nasdanika.ledger.Пользователь;
import org.nasdanika.ledger.Проводка;
import org.nasdanika.ledger.СвойствоАктива;
import org.nasdanika.ledger.СсылкаНаИзображение;
import org.nasdanika.ledger.Субъект;
import org.nasdanika.ledger.Счёт;
import org.nasdanika.ledger.УчётныйЦентр;
import org.nasdanika.ledger.ФиксированныйКурс;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedgerFactoryImpl extends EFactoryImpl implements LedgerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LedgerFactory init() {
		try {
			LedgerFactory theLedgerFactory = (LedgerFactory)EPackage.Registry.INSTANCE.getEFactory(LedgerPackage.eNS_URI);
			if (theLedgerFactory != null) {
				return theLedgerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LedgerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LedgerPackage.КОММЕНТАРИЙ: return (EObject)createКомментарий();
			case LedgerPackage.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ: return (EObject)createСсылкаНаИзображение();
			case LedgerPackage.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ: return (EObject)createВстроенноеИзображение();
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР: return (EObject)createУчётныйЦентр();
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ: return (EObject)createПользователь();
			case LedgerPackage.ОРГАНИЗАЦИЯ: return (EObject)createОрганизация();
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ: return (EObject)createЖурналОпераций();
			case LedgerPackage.СЧЁТ: return (EObject)createСчёт();
			case LedgerPackage.АКТИВ: return (EObject)createАктив();
			case LedgerPackage.СВОЙСТВО_АКТИВА: return (EObject)createСвойствоАктива();
			case LedgerPackage.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА: return (EObject)createЗначениеСвойстваАктива();
			case LedgerPackage.ФИКСИРОВАННЫЙ_КУРС: return (EObject)createФиксированныйКурс();
			case LedgerPackage.ВЫЧИСЛИТЕЛЬ_КУРСА: return (EObject)createВычислительКурса();
			case LedgerPackage.ОПЕРАЦИЯ: return (EObject)createОперация();
			case LedgerPackage.ПРОВОДКА: return (EObject)createПроводка();
			case LedgerPackage.СУБЪЕКТ: return (EObject)createСубъект();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LedgerPackage.THEME:
				return createThemeFromString(eDataType, initialValue);
			case LedgerPackage.КУРС_АКТИВА:
				return createКурсАктиваFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LedgerPackage.THEME:
				return convertThemeToString(eDataType, instanceValue);
			case LedgerPackage.КУРС_АКТИВА:
				return convertКурсАктиваToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ЖурналОпераций createЖурналОпераций() {
		ЖурналОперацийImpl журналОпераций = new ЖурналОперацийImpl();
		return журналОпераций;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public УчётныйЦентр createУчётныйЦентр() {
		УчётныйЦентрImpl учётныйЦентр = new УчётныйЦентрImpl();
		return учётныйЦентр;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Пользователь createПользователь() {
		ПользовательImpl пользователь = new ПользовательImpl();
		return пользователь;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Организация createОрганизация() {
		ОрганизацияImpl организация = new ОрганизацияImpl();
		return организация;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Счёт createСчёт() {
		СчётImpl счёт = new СчётImpl();
		return счёт;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Актив createАктив() {
		АктивImpl актив = new АктивImpl();
		return актив;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public СвойствоАктива createСвойствоАктива() {
		СвойствоАктиваImpl свойствоАктива = new СвойствоАктиваImpl();
		return свойствоАктива;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ЗначениеСвойстваАктива createЗначениеСвойстваАктива() {
		ЗначениеСвойстваАктиваImpl значениеСвойстваАктива = new ЗначениеСвойстваАктиваImpl();
		return значениеСвойстваАктива;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ФиксированныйКурс createФиксированныйКурс() {
		ФиксированныйКурсImpl фиксированныйКурс = new ФиксированныйКурсImpl();
		return фиксированныйКурс;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ВычислительКурса createВычислительКурса() {
		ВычислительКурсаImpl вычислительКурса = new ВычислительКурсаImpl();
		return вычислительКурса;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Операция createОперация() {
		ОперацияImpl операция = new ОперацияImpl();
		return операция;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Проводка createПроводка() {
		ПроводкаImpl проводка = new ПроводкаImpl();
		return проводка;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Субъект createСубъект() {
		СубъектImpl субъект = new СубъектImpl();
		return субъект;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createThemeFromString(EDataType eDataType, String initialValue) {
		return (Theme)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThemeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public КурсАктива createКурсАктиваFromString(EDataType eDataType, String initialValue) {
		return (КурсАктива)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertКурсАктиваToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Комментарий createКомментарий() {
		КомментарийImpl комментарий = new КомментарийImpl();
		return комментарий;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public СсылкаНаИзображение createСсылкаНаИзображение() {
		СсылкаНаИзображениеImpl ссылкаНаИзображение = new СсылкаНаИзображениеImpl();
		return ссылкаНаИзображение;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ВстроенноеИзображение createВстроенноеИзображение() {
		ВстроенноеИзображениеImpl встроенноеИзображение = new ВстроенноеИзображениеImpl();
		return встроенноеИзображение;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerPackage getLedgerPackage() {
		return (LedgerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LedgerPackage getPackage() {
		return LedgerPackage.eINSTANCE;
	}

} //LedgerFactoryImpl
