/**
 */
package org.nasdanika.ledger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Встроенное Изображение</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Изображение хранящееся в модели. Например фотография товара загруженная пользователем.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ВстроенноеИзображение#getСодержание <em>Содержание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ВстроенноеИзображение#getФормат <em>Формат</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Байты изображения.
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Формат</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * формат изображения - jpg, png, bmp, ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Формат</em>' attribute.
	 * @see #setФормат(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getВстроенноеИзображение_Формат()
	 * @model
	 * @generated
	 */
	String getФормат();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ВстроенноеИзображение#getФормат <em>Формат</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Формат</em>' attribute.
	 * @see #getФормат()
	 * @generated
	 */
	void setФормат(String value);

} // ВстроенноеИзображение
