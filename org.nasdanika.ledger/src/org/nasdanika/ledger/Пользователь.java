/**
 */
package org.nasdanika.ledger;

import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.html.Theme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Пользователь</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Хранитель журнала имеющий учётную запись и пароль для входа в систему.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.Пользователь#getTheme <em>Theme</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getПользователь()
 * @model
 * @generated
 */
public interface Пользователь extends LoginPasswordHashUser, ХранительЖурналовОпераций {

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(Theme)
	 * @see org.nasdanika.ledger.LedgerPackage#getПользователь_Theme()
	 * @model dataType="org.nasdanika.ledger.Theme"
	 * @generated
	 */
	Theme getTheme();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.Пользователь#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(Theme value);
} // Пользователь
