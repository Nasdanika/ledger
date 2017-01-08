/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.LoginPasswordHashUser;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Пользователь</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Пользователь#getПрава <em>Права</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getПользователь()
 * @model
 * @generated
 */
public interface Пользователь extends LoginPasswordHashUser, ХранительЖурналовОпераций {

	/**
	 * Returns the value of the '<em><b>Права</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Право}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Права</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Права</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getПользователь_Права()
	 * @model containment="true"
	 * @generated
	 */
	EList<Право> getПрава();
} // Пользователь
