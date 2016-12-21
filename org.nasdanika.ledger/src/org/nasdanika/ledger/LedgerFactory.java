/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.ledger.LedgerPackage
 * @generated
 */
public interface LedgerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerFactory eINSTANCE = org.nasdanika.ledger.impl.LedgerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ledger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ledger</em>'.
	 * @generated
	 */
	Ledger createLedger();

	/**
	 * Returns a new object of class '<em>Учётный Центр</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Учётный Центр</em>'.
	 * @generated
	 */
	УчётныйЦентр createУчётныйЦентр();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LedgerPackage getLedgerPackage();

} //LedgerFactory
