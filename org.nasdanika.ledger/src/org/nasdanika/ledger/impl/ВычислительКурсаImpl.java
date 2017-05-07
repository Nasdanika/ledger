/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ВычислительКурса;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Вычислитель Курса</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ВычислительКурсаImpl#getКод <em>Код</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ВычислительКурсаImpl extends ИсточникКурсаАктиваImpl implements ВычислительКурса {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ВычислительКурсаImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ВЫЧИСЛИТЕЛЬ_КУРСА;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getКод() {
		return (String)eGet(LedgerPackage.Literals.ВЫЧИСЛИТЕЛЬ_КУРСА__КОД, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКод(String newКод) {
		eSet(LedgerPackage.Literals.ВЫЧИСЛИТЕЛЬ_КУРСА__КОД, newКод);
	}

} //ВычислительКурсаImpl
