/**
 */
package org.nasdanika.ledger;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Фиксированный Курс</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ФиксированныйКурс#getКурс <em>Курс</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getФиксированныйКурс()
 * @model
 * @generated
 */
public interface ФиксированныйКурс extends ИсточникКурсаАктива {
	/**
	 * Returns the value of the '<em><b>Курс</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Курс</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Курс</em>' attribute.
	 * @see #setКурс(BigDecimal)
	 * @see org.nasdanika.ledger.LedgerPackage#getФиксированныйКурс_Курс()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getКурс();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ФиксированныйКурс#getКурс <em>Курс</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Курс</em>' attribute.
	 * @see #getКурс()
	 * @generated
	 */
	void setКурс(BigDecimal value);

} // ФиксированныйКурс
