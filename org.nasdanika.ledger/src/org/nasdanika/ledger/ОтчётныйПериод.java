/**
 */
package org.nasdanika.ledger;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Отчётный Период</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Период за который генерируется отчёт.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.ledger.LedgerPackage#getОтчётныйПериод()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ОтчётныйПериод extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Date getНачалоПериода();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Date getКонецПериода();

} // ОтчётныйПериод
