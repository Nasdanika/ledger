/**
 */
package org.nasdanika.ledger.impl;

import java.math.BigDecimal;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ЗначениеСвойстваАктива;
import org.nasdanika.ledger.Проводка;
import org.nasdanika.ledger.Счёт;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Проводка</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ПроводкаImpl#isСверено <em>Сверено</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПроводкаImpl#getСчёт <em>Счёт</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПроводкаImpl#getАктив <em>Актив</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПроводкаImpl#getКоличество <em>Количество</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПроводкаImpl#getЗначенияСвойствАктива <em>Значения Свойств Актива</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ПроводкаImpl extends ЭлементМоделиImpl implements Проводка {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПроводкаImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ПРОВОДКА;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isСверено() {
		return (Boolean)eGet(LedgerPackage.Literals.ПРОВОДКА__СВЕРЕНО, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСверено(boolean newСверено) {
		eSet(LedgerPackage.Literals.ПРОВОДКА__СВЕРЕНО, newСверено);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Счёт getСчёт() {
		return (Счёт)eGet(LedgerPackage.Literals.ПРОВОДКА__СЧЁТ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСчёт(Счёт newСчёт) {
		eSet(LedgerPackage.Literals.ПРОВОДКА__СЧЁТ, newСчёт);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Актив getАктив() {
		return (Актив)eGet(LedgerPackage.Literals.ПРОВОДКА__АКТИВ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setАктив(Актив newАктив) {
		eSet(LedgerPackage.Literals.ПРОВОДКА__АКТИВ, newАктив);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getКоличество() {
		return (BigDecimal)eGet(LedgerPackage.Literals.ПРОВОДКА__КОЛИЧЕСТВО, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКоличество(BigDecimal newКоличество) {
		eSet(LedgerPackage.Literals.ПРОВОДКА__КОЛИЧЕСТВО, newКоличество);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ЗначениеСвойстваАктива getЗначенияСвойствАктива() {
		return (ЗначениеСвойстваАктива)eGet(LedgerPackage.Literals.ПРОВОДКА__ЗНАЧЕНИЯ_СВОЙСТВ_АКТИВА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setЗначенияСвойствАктива(ЗначениеСвойстваАктива newЗначенияСвойствАктива) {
		eSet(LedgerPackage.Literals.ПРОВОДКА__ЗНАЧЕНИЯ_СВОЙСТВ_АКТИВА, newЗначенияСвойствАктива);
	}

} //ПроводкаImpl
