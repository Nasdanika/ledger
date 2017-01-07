/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Право</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Право#getЭлементМодели <em>Элемент Модели</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Право#getДействия <em>Действия</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getПраво()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Право extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Элемент Модели</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Элемент Модели</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Элемент Модели</em>' reference.
	 * @see #setЭлементМодели(ЭлементМодели)
	 * @see org.nasdanika.ledger.LedgerPackage#getПраво_ЭлементМодели()
	 * @model
	 * @generated
	 */
	ЭлементМодели getЭлементМодели();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Право#getЭлементМодели <em>Элемент Модели</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Элемент Модели</em>' reference.
	 * @see #getЭлементМодели()
	 * @generated
	 */
	void setЭлементМодели(ЭлементМодели value);

	/**
	 * Returns the value of the '<em><b>Действия</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Действия</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Действия</em>' attribute list.
	 * @see org.nasdanika.ledger.LedgerPackage#getПраво_Действия()
	 * @model
	 * @generated
	 */
	EList<String> getДействия();

} // Право
