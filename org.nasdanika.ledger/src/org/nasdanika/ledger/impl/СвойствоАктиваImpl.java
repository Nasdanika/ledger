/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.СвойствоАктива;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Свойство Актива</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl#getТип <em>Тип</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl#getНижняяГраница <em>Нижняя Граница</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl#getВерхняяГраница <em>Верхняя Граница</em>}</li>
 * </ul>
 *
 * @generated
 */
public class СвойствоАктиваImpl extends CDOObjectImpl implements СвойствоАктива {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СвойствоАктиваImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.СВОЙСТВО_АКТИВА;
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
	public String getНаименование() {
		return (String)eGet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setНаименование(String newНаименование) {
		eSet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ, newНаименование);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getОписание() {
		return (String)eGet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ОПИСАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setОписание(String newОписание) {
		eSet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ОПИСАНИЕ, newОписание);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getТип() {
		return (String)eGet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ТИП, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setТип(String newТип) {
		eSet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ТИП, newТип);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getНижняяГраница() {
		return (Integer)eGet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setНижняяГраница(int newНижняяГраница) {
		eSet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА, newНижняяГраница);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getВерхняяГраница() {
		return (Integer)eGet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setВерхняяГраница(int newВерхняяГраница) {
		eSet(LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА, newВерхняяГраница);
	}

} //СвойствоАктиваImpl
