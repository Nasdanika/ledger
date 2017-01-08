/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Свойство Актива</b></em>'.
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
 *   <li>{@link org.nasdanika.ledger.СвойствоАктива#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.СвойствоАктива#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.СвойствоАктива#getТип <em>Тип</em>}</li>
 *   <li>{@link org.nasdanika.ledger.СвойствоАктива#getНижняяГраница <em>Нижняя Граница</em>}</li>
 *   <li>{@link org.nasdanika.ledger.СвойствоАктива#getВерхняяГраница <em>Верхняя Граница</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface СвойствоАктива extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Наименование</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Наименование</em>' attribute.
	 * @see #setНаименование(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива_Наименование()
	 * @model required="true"
	 * @generated
	 */
	String getНаименование();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СвойствоАктива#getНаименование <em>Наименование</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Наименование</em>' attribute.
	 * @see #getНаименование()
	 * @generated
	 */
	void setНаименование(String value);

	/**
	 * Returns the value of the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Описание</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Описание</em>' attribute.
	 * @see #setОписание(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива_Описание()
	 * @model
	 * @generated
	 */
	String getОписание();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СвойствоАктива#getОписание <em>Описание</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Описание</em>' attribute.
	 * @see #getОписание()
	 * @generated
	 */
	void setОписание(String value);

	/**
	 * Returns the value of the '<em><b>Тип</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Тип</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Тип</em>' attribute.
	 * @see #setТип(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива_Тип()
	 * @model
	 * @generated
	 */
	String getТип();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СвойствоАктива#getТип <em>Тип</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Тип</em>' attribute.
	 * @see #getТип()
	 * @generated
	 */
	void setТип(String value);

	/**
	 * Returns the value of the '<em><b>Нижняя Граница</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Нижняя Граница</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Нижняя Граница</em>' attribute.
	 * @see #setНижняяГраница(int)
	 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива_НижняяГраница()
	 * @model default="0"
	 * @generated
	 */
	int getНижняяГраница();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СвойствоАктива#getНижняяГраница <em>Нижняя Граница</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Нижняя Граница</em>' attribute.
	 * @see #getНижняяГраница()
	 * @generated
	 */
	void setНижняяГраница(int value);

	/**
	 * Returns the value of the '<em><b>Верхняя Граница</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Верхняя Граница</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Верхняя Граница</em>' attribute.
	 * @see #setВерхняяГраница(int)
	 * @see org.nasdanika.ledger.LedgerPackage#getСвойствоАктива_ВерхняяГраница()
	 * @model default="1"
	 * @generated
	 */
	int getВерхняяГраница();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СвойствоАктива#getВерхняяГраница <em>Верхняя Граница</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Верхняя Граница</em>' attribute.
	 * @see #getВерхняяГраница()
	 * @generated
	 */
	void setВерхняяГраница(int value);

} // СвойствоАктива
