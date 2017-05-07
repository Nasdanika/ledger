/**
 */
package org.nasdanika.ledger.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.Пользователь;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Комментарий</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.КомментарийImpl#getАвтор <em>Автор</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.КомментарийImpl#getСодержание <em>Содержание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.КомментарийImpl#getДата <em>Дата</em>}</li>
 * </ul>
 *
 * @generated
 */
public class КомментарийImpl extends CDOObjectImpl implements Комментарий {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected КомментарийImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.КОММЕНТАРИЙ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Пользователь getАвтор() {
		return (Пользователь)eGet(LedgerPackage.Literals.КОММЕНТАРИЙ__АВТОР, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setАвтор(Пользователь newАвтор) {
		eSet(LedgerPackage.Literals.КОММЕНТАРИЙ__АВТОР, newАвтор);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getСодержание() {
		return (String)eGet(LedgerPackage.Literals.КОММЕНТАРИЙ__СОДЕРЖАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСодержание(String newСодержание) {
		eSet(LedgerPackage.Literals.КОММЕНТАРИЙ__СОДЕРЖАНИЕ, newСодержание);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getДата() {
		return (Date)eGet(LedgerPackage.Literals.КОММЕНТАРИЙ__ДАТА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setДата(Date newДата) {
		eSet(LedgerPackage.Literals.КОММЕНТАРИЙ__ДАТА, newДата);
	}

} //КомментарийImpl
