/**
 */
package org.nasdanika.ledger;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Фиксированный Отчётный Период</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод#getНачалоПериода <em>Начало Периода</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод#getКонецПериода <em>Конец Периода</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getФиксированныйОтчётныйПериод()
 * @model
 * @generated
 */
public interface ФиксированныйОтчётныйПериод extends ОтчётныйПериод {
	/**
	 * Returns the value of the '<em><b>Начало Периода</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Начало Периода</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Начало Периода</em>' attribute.
	 * @see #setНачалоПериода(Date)
	 * @see org.nasdanika.ledger.LedgerPackage#getФиксированныйОтчётныйПериод_НачалоПериода()
	 * @model
	 * @generated
	 */
	Date getНачалоПериода();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод#getНачалоПериода <em>Начало Периода</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Начало Периода</em>' attribute.
	 * @see #getНачалоПериода()
	 * @generated
	 */
	void setНачалоПериода(Date value);

	/**
	 * Returns the value of the '<em><b>Конец Периода</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Конец Периода</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Конец Периода</em>' attribute.
	 * @see #setКонецПериода(Date)
	 * @see org.nasdanika.ledger.LedgerPackage#getФиксированныйОтчётныйПериод_КонецПериода()
	 * @model
	 * @generated
	 */
	Date getКонецПериода();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод#getКонецПериода <em>Конец Периода</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Конец Периода</em>' attribute.
	 * @see #getКонецПериода()
	 * @generated
	 */
	void setКонецПериода(Date value);

} // ФиксированныйОтчётныйПериод
