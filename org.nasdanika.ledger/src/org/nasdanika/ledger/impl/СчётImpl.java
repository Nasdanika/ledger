/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.Счёт;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Счёт</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.СчётImpl#getСубСчета <em>Суб Счета</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СчётImpl#getАктивы <em>Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СчётImpl#isГруппа <em>Группа</em>}</li>
 * </ul>
 *
 * @generated
 */
public class СчётImpl extends ЭлементМоделиImpl implements Счёт {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СчётImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.СЧЁТ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Счёт> getСубСчета() {
		return (EList<Счёт>)eGet(LedgerPackage.Literals.СЧЁТ__СУБ_СЧЕТА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Актив> getАктивы() {
		return (EList<Актив>)eGet(LedgerPackage.Literals.СЧЁТ__АКТИВЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isГруппа() {
		return (Boolean)eGet(LedgerPackage.Literals.СЧЁТ__ГРУППА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setГруппа(boolean newГруппа) {
		eSet(LedgerPackage.Literals.СЧЁТ__ГРУППА, newГруппа);
	}

} //СчётImpl
