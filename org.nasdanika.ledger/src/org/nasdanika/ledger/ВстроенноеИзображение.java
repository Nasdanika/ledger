/**
 */
package org.nasdanika.ledger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Встроенное Изображение</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ВстроенноеИзображение#getСодержание <em>Содержание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ВстроенноеИзображение#getТип <em>Тип</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getВстроенноеИзображение()
 * @model
 * @generated
 */
public interface ВстроенноеИзображение extends Изображение {
	/**
	 * Returns the value of the '<em><b>Содержание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Содержание</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Содержание</em>' attribute.
	 * @see #setСодержание(byte[])
	 * @see org.nasdanika.ledger.LedgerPackage#getВстроенноеИзображение_Содержание()
	 * @model
	 * @generated
	 */
	byte[] getСодержание();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ВстроенноеИзображение#getСодержание <em>Содержание</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Содержание</em>' attribute.
	 * @see #getСодержание()
	 * @generated
	 */
	void setСодержание(byte[] value);

	/**
	 * Returns the value of the '<em><b>Тип</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Тип</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Тип</em>' attribute.
	 * @see #setТип(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getВстроенноеИзображение_Тип()
	 * @model
	 * @generated
	 */
	String getТип();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ВстроенноеИзображение#getТип <em>Тип</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Тип</em>' attribute.
	 * @see #getТип()
	 * @generated
	 */
	void setТип(String value);

} // ВстроенноеИзображение
