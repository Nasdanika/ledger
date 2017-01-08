/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Субъект</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Физическое или юридическое лицо принимающее участие в хозяйственных операциях. 
 * Например банк или постоянный покупатель.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Субъект#getОперации <em>Операции</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getСубъект()
 * @model
 * @generated
 */
public interface Субъект extends ЭлементМодели {

	/**
	 * Returns the value of the '<em><b>Операции</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Операция}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.ledger.Операция#getСубъекты <em>Субъекты</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Операции в которых субъект принимал участие. 
	 * Например, покупки произведённые постоянным покупателем.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Операции</em>' reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getСубъект_Операции()
	 * @see org.nasdanika.ledger.Операция#getСубъекты
	 * @model opposite="субъекты"
	 * @generated
	 */
	EList<Операция> getОперации();
} // Субъект
