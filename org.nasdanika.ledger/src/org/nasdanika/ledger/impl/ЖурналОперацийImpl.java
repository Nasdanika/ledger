/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.ОтчётныйПериод;
import org.nasdanika.ledger.Субъект;
import org.nasdanika.ledger.Счёт;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Журнал Операций</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getАктивы <em>Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getСчета <em>Счета</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getОперации <em>Операции</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getСубъекты <em>Субъекты</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getОтчётныеАктивы <em>Отчётные Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getСчётПоУмолчаниюДляБалансировкиОпераций <em>Счёт По Умолчанию Для Балансировки Операций</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl#getОтчётныеПериоды <em>Отчётные Периоды</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ЖурналОперацийImpl extends ЭлементМоделиImpl implements ЖурналОпераций {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЖурналОперацийImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Операция> getОперации() {
		return (EList<Операция>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Актив> getАктивы() {
		return (EList<Актив>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Счёт> getСчета() {
		return (EList<Счёт>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЕТА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Субъект> getСубъекты() {
		return (EList<Субъект>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Актив> getОтчётныеАктивы() {
		return (EList<Актив>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_АКТИВЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Счёт getСчётПоУмолчаниюДляБалансировкиОпераций() {
		return (Счёт)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСчётПоУмолчаниюДляБалансировкиОпераций(Счёт newСчётПоУмолчаниюДляБалансировкиОпераций) {
		eSet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ, newСчётПоУмолчаниюДляБалансировкиОпераций);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ОтчётныйПериод> getОтчётныеПериоды() {
		return (EList<ОтчётныйПериод>)eGet(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_ПЕРИОДЫ, true);
	}

} //ЖурналОперацийImpl
