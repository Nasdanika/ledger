/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.ХранительЖурналовОпераций;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Хранитель Журналов Операций</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ХранительЖурналовОперацийImpl#getЖурналыОпераций <em>Журналы Операций</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ХранительЖурналовОперацийImpl extends ЭлементМоделиImpl implements ХранительЖурналовОпераций {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ХранительЖурналовОперацийImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ЖурналОпераций> getЖурналыОпераций() {
		return (EList<ЖурналОпераций>)eGet(LedgerPackage.Literals.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ, true);
	}

} //ХранительЖурналовОперацийImpl
