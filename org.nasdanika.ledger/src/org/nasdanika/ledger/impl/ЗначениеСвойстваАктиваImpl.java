/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ЗначениеСвойстваАктива;
import org.nasdanika.ledger.СвойствоАктива;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Значение Свойства Актива</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl#getСвойство <em>Свойство</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl#getЗначения <em>Значения</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ЗначениеСвойстваАктиваImpl extends CDOObjectImpl implements ЗначениеСвойстваАктива {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЗначениеСвойстваАктиваImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА;
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
	public СвойствоАктива getСвойство() {
		return (СвойствоАктива)eGet(LedgerPackage.Literals.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__СВОЙСТВО, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setСвойство(СвойствоАктива newСвойство) {
		eSet(LedgerPackage.Literals.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__СВОЙСТВО, newСвойство);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getЗначения() {
		return (EList<String>)eGet(LedgerPackage.Literals.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__ЗНАЧЕНИЯ, true);
	}

} //ЗначениеСвойстваАктиваImpl
