/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Элемент Модели</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ЭлементМодели extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Наименование</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Наименование</em>' attribute.
	 * @see #setНаименование(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Наименование()
	 * @model
	 * @generated
	 */
	String getНаименование();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Наименование</em>' attribute.
	 * @see #getНаименование()
	 * @generated
	 */
	void setНаименование(String value);

	/**
	 * Returns the value of the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Описание</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Описание</em>' attribute.
	 * @see #setОписание(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Описание()
	 * @model
	 * @generated
	 */
	String getОписание();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Описание</em>' attribute.
	 * @see #getОписание()
	 * @generated
	 */
	void setОписание(String value);

} // ЭлементМодели
