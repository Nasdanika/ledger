/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.html.Theme;
import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ВстроенноеИзображение;
import org.nasdanika.ledger.ВычислительКурса;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.ЗначениеСвойстваАктива;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.ИсточникКурсаАктива;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.КурсАктива;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Организация;
import org.nasdanika.ledger.ОтчётныйПериод;
import org.nasdanika.ledger.Пользователь;
import org.nasdanika.ledger.ПредыдущийГод;
import org.nasdanika.ledger.ПредыдущийМесяц;
import org.nasdanika.ledger.Проводка;
import org.nasdanika.ledger.СвойствоАктива;
import org.nasdanika.ledger.СсылкаНаИзображение;
import org.nasdanika.ledger.Субъект;
import org.nasdanika.ledger.Счёт;
import org.nasdanika.ledger.ТекущийГод;
import org.nasdanika.ledger.ТекущийМесяц;
import org.nasdanika.ledger.УчётныйЦентр;
import org.nasdanika.ledger.ФиксированныйКурс;
import org.nasdanika.ledger.ФиксированныйОтчётныйПериод;
import org.nasdanika.ledger.ХранительЖурналовОпераций;
import org.nasdanika.ledger.ЭлементМодели;
import org.nasdanika.ledger.util.LedgerValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedgerPackageImpl extends EPackageImpl implements LedgerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass журналОперацийEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass учётныйЦентрEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass элементМоделиEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass пользовательEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass организацияEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass хранительЖурналовОперацийEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass счётEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass активEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass свойствоАктиваEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass значениеСвойстваАктиваEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass источникКурсаАктиваEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass фиксированныйКурсEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass вычислительКурсаEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass операцияEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass проводкаEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass субъектEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass отчётныйПериодEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass предыдущийМесяцEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass предыдущийГодEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass текущийМесяцEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass текущийГодEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass фиксированныйОтчётныйПериодEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType themeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType курсАктиваEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass комментарийEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass изображениеEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ссылкаНаИзображениеEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass встроенноеИзображениеEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.ledger.LedgerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LedgerPackageImpl() {
		super(eNS_URI, LedgerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LedgerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LedgerPackage init() {
		if (isInited) return (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Obtain or create and register package
		LedgerPackageImpl theLedgerPackage = (LedgerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LedgerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LedgerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SecurityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLedgerPackage.createPackageContents();

		// Initialize created meta-data
		theLedgerPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLedgerPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LedgerValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLedgerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LedgerPackage.eNS_URI, theLedgerPackage);
		return theLedgerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЖурналОпераций() {
		return журналОперацийEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_Операции() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_Активы() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_Счета() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_Субъекты() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_ОтчётныеАктивы() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЖурналОпераций_ОтчётныеПериоды() {
		return (EReference)журналОперацийEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getУчётныйЦентр() {
		return учётныйЦентрEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getУчётныйЦентр_ХранителиЖурналовОпераций() {
		return (EReference)учётныйЦентрEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЭлементМодели() {
		return элементМоделиEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЭлементМодели_Наименование() {
		return (EAttribute)элементМоделиEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЭлементМодели_Описание() {
		return (EAttribute)элементМоделиEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЭлементМодели_Комментарии() {
		return (EReference)элементМоделиEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЭлементМодели_Изображение() {
		return (EReference)элементМоделиEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЭлементМодели_Идентификатор() {
		return (EAttribute)элементМоделиEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getЭлементМодели__Validate__DiagnosticChain_Map() {
		return элементМоделиEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getПользователь() {
		return пользовательEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getПользователь_Theme() {
		return (EAttribute)пользовательEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getОрганизация() {
		return организацияEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getХранительЖурналовОпераций() {
		return хранительЖурналовОперацийEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getХранительЖурналовОпераций_ЖурналыОпераций() {
		return (EReference)хранительЖурналовОперацийEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getСчёт() {
		return счётEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getСчёт_СубСчета() {
		return (EReference)счётEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getСчёт_Активы() {
		return (EReference)счётEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getСчёт_Проводки() {
		return (EReference)счётEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСчёт_Группа() {
		return (EAttribute)счётEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getАктив() {
		return активEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getАктив_ИсточникиКурсов() {
		return (EReference)активEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getАктив_СубАктивы() {
		return (EReference)активEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getАктив_Точность() {
		return (EAttribute)активEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getАктив_Свойства() {
		return (EReference)активEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getАктив_Счета() {
		return (EReference)активEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getАктив_Проводки() {
		return (EReference)активEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getАктив_ЕдиницаИзмерения() {
		return (EAttribute)активEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getАктив_Группа() {
		return (EAttribute)активEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getСвойствоАктива() {
		return свойствоАктиваEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСвойствоАктива_Наименование() {
		return (EAttribute)свойствоАктиваEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСвойствоАктива_Описание() {
		return (EAttribute)свойствоАктиваEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСвойствоАктива_Тип() {
		return (EAttribute)свойствоАктиваEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСвойствоАктива_НижняяГраница() {
		return (EAttribute)свойствоАктиваEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСвойствоАктива_ВерхняяГраница() {
		return (EAttribute)свойствоАктиваEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЗначениеСвойстваАктива() {
		return значениеСвойстваАктиваEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЗначениеСвойстваАктива_Свойство() {
		return (EReference)значениеСвойстваАктиваEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЗначениеСвойстваАктива_Значения() {
		return (EAttribute)значениеСвойстваАктиваEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getИсточникКурсаАктива() {
		return источникКурсаАктиваEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getИсточникКурсаАктива_НачалоПериодаДействия() {
		return (EAttribute)источникКурсаАктиваEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getИсточникКурсаАктива_КонецПериодаДействия() {
		return (EAttribute)источникКурсаАктиваEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getИсточникКурсаАктива_БазовыйАктив() {
		return (EReference)источникКурсаАктиваEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getИсточникКурсаАктива_Комментарий() {
		return (EAttribute)источникКурсаАктиваEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList() {
		return источникКурсаАктиваEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getФиксированныйКурс() {
		return фиксированныйКурсEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getФиксированныйКурс_Курс() {
		return (EAttribute)фиксированныйКурсEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getВычислительКурса() {
		return вычислительКурсаEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getВычислительКурса_Код() {
		return (EAttribute)вычислительКурсаEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getОперация() {
		return операцияEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getОперация_ДатаОперации() {
		return (EAttribute)операцияEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getОперация_Проводки() {
		return (EReference)операцияEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getОперация_Создатель() {
		return (EReference)операцияEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getОперация_ПервичныйВвод() {
		return (EAttribute)операцияEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getОперация_Субъекты() {
		return (EReference)операцияEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getПроводка() {
		return проводкаEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getПроводка_ДатаПроводки() {
		return (EAttribute)проводкаEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getПроводка_Сверено() {
		return (EAttribute)проводкаEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getПроводка_Счёт() {
		return (EReference)проводкаEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getПроводка_Актив() {
		return (EReference)проводкаEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getПроводка_Количество() {
		return (EAttribute)проводкаEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getПроводка_ЗначенияСвойствАктива() {
		return (EReference)проводкаEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getПроводка_БалансирующаяПроводка() {
		return (EAttribute)проводкаEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getСубъект() {
		return субъектEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getСубъект_Операции() {
		return (EReference)субъектEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getОтчётныйПериод() {
		return отчётныйПериодEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getОтчётныйПериод__GetНачалоПериода() {
		return отчётныйПериодEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getОтчётныйПериод__GetКонецПериода() {
		return отчётныйПериодEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getПредыдущийМесяц() {
		return предыдущийМесяцEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getПредыдущийГод() {
		return предыдущийГодEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getТекущийМесяц() {
		return текущийМесяцEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getТекущийГод() {
		return текущийГодEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getФиксированныйОтчётныйПериод() {
		return фиксированныйОтчётныйПериодEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getФиксированныйОтчётныйПериод_НачалоПериода() {
		return (EAttribute)фиксированныйОтчётныйПериодEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getФиксированныйОтчётныйПериод_КонецПериода() {
		return (EAttribute)фиксированныйОтчётныйПериодEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTheme() {
		return themeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getКурсАктива() {
		return курсАктиваEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getКомментарий() {
		return комментарийEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getКомментарий_Автор() {
		return (EReference)комментарийEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getКомментарий_Содержание() {
		return (EAttribute)комментарийEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getКомментарий_Дата() {
		return (EAttribute)комментарийEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getИзображение() {
		return изображениеEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getСсылкаНаИзображение() {
		return ссылкаНаИзображениеEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getСсылкаНаИзображение_Ссылка() {
		return (EAttribute)ссылкаНаИзображениеEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getВстроенноеИзображение() {
		return встроенноеИзображениеEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getВстроенноеИзображение_Содержание() {
		return (EAttribute)встроенноеИзображениеEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getВстроенноеИзображение_Формат() {
		return (EAttribute)встроенноеИзображениеEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerFactory getLedgerFactory() {
		return (LedgerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		элементМоделиEClass = createEClass(ЭЛЕМЕНТ_МОДЕЛИ);
		createEAttribute(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ);
		createEAttribute(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ);
		createEReference(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ);
		createEReference(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ);
		createEAttribute(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР);
		createEOperation(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ___VALIDATE__DIAGNOSTICCHAIN_MAP);

		комментарийEClass = createEClass(КОММЕНТАРИЙ);
		createEReference(комментарийEClass, КОММЕНТАРИЙ__АВТОР);
		createEAttribute(комментарийEClass, КОММЕНТАРИЙ__СОДЕРЖАНИЕ);
		createEAttribute(комментарийEClass, КОММЕНТАРИЙ__ДАТА);

		изображениеEClass = createEClass(ИЗОБРАЖЕНИЕ);

		ссылкаНаИзображениеEClass = createEClass(ССЫЛКА_НА_ИЗОБРАЖЕНИЕ);
		createEAttribute(ссылкаНаИзображениеEClass, ССЫЛКА_НА_ИЗОБРАЖЕНИЕ__ССЫЛКА);

		встроенноеИзображениеEClass = createEClass(ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ);
		createEAttribute(встроенноеИзображениеEClass, ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__СОДЕРЖАНИЕ);
		createEAttribute(встроенноеИзображениеEClass, ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__ФОРМАТ);

		учётныйЦентрEClass = createEClass(УЧЁТНЫЙ_ЦЕНТР);
		createEReference(учётныйЦентрEClass, УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ);

		хранительЖурналовОперацийEClass = createEClass(ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ);
		createEReference(хранительЖурналовОперацийEClass, ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ);

		пользовательEClass = createEClass(ПОЛЬЗОВАТЕЛЬ);
		createEAttribute(пользовательEClass, ПОЛЬЗОВАТЕЛЬ__THEME);

		организацияEClass = createEClass(ОРГАНИЗАЦИЯ);

		журналОперацийEClass = createEClass(ЖУРНАЛ_ОПЕРАЦИЙ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__СЧЕТА);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_АКТИВЫ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ);
		createEReference(журналОперацийEClass, ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_ПЕРИОДЫ);

		счётEClass = createEClass(СЧЁТ);
		createEAttribute(счётEClass, СЧЁТ__ГРУППА);
		createEReference(счётEClass, СЧЁТ__СУБ_СЧЕТА);
		createEReference(счётEClass, СЧЁТ__АКТИВЫ);
		createEReference(счётEClass, СЧЁТ__ПРОВОДКИ);

		активEClass = createEClass(АКТИВ);
		createEReference(активEClass, АКТИВ__ИСТОЧНИКИ_КУРСОВ);
		createEAttribute(активEClass, АКТИВ__ГРУППА);
		createEReference(активEClass, АКТИВ__СУБ_АКТИВЫ);
		createEAttribute(активEClass, АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ);
		createEAttribute(активEClass, АКТИВ__ТОЧНОСТЬ);
		createEReference(активEClass, АКТИВ__СВОЙСТВА);
		createEReference(активEClass, АКТИВ__СЧЕТА);
		createEReference(активEClass, АКТИВ__ПРОВОДКИ);

		свойствоАктиваEClass = createEClass(СВОЙСТВО_АКТИВА);
		createEAttribute(свойствоАктиваEClass, СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ);
		createEAttribute(свойствоАктиваEClass, СВОЙСТВО_АКТИВА__ОПИСАНИЕ);
		createEAttribute(свойствоАктиваEClass, СВОЙСТВО_АКТИВА__ТИП);
		createEAttribute(свойствоАктиваEClass, СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА);
		createEAttribute(свойствоАктиваEClass, СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА);

		значениеСвойстваАктиваEClass = createEClass(ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА);
		createEReference(значениеСвойстваАктиваEClass, ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__СВОЙСТВО);
		createEAttribute(значениеСвойстваАктиваEClass, ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__ЗНАЧЕНИЯ);

		источникКурсаАктиваEClass = createEClass(ИСТОЧНИК_КУРСА_АКТИВА);
		createEAttribute(источникКурсаАктиваEClass, ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ);
		createEAttribute(источникКурсаАктиваEClass, ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ);
		createEReference(источникКурсаАктиваEClass, ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ);
		createEAttribute(источникКурсаАктиваEClass, ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ);
		createEOperation(источникКурсаАктиваEClass, ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST);

		фиксированныйКурсEClass = createEClass(ФИКСИРОВАННЫЙ_КУРС);
		createEAttribute(фиксированныйКурсEClass, ФИКСИРОВАННЫЙ_КУРС__КУРС);

		вычислительКурсаEClass = createEClass(ВЫЧИСЛИТЕЛЬ_КУРСА);
		createEAttribute(вычислительКурсаEClass, ВЫЧИСЛИТЕЛЬ_КУРСА__КОД);

		операцияEClass = createEClass(ОПЕРАЦИЯ);
		createEAttribute(операцияEClass, ОПЕРАЦИЯ__ДАТА_ОПЕРАЦИИ);
		createEAttribute(операцияEClass, ОПЕРАЦИЯ__ПЕРВИЧНЫЙ_ВВОД);
		createEReference(операцияEClass, ОПЕРАЦИЯ__ПРОВОДКИ);
		createEReference(операцияEClass, ОПЕРАЦИЯ__СОЗДАТЕЛЬ);
		createEReference(операцияEClass, ОПЕРАЦИЯ__СУБЪЕКТЫ);

		проводкаEClass = createEClass(ПРОВОДКА);
		createEAttribute(проводкаEClass, ПРОВОДКА__ДАТА_ПРОВОДКИ);
		createEReference(проводкаEClass, ПРОВОДКА__СЧЁТ);
		createEReference(проводкаEClass, ПРОВОДКА__АКТИВ);
		createEAttribute(проводкаEClass, ПРОВОДКА__КОЛИЧЕСТВО);
		createEAttribute(проводкаEClass, ПРОВОДКА__СВЕРЕНО);
		createEAttribute(проводкаEClass, ПРОВОДКА__БАЛАНСИРУЮЩАЯ_ПРОВОДКА);
		createEReference(проводкаEClass, ПРОВОДКА__ЗНАЧЕНИЯ_СВОЙСТВ_АКТИВА);

		субъектEClass = createEClass(СУБЪЕКТ);
		createEReference(субъектEClass, СУБЪЕКТ__ОПЕРАЦИИ);

		отчётныйПериодEClass = createEClass(ОТЧЁТНЫЙ_ПЕРИОД);
		createEOperation(отчётныйПериодEClass, ОТЧЁТНЫЙ_ПЕРИОД___GET_НАЧАЛО_ПЕРИОДА);
		createEOperation(отчётныйПериодEClass, ОТЧЁТНЫЙ_ПЕРИОД___GET_КОНЕЦ_ПЕРИОДА);

		предыдущийМесяцEClass = createEClass(ПРЕДЫДУЩИЙ_МЕСЯЦ);

		предыдущийГодEClass = createEClass(ПРЕДЫДУЩИЙ_ГОД);

		текущийМесяцEClass = createEClass(ТЕКУЩИЙ_МЕСЯЦ);

		текущийГодEClass = createEClass(ТЕКУЩИЙ_ГОД);

		фиксированныйОтчётныйПериодEClass = createEClass(ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД);
		createEAttribute(фиксированныйОтчётныйПериодEClass, ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__НАЧАЛО_ПЕРИОДА);
		createEAttribute(фиксированныйОтчётныйПериодEClass, ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__КОНЕЦ_ПЕРИОДА);

		// Create data types
		themeEDataType = createEDataType(THEME);
		курсАктиваEDataType = createEDataType(КУРС_АКТИВА);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ссылкаНаИзображениеEClass.getESuperTypes().add(this.getИзображение());
		встроенноеИзображениеEClass.getESuperTypes().add(this.getИзображение());
		учётныйЦентрEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordRealm());
		учётныйЦентрEClass.getESuperTypes().add(this.getЭлементМодели());
		хранительЖурналовОперацийEClass.getESuperTypes().add(this.getЭлементМодели());
		пользовательEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordHashUser());
		пользовательEClass.getESuperTypes().add(this.getХранительЖурналовОпераций());
		организацияEClass.getESuperTypes().add(this.getХранительЖурналовОпераций());
		журналОперацийEClass.getESuperTypes().add(this.getЭлементМодели());
		счётEClass.getESuperTypes().add(this.getЭлементМодели());
		активEClass.getESuperTypes().add(this.getЭлементМодели());
		фиксированныйКурсEClass.getESuperTypes().add(this.getИсточникКурсаАктива());
		вычислительКурсаEClass.getESuperTypes().add(this.getИсточникКурсаАктива());
		операцияEClass.getESuperTypes().add(this.getЭлементМодели());
		проводкаEClass.getESuperTypes().add(this.getЭлементМодели());
		субъектEClass.getESuperTypes().add(this.getЭлементМодели());
		предыдущийМесяцEClass.getESuperTypes().add(this.getОтчётныйПериод());
		предыдущийГодEClass.getESuperTypes().add(this.getОтчётныйПериод());
		текущийМесяцEClass.getESuperTypes().add(this.getОтчётныйПериод());
		текущийГодEClass.getESuperTypes().add(this.getОтчётныйПериод());
		фиксированныйОтчётныйПериодEClass.getESuperTypes().add(this.getОтчётныйПериод());

		// Initialize classes, features, and operations; add parameters
		initEClass(элементМоделиEClass, ЭлементМодели.class, "ЭлементМодели", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getЭлементМодели_Наименование(), ecorePackage.getEString(), "наименование", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getЭлементМодели_Описание(), ecorePackage.getEString(), "описание", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЭлементМодели_Комментарии(), this.getКомментарий(), null, "комментарии", null, 0, -1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЭлементМодели_Изображение(), this.getИзображение(), null, "изображение", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getЭлементМодели_Идентификатор(), ecorePackage.getEString(), "идентификатор", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getЭлементМодели__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(комментарийEClass, Комментарий.class, "Комментарий", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getКомментарий_Автор(), this.getПользователь(), null, "автор", null, 1, 1, Комментарий.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getКомментарий_Содержание(), ecorePackage.getEString(), "содержание", null, 1, 1, Комментарий.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getКомментарий_Дата(), ecorePackage.getEDate(), "дата", null, 0, 1, Комментарий.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(изображениеEClass, Изображение.class, "Изображение", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ссылкаНаИзображениеEClass, СсылкаНаИзображение.class, "СсылкаНаИзображение", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getСсылкаНаИзображение_Ссылка(), ecorePackage.getEString(), "ссылка", null, 0, 1, СсылкаНаИзображение.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(встроенноеИзображениеEClass, ВстроенноеИзображение.class, "ВстроенноеИзображение", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getВстроенноеИзображение_Содержание(), ecorePackage.getEByteArray(), "содержание", null, 0, 1, ВстроенноеИзображение.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getВстроенноеИзображение_Формат(), ecorePackage.getEString(), "формат", null, 0, 1, ВстроенноеИзображение.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(учётныйЦентрEClass, УчётныйЦентр.class, "УчётныйЦентр", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getУчётныйЦентр_ХранителиЖурналовОпераций(), this.getХранительЖурналовОпераций(), null, "хранителиЖурналовОпераций", null, 0, -1, УчётныйЦентр.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(хранительЖурналовОперацийEClass, ХранительЖурналовОпераций.class, "ХранительЖурналовОпераций", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getХранительЖурналовОпераций_ЖурналыОпераций(), this.getЖурналОпераций(), null, "журналыОпераций", null, 0, -1, ХранительЖурналовОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(пользовательEClass, Пользователь.class, "Пользователь", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getПользователь_Theme(), this.getTheme(), "theme", null, 0, 1, Пользователь.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(организацияEClass, Организация.class, "Организация", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(журналОперацийEClass, ЖурналОпераций.class, "ЖурналОпераций", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getЖурналОпераций_Активы(), this.getАктив(), null, "активы", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_Счета(), this.getСчёт(), null, "счета", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_Операции(), this.getОперация(), null, "операции", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_Субъекты(), this.getСубъект(), null, "субъекты", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_ОтчётныеАктивы(), this.getАктив(), null, "отчётныеАктивы", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций(), this.getСчёт(), null, "счётПоУмолчаниюДляБалансировкиОпераций", null, 0, 1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getЖурналОпераций_ОтчётныеПериоды(), this.getОтчётныйПериод(), null, "отчётныеПериоды", null, 0, -1, ЖурналОпераций.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(счётEClass, Счёт.class, "Счёт", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getСчёт_Группа(), ecorePackage.getEBoolean(), "группа", null, 0, 1, Счёт.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getСчёт_СубСчета(), this.getСчёт(), null, "субСчета", null, 0, -1, Счёт.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getСчёт_Активы(), this.getАктив(), this.getАктив_Счета(), "активы", null, 1, -1, Счёт.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getСчёт_Проводки(), this.getПроводка(), this.getПроводка_Счёт(), "проводки", null, 0, -1, Счёт.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(активEClass, Актив.class, "Актив", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getАктив_ИсточникиКурсов(), this.getИсточникКурсаАктива(), null, "источникиКурсов", null, 0, -1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getАктив_Группа(), ecorePackage.getEBoolean(), "группа", null, 0, 1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getАктив_СубАктивы(), this.getАктив(), null, "субАктивы", null, 0, -1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getАктив_ЕдиницаИзмерения(), ecorePackage.getEString(), "единицаИзмерения", null, 0, 1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getАктив_Точность(), ecorePackage.getEIntegerObject(), "точность", null, 0, 1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getАктив_Свойства(), this.getСвойствоАктива(), null, "свойства", null, 0, -1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getАктив_Счета(), this.getСчёт(), this.getСчёт_Активы(), "счета", null, 0, -1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getАктив_Проводки(), this.getПроводка(), this.getПроводка_Актив(), "проводки", null, 0, -1, Актив.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(свойствоАктиваEClass, СвойствоАктива.class, "СвойствоАктива", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getСвойствоАктива_Наименование(), ecorePackage.getEString(), "наименование", null, 1, 1, СвойствоАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getСвойствоАктива_Описание(), ecorePackage.getEString(), "описание", null, 0, 1, СвойствоАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getСвойствоАктива_Тип(), ecorePackage.getEString(), "тип", null, 0, 1, СвойствоАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getСвойствоАктива_НижняяГраница(), ecorePackage.getEInt(), "нижняяГраница", "0", 0, 1, СвойствоАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getСвойствоАктива_ВерхняяГраница(), ecorePackage.getEInt(), "верхняяГраница", "1", 0, 1, СвойствоАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(значениеСвойстваАктиваEClass, ЗначениеСвойстваАктива.class, "ЗначениеСвойстваАктива", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getЗначениеСвойстваАктива_Свойство(), this.getСвойствоАктива(), null, "свойство", null, 1, 1, ЗначениеСвойстваАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getЗначениеСвойстваАктива_Значения(), ecorePackage.getEString(), "значения", null, 0, -1, ЗначениеСвойстваАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(источникКурсаАктиваEClass, ИсточникКурсаАктива.class, "ИсточникКурсаАктива", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getИсточникКурсаАктива_НачалоПериодаДействия(), ecorePackage.getEDate(), "началоПериодаДействия", null, 0, 1, ИсточникКурсаАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getИсточникКурсаАктива_КонецПериодаДействия(), ecorePackage.getEDate(), "конецПериодаДействия", null, 0, 1, ИсточникКурсаАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getИсточникКурсаАктива_БазовыйАктив(), this.getАктив(), null, "базовыйАктив", null, 1, 1, ИсточникКурсаАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getИсточникКурсаАктива_Комментарий(), ecorePackage.getEString(), "комментарий", null, 0, 1, ИсточникКурсаАктива.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList(), this.getКурсАктива(), "получитьКурс", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "дата", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "количество", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getЗначениеСвойстваАктива(), "значенияСвойств", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getКурсАктива(), "базовыйКурс", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getСубъект(), "субъект", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(фиксированныйКурсEClass, ФиксированныйКурс.class, "ФиксированныйКурс", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getФиксированныйКурс_Курс(), ecorePackage.getEBigDecimal(), "курс", null, 1, 1, ФиксированныйКурс.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(вычислительКурсаEClass, ВычислительКурса.class, "ВычислительКурса", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getВычислительКурса_Код(), ecorePackage.getEString(), "код", null, 1, 1, ВычислительКурса.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(операцияEClass, Операция.class, "Операция", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getОперация_ДатаОперации(), ecorePackage.getEDate(), "датаОперации", null, 1, 1, Операция.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getОперация_ПервичныйВвод(), ecorePackage.getEBoolean(), "первичныйВвод", null, 0, 1, Операция.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getОперация_Проводки(), this.getПроводка(), null, "проводки", null, 0, -1, Операция.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getОперация_Создатель(), this.getПользователь(), null, "создатель", null, 1, 1, Операция.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getОперация_Субъекты(), this.getСубъект(), this.getСубъект_Операции(), "субъекты", null, 0, -1, Операция.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(проводкаEClass, Проводка.class, "Проводка", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getПроводка_ДатаПроводки(), ecorePackage.getEDate(), "датаПроводки", null, 1, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getПроводка_Счёт(), this.getСчёт(), this.getСчёт_Проводки(), "счёт", null, 1, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getПроводка_Актив(), this.getАктив(), this.getАктив_Проводки(), "актив", null, 1, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getПроводка_Количество(), ecorePackage.getEBigDecimal(), "количество", null, 1, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getПроводка_Сверено(), ecorePackage.getEBoolean(), "сверено", null, 0, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getПроводка_БалансирующаяПроводка(), ecorePackage.getEBoolean(), "балансирующаяПроводка", null, 0, 1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getПроводка_ЗначенияСвойствАктива(), this.getЗначениеСвойстваАктива(), null, "значенияСвойствАктива", null, 0, -1, Проводка.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(субъектEClass, Субъект.class, "Субъект", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getСубъект_Операции(), this.getОперация(), this.getОперация_Субъекты(), "операции", null, 0, -1, Субъект.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(отчётныйПериодEClass, ОтчётныйПериод.class, "ОтчётныйПериод", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getОтчётныйПериод__GetНачалоПериода(), ecorePackage.getEDate(), "getНачалоПериода", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getОтчётныйПериод__GetКонецПериода(), ecorePackage.getEDate(), "getКонецПериода", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(предыдущийМесяцEClass, ПредыдущийМесяц.class, "ПредыдущийМесяц", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(предыдущийГодEClass, ПредыдущийГод.class, "ПредыдущийГод", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(текущийМесяцEClass, ТекущийМесяц.class, "ТекущийМесяц", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(текущийГодEClass, ТекущийГод.class, "ТекущийГод", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(фиксированныйОтчётныйПериодEClass, ФиксированныйОтчётныйПериод.class, "ФиксированныйОтчётныйПериод", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getФиксированныйОтчётныйПериод_НачалоПериода(), ecorePackage.getEDate(), "началоПериода", null, 0, 1, ФиксированныйОтчётныйПериод.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getФиксированныйОтчётныйПериод_КонецПериода(), ecorePackage.getEDate(), "конецПериода", null, 0, 1, ФиксированныйОтчётныйПериод.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(themeEDataType, Theme.class, "Theme", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(курсАктиваEDataType, КурсАктива.class, "КурсАктива", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// org.nasdanika.cdo.web.render
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0430\u043a\u0435\u0442 (package) Ledger \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u0434\u043e\u043c\u0435\u043d\u043d\u044b\u0435 \u043c\u043e\u0434\u0435\u043b\u044c\u043d\u044b\u0435 \u043a\u043b\u0430\u0441\u0441\u044b \u0434\u043b\u044f \u0443\u0447\u0451\u0442\u0430 \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439.\r\n\r\n[[classifier>\u0423\u0447\u0451\u0442\u043d\u044b\u0439\u0426\u0435\u043d\u0442\u0440|\u0423\u0447\u0451\u0442\u043d\u044b\u0439 \u0426\u0435\u043d\u0442\u0440]] \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043a\u043e\u0440\u043d\u0435\u0432\u044b\u043c \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u043c \u043c\u043e\u0434\u0435\u043b\u0438 \u0438 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 [[classifier>\u0425\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c\u0416\u0443\u0440\u043d\u0430\u043b\u043e\u0432\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0439|\u0445\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u0435\u0439 \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439]] - \r\n[[classifier>\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c|\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439]] \u0438 [[classifier>\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f|\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438]].\r\n\r\n\u0425\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0430\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u043c \u0431\u0430\u0437\u043e\u0432\u044b\u043c \u043a\u043b\u0430\u0441\u0441\u043e\u043c \u0434\u043b\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439 \u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0439. \u0425\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 [[classifier>\u0416\u0443\u0440\u043d\u0430\u043b\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0439|\u0436\u0443\u0440\u043d\u0430\u043b\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439]]. \r\n\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c \u044d\u0442\u043e \u0445\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0441 \u043b\u043e\u0433\u0438\u043d\u043e\u043c \u0438 \u043f\u0430\u0440\u043e\u043b\u0435\u043c. \u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u044e\u0442 \u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u043d\u0430\u0434 \u043a\u043e\u0442\u043e\u0440\u044b\u043c\u0438 \u043c\u043e\u0433\u0443\u0442 \u0440\u0430\u0431\u043e\u0442\u0430\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439. \r\n\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0438 \u043c\u043e\u0433\u0443\u0442 \u0434\u0430\u0432\u0430\u0442\u044c \u0434\u043e\u0441\u0442\u0443\u043f \u0434\u0440\u0443\u0433\u0438\u043c \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f\u043c \u043a \u0441\u0432\u043e\u0438\u043c \u0436\u0443\u0440\u043d\u0430\u043b\u0430\u043c \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439. \u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u044e\u0442 \u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u044b \u043d\u0435\u0437\u0430\u0432\u0438\u0441\u0438\u043c\u044b\u0435 \u043e\u0442 \u043a\u043e\u043d\u043a\u0440\u0435\u0442\u043d\u043e\u0433\u043e \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f. \u041a\u043e\u043d\u0446\u0435\u043f\u0446\u0438\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c-\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u0437\u0430\u0438\u043c\u0441\u0442\u0432\u043e\u0432\u0430\u043d\u0430 \u0443 GitHub \u0438 DockerHub.\r\n\r\n[[classifier>\u0416\u0443\u0440\u043d\u0430\u043b\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0439|\u0416\u0443\u0440\u043d\u0430\u043b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439]] \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 [[classifier>\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f|\u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438]] \u0441 [[classifier>\u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0430|\u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0430\u043c\u0438]] \u0438 \u0441\u0441\u044b\u043b\u043e\u0447\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435 - [[classifier>\u0421\u0447\u0451\u0442|\u0441\u0447\u0435\u0442\u0430]], [[classifier>\u0410\u043a\u0442\u0438\u0432|\u0430\u043a\u0442\u0438\u0432\u044b]] \u0438 [[classifier>\u0421\u0443\u0431\u044a\u0435\u043a\u0442|\u0441\u0443\u0431\u044a\u0435\u043a\u0442\u044b]].\r\n\r\n\u041a\u0430\u0436\u0434\u0430\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u043c\u043e\u0436\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a \u0438 \u0441\u0441\u044b\u043b\u0430\u0442\u044c\u0441\u044f \u043d\u0430 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u0438\u0445 \u0441\u0443\u0431\u044a\u0435\u043a\u0442\u043e\u0432. \u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0430 \u043e\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0430\u043a\u0442\u0438\u0432\u0430 \u043f\u043e \u0441\u0447\u0451\u0442\u0443 \u043a\u0430\u043a \u0447\u0430\u0441\u0442\u044c \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438. \r\n\u0421\u0443\u043c\u043c\u0430 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0439 \u0430\u043a\u0442\u0438\u0432\u043e\u0432 \u043f\u043e \u0441\u0447\u0435\u0442\u0430\u043c \u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u043f\u0435\u0440\u0435\u0441\u0447\u0438\u0442\u0430\u043d\u043d\u0430\u044f \u043d\u0430 \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u0430\u043a\u0442\u0438\u0432 (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0440\u0443\u0431\u043b\u0438) \u043f\u043e \u043a\u0443\u0440\u0441\u0443 \u043d\u0430 \u0434\u0430\u0442\u0443 \u0441\u043e\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0434\u043e\u043b\u0436\u043d\u0430 \u0440\u0430\u0432\u043d\u044f\u0442\u0441\u044f \u043d\u0443\u043b\u044e (\u0431\u044b\u0442\u044c \u0441\u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0430). \r\n\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435\u043c \u043a\u043e\u043d\u0446\u0435\u043f\u0446\u0438\u0438 \u0434\u0432\u043e\u0439\u043d\u043e\u0439 \u0437\u0430\u043f\u0438\u0441\u0438 \u0431\u0443\u0445\u0433\u0430\u043b\u0442\u0435\u0440\u0441\u043a\u043e\u0433\u043e \u0443\u0447\u0451\u0442\u0430 - \u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u044c \u0443\u0447\u0430\u0441\u0442\u0438\u0435 \u0431\u043e\u043b\u0435\u0435 \u0447\u0435\u043c \u0434\u0432\u0430 \u0441\u0447\u0451\u0442\u0430 \u0438 \u0441\u0447\u0435\u0442\u0430 \u043c\u043e\u0433\u0443\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0440\u0430\u0437\u043d\u044b\u0435 \u0430\u043a\u0442\u0438\u0432\u044b (\u0440\u0443\u0431\u043b\u0438, \u0434\u043e\u043b\u043b\u0430\u0440\u044b, \u0442\u043e\u0432\u0430\u0440).\r\n\r\n\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430\u0446\u0438\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u043c\u043e\u0434\u0435\u043b\u0438 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u043f\u043e\u0434\u0440\u043e\u0431\u043d\u043e\u0435 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0438 \u0438\u0445 \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u043e\u0432, \u0441\u0432\u044f\u0437\u0435\u0439 \u0438 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439. [[todo|\u041c\u043e\u0434\u0435\u043b\u044c \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0445 \u0438\u0441\u0442\u043e\u0440\u0438\u0439]] \u043e\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442 \u0444\u0443\u043d\u043a\u0446\u0438\u043e\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0433\u0440\u0430\u043c\u043c\u044b \u0443\u0447\u0451\u0442\u0430 \u0432 \u0442\u0435\u0440\u043c\u0438\u043d\u0430\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0434\u043e\u043c\u0435\u043d\u043d\u043e\u0439 \u043c\u043e\u0434\u0435\u043b\u0438.\r\n\r\n## \u041c\u0435\u0442\u0430\u0444\u043e\u0440\u0430\r\n\r\n\u0423\u0447\u0451\u0442\u043d\u044b\u0439 \u0446\u0435\u043d\u0442\u0440 \u044d\u0442\u043e \u0437\u0434\u0430\u043d\u0438\u0435 \u0441 \u043a\u0432\u0430\u0440\u0442\u0438\u0440\u0430\u043c\u0438 (\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0438) \u0438 \u043e\u0444\u0438\u0441\u0430\u043c\u0438 (\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438). \u0418 \u0432 \u043a\u0432\u0430\u0440\u0442\u0438\u0440\u0430\u0445 \u0438 \u0432 \u043e\u0444\u0438\u0441\u0430\u0445 \u0445\u0440\u0430\u043d\u044f\u0442\u0441\u044f \u0436\u0443\u0440\u043d\u0430\u043b\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439. \r\n\u0416\u0443\u0440\u043d\u0430\u043b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u044d\u0442\u043e \u0442\u0435\u0442\u0440\u0430\u0434\u044c \u0432 \u043a\u043e\u0442\u043e\u0440\u043e\u0439 \u0437\u0430\u043f\u0438\u0441\u044b\u0432\u0430\u044e\u0442\u0441\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438. \r\n\u0421\u0447\u0451\u0442 \u044d\u0442\u043e \u043d\u0435\u043a\u0438\u0439 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440 \u0432 \u043a\u043e\u0442\u043e\u0440\u043e\u043c \u043c\u043e\u0436\u043d\u043e \u0434\u0435\u0440\u0436\u0430\u0442\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0451\u043d\u043d\u044b\u0435 \u0430\u043a\u0442\u0438\u0432\u044b. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0432 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0435 \u043c\u043e\u0436\u043d\u043e \u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0434\u0435\u043d\u044c\u0433\u0438, \u0430 \u0432 \u043a\u043e\u0440\u043e\u0431\u043a\u0435 \u0442\u043e\u0432\u0430\u0440. \r\n\r\n\u041d\u0430 \u0437\u0430\u043c\u0435\u0442\u043a\u0443: \u041c\u0435\u0442\u0430\u0444\u043e\u0440\u044b \u043c\u043e\u0433\u0443\u0442 \u0441\u043b\u0443\u0436\u0438\u0442\u044c \u0431\u043e\u043b\u044c\u0448\u0438\u043c \u043f\u043e\u0434\u0441\u043f\u043e\u0440\u044c\u0435\u043c \u0432 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0438 \u043a\u0430\u043a\u043e\u0439-\u043b\u0438\u0431\u043e \u043a\u043e\u043d\u0446\u0435\u043f\u0446\u0438\u0438. \u0413\u043b\u0430\u0432\u043d\u043e\u0435 \u043d\u0435 \u0437\u0430\u0431\u044b\u0432\u0430\u0442\u044c \u0447\u0442\u043e \u043c\u0435\u0442\u0430\u0444\u043e\u0440\u044b \u043d\u0435 \u0441\u0442\u043e\u0438\u0442 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u044c \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u0443\u043a\u0432\u0430\u043b\u044c\u043d\u043e.\r\n\r\n## \u041f\u0440\u0438\u043c\u0435\u0440\r\n\r\n\u041c\u0430\u0440\u044c\u044f \u0418\u0432\u0430\u043d\u043e\u0432\u043d\u0430 \u0442\u043e\u0440\u0433\u0443\u0435\u0442 \u043d\u0430 \u0440\u044b\u043d\u043a\u0435 \u043c\u043e\u043b\u043e\u043a\u043e\u043c, \u043f\u043e\u043c\u0438\u0434\u043e\u0440\u0430\u043c\u0438 \u0438 \u043e\u0433\u0443\u0440\u0446\u0430\u043c\u0438. \u041e\u0432\u043e\u0449\u0438 \u043e\u043d\u0430 \u0432\u044b\u0440\u0430\u0449\u0438\u0432\u0430\u0435\u0442 \u0441\u0430\u043c\u0430, \u043c\u043e\u043b\u043e\u043a\u043e \u043f\u043e\u043a\u0443\u043f\u0430\u0435\u0442 \u0443 \u0441\u043e\u0441\u0435\u0434\u043a\u0438. \r\n\u0423 \u041c\u0430\u0440\u044c\u0438 \u0418\u0432\u0430\u043d\u043e\u0432\u043d\u044b \u0435\u0441\u0442\u044c \u043f\u043e\u0441\u0442\u043e\u044f\u043d\u043d\u044b\u0435 \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u0438 - \u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430 \u0438 \u0424\u0451\u0434\u043e\u0440 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447 -  \u043a\u043e\u0442\u043e\u0440\u044b\u043c \u043e\u043d\u0430 \u043f\u043e\u0440\u043e\u0439 \u043f\u0440\u043e\u0434\u0430\u0451\u0442 \u0432 \u043a\u0440\u0435\u0434\u0438\u0442 \u0438 \u0431\u0435\u0440\u0451\u0442 \u0434\u0435\u043d\u044c\u0433\u0438 \u0432\u043f\u0435\u0440\u0451\u0434 (\u043f\u0440\u0435\u0434\u043e\u043f\u043b\u0430\u0442\u0430). \r\n\u041c\u0430\u0440\u044c\u044f \u0418\u0432\u0430\u043d\u043e\u0432\u043d\u0430 \u0445\u0440\u0430\u043d\u0438\u0442 \u0434\u0435\u043d\u044c\u0433\u0438 \u0432 \u0421\u0431\u0435\u0440\u0431\u0430\u043d\u043a\u0435 \u0432 \u0440\u0443\u0431\u043b\u044f\u0445 \u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u0430\u0445.\r\n\r\n### \u0421\u0443\u0431\u044a\u0435\u043a\u0442\u044b\r\n\r\n* \u0421\u0431\u0435\u0440\u0431\u0430\u043d\u043a\r\n* \u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430\r\n* \u0424\u0451\u0434\u043e\u0440 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447\r\n\r\n### \u0410\u043a\u0442\u0438\u0432\u044b\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 - \u0433\u0440\u0443\u043f\u043f\u0430 \u0430\u043a\u0442\u0438\u0432\u043e\u0432, \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c 2 (\u0437\u043d\u0430\u043a\u0430 \u043f\u043e\u0441\u043b\u0435 \u0437\u0430\u043f\u044f\u0442\u043e\u0439) - \u043a\u043e\u043f\u0435\u0439\u043a\u0438 \u0438\u043b\u0438 \u0446\u0435\u043d\u0442\u044b. \u0410\u043a\u0442\u0438\u0432\u044b \u0432 \u0433\u0440\u0443\u043f\u043f\u0435 \u043d\u0430\u0441\u043b\u0435\u0434\u0443\u044e\u0442 \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c.\r\n    * \u0420\u0443\u0431\u043b\u0438 \r\n    * \u0414\u043e\u043b\u043b\u0430\u0440\u044b\r\n* \u0422\u043e\u0432\u0430\u0440\u044b\r\n    * \u041c\u043e\u043b\u043e\u043a\u043e - \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0438\u0437\u043c\u0435\u0440\u0435\u043d\u0438\u044f \u043b\u0438\u0442\u0440\u044b, \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c 3 (\u043c\u0438\u043b\u043b\u0438\u043b\u0438\u0442\u0440\u044b)\r\n    * \u041e\u0432\u043e\u0449\u0438 - \u0433\u0440\u0443\u043f\u043f\u0430 \u0430\u043a\u0442\u0438\u0432\u043e\u0432, \u0435\u0434\u0438\u043d\u0438\u0446\u0430 \u0438\u0437\u043c\u0435\u0440\u0435\u043d\u0438\u044f \u043a\u0438\u043b\u043e\u0433\u0440\u0430\u043c\u043c\u044b, \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c 3 (\u0433\u0440\u0430\u043c\u044b). \u0410\u043a\u0442\u0438\u0432\u044b \u0432 \u0433\u0440\u0443\u043f\u043f\u0435 \u043d\u0430\u0441\u043b\u0435\u0434\u0443\u044e\u0442 \u0435\u0434\u0438\u043d\u0438\u0446\u0443 \u0438\u0437\u043c\u0435\u0440\u0435\u043d\u0438\u044f \u0440\u0430\u0432\u043d\u043e \u043a\u0430\u043a \u0438 \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c.\r\n        * \u041f\u043e\u043c\u0438\u0434\u043e\u0440\u044b \r\n        * \u041e\u0433\u0443\u0440\u0446\u044b\r\n\r\n### \u0421\u0447\u0435\u0442\u0430\r\n\r\n* \u0414\u0435\u043d\u0435\u0436\u043d\u044b\u0435 \r\n    * \u041a\u043e\u0448\u0435\u043b\u0451\u043a - \u0432 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0435 \u043c\u043e\u0436\u043d\u043e \u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0434\u0435\u043d\u044c\u0433\u0438 (\u0440\u0443\u0431\u043b\u0438 \u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u044b), \u043d\u043e \u043d\u0435\u043b\u044c\u0437\u044f \u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043c\u043e\u043b\u043a\u043e, \u043f\u043e\u043c\u0438\u0434\u043e\u0440\u044b \u0438 \u043e\u0433\u0443\u0440\u0446\u044b.\r\n    * \u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0438\u0435\r\n        * \u0420\u0443\u0431\u043b\u0451\u0432\u044b\u0439 \u0441\u0447\u0451\u0442\r\n        * \u0414\u043e\u043b\u043b\u0430\u0440\u043e\u0432\u044b\u0439 \u0441\u0447\u0451\u0442\r\n* \u0422\u043e\u0432\u0430\u0440\u043d\u044b\u0435\r\n    * \u0411\u0438\u0434\u043e\u043d - \u0432 \u0431\u0438\u0434\u043e\u043d\u0435 \u043c\u043e\u0436\u043d\u043e \u0434\u0435\u0440\u0436\u0430\u0442\u044c \u043c\u043e\u043b\u043e\u043a\u043e. \u0415\u0441\u043b\u0438 \u0442\u0430\u043c \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u043c\u043e\u043b\u043a\u043e \u0442\u043e \u043b\u0443\u0447\u0448\u0435 \u0442\u0443\u0434\u0430 \u043d\u0435 \u043a\u043b\u0430\u0441\u0442\u044c \u043f\u043e\u043c\u0438\u0434\u043e\u0440\u044b \u0438\u043b\u0438 \u043e\u0433\u0443\u0440\u0446\u044b.\r\n    * \u041a\u043e\u0440\u0437\u0438\u043d\u043a\u0430 - \u0432 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0435 \u043c\u043e\u0436\u043d\u043e \u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0438 \u043f\u043e\u043c\u0438\u0434\u043e\u0440\u044b \u0438 \u043e\u0433\u0443\u0440\u0446\u044b \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e. \u0412 \u043f\u0440\u0438\u043d\u0446\u0438\u043f\u0435 \u0432 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0435 \u043c\u043e\u0436\u043d\u043e \u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0438 \u0434\u0435\u043d\u044c\u0433\u0438 - \u0441\u043f\u0440\u044f\u0442\u0430\u0442\u044c \u043f\u043e\u0434 \u043e\u0432\u043e\u0449\u0438 \u043e\u0442 \u0445\u0443\u043b\u0438\u0433\u0430\u043d\u043e\u0432.\r\n* \u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0435 - \u043d\u0430 \u043a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0445 \u0441\u0447\u0435\u0442\u0430\u0445 \u043c\u043e\u0433\u0443\u0442 \"\u0445\u0440\u0430\u043d\u0438\u0442\u044c\u0441\u044f\" \u0434\u0435\u043d\u044c\u0433\u0438 \u0432 \u0441\u043b\u0443\u0447\u0430\u0435 \u043f\u0440\u043e\u0434\u0430\u0436\u0438 \u0432 \u043a\u0440\u0435\u0434\u0438\u0442 \u0438\u043b\u0438 \u0442\u043e\u0432\u0430\u0440 - \u0434\u0435\u043d\u044c\u0433\u0438 \u0432\u0437\u044f\u0442\u044b \u0432\u043f\u0435\u0440\u0451\u0434 \u043f\u043e\u0434 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0451\u043d\u043d\u044b\u0439 \u0442\u043e\u0432\u0430\u0440.\r\n    * \u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430\r\n    * \u0424\u0451\u0434\u043e\u0440 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447\r\n* \u041f\u0440\u0438\u0431\u044b\u043b\u0438 \u0438 \u0443\u0431\u044b\u0442\u043a\u0438 \u0432 \u043f\u0435\u0440\u0435\u0441\u0447\u0451\u0442\u0435 \u043d\u0430 \u0440\u0443\u0431\u043b\u0438.\r\n\r\n### \u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0438\r\n\r\n#### \u041f\u043e\u043a\u0443\u043f\u043a\u0430 \u043c\u043e\u043b\u043e\u043a\u0430 \u0443 \u0441\u043e\u0441\u0435\u0434\u043a\u0438\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0438\u0437 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0430.\r\n* \u041c\u043e\u043b\u043e\u043a\u043e \u0432 \u0431\u0438\u0434\u043e\u043d.\r\n* \"\u041a\u0443\u0440\u0441\" \u043c\u043e\u043b\u043e\u043a\u0430 \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u043e \u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u0438.\r\n\r\n#### \u041e\u0432\u043e\u0449\u0438 \u0441 \u043e\u0433\u043e\u0440\u043e\u0434\u0430\r\n\r\n* \"\u041a\u0443\u0440\u0441\" \u043e\u0432\u043e\u0449\u0435\u0439 \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u043e \u043c\u0430\u0433\u0438\u0447\u0435\u0441\u043a\u0438 \u0440\u0430\u0441\u0447\u0438\u0442\u0430\u043d\u043d\u043e\u0439 \"\u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u0438\". \r\n* \u041e\u0432\u043e\u0449\u0438 \u0432 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0443.\r\n* \u0422\u0443\u0442 \u043d\u0443\u0436\u0435\u043d \u0441\u0447\u0451\u0442 \u0447\u0442\u043e\u0431\u044b \u0443\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c \u0442\u0440\u0443\u0434, \u0443\u0434\u043e\u0431\u0440\u0435\u043d\u0438\u044f \u0438 \u0442.\u0434. \u0414\u043b\u044f \u043f\u0440\u043e\u0441\u0442\u043e\u0442\u044b \u043f\u0443\u0441\u0442\u044c \u044d\u0442\u043e \u0431\u0443\u0434\u0435\u0442 \u0441\u0447\u0451\u0442 \"\u041f\u0440\u0438\u0431\u044b\u043b\u0438 \u0438 \u0443\u0431\u044b\u0442\u043a\u0438\". \u0421\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u043e\u0432\u043e\u0449\u0435\u0439 \u0441\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0441 \u043f\u0440\u0438\u0431\u044b\u043b\u0435\u0439 \u0438 \u0443\u0431\u044b\u0442\u043a\u043e\u0432.\r\n\r\n\r\n#### \u041f\u043e\u0435\u0437\u0434\u043a\u0430 \u0432 \u0433\u043e\u0440\u043e\u0434 \u043d\u0430 \u0440\u044b\u043d\u043e\u043a\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0438\u0437 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0430 \u043d\u0430 \u0431\u0438\u043b\u0435\u0442 \u043d\u0430 \u044d\u043b\u0435\u043a\u0442\u0440\u0438\u0447\u043a\u0443, \u0442\u0440\u0430\u043c\u0432\u0430\u0439, \u0438 \u043d\u0430 \u043e\u043f\u043b\u0430\u0442\u0443 \u043c\u0435\u0441\u0442\u0430 \u043d\u0430 \u0440\u044b\u043d\u043a\u0435.\r\n* \u0421\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u0432\u044b\u0448\u0435\u043f\u0435\u0440\u0435\u0447\u0438\u0441\u043b\u0435\u043d\u043d\u044b\u0445 \u0437\u0430\u0442\u0440\u0430\u0442 \u0432 \u043f\u0440\u0438\u0431\u044b\u043b\u0438 \u0438 \u0443\u0431\u044b\u0442\u043a\u0438.\r\n\r\n#### \u041f\u0440\u043e\u0434\u0430\u0436\u0430 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u043c\u0443 \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044e\r\n\r\n\u041f\u0440\u043e\u0434\u0430\u0436\u0430 \u043a\u0438\u043b\u043e\u0433\u0440\u0430\u043c\u043c\u0430 \u043e\u0433\u0443\u0440\u0446\u043e\u0432 \u0438 \u043b\u0438\u0442\u0440\u0430 \u043c\u043e\u043b\u043e\u043a\u0430 (\u0445\u0435-\u0445\u0435) \u0441\u043e \u0441\u043a\u0438\u0434\u043a\u043e\u0439 \u0437\u0430 \"\u043e\u043f\u0442\":\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0432 \u043a\u043e\u0448\u0435\u043b\u0451\u043a\r\n* \u041c\u043e\u043b\u043e\u043a\u043e \u0438\u0437 \u0431\u0438\u0434\u043e\u043d\u0430\r\n* \u041e\u0433\u0443\u0440\u0446\u044b \u0438\u0437 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0438\r\n* \u041e\u0433\u0443\u0440\u0446\u044b \u0438 \u043c\u043e\u043b\u043e\u043a\u043e \u043f\u0435\u0440\u0435\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u044e\u0442\u0441\u044f \u0432 \u0440\u0443\u0431\u043b\u0438 \u043f\u043e \"\u043a\u0443\u0440\u0441\u0443\". \u0412 \u0441\u043b\u0443\u0447\u0430\u0435 \u0442\u043e\u0432\u0430\u0440\u0430 \u044d\u0442\u043e \u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c. \u0420\u0430\u0437\u043d\u0438\u0446\u0430 \u043c\u0435\u0436\u0434\u0443 \u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e \u0438 \u0432\u044b\u0440\u0443\u0447\u043a\u043e\u0439 \u0437\u0430\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0432 \u043f\u0440\u0438\u0431\u044b\u043b\u0438/\u0443\u0431\u044b\u0442\u043a\u0438 \u0447\u0442\u043e\u0431\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u0431\u044b\u043b\u0430 \u0441\u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0430.\r\n\r\n#### \u041f\u0440\u043e\u0434\u0430\u0436\u0430 \u041a\u043b\u0430\u0432\u0434\u0438\u0438 \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0435\r\n\r\n\u0422\u043e-\u0436\u0435 \u0441\u0430\u043c\u043e\u0435 \u043a\u0430\u043a \u0438 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u043c\u0443 \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044e, \u043d\u043e \u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u0430 \u043a\u0430\u043a \u0441\u0443\u0431\u044a\u0435\u043a\u0442 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438.\r\n\r\n#### \u041f\u0440\u043e\u0434\u0430\u0436\u0430 \u043e\u0432\u043e\u0449\u0435\u0439 \u0432 \u043a\u0440\u0435\u0434\u0438\u0442 \u0424\u0451\u0434\u043e\u0440\u0443 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447\u0443\r\n\r\n\u0423 \u0424\u0451\u0434\u043e\u0440\u0430 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447\u0430 \u043d\u0435 \u0445\u0432\u0430\u0442\u0438\u043b\u043e \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445 \u0432 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0435 \u0447\u0442\u043e\u0431\u044b \u0440\u0430\u0441\u043f\u043b\u0430\u0442\u0438\u0442\u044c\u0441\u044f \u0437\u0430 \u0432\u0441\u0435 \u043e\u0432\u043e\u0449\u0438.\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0432 \u043a\u043e\u0448\u0435\u043b\u0451\u043a\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u043d\u0430 \u0441\u0447\u0451\u0442 \u0424\u0451\u0434\u043e\u0440\u0430 \u041f\u0435\u0442\u0440\u043e\u0432\u0438\u0447\u0430 (\u0434\u043e\u043b\u0436\u0435\u043d)\r\n* \u041e\u0432\u043e\u0449\u0438 \u0438\u0437 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0438\r\n* \u0420\u0430\u0437\u043d\u0438\u0446\u0430 \u043c\u0435\u0436\u0434\u0443 \u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e \u0438 \u0432\u044b\u0440\u0443\u0447\u043a\u043e\u0439 \u0432 \u043f\u0440\u0438\u0431\u044b\u043b\u0438/\u0443\u0431\u044b\u0442\u043a\u0438.\r\n\r\n#### \u0424\u0451\u0434\u043e\u0440\u0443 \u0421\u0435\u043c\u0451\u043d\u043e\u0432\u0438\u0447 \u0440\u0430\u0441\u043f\u043b\u0430\u0442\u0438\u043b\u0441\u044f\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0432 \u043a\u043e\u0448\u0435\u043b\u0451\u043a\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0441\u043e \u0441\u0447\u0451\u0442\u0430 \u0424\u0451\u0434\u043e\u0440\u0430 \u041f\u0435\u0442\u0440\u043e\u0432\u0438\u0447\u0430 (\u0431\u043e\u043b\u044c\u0448\u0435 \u043d\u0435 \u0434\u043e\u043b\u0436\u0435\u043d)\r\n\r\n#### \u041f\u0440\u0435\u0434\u043e\u043f\u043b\u0430\u0442\u0430\r\n\r\n\u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430 \u043e\u0442\u0434\u0430\u043b\u0430 \u0434\u0435\u043d\u044c\u0433\u0438 \u0432\u043f\u0435\u0440\u0451\u0434 \u0437\u0430 \u043a\u0438\u043b\u043e \u043f\u043e\u043c\u0438\u0434\u043e\u0440\u043e\u0432.\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0432 \u043a\u043e\u0448\u0435\u043b\u0451\u043a\r\n* \u041e\u0432\u043e\u0449\u0438 \u0441\u043e \u0441\u0447\u0451\u0442\u0430 \u041a\u043b\u0430\u0432\u0434\u0438\u0438 \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u044b (\u041c\u0430\u0440\u044c\u044f \u0418\u0432\u0430\u043d\u043e\u0432\u043d\u0430 \u0434\u043e\u043b\u0436\u043d\u0430 \u041a\u043b\u0430\u0432\u0434\u0438\u0438 \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0435 \u043a\u0438\u043b\u043e \u043f\u043e\u043c\u0438\u0434\u043e\u0440)\r\n* \u0420\u0430\u0437\u043d\u0438\u0446\u0430 \u043c\u0435\u0436\u0434\u0443 \u0441\u0435\u0431\u0435\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e \u0438 \u0432\u044b\u0440\u0443\u0447\u043a\u043e\u0439 \u0432 \u043f\u0440\u0438\u0431\u044b\u043b\u0438/\u0443\u0431\u044b\u0442\u043a\u0438.\r\n\r\n#### \u041e\u0432\u043e\u0449\u0438 \u041a\u043b\u0430\u0432\u0434\u0438\u0438 \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0435\r\n\r\n* \u041e\u0432\u043e\u0449\u0438 \u043d\u0430 \u0441\u0447\u0451\u0442 \u041a\u043b\u0430\u0432\u0434\u0438\u0438 \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u044b (\u0431\u043e\u043b\u044c\u0448\u0435 \u043d\u0435 \u0434\u043e\u043b\u0436\u043d\u0430)\r\n* \u041e\u0432\u043e\u0449\u0438 \u0438\u0437 \u043a\u043e\u0440\u0437\u0438\u043d\u043a\u0438\r\n\r\n#### \u041f\u043e\u043a\u0443\u043f\u043a\u0430 \u0432\u0430\u043b\u044e\u0442\u044b\r\n\r\n* \u0422\u0435\u043a\u0443\u0449\u0438\u0439 \u043a\u0443\u0440\u0441 \u0432 \u0442\u0430\u0431\u043b\u0438\u0446\u0443 \u043a\u0443\u0440\u0441\u043e\u0432\r\n* \u0420\u0443\u0431\u043b\u0438 \u0438\u0437 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0430\r\n* \u0414\u043e\u043b\u043b\u0430\u0440\u044b \u0432 \u043a\u043e\u0448\u0435\u043b\u0451\u043a\r\n\r\n#### \u0414\u0435\u043d\u044c\u0433\u0438 \u0432 \u0431\u0430\u043d\u043a\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u0438\u0437 \u043a\u043e\u0448\u0435\u043b\u044c\u043a\u0430\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u043d\u0430 \u0441\u0447\u0451\u0442\r\n* \u0421\u0443\u0431\u044a\u0435\u043a\u0442 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 - \u0421\u0431\u0435\u0440\u0431\u0430\u043d\u043a\r\n\r\n### \u0421\u0432\u0435\u0440\u043a\u0430 \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a\r\n\r\n\u041f\u043e\u043b\u0443\u0447\u0438\u0432 \u0432\u044b\u043f\u0438\u0441\u043a\u0438 \u0438 \u0431\u0430\u043d\u043a\u0430 \u041a\u043b\u0430\u0432\u0434\u0438\u044f \u041f\u0435\u0442\u0440\u043e\u0432\u043d\u0430 \u0441\u0432\u0435\u0440\u044f\u0435\u0442 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u0438 \u043e\u0441\u0442\u0430\u0442\u043a\u0438 \u0438 \u043e\u0442\u043c\u0435\u0447\u0430\u0435\u0442 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043a\u0430\u043a \"\u0421\u0432\u0435\u0440\u0435\u043d\u043e\".\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
		   });	
		addAnnotation
		  (элементМоделиEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u0440\u044f\u0434\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u043c\u043e\u0434\u0435\u043b\u0438 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0438\u0439 \u043e\u0431\u0449\u0438\u0435 \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u044b \u0438 \u0441\u0441\u044b\u043b\u043a\u0438. \r\n\u041f\u043e\u0434\u043a\u043b\u0430\u0441\u0441\u044b \u043c\u043e\u0433\u0443\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0441\u0441\u044b\u043b\u043a\u0438 \u0438 \u0430\u0442\u0442\u0440\u0438\u0431\u0443\u0442\u044b \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0451\u043d\u043d\u044b\u0435 \u0432 \u0441\u0443\u043f\u0435\u0440\u043a\u043b\u0430\u0441\u0441\u0435."
		   });	
		addAnnotation
		  (getЭлементМодели__Validate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "documentation", "Validates element."
		   });	
		addAnnotation
		  ((getЭлементМодели__Validate__DiagnosticChain_Map()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Diagnostics to add validation messages to."
		   });	
		addAnnotation
		  ((getЭлементМодели__Validate__DiagnosticChain_Map()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Validation context."
		   });	
		addAnnotation
		  (getЭлементМодели_Наименование(), 
		   source, 
		   new String[] {
			 "documentation", "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430."
		   });	
		addAnnotation
		  (getЭлементМодели_Описание(), 
		   source, 
		   new String[] {
			 "documentation", "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435 HTML."
		   });	
		addAnnotation
		  (getЭлементМодели_Комментарии(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0438 \u043a \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0443. "
		   });	
		addAnnotation
		  (getЭлементМодели_Изображение(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0444\u043e\u0442\u043e\u0433\u0440\u0430\u0444\u0438\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f \u0438\u043b\u0438 \u0442\u043e\u0432\u0430\u0440\u0430, \u0438\u043b\u0438 \u0438\u043a\u043e\u043d\u043a\u0430 \u0434\u043b\u044f \u0441\u0447\u0451\u0442\u0430 - \u043a\u043e\u0448\u0435\u043b\u0451\u043a \u0434\u043b\u044f \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0445, \u0437\u0434\u0430\u043d\u0438\u0435 \u0434\u043b\u044f \u0431\u0430\u043d\u043a\u0430, \u043a\u043e\u0440\u0430\u0431\u043b\u044c \u0438\u043b\u0438 \u043c\u0430\u0448\u0438\u043d\u0430 \u0434\u043b\u044f \u0442\u043e\u0432\u0430\u0440\u043e\u0432 \u0432 \u043f\u0443\u0442\u0438."
		   });	
		addAnnotation
		  (getЭлементМодели_Идентификатор(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043d\u043e\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u043e\u0433\u043e \u0441\u0447\u0451\u0442\u0430"
		   });	
		addAnnotation
		  (комментарийEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439 \u043a \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0443 \u043c\u043e\u0434\u0435\u043b\u0438, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043a \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (getКомментарий_Автор(), 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u0432\u0442\u043e\u0440 \u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u044f"
		   });	
		addAnnotation
		  (getКомментарий_Содержание(), 
		   source, 
		   new String[] {
			 "documentation", "\u0422\u0435\u043a\u0441\u0442 \u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u044f \u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435 HTML"
		   });	
		addAnnotation
		  (getКомментарий_Дата(), 
		   source, 
		   new String[] {
			 "documentation", "\u0414\u0430\u0442\u0430 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044f \u043a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u044f."
		   });	
		addAnnotation
		  (изображениеEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u0430\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f."
		   });	
		addAnnotation
		  (ссылкаНаИзображениеEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0441\u044b\u043b\u043a\u0430 \u043d\u0430 \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 http://www.myserver.com/myimage.png. \u041f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u0434\u043e\u043b\u0436\u043d\u043e \u0440\u0430\u0441\u043f\u043e\u0437\u043d\u043e\u0432\u0430\u0442\u044c \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0438\u0435 \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u044c\u043d\u044b\u0435 \u043f\u0440\u043e\u0442\u043e\u043a\u043e\u043b\u044b:\r\n\r\n* ``bundle`` - \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 OSGi bundle. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440: ``bundle://org.nasdanika.icons/fatcow-hosting-icons/FatCow_Icons16x16/3d_glasses.png``\r\n* ``font-awesome`` - [FontAwesome](http://fontawesome.io/icons/) \u0438\u043a\u043e\u043d\u043a\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440: ``font-awesome://address-book``\r\n* ``bootstrap-glyphicon`` - [Bootstrap](http://getbootstrap.com/components/) \u0433\u043b\u0438\u0444. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440: ``bootstrap-glyphicon://search``"
		   });	
		addAnnotation
		  (getСсылкаНаИзображение_Ссылка(), 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0441\u0441\u044b\u043b\u043a\u0438."
		   });	
		addAnnotation
		  (встроенноеИзображениеEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0445\u0440\u0430\u043d\u044f\u0449\u0435\u0435\u0441\u044f \u0432 \u043c\u043e\u0434\u0435\u043b\u0438. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0444\u043e\u0442\u043e\u0433\u0440\u0430\u0444\u0438\u044f \u0442\u043e\u0432\u0430\u0440\u0430 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u0430\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u043c."
		   });	
		addAnnotation
		  (getВстроенноеИзображение_Содержание(), 
		   source, 
		   new String[] {
			 "documentation", "\u0411\u0430\u0439\u0442\u044b \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f."
		   });	
		addAnnotation
		  (getВстроенноеИзображение_Формат(), 
		   source, 
		   new String[] {
			 "documentation", "\u0444\u043e\u0440\u043c\u0430\u0442 \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f - jpg, png, bmp, ..."
		   });	
		addAnnotation
		  (учётныйЦентрEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u0440\u043d\u0435\u0432\u043e\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438."
		   });	
		addAnnotation
		  (getУчётныйЦентр_ХранителиЖурналовОпераций(), 
		   source, 
		   new String[] {
			 "documentation", "\u0423\u0447\u0451\u0442\u043d\u044b\u0439 \u0446\u0435\u043d\u0442\u0440 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u0445\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u0435\u0439 \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 - \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439 \u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (хранительЖурналовОперацийEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u0431\u0441\u0442\u0430\u043a\u0442\u043d\u044b\u0439 \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u043c\u043e\u0434\u0435\u043b\u0438 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0438\u0445 \u0436\u0443\u0440\u043d\u0430\u043b\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 - \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439 \u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0439."
		   });	
		addAnnotation
		  (getХранительЖурналовОпераций_ЖурналыОпераций(), 
		   source, 
		   new String[] {
			 "documentation", "\u0416\u0443\u0440\u043d\u0430\u043b\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u043f\u0440\u0438\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0438\u0435 \u0445\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044e."
		   });	
		addAnnotation
		  (пользовательEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0425\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u0430 \u0438\u043c\u0435\u044e\u0449\u0438\u0439 \u0443\u0447\u0451\u0442\u043d\u0443\u044e \u0437\u0430\u043f\u0438\u0441\u044c \u0438 \u043f\u0430\u0440\u043e\u043b\u044c \u0434\u043b\u044f \u0432\u0445\u043e\u0434\u0430 \u0432 \u0441\u0438\u0441\u0442\u0435\u043c\u0443."
		   });	
		addAnnotation
		  (организацияEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0425\u0440\u0430\u043d\u0438\u0442\u0435\u043b\u044c \u0436\u0443\u0440\u043d\u0430\u043b\u043e\u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u043d\u0430\u0434 \u043a\u043e\u0442\u043e\u0440\u044b\u043c\u0438 \u0440\u0430\u0431\u043e\u0442\u0430\u044e\u0442 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439. \u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0438 \u043c\u043e\u0433\u0443\u0442 \u0438\u043c\u0435\u0442\u044c \u0440\u0430\u0437\u043d\u044b\u0435 \u043f\u0440\u0430\u0432\u0430. \r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043a\u0442\u043e-\u0442\u043e \u043c\u043e\u0436\u0435\u0442 \u0442\u043e\u043b\u044c\u043a\u043e \u043e\u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043b\u044f\u0442\u044c \u043f\u0435\u0440\u0432\u0438\u0447\u043d\u044b\u0439 \u0432\u0432\u043e\u0434 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439, \u043a\u0442\u043e-\u0442\u043e \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0432\u0432\u043e\u0434\u0438\u0442\u044c \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438, \u043d\u043e \u043c\u043e\u0436\u0435\u0442 \u0441\u043e\u0437\u0434\u0430\u0432\u0430\u0442\u044c \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\u0445, \r\n\u0430 \u043a\u0442\u043e-\u0442\u043e \u0435\u0449\u0451 \u043c\u043e\u0436\u0435\u0442 \u0442\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u043e\u0441\u043c\u0430\u0442\u0440\u0438\u0432\u0430\u0442\u044c \u043e\u0442\u0447\u0451\u0442\u044b."
		   });	
		addAnnotation
		  (журналОперацийEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0416\u0443\u0440\u043d\u0430\u043b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u0441\u043f\u0438\u0441\u043e\u043a \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0438 \u0441\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435 - \u0441\u0447\u0435\u0442\u0430, \u0430\u043a\u0442\u0438\u0432\u044b \u0438 \u0441\u0443\u0431\u044a\u0435\u043a\u0442\u044b."
		   });	
		addAnnotation
		  (getЖурналОпераций_Активы(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u0440\u043d\u0435\u0432\u044b\u0435 \u0430\u043a\u0442\u0438\u0432\u044b."
		   });	
		addAnnotation
		  (getЖурналОпераций_Счета(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u0440\u043d\u0435\u0432\u044b\u0435 \u0441\u0447\u0435\u0442\u0430."
		   });	
		addAnnotation
		  (getЖурналОпераций_Операции(), 
		   source, 
		   new String[] {
			 "documentation", "\u0425\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0435 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (getЖурналОпераций_Субъекты(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u044b \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u044e\u0449\u0438\u0435 \u0443\u0447\u0430\u0441\u0442\u0438\u0435 \u0432 \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0439 \u0434\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438."
		   });	
		addAnnotation
		  (getЖурналОпераций_ОтчётныеАктивы(), 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u043a\u0442\u0438\u0432\u044b \u0432 \u0442\u0435\u0440\u043c\u0438\u043d\u0430\u0445 \u043a\u043e\u0442\u043e\u0440\u044b\u0445 \u0434\u043e\u043b\u0436\u043d\u044b \u0433\u0435\u043d\u0435\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u043e\u0442\u0447\u0451\u0442\u044b. \r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0440\u0443\u0431\u043b\u0438 \u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u044b."
		   });	
		addAnnotation
		  (getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0447\u0451\u0442 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439.\r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \"\u041f\u0440\u0438\u0431\u044b\u043b\u0438 \u0438 \u0443\u0431\u044b\u0442\u043a\u0438\". \u0415\u0441\u043b\u0438 \u0441\u0447\u0451\u0442 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u043e\u0434\u0438\u043d \u0438\u0437 \u043e\u0442\u0447\u0451\u0442\u043d\u044b\u0445 \u0430\u043a\u0442\u0438\u0432\u043e\u0432, \r\n\u0442\u043e \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0432\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0442\u0435\u0440\u043c\u0438\u043d\u0430\u0445 \u044d\u0442\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430. \u0418\u043d\u0430\u0447\u0435 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0432\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0442\u0435\u0440\u043c\u0438\u043d\u0430\u0445 \u043f\u0435\u0440\u0432\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430\r\n\u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u0441\u0447\u0451\u0442\u043e\u043c.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* \u0421\u0447\u0451\u0442 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0440\u0443\u0431\u043b\u0438 \u0438 \u043f\u0435\u0440\u0432\u044b\u0439 \u043e\u0442\u0447\u0451\u0442\u043d\u044b\u0439 \u0430\u043a\u0442\u0438\u0432 \u044d\u0442\u043e \u0440\u0443\u0431\u043b\u0438. \u0417\u043d\u0430\u0447\u0438\u0442 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u043e\u0432\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0440\u0443\u0431\u043b\u044f\u0445.\r\n* \u0421\u0447\u0451\u0442 \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0440\u0443\u0431\u043b\u0438, \u043d\u043e \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0434\u043e\u043b\u043b\u0430\u0440\u044b. \u0414\u043e\u043b\u043b\u0430\u0440\u044b \u044d\u0442\u043e \u0432\u0442\u043e\u0440\u043e\u0439 \u043e\u0442\u0447\u0451\u0442\u043d\u044b\u0439 \u0430\u043a\u0442\u0438\u0432. \u0411\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432 \u0434\u043e\u043b\u043b\u0430\u0440\u0430\u0445.\r\n* \u0421\u0447\u0451\u0442 \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u043d\u0438 \u0440\u0443\u0431\u043b\u0438 \u043d\u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u044b, \u043d\u043e \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0435\u0432\u0440\u043e. \u0411\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432 \u0435\u0432\u0440\u043e.\r\n\r\n"
		   });	
		addAnnotation
		  (getЖурналОпераций_ОтчётныеПериоды(), 
		   source, 
		   new String[] {
			 "documentation", "\u0416\u0443\u0440\u043d\u0430\u043b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u043c\u043e\u0436\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043e\u0442\u0447\u0451\u0442\u043d\u044b\u0445 \u043f\u0435\u0440\u0438\u043e\u0434\u043e\u0432."
		   });	
		addAnnotation
		  (счётEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0447\u0451\u0442 \u044d\u0442\u043e \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a \u0438/\u0438\u043b\u0438 \u043f\u0440\u0438\u0451\u043c\u043d\u0438\u043a \u0430\u043a\u0442\u0438\u0432\u043e\u0432. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0432 \u0441\u0447\u0451\u0442 \"\u043a\u043e\u0448\u0435\u043b\u0451\u043a\" \u043c\u043e\u0436\u043d\u043e \u043f\u043e\u043b\u043e\u0436\u0438\u0442\u044c \u0434\u0435\u043d\u044c\u0433\u0438, \u0430 \u0441\u043e \u0441\u0447\u0451\u0442\u0430 \"\u0441\u043a\u043b\u0430\u0434\" \u0432\u0437\u044f\u0442\u044c \u0442\u043e\u0432\u0430\u0440."
		   });	
		addAnnotation
		  (getСчёт_Группа(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u043d\u0434\u0438\u043a\u0430\u0442\u043e\u0440 \u0442\u043e\u0433\u043e \u0447\u0442\u043e \u0441\u0447\u0451\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u0433\u0440\u0443\u043f\u043f\u0438\u0440\u043e\u0432\u043a\u0438 \u0434\u0440\u0443\u0433\u0438\u0445 \u0441\u0447\u0435\u0442\u043e\u0432. \r\n\u0413\u0440\u0443\u043f\u043f\u043e\u0432\u044b\u0435 \u0441\u0447\u0435\u0442\u0430 \u043c\u043e\u0433\u0443\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0441\u0443\u0431-\u0441\u0447\u0435\u0442\u0430, \u043d\u043e \u043d\u0435 \u043c\u043e\u0433\u0443\u0442 \u0438\u043c\u0435\u0442\u044c \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a."
		   });	
		addAnnotation
		  (getСчёт_СубСчета(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0447\u0435\u0442\u0430 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u043e\u0432\u0430\u043d\u044b \u0432 \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u044e, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440:\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438\r\n    * \u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0438\u0435 \u0432\u043a\u043b\u0430\u0434\u044b\r\n        * \u0421\u0431\u0435\u0440\u0431\u0430\u043d\u043a\r\n            * \u0420\u0443\u0431\u043b\u0451\u0432\u044b\u0439 \u0441\u0447\u0451\u0442 1234\r\n            * \u0412\u0430\u043b\u044e\u0442\u043d\u044b\u0439 \u0441\u0447\u0451\u0442 5678\r\n    * \u041d\u0430\u043b\u0438\u0447\u043d\u044b\u0435"
		   });	
		addAnnotation
		  (getСчёт_Активы(), 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u043a\u0442\u0438\u0432\u044b \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u043c\u044b\u0435 \u0441\u0447\u0451\u0442\u043e\u043c. \u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043f\u043e \u0441\u0447\u0451\u0442\u0443 \u043c\u043e\u0433\u0443\u0442 \u043e\u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u0441 \u0430\u043a\u0442\u0438\u0432\u0430\u043c\u0438 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u043c\u044b\u043c\u0438 \u0441\u0447\u0451\u0442\u043e\u043c. \r\n\u0415\u0441\u043b\u0438 \u0430\u043a\u0442\u0438\u0432 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0433\u0440\u0443\u043f\u043f\u043e\u0439, \u0442\u043e \u044d\u0442\u043e \u043e\u0437\u043d\u0430\u0447\u0430\u0435\u0442 \u0447\u0442\u043e \u0441\u0447\u0451\u0442 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442, \u0440\u0435\u043a\u0443\u0440\u0441\u0438\u0432\u043d\u043e, \u043b\u044e\u0431\u043e\u0439 \u043f\u043e\u0434-\u0430\u043a\u0442\u0438\u0432 \u0433\u0440\u0443\u043f\u043f\u043e\u0432\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430\r\n\u0435\u0441\u043b\u0438 \u044d\u0442\u043e\u0442 \u0430\u043a\u0442\u0438\u0432 \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0433\u0440\u0443\u043f\u043f\u043e\u0439.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* \u0410\u043a\u0442\u0438\u0432\u044b - \u0440\u0443\u0431\u043b\u0438 \u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u044b. \u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043f\u043e \u0441\u0447\u0451\u0442\u0443 \u043c\u043e\u0433\u0443\u0442 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u0442\u044c\u0441\u044f \u0432 \u0440\u0443\u0431\u043b\u044f\u0445 \u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u0430\u0445.\r\n* \u0410\u043a\u0442\u0438\u0432 - \u0434\u0435\u043d\u044c\u0433\u0438. \u0414\u0435\u043d\u044c\u0433\u0438 \u044d\u0442\u043e \u0433\u0440\u0443\u043f\u043f\u0430 \u0430\u043a\u0442\u0438\u0432\u043e\u0432 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0430\u044f \u0440\u0443\u0431\u043b\u0438, \u0434\u043e\u043b\u043b\u0430\u0440\u044b \u0438 \u0435\u0432\u0440\u043e. \u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043f\u043e \u0441\u0447\u0451\u0442\u0443 \u043c\u043e\u0433\u0443\u0442 \u043f\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u0442\u044c\u0441\u044f \u0432 \u0440\u0443\u0431\u043b\u044f\u0445, \u0434\u043e\u043b\u043b\u0430\u0440\u0430\u0445 \u0438 \u0435\u0432\u0440\u043e.\r\n"
		   });	
		addAnnotation
		  (getСчёт_Проводки(), 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043f\u043e \u0441\u0447\u0451\u0442\u0443. \u042d\u0442\u0430 \u0441\u0441\u044b\u043b\u043a\u0430 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043e\u0431\u0440\u0430\u0442\u043d\u043e\u0439 \u043a \u0441\u0441\u044b\u043b\u043a\u0435 \"\u0421\u0447\u0451\u0442\" \u0432 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0435 \u0438 \u0437\u0430\u043f\u043e\u043b\u043d\u044f\u0435\u0442\u0441\u044f \u0441\u0438\u0441\u0442\u0435\u043c\u043e\u0439 \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438."
		   });	
		addAnnotation
		  (активEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u043a\u0442\u0438\u0432 \u044d\u0442\u043e \u043d\u0435\u0447\u0442\u043e \u0438\u043c\u0435\u044e\u0449\u0435\u0435 \u0446\u0435\u043d\u043d\u043e\u0441\u0442\u044c - \u0434\u0435\u043d\u044c\u0433\u0438, \u0442\u043e\u0432\u0430\u0440, \u0443\u0441\u043b\u0443\u0433\u0438 (\u0442\u0440\u0443\u0434).\r\n\r\n\u0425\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u0430\u044f \u0434\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0437\u0430\u043a\u043b\u044e\u0447\u0430\u0435\u0442\u0441\u044f \u0432 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0438 \u0430\u043a\u0442\u0438\u0432\u043e\u0432 \u043c\u0435\u0436\u0434\u0443 \u0441\u0447\u0435\u0442\u0430\u043c\u0438 \u0438 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u0430\u043a\u0442\u0438\u0432\u043e\u0432. \r\n\u0423\u0447\u0451\u0442 \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0439 \u0434\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u0437\u0430\u043a\u043b\u044e\u0447\u0430\u0435\u0442\u0441\u044f \u0432 \u0430\u043a\u043a\u0443\u0440\u0430\u0442\u043d\u043e\u043c \u0444\u0438\u043a\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0438 \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0441 \u0446\u0435\u043b\u044c\u044e \u0441\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043e\u0442\u0447\u0451\u0442\u043d\u043e\u0441\u0442\u0438 \u043a\u043e\u0442\u043e\u0440\u0430\u044f \u043c\u043e\u0436\u0435\u0442\r\n\u0431\u044b\u0442\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0430 \u0434\u043b\u044f \u0430\u043d\u0430\u043b\u0438\u0437\u0430 \u0438 \u043a\u043e\u0440\u0440\u0435\u043a\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u0434\u0435\u044f\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* \u041f\u0440\u043e\u0447\u0438\u0442\u0430\u043d\u0430 \u043b\u0435\u043a\u0446\u0438\u044f \u0437\u0430 \u043d\u0430\u043b\u0438\u0447\u043d\u044b\u0435: \u041e\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0435 \u0443\u0441\u043b\u0443\u0433\u0438 -> \u041a\u043e\u0448\u0435\u043b\u0451\u043a.\r\n* \u041f\u0440\u043e\u0434\u0430\u043d \u0442\u043e\u0432\u0430\u0440: \u0421\u043a\u043b\u0430\u0434 -\u0442\u043e\u0432\u0430\u0440-> \u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c -\u0434\u0435\u043d\u044c\u0433\u0438-> \u041a\u043e\u0448\u0435\u043b\u0451\u043a.\r\n* \u0414\u0435\u043d\u044c\u0433\u0438 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u044b \u0432 \u0431\u0430\u043d\u043a: \u041a\u043e\u0448\u0435\u043b\u0451\u043a -> \u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0438\u0439 \u0441\u0447\u0451\u0442."
		   });	
		addAnnotation
		  (getАктив_ИсточникиКурсов(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0438 \u043a\u0443\u0440\u0441\u0430 \u0434\u0430\u043d\u043d\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0442\u0441\u044f \u0447\u0442\u043e\u0431\u044b \u043f\u043e\u043b\u0443\u0447\u0438\u0442\u044c \u0442\u0435\u043a\u0443\u0449\u0438\u0439 \u0438\u043b\u0438 \u043d\u0430\u0438\u0431\u043e\u043b\u0435\u0435 \u0430\u043a\u043a\u0443\u0440\u0430\u0442\u043d\u044b\u0439 \u043a\u0443\u0440\u0441 \u0430\u043a\u0442\u0438\u0432\u0430 \u043f\u0440\u0438 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0438 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439\r\n\u0438 \u0441\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0438 \u043e\u0442\u0447\u0451\u0442\u043d\u043e\u0441\u0442\u0438."
		   });	
		addAnnotation
		  (getАктив_Группа(), 
		   source, 
		   new String[] {
			 "documentation", "\u0415\u0441\u043b\u0438 \u044d\u0442\u043e\u0442 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d \u0432 true, \u0437\u043d\u0430\u0447\u0438\u0442 \u0430\u043a\u0442\u0438\u0432 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0433\u0440\u0443\u043f\u043f\u043e\u0439.\r\n\u0413\u0440\u0443\u043f\u043f\u0430 \u0430\u043a\u0442\u0438\u0432\u043e\u0432 \u043c\u043e\u0436\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0441\u0443\u0431-\u0430\u043a\u0442\u0438\u0432\u044b, \u043d\u043e \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f\r\n\u0432 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0430\u0445. "
		   });	
		addAnnotation
		  (getАктив_СубАктивы(), 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u043a\u0442\u0438\u0432\u044b \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u043e\u0432\u0430\u043d\u044b \u0432 \u0438\u0435\u0440\u0430\u0440\u0445\u0438\u044e. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440:\r\n\r\n* \u0414\u0435\u043d\u044c\u0433\u0438\r\n    * \u0420\u0443\u0431\u043b\u0438\r\n    * \u0414\u043e\u043b\u043b\u0430\u0440\u044b\r\n    * \u0415\u0432\u0440\u043e\r\n* \u0422\u043e\u0432\u0430\u0440\u044b\r\n    * \u041e\u0432\u043e\u0449\u0438\r\n        * \u041f\u043e\u043c\u0438\u0434\u043e\u0440\u044b\r\n        * \u041e\u0433\u0443\u0440\u0446\u044b\r\n\r\n"
		   });	
		addAnnotation
		  (getАктив_ЕдиницаИзмерения(), 
		   source, 
		   new String[] {
			 "documentation", "\u0415\u0434\u0438\u043d\u0438\u0446\u0430 \u0438\u0437\u043c\u0435\u0440\u0435\u043d\u0438\u044f \u0430\u043a\u0442\u0438\u0432\u0430. \r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043b\u0438\u0442\u0440\u044b, \u0448\u0442\u0443\u043a\u0438, \u043a\u0438\u043b\u043e\u0433\u0440\u0430\u043c\u043c\u044b."
		   });	
		addAnnotation
		  (getАктив_Точность(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0434\u0435\u0441\u044f\u0442\u0438\u0447\u043d\u044b\u0445 \u0437\u043d\u0430\u043a\u043e\u0432 \u043f\u043e\u0441\u043b\u0435 \u0437\u0430\u043f\u044f\u0442\u043e\u0439 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u043c\u044b\u0445 \u043f\u0440\u0438\r\n\u0443\u0447\u0451\u0442\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u0430 \u0430\u043a\u0442\u0438\u0432\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440:\r\n\r\n* 2 \u0434\u043b\u044f \u0434\u043e\u043b\u043b\u0430\u0440\u043e\u0432 \u0438 \u0440\u0443\u0431\u043b\u0435\u0439 - \u043a\u043e\u043f\u0435\u0439\u043a\u0438 \u0438 \u0446\u0435\u043d\u0442\u044b.\r\n* 3 \u0434\u043b\u044f \u043a\u0438\u043b\u043e\u0433\u0440\u0430\u043c\u043c\u043e\u0432 \u0435\u0441\u043b\u0438 \u0438\u0437\u043c\u0435\u0440\u044f\u0442\u0441\u044f \u0441 \u0442\u043e\u0447\u043d\u043e\u0441\u0442\u044c \u0434\u043e \u0433\u0440\u0430\u043c\u043c\u043e\u0432.\r\n* 0 \u0434\u043b\u044f \u043d\u0435\u0434\u0435\u043b\u0438\u043c\u044b\u0445 \u0448\u0442\u0443\u0447\u043d\u044b\u0445 \u0442\u043e\u0432\u0430\u0440\u043e\u0432, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043b\u0430\u043c\u043f\u043e\u0447\u0435\u043a."
		   });	
		addAnnotation
		  (getАктив_Свойства(), 
		   source, 
		   new String[] {
			 "documentation", "\u041e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0441\u0432\u043e\u0439\u0441\u0442\u0432 \u0430\u043a\u0442\u0438\u0432\u0430.\r\n\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u0441\u0432\u043e\u0439\u0441\u0442\u0432 \u0432\u0432\u043e\u0434\u044f\u0442\u0441\u044f \u0432 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0435."
		   });	
		addAnnotation
		  (getАктив_Счета(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0447\u0435\u0442\u0430 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u044e\u0449\u0438\u0435 \u0434\u0430\u043d\u043d\u044b\u0439 \u0430\u043a\u0442\u0438\u0432."
		   });	
		addAnnotation
		  (getАктив_Проводки(), 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043e\u043f\u0438\u0441\u044b\u0432\u0430\u044e\u0449\u0438\u0435 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0434\u0430\u043d\u043d\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430 \u043c\u0435\u0436\u0434\u0443 \u0441\u0447\u0435\u0442\u0430\u043c\u0438."
		   });	
		addAnnotation
		  (свойствоАктиваEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0420\u0430\u0437\u043d\u044b\u0435 \u0430\u043a\u0442\u0438\u0432\u044b \u043c\u043e\u0433\u0443\u0442 \u043e\u0431\u043b\u0430\u0434\u0430\u0442\u044c \u0440\u0430\u0437\u043d\u044b\u043c\u0438 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430\u043c\u0438. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440:\r\n\r\n* \u0414\u0430\u0442\u0430 \u0438\u0441\u0442\u0435\u0447\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u0430 \u0433\u043e\u0434\u043d\u043e\u0441\u0442\u0438 \u0434\u043b\u044f \u043f\u0438\u0449\u0435\u0432\u044b\u0445 \u0442\u043e\u0432\u0430\u0440\u043e\u0432.\r\n* \u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f \u0434\u043b\u044f \u044f\u0438\u0446.\r\n* \u0420\u0430\u0437\u043c\u0435\u0440 \u0434\u043b\u044f \u0440\u0430\u043a\u043e\u0432. "
		   });	
		addAnnotation
		  (getСвойствоАктива_Наименование(), 
		   source, 
		   new String[] {
			 "documentation", "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \"\u0414\u0430\u0442\u0430 \u0438\u0441\u0442\u0435\u0447\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u0430 \u0433\u043e\u0434\u043d\u043e\u0441\u0442\u0438\"."
		   });	
		addAnnotation
		  (getСвойствоАктива_Описание(), 
		   source, 
		   new String[] {
			 "documentation", "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0443\u043a\u0430\u0437\u0430\u043d\u0438\u0435 \u0434\u043b\u0438\u043d\u044b \u043a\u043e\u0440\u043e\u0447\u0435 \u043a\u043e\u0442\u043e\u0440\u043e\u0439 \u0440\u0430\u043a \u0441\u0447\u0438\u0442\u0430\u0435\u0442\u0441\u044f\r\n\u043c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u043c, \u0430 \u0434\u043b\u0438\u043d\u043d\u0435\u0435 \u0431\u043e\u043b\u044c\u0448\u0438\u043c, \u0430 \u0442\u0430\u043a\u0436\u0435 \u043e\u0431\u044a\u044f\u0441\u043d\u0435\u043d\u0438\u0435 \u043a\u0430\u043a \u043c\u0435\u0440\u0438\u0442\u044c - \u0441 \u0443\u0441\u0430\u043c\u0438 \u0438\u043b\u0438 \u0431\u0435\u0437."
		   });	
		addAnnotation
		  (getСвойствоАктива_Тип(), 
		   source, 
		   new String[] {
			 "documentation", "\u0422\u0438\u043f \u0434\u0430\u043d\u043d\u044b\u0445 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 - \u0447\u0438\u0441\u043b\u043e, \u0434\u0430\u0442\u0430, \u0432\u044b\u0431\u043e\u0440(\u041c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u0439, \u0411\u043e\u043b\u044c\u0448\u043e\u0439), ... \r\n\u0424\u043e\u0440\u043c\u0430\u0442 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0442\u0438\u043f\u0430 \u0431\u0443\u0434\u0435\u0442 \u0443\u0442\u043e\u0447\u043d\u0451\u043d \u043f\u043e\u0437\u0436\u0435."
		   });	
		addAnnotation
		  (getСвойствоАктива_НижняяГраница(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u043c\u043e\u0436\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u043c\u043e\u0449\u043d\u043e\u0441\u0442\u044c - \u0442\u0440\u0435\u0431\u0443\u0435\u043c\u043e\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439. \r\n\u0414\u0438\u0430\u043f\u0430\u0437\u043e\u043d \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u0442\u0441\u044f \u043d\u0438\u0436\u043d\u0435\u0439 \u0438 \u0432\u0435\u0440\u0445\u043d\u0435\u0439 \u0433\u0440\u0430\u043d\u0438\u0446\u0435\u0439.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* 0..1 - \u041d\u0435\u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u0441 \u043c\u0430\u043a\u0441\u0438\u043c\u0443\u043c \u043e\u0434\u043d\u0438\u043c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435\u043c.\r\n* 1..1 - \u041e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e (\u043c\u0438\u043d\u0438\u043c\u0443\u043c \u043e\u0434\u043d\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435) \u0441 \u043c\u0430\u043a\u0441\u0438\u043c\u0443\u043c \u043e\u0434\u043d\u0438\u043c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435\u043c.\r\n* 0..-1 - \u041d\u0435\u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u0441 \u043d\u0435\u043e\u0433\u0440\u0430\u043d\u0438\u0447\u0435\u043d\u043d\u044b\u043c \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e\u043c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439.\r\n* 1..-1 - \u041e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u0441 \u043d\u0435\u043e\u0433\u0440\u0430\u043d\u0438\u0447\u0435\u043d\u043d\u044b\u043c \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e\u043c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439. "
		   });	
		addAnnotation
		  (getСвойствоАктива_ВерхняяГраница(), 
		   source, 
		   new String[] {
			 "documentation", "\u0412\u0435\u0440\u0445\u043d\u044f\u044f \u0433\u0440\u0430\u043d\u0438\u0446\u0430 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430."
		   });	
		addAnnotation
		  (значениеСвойстваАктиваEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f (\u0432\u0435\u043b\u0438\u0447\u0438\u043d\u044b) \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0434\u043b\u044f \u0430\u043a\u0442\u0438\u0432\u0430 ``\u0420\u0430\u043a`` \u0438 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 ``\u0420\u0430\u0437\u043c\u0435\u0440`` \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c ``\u0411\u043e\u043b\u044c\u0448\u043e\u0439``."
		   });	
		addAnnotation
		  (getЗначениеСвойстваАктива_Свойство(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0441\u044b\u043b\u043a\u0430 \u043d\u0430 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e."
		   });	
		addAnnotation
		  (getЗначениеСвойстваАктива_Значения(), 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0432 \u0442\u0435\u043a\u0441\u0442\u043e\u0432\u043e\u043c \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0438."
		   });	
		addAnnotation
		  (источникКурсаАктиваEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u044b\u0439 \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441. "
		   });	
		addAnnotation
		  (getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList(), 
		   source, 
		   new String[] {
			 "documentation", "\u042d\u0442\u0430 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u0432\u044b\u0437\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043f\u0440\u0438 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0438 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0438 \u0441\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0438 \u043e\u0442\u0447\u0451\u0442\u043d\u043e\u0441\u0442\u0438\r\n\u0441 \u0446\u0435\u043b\u044c\u044e \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u044f \u0442\u0435\u043a\u0443\u0449\u0435\u0433\u043e \u0438\u043b\u0438 \u043d\u0430\u0438\u0431\u043e\u043b\u0435\u0435 \u0430\u043a\u043a\u0443\u0440\u0430\u0442\u043d\u043e\u0433\u043e \u043a\u0443\u0440\u0441\u0430 \u0430\u043a\u0442\u0438\u0432\u0430 \u043f\u043e \u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u044e \u043a \u0434\u0440\u0443\u0433\u043e\u043c\u0443 \u0430\u043a\u0442\u0438\u0432\u0443.\r\n\r\n\u0414\u0430\u0442\u0430 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u043c\u043e\u0433\u043e \u043a\u0443\u0440\u0441\u0430 \u043d\u0435 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e \u0434\u043e\u043b\u0436\u043d\u0430 \u0441\u043e\u0432\u043f\u0430\u0434\u0430\u0442\u044c \u0441 \u0437\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u043c\u043e\u0439 \u0434\u0430\u0442\u043e\u0439. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043a\u0443\u0440\u0441 \u0434\u043e\u043b\u043b\u0430\u0440\u0430 \u043f\u043e \u0426\u0435\u043d\u0442\u0440\u043e\u0431\u0430\u043d\u043a\u0443 \u0432\u044b\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0432 \u0434\u0430\u0442\u044b \u043a\u043e\u0433\u0434\u0430 \u0431\u044b\u043b\u0438 \u0442\u043e\u0440\u0433\u0438. \r\n\u0421\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0435\u043d\u043d\u043e \u0435\u0441\u043b\u0438 \u0437\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u043c\u0430\u044f \u0434\u0430\u0442\u0430 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0432\u044b\u0445\u043e\u0434\u043d\u044b\u043c \u0438\u043b\u0438 \u043f\u0440\u0430\u0437\u0434\u043d\u0438\u043a\u0430\u043c, \u0442\u043e \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0451\u043d\u043d\u044b\u0439 \u043a\u0443\u0440\u0441 \u0431\u0443\u0434\u0435\u0442 \u0438\u043c\u0435\u0442\u044c \u0434\u0430\u0442\u0443 \u043f\u043e\u0441\u043b\u0435\u0434\u043d\u0438\u0445 \u0442\u043e\u0440\u0433\u043e\u0432.\r\n\r\n\u0415\u0441\u043b\u0438 \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a \u043d\u0435 \u0438\u043c\u0435\u0435\u0442 \u0434\u0430\u043d\u043d\u044b\u0445 \u043e \u043a\u0443\u0440\u0441\u0435, \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u0442\u0441\u044f ``null``."
		   });	
		addAnnotation
		  ((getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "\u0414\u0430\u0442\u0430 \u0437\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u043a\u0443\u0440\u0441\u0430."
		   });	
		addAnnotation
		  ((getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0430\u043a\u0442\u0438\u0432\u0430 \u043c\u043e\u0436\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044f\u043c\u0438 \u043a\u0443\u0440\u0441\u0430\r\n \u0434\u043b\u044f \u043a\u0430\u043b\u044c\u043a\u0443\u043b\u044f\u0446\u0438\u0438 \u043e\u043f\u0442\u043e\u0432\u044b\u0445 \u0441\u043a\u0438\u0434\u043e\u043a."
		   });	
		addAnnotation
		  ((getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u0441\u0432\u043e\u0439\u0441\u0442\u0432 \u043c\u043e\u0433\u0443\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044f\u043c\u0438 \u043a\u0443\u0440\u0441\u0430. \r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* \u0415\u0441\u043b\u0438 \u0431\u043b\u0438\u0437\u043a\u0430 \u0434\u0430\u0442\u0430 \u0438\u0441\u0442\u0435\u0447\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u0430 \u0433\u043e\u0434\u043d\u043e\u0441\u0442\u0438 \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044c \u043c\u043e\u0436\u0435\u0442 \u0443\u043c\u0435\u043d\u044c\u0448\u0438\u0442\u044c \u043a\u0443\u0440\u0441 \u0430\u043a\u0442\u0438\u0432\u0430 \u043f\u043e \u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u044e \u043a \u0431\u0430\u0437\u043e\u0432\u043e\u0439.\r\n* \u0412\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044c \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u0438 \u0440\u0430\u043a\u043e\u0432 \u043c\u043e\u0436\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u0440\u0430\u0437\u043c\u0435\u0440 (\u0411\u043e\u043b\u044c\u0448\u0438\u0435) \u0438 \u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u0443\u0440\u0441 (3) \u0438 \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u044c \u0447\u0442\u043e \u0431\u043e\u043b\u044c\u0448\u0438\u0435 \u0440\u0430\u043a\u0438 \u043f\u043e 5 \u0442.\u043a. \u043c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u0435 \u043f\u043e 3 (\u0431\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u0443\u0440\u0441 \u043f\u0440\u0435\u0434\u043f\u043e\u043b\u0430\u0433\u0430\u0435\u0442\u0441\u044f \u0434\u043b\u044f \u043c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u0445 \u0440\u0430\u043a\u043e\u0432).\r\n\r\n"
		   });	
		addAnnotation
		  ((getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "documentation", "\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u0443\u0440\u0441 \u043c\u043e\u0436\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044f\u043c\u0438 \u043a\u0443\u0440\u0441\u043e\u0432."
		   });	
		addAnnotation
		  ((getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList()).getEParameters().get(4), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u043c\u043e\u0433\u0443\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044f\u043c\u0438 \u043a\u0443\u0440\u0441\u043e\u0432.\r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044c \u043c\u043e\u0436\u0435\u0442 \u043f\u043e\u0434\u0441\u0447\u0438\u0442\u0430\u0442\u044c \u043e\u0431\u043e\u0440\u043e\u0442\u044b \u0441 \u0434\u0430\u043d\u043d\u044b\u043c \u0441\u0443\u0431\u044a\u0435\u043a\u0442\u043e\u043c\r\n\u0438 \u0443\u043c\u0435\u043d\u044c\u0448\u0438\u0442\u044c \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u0430\u043a\u0442\u0438\u0432\u0430 \"\u0437\u0430 \u043b\u043e\u044f\u043b\u044c\u043d\u043e\u0441\u0442\u044c\"."
		   });	
		addAnnotation
		  (getИсточникКурсаАктива_НачалоПериодаДействия(), 
		   source, 
		   new String[] {
			 "documentation", "\u041d\u0430\u0447\u0430\u043b\u043e \u043f\u0435\u0440\u0438\u043e\u0434\u0430 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0430."
		   });	
		addAnnotation
		  (getИсточникКурсаАктива_КонецПериодаДействия(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043d\u0435\u0446 \u043f\u0435\u0440\u0438\u043e\u0434\u0430 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0430. \u0415\u0441\u043b\u0438 \u043d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d, \u0437\u043d\u0430\u0447\u0438\u0442 \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\r\n\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u0435\u043d \u0434\u043e \u043d\u0430\u0447\u0430\u043b\u0430 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0435\u0433\u043e \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0430 \u043f\u0440\u0438 \u0443\u0441\u043b\u043e\u0432\u0438\u0438\r\n\u0447\u0442\u043e \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0438 \u0443\u043f\u043e\u0440\u044f\u0434\u043e\u0447\u0435\u043d\u044b \u043f\u043e \u0434\u0430\u0442\u0430\u043c \u043d\u0430\u0447\u0430\u043b\u0430 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f."
		   });	
		addAnnotation
		  (getИсточникКурсаАктива_БазовыйАктив(), 
		   source, 
		   new String[] {
			 "documentation", "\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u0430\u043a\u0442\u0438\u0432 \u0434\u043b\u044f \u043a\u0443\u0440\u0441\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0440\u0443\u0431\u043b\u0438 \u0434\u043b\u044f \u0434\u043e\u043b\u043b\u0430\u0440\u043e\u0432 \u0438\u043b\u0438 \u0434\u043e\u043b\u043b\u0430\u0440\u044b \u0434\u043b\u044f\r\n\u0442\u043e\u0432\u0430\u0440\u043e\u0432 \u043a\u0443\u043f\u043b\u0435\u043d\u043d\u044b\u0445 \u0437\u0430 \u0434\u043e\u043b\u043b\u0430\u0440\u044b."
		   });	
		addAnnotation
		  (getИсточникКурсаАктива_Комментарий(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043c\u043c\u0435\u043d\u0442\u0430\u0440\u0438\u0439 \u043a \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0443."
		   });	
		addAnnotation
		  (фиксированныйКурсEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0424\u0438\u043a\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u043a\u0443\u0440\u0441 \u0432\u0432\u043e\u0434\u0438\u0442\u0441\u044f \u0432\u0440\u0443\u0447\u043d\u0443\u044e \u0438\u043b\u0438 \u0438\u043c\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442\u0441\u044f \u0438\u0437 \u0432\u043d\u0435\u0448\u043d\u0435\u0433\u043e\r\n\u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0430."
		   });	
		addAnnotation
		  (getФиксированныйКурс_Курс(), 
		   source, 
		   new String[] {
			 "documentation", "\u0412\u0435\u043b\u0438\u0447\u0438\u043d\u0430 \u043a\u0443\u0440\u0441\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 ``60.66`` \u0434\u043b\u044f \u0434\u043e\u043b\u043b\u0430\u0440\u0430 \u043a \u0440\u0443\u0431\u043b\u044e."
		   });	
		addAnnotation
		  (вычислительКурсаEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0412\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044c \u043a\u0443\u0440\u0441\u0430 \u0438\u0441\u043f\u043e\u043b\u043d\u044f\u0435\u0442 \u042f\u0432\u0430 \u043a\u043e\u0434 \u0447\u0442\u043e\u0431\u044b \u0432\u044b\u0447\u0438\u0441\u043b\u0438\u0442\u044c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043a\u0443\u0440\u0441\u0430.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440\u044b:\r\n\r\n* \u041a\u0443\u0440\u0441 \u043c\u043e\u0436\u0435\u0442 \u0437\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u0442\u044c\u0441\u044f \u0447\u0435\u0440\u0435\u0437 \u0438\u043d\u0442\u0435\u0440\u043d\u0435\u0442 \u0441 http://www.cbr-xml-daily.ru/\r\n* \u041a\u0443\u0440\u0441 \u043c\u043e\u0436\u0435\u0442 \u0432\u044b\u0447\u0438\u0441\u043b\u044f\u0442\u044c\u0441\u044f \u0438\u0437 \u0431\u0430\u0437\u043e\u0432\u043e\u0433\u043e \u043a\u0443\u0440\u0441\u0430 (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0444\u0438\u043a\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0433\u043e \u043a\u0443\u0440\u0441\u0430/\u0446\u0435\u043d\u044b \u0442\u043e\u0432\u0430\u0440\u0430) \u0438 \u0441\u0432\u043e\u0439\u0441\u0442\u0432 \u0442\u043e\u0432\u0430\u0440\u0430 (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0434\u0430\u0442\u044b \u0438\u0441\u0442\u0435\u0447\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u0430 \u0433\u043e\u0434\u043d\u043e\u0441\u0442\u0438)."
		   });	
		addAnnotation
		  (getВычислительКурса_Код(), 
		   source, 
		   new String[] {
			 "documentation", "\u042f\u0432\u0430 \u043a\u043e\u0434 \u0432\u044b\u0447\u0438\u0441\u043b\u044f\u044e\u0449\u0438\u0439 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043a\u0443\u0440\u0441\u0430."
		   });	
		addAnnotation
		  (операцияEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u0430\u043f\u0438\u0441\u044c \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0439 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (getОперация_ДатаОперации(), 
		   source, 
		   new String[] {
			 "documentation", "\u0414\u0430\u0442\u0430 \u0441\u043e\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f \u0438\u043b\u0438 \u0437\u0430\u043f\u0438\u0441\u0438 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (getОперация_ПервичныйВвод(), 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0435\u0440\u0432\u0438\u0447\u043d\u044b\u0439 \u0432\u0432\u043e\u0434 \u043e\u0437\u043d\u0430\u0447\u0430\u0435\u0442 \u0447\u0442\u043e \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0432\u0432\u0435\u0434\u0435\u043d\u043e, \u043d\u043e \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438\r\n\u043f\u043e \u0441\u0447\u0435\u0442\u0430\u043c \u043b\u0438\u0431\u043e \u043d\u0435 \u0441\u0434\u0435\u043b\u0430\u043d\u044b, \u043b\u0438\u0431\u043e \u0441\u0434\u0435\u043b\u0430\u043d\u044b \u043d\u0435 \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e."
		   });	
		addAnnotation
		  (getОперация_Проводки(), 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0438 \u043f\u043e \u0441\u0447\u0435\u0442\u0430\u043c. \u0410\u043a\u0442\u0438\u0432\u044b \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u0440\u0430\u0437\u043d\u044b\u043c\u0438, \u043d\u043e \u0441\u0443\u043c\u043c\u0430 \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a \u0432 \u043f\u0435\u0440\u0435\u0441\u0447\u0451\u0442\u0435 \u043d\u0430 \u0430\u043a\u0442\u0438\u0432 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c\r\n\u0440\u0430\u0432\u043d\u0430 \u043d\u0443\u043b\u044e. \u0421\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0435\u043d\u043d\u043e, \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f \u0434\u043e\u043b\u0436\u043d\u0430 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u0431\u043e\u043b\u0435\u0435 \u043e\u0434\u043d\u043e\u0439 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438.\r\n\r\n\u041f\u0440\u0438\u043c\u0435\u0440 - \u043f\u0440\u043e\u0434\u0430\u0436\u0430 \u043a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440\u0430 \u0437\u0430 \u0440\u0443\u0431\u043b\u0438:\r\n\r\n* \u041a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440 \u0441\u043f\u0438\u0441\u0430\u043d \u0441\u043e \u0441\u043a\u043b\u0430\u0434\u0430.\r\n* \u0420\u0443\u0431\u043b\u0438 \u0437\u0430\u0447\u0438\u0441\u043b\u0435\u043d\u044b \u0432 \u043a\u0430\u0441\u0441\u0443.\r\n\r\n\u041a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440 \u0431\u044b\u043b \u043f\u0440\u0438\u043e\u0431\u0440\u0435\u0442\u0451\u043d \u0437\u0430 \u0434\u043e\u043b\u043b\u0430\u0440\u044b \u0438 \u0444\u0438\u043a\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u043a\u0443\u0440\u0441 \u043a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d \u0432 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u043a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440\u0430 \u043d\u0430 \u0434\u0430\u0442\u0443 \u043f\u043e\u043a\u0443\u043f\u043a\u0438 \u043f\u043e \u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u044e \u043a \u0434\u043e\u043b\u043b\u0430\u0440\u0430\u043c.\r\n\u0421\u0438\u0441\u0442\u0435\u043c\u0430 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u0442 \"\u043f\u0443\u0442\u044c \u043f\u0435\u0440\u0435\u0441\u0447\u0451\u0442\u0430 \u043a\u0443\u0440\u0441\u0430\" \u043a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440 -> \u0434\u043e\u043b\u043b\u0430\u0440\u044b -> \u0440\u0443\u0431\u043b\u0438 \u0438 \u0432\u044b\u0447\u0438\u0441\u043b\u044f\u0435\u0442 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u043a\u043e\u043c\u043f\u044c\u044e\u0442\u0435\u0440\u0430 \u0432 \u0440\u0443\u0431\u043b\u044f\u0445 \u043d\u0430 \u0434\u0430\u0442\u0443 \u0441\u043e\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438. \r\n\u0420\u0430\u0437\u043d\u0438\u0446\u0430 \u043c\u0435\u0436\u0434\u0443 \u043f\u043e\u043a\u0443\u043f\u043d\u043e\u0439 \u0438 \u043f\u0440\u043e\u0434\u0430\u0436\u043d\u043e\u0439 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c\u044e \u0437\u0430\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0432 \u043f\u0440\u0438\u0431\u044b\u043b\u0438 \u0438 \u0443\u0431\u044b\u0442\u043a\u0438."
		   });	
		addAnnotation
		  (getОперация_Создатель(), 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c \u0441\u043e\u0437\u0434\u0430\u0432\u0448\u0438\u0439 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044e."
		   });	
		addAnnotation
		  (getОперация_Субъекты(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u044b \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u044e\u0449\u0438\u0435 \u0443\u0447\u0430\u0441\u0442\u0438\u0435 \u0432 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c."
		   });	
		addAnnotation
		  (проводкаEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0440\u043e\u0432\u043e\u0434\u043a\u0430 \u044d\u0442\u043e \u0447\u0430\u0441\u0442\u044c \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u043e\u043f\u0438\u0441\u044b\u0432\u0430\u044e\u0449\u0430\u044f \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0430\u043a\u0442\u0438\u0432\u0430 \u043f\u043e \u0441\u0447\u0451\u0442\u0443."
		   });	
		addAnnotation
		  (getПроводка_ДатаПроводки(), 
		   source, 
		   new String[] {
			 "documentation", "\u0414\u0430\u0442\u0430 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438, \u043c\u043e\u0436\u0435\u0442 \u043e\u0442\u043b\u0438\u0447\u0430\u0442\u044c\u0441\u044f \u043e\u0442 \u0434\u0430\u0442\u044b \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438."
		   });	
		addAnnotation
		  (getПроводка_Счёт(), 
		   source, 
		   new String[] {
			 "documentation", "\u0421\u0447\u0451\u0442 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438."
		   });	
		addAnnotation
		  (getПроводка_Актив(), 
		   source, 
		   new String[] {
			 "documentation", "\u0410\u043a\u0442\u0438\u0432 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438. \u0414\u043e\u043b\u0436\u0435\u043d \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0442\u044c\u0441\u044f \u0441\u0447\u0451\u0442\u043e\u043c."
		   });	
		addAnnotation
		  (getПроводка_Количество(), 
		   source, 
		   new String[] {
			 "documentation", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0430\u043a\u0442\u0438\u0432\u0430."
		   });	
		addAnnotation
		  (getПроводка_Сверено(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u043d\u0434\u0438\u043a\u0430\u0442\u043e\u0440 \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u044e\u0449\u0438\u0439 \u043d\u0430 \u0442\u043e \u0447\u0442\u043e \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0430 \u0441\u0432\u0435\u0440\u0435\u043d\u0430 \u0441 \u0432\u044b\u043f\u0438\u0441\u043a\u0430\u043c\u0438 \u043a\u043e\u0440\u0440\u0435\u0441\u043f\u043e\u043d\u0434\u0435\u043d\u0442\u0430,\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u0430."
		   });	
		addAnnotation
		  (getПроводка_БалансирующаяПроводка(), 
		   source, 
		   new String[] {
			 "documentation", "\u0418\u043d\u0434\u0438\u043a\u0430\u0442\u043e\u0440 \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u0443\u044e\u0449\u0435\u0439 \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0438. \u0411\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u0443\u044e\u0449\u0430\u044f \u043f\u0440\u043e\u0432\u043e\u0434\u043a\u0430 \u043f\u0440\u0438\u0432\u043e\u0434\u0438\u0442\r\n\u0431\u0430\u043b\u0430\u043d\u0441 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0432 \u043d\u043e\u043b\u044c \u043f\u043e \u043a\u0443\u0440\u0441\u0443 \u043d\u0430 \u043c\u043e\u043c\u0435\u043d\u0442 \u0441\u043e\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438.\r\n\r\n\u041f\u0440\u0438 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0438 \u043a\u0443\u0440\u0441\u043e\u0432, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u043f\u0440\u0438 \u043a\u043e\u0440\u0440\u0435\u043a\u0446\u0438\u0438 \u043e\u0448\u0438\u0431\u043e\u0447\u043d\u043e\u0433\u043e \u0432\u0432\u043e\u0434\u0430, \r\n\u0441\u0438\u0441\u0442\u0435\u043c\u0430 \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0435\u0440\u0435\u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 \"\u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e\" \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u0443\u044e\u0449\u0438\u0445 \u043f\u0440\u043e\u0432\u043e\u0434\u043e\u043a."
		   });	
		addAnnotation
		  (getПроводка_ЗначенияСвойствАктива(), 
		   source, 
		   new String[] {
			 "documentation", "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u0441\u0432\u043e\u0439\u0441\u0442\u0432 \u0430\u043a\u0442\u0438\u0432\u0430. \u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0434\u0430\u0442\u0430 \u0438\u0441\u0442\u0435\u0447\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u0430 \u0433\u043e\u0434\u043d\u043e\u0441\u0442\u0438 \u0442\u043e\u0432\u0430\u0440\u0430."
		   });	
		addAnnotation
		  (субъектEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0438\u043b\u0438 \u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u043b\u0438\u0446\u043e \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u044e\u0449\u0435\u0435 \u0443\u0447\u0430\u0441\u0442\u0438\u0435 \u0432 \u0445\u043e\u0437\u044f\u0439\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\u0445. \r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0431\u0430\u043d\u043a \u0438\u043b\u0438 \u043f\u043e\u0441\u0442\u043e\u044f\u043d\u043d\u044b\u0439 \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c."
		   });	
		addAnnotation
		  (getСубъект_Операции(), 
		   source, 
		   new String[] {
			 "documentation", "\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0432 \u043a\u043e\u0442\u043e\u0440\u044b\u0445 \u0441\u0443\u0431\u044a\u0435\u043a\u0442 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u043b \u0443\u0447\u0430\u0441\u0442\u0438\u0435. \r\n\u041d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u043f\u043e\u043a\u0443\u043f\u043a\u0438 \u043f\u0440\u043e\u0438\u0437\u0432\u0435\u0434\u0451\u043d\u043d\u044b\u0435 \u043f\u043e\u0441\u0442\u043e\u044f\u043d\u043d\u044b\u043c \u043f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u0435\u043c."
		   });	
		addAnnotation
		  (курсАктиваEDataType, 
		   source, 
		   new String[] {
			 "documentation", "\u0421 \u0446\u0435\u043b\u044c\u044e \u0431\u0430\u043b\u0430\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0439 \u0438 \u0441\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043e\u0442\u0447\u0451\u0442\u043d\u043e\u0441\u0442\u0438 \u0434\u043e\u043b\u0436\u043d\u043e \u0431\u044b\u0442\u044c \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u044b\u0432\u0430\u0442\u044c \u0432\u0435\u043b\u0438\u0447\u0438\u043d\u0443 \u043e\u0434\u043d\u043e\u0433\u043e \u0430\u043a\u0442\u0438\u0432\u0430 \u0432 \u0432\u0435\u043b\u0438\u0447\u0438\u043d\u0443 \u0434\u0440\u0443\u0433\u043e\u0433\u043e.\r\n\u041a\u043e\u044d\u0444\u0444\u0438\u0446\u0438\u0435\u043d\u0442 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043d\u0430\u0437\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043a\u0443\u0440\u0441\u043e\u043c \u043f\u043e \u0430\u043d\u0430\u043b\u043e\u0433\u0438\u0438 \u0441 \u043a\u0443\u0440\u0441\u043e\u043c \u0432\u0430\u043b\u044e\u0442. \u0414\u043b\u044f \u0442\u043e\u0432\u0430\u0440\u043e\u0432 \u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c \u0442\u0430\u0432\u0430\u0440\u0430 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0435\u0433\u043e \"\u043a\u0443\u0440\u0441\u043e\u043c\"."
		   });	
		addAnnotation
		  (отчётныйПериодEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u041f\u0435\u0440\u0438\u043e\u0434 \u0437\u0430 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0433\u0435\u043d\u0435\u0440\u0438\u0440\u0443\u0435\u0442\u0441\u044f \u043e\u0442\u0447\u0451\u0442."
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web.render</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.nasdanika.cdo.web.render";	
		addAnnotation
		  (элементМоделиEClass, 
		   source, 
		   new String[] {
			 "label", "{{\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435}}"
		   });
	}

} //LedgerPackageImpl
