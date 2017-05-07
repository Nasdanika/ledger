/**
 */
package org.nasdanika.ledger;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Проводка</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Проводка это часть операции описывающая движение актива по счёту.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Проводка#getСчёт <em>Счёт</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Проводка#getАктив <em>Актив</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Проводка#getКоличество <em>Количество</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Проводка#isСверено <em>Сверено</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Проводка#isБалансирующаяПроводка <em>Балансирующая Проводка</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Проводка#getЗначенияСвойствАктива <em>Значения Свойств Актива</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getПроводка()
 * @model
 * @generated
 */
public interface Проводка extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Сверено</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Сверено</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Индикатор указывающий на то что проводка сверена с выписками корреспондента,например банка.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Сверено</em>' attribute.
	 * @see #setСверено(boolean)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_Сверено()
	 * @model
	 * @generated
	 */
	boolean isСверено();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#isСверено <em>Сверено</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Сверено</em>' attribute.
	 * @see #isСверено()
	 * @generated
	 */
	void setСверено(boolean value);

	/**
	 * Returns the value of the '<em><b>Счёт</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Счёт#getПроводки <em>Проводки</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Счёт</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Счёт проводки.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Счёт</em>' reference.
	 * @see #setСчёт(Счёт)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_Счёт()
	 * @see org.nasdanika.ledger.Счёт#getПроводки
	 * @model opposite="проводки" required="true"
	 * @generated
	 */
	Счёт getСчёт();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#getСчёт <em>Счёт</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Счёт</em>' reference.
	 * @see #getСчёт()
	 * @generated
	 */
	void setСчёт(Счёт value);

	/**
	 * Returns the value of the '<em><b>Актив</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Актив#getПроводки <em>Проводки</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Актив</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Актив проводки. Должен поддерживаться счётом.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Актив</em>' reference.
	 * @see #setАктив(Актив)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_Актив()
	 * @see org.nasdanika.ledger.Актив#getПроводки
	 * @model opposite="проводки" required="true"
	 * @generated
	 */
	Актив getАктив();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#getАктив <em>Актив</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Актив</em>' reference.
	 * @see #getАктив()
	 * @generated
	 */
	void setАктив(Актив value);

	/**
	 * Returns the value of the '<em><b>Количество</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Количество</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Количество актива.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Количество</em>' attribute.
	 * @see #setКоличество(BigDecimal)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_Количество()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getКоличество();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#getКоличество <em>Количество</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Количество</em>' attribute.
	 * @see #getКоличество()
	 * @generated
	 */
	void setКоличество(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Значения Свойств Актива</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Значения Свойств Актива</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Значения свойств актива. Например дата истечения срока годности товара.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Значения Свойств Актива</em>' reference.
	 * @see #setЗначенияСвойствАктива(ЗначениеСвойстваАктива)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_ЗначенияСвойствАктива()
	 * @model
	 * @generated
	 */
	ЗначениеСвойстваАктива getЗначенияСвойствАктива();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#getЗначенияСвойствАктива <em>Значения Свойств Актива</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Значения Свойств Актива</em>' reference.
	 * @see #getЗначенияСвойствАктива()
	 * @generated
	 */
	void setЗначенияСвойствАктива(ЗначениеСвойстваАктива value);

	/**
	 * Returns the value of the '<em><b>Балансирующая Проводка</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Индикатор балансирующей проводки. Балансирующая проводка приводит
	 * баланс операции в ноль по курсу на момент совершения операции.
	 * 
	 * При изменении курсов, например при коррекции ошибочного ввода, 
	 * система автоматически пересчитывает атрибут "количество" балансирующих проводок.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Балансирующая Проводка</em>' attribute.
	 * @see #setБалансирующаяПроводка(boolean)
	 * @see org.nasdanika.ledger.LedgerPackage#getПроводка_БалансирующаяПроводка()
	 * @model
	 * @generated
	 */
	boolean isБалансирующаяПроводка();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Проводка#isБалансирующаяПроводка <em>Балансирующая Проводка</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Балансирующая Проводка</em>' attribute.
	 * @see #isБалансирующаяПроводка()
	 * @generated
	 */
	void setБалансирующаяПроводка(boolean value);
} // Проводка
