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
 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Отчётные Активы</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЖурналОпераций_ОтчётныеАктивы()
	 * @model
	 * @generated
	 */
	EList<Актив> getОтчётныеАктивы();
} // ЖурналОпераций
