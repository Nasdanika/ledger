/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Право;
import org.nasdanika.ledger.ЭлементМодели;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Право</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ПравоImpl#getЭлементМодели <em>Элемент Модели</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПравоImpl#getДействия <em>Действия</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ПравоImpl extends CDOObjectImpl implements Право {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПравоImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ПРАВО;
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
	public ЭлементМодели getЭлементМодели() {
		return (ЭлементМодели)eGet(LedgerPackage.Literals.ПРАВО__ЭЛЕМЕНТ_МОДЕЛИ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setЭлементМодели(ЭлементМодели newЭлементМодели) {
		eSet(LedgerPackage.Literals.ПРАВО__ЭЛЕМЕНТ_МОДЕЛИ, newЭлементМодели);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getДействия() {
		return (EList<String>)eGet(LedgerPackage.Literals.ПРАВО__ДЕЙСТВИЯ, true);
	}

} //ПравоImpl
