/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ВстроенноеИзображение;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Встроенное Изображение</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl#getСодержание <em>Содержание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl#getТип <em>Тип</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ВстроенноеИзображениеImpl extends ИзображениеImpl implements ВстроенноеИзображение {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ВстроенноеИзображениеImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getСодержание() {
		return (byte[])eGet(LedgerPackage.Literals.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__СОДЕРЖАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСодержание(byte[] newСодержание) {
		eSet(LedgerPackage.Literals.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__СОДЕРЖАНИЕ, newСодержание);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getТип() {
		return (String)eGet(LedgerPackage.Literals.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__ТИП, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setТип(String newТип) {
		eSet(LedgerPackage.Literals.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__ТИП, newТип);
	}

} //ВстроенноеИзображениеImpl
