/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Операция</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.Операция#getПроводки <em>Проводки</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Операция#getСоздатель <em>Создатель</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Операция#isПервичныйВвод <em>Первичный Ввод</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Операция#getСубъекты <em>Субъекты</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getОперация()
 * @model
 * @generated
 */
public interface Операция extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Проводки</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Проводка}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Проводки</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Проводки</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getОперация_Проводки()
	 * @model containment="true"
	 * @generated
	 */
	EList<Проводка> getПроводки();

	/**
	 * Returns the value of the '<em><b>Создатель</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Создатель</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Создатель</em>' reference.
	 * @see #setСоздатель(Пользователь)
	 * @see org.nasdanika.ledger.LedgerPackage#getОперация_Создатель()
	 * @model required="true"
	 * @generated
	 */
	Пользователь getСоздатель();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Операция#getСоздатель <em>Создатель</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Создатель</em>' reference.
	 * @see #getСоздатель()
	 * @generated
	 */
	void setСоздатель(Пользователь value);

	/**
	 * Returns the value of the '<em><b>Первичный Ввод</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Первичный Ввод</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Первичный Ввод</em>' attribute.
	 * @see #setПервичныйВвод(boolean)
	 * @see org.nasdanika.ledger.LedgerPackage#getОперация_ПервичныйВвод()
	 * @model
	 * @generated
	 */
	boolean isПервичныйВвод();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Операция#isПервичныйВвод <em>Первичный Ввод</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Первичный Ввод</em>' attribute.
	 * @see #isПервичныйВвод()
	 * @generated
	 */
	void setПервичныйВвод(boolean value);

	/**
	 * Returns the value of the '<em><b>Субъекты</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Субъекты</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Субъекты</em>' reference.
	 * @see #setСубъекты(Субъект)
	 * @see org.nasdanika.ledger.LedgerPackage#getОперация_Субъекты()
	 * @model
	 * @generated
	 */
	Субъект getСубъекты();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Операция#getСубъекты <em>Субъекты</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Субъекты</em>' reference.
	 * @see #getСубъекты()
	 * @generated
	 */
	void setСубъекты(Субъект value);
} // Операция
