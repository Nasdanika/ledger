/**
 */
package org.nasdanika.ledger.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ФиксированныйКурс;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Фиксированный Курс</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ФиксированныйКурсImpl#getКурс <em>Курс</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ФиксированныйКурсImpl extends ИсточникКурсаАктиваImpl implements ФиксированныйКурс {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ФиксированныйКурсImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ФИКСИРОВАННЫЙ_КУРС;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getКурс() {
		return (BigDecimal)eGet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_КУРС__КУРС, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКурс(BigDecimal newКурс) {
		eSet(LedgerPackage.Literals.ФИКСИРОВАННЫЙ_КУРС__КУРС, newКурс);
	}

} //ФиксированныйКурсImpl
