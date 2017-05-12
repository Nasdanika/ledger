/**
 */
package org.nasdanika.ledger.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ФиксированныйОтчётныйПериод;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Фиксированный Отчётный Период</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ФиксированныйОтчётныйПериодImpl#getНачалоПериода <em>Начало Периода</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ФиксированныйОтчётныйПериодImpl#getКонецПериода <em>Конец Периода</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ФиксированныйОтчётныйПериодImpl extends ОтчётныйПериодImpl implements ФиксированныйОтчётныйПериод {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ФиксированныйОтчётныйПериодImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getНачалоПериода() {
		return (Date)eGet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__НАЧАЛО_ПЕРИОДА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setНачалоПериода(Date newНачалоПериода) {
		eSet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__НАЧАЛО_ПЕРИОДА, newНачалоПериода);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getКонецПериода() {
		return (Date)eGet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__КОНЕЦ_ПЕРИОДА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКонецПериода(Date newКонецПериода) {
		eSet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__КОНЕЦ_ПЕРИОДА, newКонецПериода);
	}

} //ФиксированныйОтчётныйПериодImpl
