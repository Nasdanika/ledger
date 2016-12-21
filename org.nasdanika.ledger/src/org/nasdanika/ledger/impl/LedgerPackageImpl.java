/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.ledger.Ledger;
import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.УчётныйЦентр;
import org.nasdanika.ledger.ЭлементМодели;

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
	private EClass ledgerEClass = null;

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

		// Create package meta-data objects
		theLedgerPackage.createPackageContents();

		// Initialize created meta-data
		theLedgerPackage.initializePackageContents();

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
	public EClass getLedger() {
		return ledgerEClass;
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
		ledgerEClass = createEClass(LEDGER);

		учётныйЦентрEClass = createEClass(УЧЁТНЫЙ_ЦЕНТР);

		элементМоделиEClass = createEClass(ЭЛЕМЕНТ_МОДЕЛИ);
		createEAttribute(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ);
		createEAttribute(элементМоделиEClass, ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		учётныйЦентрEClass.getESuperTypes().add(this.getЭлементМодели());

		// Initialize classes, features, and operations; add parameters
		initEClass(ledgerEClass, Ledger.class, "Ledger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(учётныйЦентрEClass, УчётныйЦентр.class, "УчётныйЦентр", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(элементМоделиEClass, ЭлементМодели.class, "ЭлементМодели", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getЭлементМодели_Наименование(), ecorePackage.getEString(), "наименование", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getЭлементМодели_Описание(), ecorePackage.getEString(), "описание", null, 0, 1, ЭлементМодели.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
			 "documentation", "\u0422\u0435\u0441\u0442 \u0440\u0443\u0441\u0441\u043a\u043e\u0439 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430\u0446\u0438\u0438 \u0432 \u043c\u043e\u0434\u0435\u043b\u0438."
		   });
	}

} //LedgerPackageImpl
