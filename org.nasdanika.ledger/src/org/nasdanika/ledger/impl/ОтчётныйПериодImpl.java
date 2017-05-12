/**
 */
package org.nasdanika.ledger.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ОтчётныйПериод;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Отчётный Период</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ОтчётныйПериодImpl extends CDOObjectImpl implements ОтчётныйПериод {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ОтчётныйПериодImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ОТЧЁТНЫЙ_ПЕРИОД;
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
	public Date getНачалоПериода() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getКонецПериода() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LedgerPackage.ОТЧЁТНЫЙ_ПЕРИОД___GET_НАЧАЛО_ПЕРИОДА:
				return getНачалоПериода();
			case LedgerPackage.ОТЧЁТНЫЙ_ПЕРИОД___GET_КОНЕЦ_ПЕРИОДА:
				return getКонецПериода();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ОтчётныйПериодImpl
