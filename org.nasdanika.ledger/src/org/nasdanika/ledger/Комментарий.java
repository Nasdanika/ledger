/**
 */
package org.nasdanika.ledger;

import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Комментарий</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.Комментарий#getАвтор <em>Автор</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Комментарий#getСодержание <em>Содержание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.Комментарий#getДата <em>Дата</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getКомментарий()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Комментарий extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Автор</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Автор</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Автор</em>' reference.
	 * @see #setАвтор(Пользователь)
	 * @see org.nasdanika.ledger.LedgerPackage#getКомментарий_Автор()
	 * @model required="true"
	 * @generated
	 */
	Пользователь getАвтор();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Комментарий#getАвтор <em>Автор</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Автор</em>' reference.
	 * @see #getАвтор()
	 * @generated
	 */
	void setАвтор(Пользователь value);

	/**
	 * Returns the value of the '<em><b>Содержание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Содержание</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Содержание</em>' attribute.
	 * @see #setСодержание(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getКомментарий_Содержание()
	 * @model required="true"
	 * @generated
	 */
	String getСодержание();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Комментарий#getСодержание <em>Содержание</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Содержание</em>' attribute.
	 * @see #getСодержание()
	 * @generated
	 */
	void setСодержание(String value);

	/**
	 * Returns the value of the '<em><b>Дата</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Дата</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Дата</em>' attribute.
	 * @see #setДата(Date)
	 * @see org.nasdanika.ledger.LedgerPackage#getКомментарий_Дата()
	 * @model
	 * @generated
	 */
	Date getДата();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Комментарий#getДата <em>Дата</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Дата</em>' attribute.
	 * @see #getДата()
	 * @generated
	 */
	void setДата(Date value);

} // Комментарий
