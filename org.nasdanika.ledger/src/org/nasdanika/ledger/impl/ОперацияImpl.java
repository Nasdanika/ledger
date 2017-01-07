/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Пользователь;
import org.nasdanika.ledger.Проводка;
import org.nasdanika.ledger.Субъект;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Операция</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ОперацияImpl#getПроводки <em>Проводки</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ОперацияImpl#getСоздатель <em>Создатель</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ОперацияImpl#isПервичныйВвод <em>Первичный Ввод</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ОперацияImpl#getСубъекты <em>Субъекты</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ОперацияImpl extends ЭлементМоделиImpl implements Операция {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ОперацияImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ОПЕРАЦИЯ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Проводка> getПроводки() {
		return (EList<Проводка>)eGet(LedgerPackage.Literals.ОПЕРАЦИЯ__ПРОВОДКИ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Пользователь getСоздатель() {
		return (Пользователь)eGet(LedgerPackage.Literals.ОПЕРАЦИЯ__СОЗДАТЕЛЬ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСоздатель(Пользователь newСоздатель) {
		eSet(LedgerPackage.Literals.ОПЕРАЦИЯ__СОЗДАТЕЛЬ, newСоздатель);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isПервичныйВвод() {
		return (Boolean)eGet(LedgerPackage.Literals.ОПЕРАЦИЯ__ПЕРВИЧНЫЙ_ВВОД, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setПервичныйВвод(boolean newПервичныйВвод) {
		eSet(LedgerPackage.Literals.ОПЕРАЦИЯ__ПЕРВИЧНЫЙ_ВВОД, newПервичныйВвод);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Субъект getСубъекты() {
		return (Субъект)eGet(LedgerPackage.Literals.ОПЕРАЦИЯ__СУБЪЕКТЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСубъекты(Субъект newСубъекты) {
		eSet(LedgerPackage.Literals.ОПЕРАЦИЯ__СУБЪЕКТЫ, newСубъекты);
	}

} //ОперацияImpl
