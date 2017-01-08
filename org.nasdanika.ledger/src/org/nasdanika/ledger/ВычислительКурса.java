/**
 */
package org.nasdanika.ledger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Вычислитель Курса</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Вычислитель курса исполняет Ява код чтобы вычислить значение курса.
 * 
 * Примеры:
 * 
 * * Курс может запрашиваться через интернет с http://www.cbr-xml-daily.ru/
 * * Курс может вычисляться из базового курса (например фиксированного курса/цены товара) и свойств товара (например даты истечения срока годности).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ВычислительКурса#getКод <em>Код</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getВычислительКурса()
 * @model
 * @generated
 */
public interface ВычислительКурса extends ИсточникКурсаАктива {
	/**
	 * Returns the value of the '<em><b>Код</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Код</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ява код вычисляющий значение курса.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Код</em>' attribute.
	 * @see #setКод(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getВычислительКурса_Код()
	 * @model required="true"
	 * @generated
	 */
	String getКод();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ВычислительКурса#getКод <em>Код</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Код</em>' attribute.
	 * @see #getКод()
	 * @generated
	 */
	void setКод(String value);

} // ВычислительКурса
