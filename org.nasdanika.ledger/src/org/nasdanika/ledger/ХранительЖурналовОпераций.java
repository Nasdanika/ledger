/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Хранитель Журналов Операций</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.ХранительЖурналовОпераций#getЖурналыОпераций <em>Журналы Операций</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getХранительЖурналовОпераций()
 * @model abstract="true"
 * @generated
 */
public interface ХранительЖурналовОпераций extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Журналы Операций</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.ЖурналОпераций}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Журналы Операций</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Журналы Операций</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getХранительЖурналовОпераций_ЖурналыОпераций()
	 * @model containment="true"
	 * @generated
	 */
	EList<ЖурналОпераций> getЖурналыОпераций();
} // ХранительЖурналовОпераций
