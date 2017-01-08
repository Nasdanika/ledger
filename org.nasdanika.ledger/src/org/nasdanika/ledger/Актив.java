/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Актив</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Актив это нечто имеющее ценность - деньги, товар, услуги (труд).
 * 
 * Хозяйственная деятельность заключается в движении активов между счетами и преобразовании активов. 
 * Учёт хозяйственной деятельности заключается в аккуратном фиксировании хозяйственных операций с целью составления отчётности которая может
 * быть использована для анализа и корректирования деятельности.
 * 
 * Примеры:
 * 
 * * Прочитана лекция за наличные: Оказанные услуги -> Кошелёк.
 * * Продан товар: Склад -товар-> Покупатель -деньги-> Кошелёк.
 * * Деньги положены в банк: Кошелёк -> Банковский счёт.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Актив#getИсточникиКурсов <em>Источники Курсов</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#isГруппа <em>Группа</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getСубАктивы <em>Суб Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getЕдиницаИзмерения <em>Единица Измерения</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getТочность <em>Точность</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getСвойства <em>Свойства</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getСчета <em>Счета</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Актив#getПроводки <em>Проводки</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Источники курса данного актива используются чтобы получить текущий или наиболее аккуратный курс актива при балансировании операций
	 * и составлении отчётности.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Активы могут быть организованы в иерархию. Например:
	 * 
	 * * Деньги
	 *     * Рубли
	 *     * Доллары
	 *     * Евро
	 * * Товары
	 *     * Овощи
	 *         * Помидоры
	 *         * Огурцы
	 * 
	 * 
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Количество десятичных знаков после запятой используемых при
	 * учёте количества актива. Например:
	 * 
	 * * 2 для долларов и рублей - копейки и центы.
	 * * 3 для килограммов если измерятся с точность до граммов.
	 * * 0 для неделимых штучных товаров, например лампочек.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Определения свойств актива.
	 * Значения свойств вводятся в проводке.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Свойства</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Свойства()
	 * @model containment="true"
	 * @generated
	 */
	EList<СвойствоАктива> getСвойства();

	/**
	 * Returns the value of the '<em><b>Счета</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Счёт}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Счёт#getАктивы <em>Активы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Счета поддерживающие данный актив.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Счета</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Счета()
	 * @see org.nasdanika.ledger.Счёт#getАктивы
	 * @model opposite="активы"
	 * @generated
	 */
	EList<Счёт> getСчета();

	/**
	 * Returns the value of the '<em><b>Проводки</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Проводка}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Проводка#getАктив <em>Актив</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Проводки описывающие движение данного актива между счетами.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Проводки</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getАктив_Проводки()
	 * @see org.nasdanika.ledger.Проводка#getАктив
	 * @model opposite="актив"
	 * @generated
	 */
	EList<Проводка> getПроводки();

	/**
	 * Returns the value of the '<em><b>Единица Измерения</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Единица Измерения</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Единица измерения актива. 
	 * Например литры, штуки, килограммы.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Если этот атрибут установлен в true, значит актив является группой.
	 * Группа активов может содержать суб-активы, но не может использоваться
	 * в проводках. 
	 * <!-- end-model-doc -->
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
