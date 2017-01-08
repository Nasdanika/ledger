/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Журнал Операций</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Журнал операций содержит список хозяйственных операций и справочные данные - счета, активы и субъекты.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getОперации <em>Операции</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getСчёта <em>Счёта</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getАктивы <em>Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getСубъекты <em>Субъекты</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getОтчётныеАктивы <em>Отчётные Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЖурналОпераций#getСчётПоУмолчаниюДляБалансировкиОпераций <em>Счёт По Умолчанию Для Балансировки Операций</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций()
 * @model
 * @generated
 */
public interface ЖурналОпераций extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Операции</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Операция}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Операции</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Хозяйственные операции.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Операции</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_Операции()
	 * @model containment="true"
	 * @generated
	 */
	EList<Операция> getОперации();

	/**
	 * Returns the value of the '<em><b>Счёта</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Счёт}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Счёта</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Корневые счета.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Счёта</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_Счёта()
	 * @model containment="true"
	 * @generated
	 */
	EList<Счёт> getСчёта();

	/**
	 * Returns the value of the '<em><b>Активы</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Актив}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Активы</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Корневые активы.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Активы</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_Активы()
	 * @model containment="true"
	 * @generated
	 */
	EList<Актив> getАктивы();

	/**
	 * Returns the value of the '<em><b>Субъекты</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Субъект}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Субъекты</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Субъекты принимающие участие в хозяйственной деятельности.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Субъекты</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_Субъекты()
	 * @model containment="true"
	 * @generated
	 */
	EList<Субъект> getСубъекты();

	/**
	 * Returns the value of the '<em><b>Отчётные Активы</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Актив}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Отчётные Активы</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Активы в терминах которых должны генерироваться отчёты. 
	 * Например, рубли и доллары.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Отчётные Активы</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_ОтчётныеАктивы()
	 * @model
	 * @generated
	 */
	EList<Актив> getОтчётныеАктивы();

	/**
	 * Returns the value of the '<em><b>Счёт По Умолчанию Для Балансировки Операций</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Счёт который по умолчанию используется для балансирования операций.
	 * Например, "Прибыли и убытки". Если счёт поддерживает один из отчётных активов, 
	 * то балансирование проводится в терминах этого актива. Иначе балансирование проводится в терминах первого актива
	 * поддерживаемого счётом.
	 * 
	 * Примеры:
	 * 
	 * * Счёт поддерживает рубли и первый отчётный актив это рубли. Значит балансирование проводится в рублях.
	 * * Счёт не поддерживает рубли, но поддерживает доллары. Доллары это второй отчётный актив. Балансирование в долларах.
	 * * Счёт не поддерживает ни рубли ни доллары, но поддерживает евро. Балансирование в евро.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Счёт По Умолчанию Для Балансировки Операций</em>' reference.
	 * @see #setСчётПоУмолчаниюДляБалансировкиОпераций(Счёт)
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций()
	 * @model
	 * @generated
	 */
	Счёт getСчётПоУмолчаниюДляБалансировкиОпераций();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЖурналОпераций#getСчётПоУмолчаниюДляБалансировкиОпераций <em>Счёт По Умолчанию Для Балансировки Операций</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Счёт По Умолчанию Для Балансировки Операций</em>' reference.
	 * @see #getСчётПоУмолчаниюДляБалансировкиОпераций()
	 * @generated
	 */
	void setСчётПоУмолчаниюДляБалансировкиОпераций(Счёт value);
} // ЖурналОпераций
