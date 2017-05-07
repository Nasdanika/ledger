/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.СсылкаНаИзображение;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ссылка На Изображение</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.СсылкаНаИзображениеImpl#getСсылка <em>Ссылка</em>}</li>
 * </ul>
 *
 * @generated
 */
public class СсылкаНаИзображениеImpl extends ИзображениеImpl implements СсылкаНаИзображение {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СсылкаНаИзображениеImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getСсылка() {
		return (String)eGet(LedgerPackage.Literals.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ__ССЫЛКА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСсылка(String newСсылка) {
		eSet(LedgerPackage.Literals.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ__ССЫЛКА, newСсылка);
	}

} //СсылкаНаИзображениеImpl
