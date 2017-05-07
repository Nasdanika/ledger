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
 * Запись хозяйственной операции.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Операция#isПервичныйВвод <em>Первичный Ввод</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Операция#getПроводки <em>Проводки</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Операция#getСоздатель <em>Создатель</em>}</li>
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
	 * Проводки по счетам. Активы проводок могут быть разными, но сумма проводок в пересчёте на актив балансирования должна быть
	 * равна нулю. Соответственно, операция должна содержать более одной проводки.
	 * 
	 * Пример - продажа компьютера за рубли:
	 * 
	 * * Компьютер списан со склада.
	 * * Рубли зачислены в кассу.
	 * 
	 * Компьютер был приобретён за доллары и фиксированный курс компьютера установлен в стоимость компьютера на дату покупки по отношению к долларам.
	 * Система определяет "путь пересчёта курса" компьютер -> доллары -> рубли и вычисляет стоимость компьютера в рублях на дату совершения операции. 
	 * Разница между покупной и продажной стоимостью записывается в прибыли и убытки.
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
	 * Пользователь создавший операцию.
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
	 * Первичный ввод означает что описание операции введено, но проводки
	 * по счетам либо не сделаны, либо сделаны не полностью.
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
	 * Returns the value of the '<em><b>Субъекты</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Субъект}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Субъект#getОперации <em>Операции</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Субъекты</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Субъекты принимающие участие в операции. Например покупатель.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Субъекты</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getОперация_Субъекты()
	 * @see org.nasdanika.ledger.Субъект#getОперации
	 * @model opposite="операции"
	 * @generated
	 */
	EList<Субъект> getСубъекты();
} // Операция
