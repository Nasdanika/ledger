/**
 */
package org.nasdanika.ledger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ссылка На Изображение</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ссылка на изображение, например http://www.myserver.com/myimage.png. Приложение должно распозновать следующие специальные протоколы:
 * 
 * * ``bundle`` - изображение находится в OSGi bundle. Например: ``bundle://org.nasdanika.icons/fatcow-hosting-icons/FatCow_Icons16x16/3d_glasses.png``
 * * ``font-awesome`` - [FontAwesome](http://fontawesome.io/icons/) иконка. Например: ``font-awesome://address-book``
 * * ``bootstrap-glyphicon`` - [Bootstrap](http://getbootstrap.com/components/) глиф. Например: ``bootstrap-glyphicon://search``
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.СсылкаНаИзображение#getСсылка <em>Ссылка</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getСсылкаНаИзображение()
 * @model
 * @generated
 */
public interface СсылкаНаИзображение extends Изображение {
	/**
	 * Returns the value of the '<em><b>Ссылка</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ссылка</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Значение ссылки.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ссылка</em>' attribute.
	 * @see #setСсылка(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getСсылкаНаИзображение_Ссылка()
	 * @model
	 * @generated
	 */
	String getСсылка();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.СсылкаНаИзображение#getСсылка <em>Ссылка</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ссылка</em>' attribute.
	 * @see #getСсылка()
	 * @generated
	 */
	void setСсылка(String value);

} // СсылкаНаИзображение
