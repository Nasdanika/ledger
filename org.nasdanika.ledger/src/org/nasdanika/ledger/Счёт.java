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
 * Счёт это источник и/или приёмник активов. Например в счёт "кошелёк" можно положить деньги, а со счёта "склад" взять товар.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Счёт#isГруппа <em>Группа</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Счёт#getСубСчета <em>Суб Счета</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Счёт#getАктивы <em>Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Счёт#getПроводки <em>Проводки</em>}</li>
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
	 * Счета могут быть организованы в иерархию, например:
	 * 
	 * * Деньги
	 *     * Банковские вклады
	 *         * Сбербанк
	 *             * Рублёвый счёт 1234
	 *             * Валютный счёт 5678
	 *     * Наличные
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
	 * Активы поддерживаемые счётом. Проводки по счёту могут осуществляться с активами поддерживаемыми счётом. 
	 * Если актив является группой, то это означает что счёт поддерживает, рекурсивно, любой под-актив группового актива
	 * если этот актив не является группой.
	 * 
	 * Примеры:
	 * 
	 * * Активы - рубли и доллары. Проводки по счёту могут производиться в рублях и долларах.
	 * * Актив - деньги. Деньги это группа активов содержащая рубли, доллары и евро. Проводки по счёту могут поизводиться в рублях, долларах и евро.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Активы</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getСчёт_Активы()
	 * @model required="true"
	 * @generated
	 */
	EList<Актив> getАктивы();

	/**
	 * Returns the value of the '<em><b>Проводки</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Проводка}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Проводка#getСчёт <em>Счёт</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Проводки по счёту. Эта ссылка является обратной к ссылке "Счёт" в проводке и заполняется системой автоматически.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Проводки</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getСчёт_Проводки()
	 * @see org.nasdanika.ledger.Проводка#getСчёт
	 * @model opposite="счёт"
	 * @generated
	 */
	EList<Проводка> getПроводки();

	/**
	 * Returns the value of the '<em><b>Группа</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Группа</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Индикатор того что счёт используется для группировки других счетов. 
	 * Групповые счета могут содержать суб-счета, но не могут иметь проводок.
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
