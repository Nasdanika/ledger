/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Актив</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Актив#getИсточникиКурсов <em>Источники Курсов</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getСубАктивы <em>Суб Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getТочность <em>Точность</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getСвойства <em>Свойства</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getЕдиницаИзмерения <em>Единица Измерения</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#isГруппа <em>Группа</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getАктив()
 * @model
 * @generated
 */
public interface Актив extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Источники Курсов</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.ИсточникКурсаАктива}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Источники Курсов</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Источники Курсов</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_ИсточникиКурсов()
	 * @model containment="true"
	 * @generated
	 */
	EList<ИсточникКурсаАктива> getИсточникиКурсов();

	/**
	 * Returns the value of the '<em><b>Суб Активы</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Актив}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Суб Активы</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Суб Активы</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_СубАктивы()
	 * @model containment="true"
	 * @generated
	 */
	EList<Актив> getСубАктивы();

	/**
	 * Returns the value of the '<em><b>Точность</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Точность</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Точность</em>' attribute.
	 * @see #setТочность(Integer)
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Точность()
	 * @model
	 * @generated
	 */
	Integer getТочность();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Актив#getТочность <em>Точность</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Точность</em>' attribute.
	 * @see #getТочность()
	 * @generated
	 */
	void setТочность(Integer value);

	/**
	 * Returns the value of the '<em><b>Свойства</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.СвойствоАктива}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Свойства</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Свойства</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Свойства()
	 * @model containment="true"
	 * @generated
	 */
	EList<СвойствоАктива> getСвойства();

	/**
	 * Returns the value of the '<em><b>Единица Измерения</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Единица Измерения</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Единица Измерения</em>' attribute.
	 * @see #setЕдиницаИзмерения(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_ЕдиницаИзмерения()
	 * @model
	 * @generated
	 */
	String getЕдиницаИзмерения();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Актив#getЕдиницаИзмерения <em>Единица Измерения</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Единица Измерения</em>' attribute.
	 * @see #getЕдиницаИзмерения()
	 * @generated
	 */
	void setЕдиницаИзмерения(String value);

	/**
	 * Returns the value of the '<em><b>Группа</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Группа</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Группа</em>' attribute.
	 * @see #setГруппа(boolean)
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Группа()
	 * @model
	 * @generated
	 */
	boolean isГруппа();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Актив#isГруппа <em>Группа</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Группа</em>' attribute.
	 * @see #isГруппа()
	 * @generated
	 */
	void setГруппа(boolean value);
} // Актив
