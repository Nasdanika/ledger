/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.LoginPasswordProtectionDomain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Учётный Центр</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.УчётныйЦентр#getХранителиЖурналовОпераций <em>Хранители Журналов Операций</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getУчётныйЦентр()
 * @model
 * @generated
 */
public interface УчётныйЦентр extends LoginPasswordProtectionDomain, ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Хранители Журналов Операций</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.ХранительЖурналовОпераций}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Хранители Журналов Операций</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Хранители Журналов Операций</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getУчётныйЦентр_ХранителиЖурналовОпераций()
	 * @model containment="true"
	 * @generated
	 */
	EList<ХранительЖурналовОпераций> getХранителиЖурналовОпераций();
} // УчётныйЦентр
