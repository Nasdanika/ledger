/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Счёт</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.Счёт#getСубСчета <em>Суб Счета</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Счёт#getАктивы <em>Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Счёт#isГруппа <em>Группа</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getСчёт()
 * @model
 * @generated
 */
public interface Счёт extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Суб Счета</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Счёт}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Суб Счета</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Суб Счета</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getСчёт_СубСчета()
	 * @model containment="true"
	 * @generated
	 */
	EList<Счёт> getСубСчета();

	/**
	 * Returns the value of the '<em><b>Активы</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Актив}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Активы</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Активы</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getСчёт_Активы()
	 * @model required="true"
	 * @generated
	 */
	EList<Актив> getАктивы();

	/**
	 * Returns the value of the '<em><b>Группа</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Группа</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Группа</em>' attribute.
	 * @see #setГруппа(boolean)
	 * @see org.nasdanika.ledger.LedgerPackage#getСчёт_Группа()
	 * @model
	 * @generated
	 */
	boolean isГруппа();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Счёт#isГруппа <em>Группа</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Группа</em>' attribute.
	 * @see #isГруппа()
	 * @generated
	 */
	void setГруппа(boolean value);
} // Счёт
