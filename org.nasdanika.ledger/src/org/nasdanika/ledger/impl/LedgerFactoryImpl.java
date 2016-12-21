/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.ledger.*;

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
			case LedgerPackage.LEDGER: return (EObject)createLedger();
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР: return (EObject)createУчётныйЦентр();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ledger createLedger() {
		LedgerImpl ledger = new LedgerImpl();
		return ledger;
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
