/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Субъект;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Субъект</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.СубъектImpl#getОперации <em>Операции</em>}</li>
 * </ul>
 *
 * @generated
 */
public class СубъектImpl extends ЭлементМоделиImpl implements Субъект {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СубъектImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.СУБЪЕКТ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Операция> getОперации() {
		return (EList<Операция>)eGet(LedgerPackage.Literals.СУБЪЕКТ__ОПЕРАЦИИ, true);
	}

} //СубъектImpl
