/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Тест русской документации в модели.
 * <!-- end-model-doc -->
 * @see org.nasdanika.ledger.LedgerFactory
 * @model kind="package"
 * @generated
 */
public interface LedgerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ledger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.ledger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.ledger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerPackage eINSTANCE = org.nasdanika.ledger.impl.LedgerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.LedgerImpl <em>Ledger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.LedgerImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getLedger()
	 * @generated
	 */
	int LEDGER = 0;

	/**
	 * The number of structural features of the '<em>Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDGER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl <em>Элемент Модели</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ЭлементМоделиImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЭлементМодели()
	 * @generated
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ = 2;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ = 0;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ = 1;

	/**
	 * The number of structural features of the '<em>Элемент Модели</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Элемент Модели</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl <em>Учётный Центр</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.УчётныйЦентрImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getУчётныйЦентр()
	 * @generated
	 */
	int УЧЁТНЫЙ_ЦЕНТР = 1;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The number of structural features of the '<em>Учётный Центр</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Учётный Центр</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Ledger <em>Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ledger</em>'.
	 * @see org.nasdanika.ledger.Ledger
	 * @generated
	 */
	EClass getLedger();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.УчётныйЦентр <em>Учётный Центр</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Учётный Центр</em>'.
	 * @see org.nasdanika.ledger.УчётныйЦентр
	 * @generated
	 */
	EClass getУчётныйЦентр();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ЭлементМодели <em>Элемент Модели</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Элемент Модели</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели
	 * @generated
	 */
	EClass getЭлементМодели();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Наименование</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getНаименование()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EAttribute getЭлементМодели_Наименование();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Описание</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getОписание()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EAttribute getЭлементМодели_Описание();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LedgerFactory getLedgerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.LedgerImpl <em>Ledger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.LedgerImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getLedger()
		 * @generated
		 */
		EClass LEDGER = eINSTANCE.getLedger();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl <em>Учётный Центр</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.УчётныйЦентрImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getУчётныйЦентр()
		 * @generated
		 */
		EClass УЧЁТНЫЙ_ЦЕНТР = eINSTANCE.getУчётныйЦентр();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl <em>Элемент Модели</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ЭлементМоделиImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЭлементМодели()
		 * @generated
		 */
		EClass ЭЛЕМЕНТ_МОДЕЛИ = eINSTANCE.getЭлементМодели();
		/**
		 * The meta object literal for the '<em><b>Наименование</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ = eINSTANCE.getЭлементМодели_Наименование();
		/**
		 * The meta object literal for the '<em><b>Описание</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ = eINSTANCE.getЭлементМодели_Описание();

	}

} //LedgerPackage
