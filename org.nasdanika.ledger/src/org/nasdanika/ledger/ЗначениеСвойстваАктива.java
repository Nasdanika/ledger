/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Значение Свойства Актива</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.ЗначениеСвойстваАктива#getСвойство <em>Свойство</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЗначениеСвойстваАктива#getЗначения <em>Значения</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getЗначениеСвойстваАктива()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ЗначениеСвойстваАктива extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Свойство</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Свойство</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Свойство</em>' reference.
	 * @see #setСвойство(СвойствоАктива)
	 * @see org.nasdanika.ledger.LedgerPackage#getЗначениеСвойстваАктива_Свойство()
	 * @model required="true"
	 * @generated
	 */
	СвойствоАктива getСвойство();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЗначениеСвойстваАктива#getСвойство <em>Свойство</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Свойство</em>' reference.
	 * @see #getСвойство()
	 * @generated
	 */
	void setСвойство(СвойствоАктива value);

	/**
	 * Returns the value of the '<em><b>Значения</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Значения</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Значения</em>' attribute list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЗначениеСвойстваАктива_Значения()
	 * @model
	 * @generated
	 */
	EList<String> getЗначения();

} // ЗначениеСвойстваАктива
