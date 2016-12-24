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
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ModelElementImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.HubImpl <em>Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.HubImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getHub()
	 * @generated
	 */
	int HUB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.UserImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.OrganizationImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 4;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.LegderContainerImpl <em>Legder Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.LegderContainerImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getLegderContainer()
	 * @generated
	 */
	int LEGDER_CONTAINER = 5;

	/**
	 * The number of structural features of the '<em>Legder Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGDER_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Legder Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGDER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.СчётImpl <em>Счёт</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.СчётImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСчёт()
	 * @generated
	 */
	int СЧЁТ = 6;

	/**
	 * The number of structural features of the '<em>Счёт</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Счёт</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.AssetImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 7;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.OperationImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ItemImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.RateImpl <em>Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.RateImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getRate()
	 * @generated
	 */
	int RATE = 10;

	/**
	 * The number of structural features of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.PartyImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 11;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Hub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub</em>'.
	 * @see org.nasdanika.ledger.Hub
	 * @generated
	 */
	EClass getHub();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.ledger.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.ledger.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.ledger.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.ledger.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.ledger.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.LegderContainer <em>Legder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legder Container</em>'.
	 * @see org.nasdanika.ledger.LegderContainer
	 * @generated
	 */
	EClass getLegderContainer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Счёт <em>Счёт</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Счёт</em>'.
	 * @see org.nasdanika.ledger.Счёт
	 * @generated
	 */
	EClass getСчёт();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.nasdanika.ledger.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.nasdanika.ledger.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.nasdanika.ledger.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate</em>'.
	 * @see org.nasdanika.ledger.Rate
	 * @generated
	 */
	EClass getRate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.nasdanika.ledger.Party
	 * @generated
	 */
	EClass getParty();

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
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.HubImpl <em>Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.HubImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getHub()
		 * @generated
		 */
		EClass HUB = eINSTANCE.getHub();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ModelElementImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.UserImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.OrganizationImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.LegderContainerImpl <em>Legder Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.LegderContainerImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getLegderContainer()
		 * @generated
		 */
		EClass LEGDER_CONTAINER = eINSTANCE.getLegderContainer();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.СчётImpl <em>Счёт</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.СчётImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСчёт()
		 * @generated
		 */
		EClass СЧЁТ = eINSTANCE.getСчёт();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.AssetImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.OperationImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ItemImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.RateImpl <em>Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.RateImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getRate()
		 * @generated
		 */
		EClass RATE = eINSTANCE.getRate();
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.PartyImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

	}

} //LedgerPackage
