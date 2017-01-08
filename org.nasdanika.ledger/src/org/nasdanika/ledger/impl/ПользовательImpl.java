/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.impl.LoginUserImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.Пользователь;
import org.nasdanika.ledger.Право;
import org.nasdanika.ledger.ХранительЖурналовОпераций;
import org.nasdanika.ledger.ЭлементМодели;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Пользователь</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getPasswordHash <em>Password Hash</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getКомментарии <em>Комментарии</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getИзображение <em>Изображение</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getИдентификатор <em>Идентификатор</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getЖурналыОпераций <em>Журналы Операций</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getПрава <em>Права</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ПользовательImpl extends LoginUserImpl implements Пользователь {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПользовательImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ПОЛЬЗОВАТЕЛЬ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPasswordHash() {
		return (byte[])eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHash(byte[] newPasswordHash) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, newPasswordHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getНаименование() {
		return (String)eGet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setНаименование(String newНаименование) {
		eSet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ, newНаименование);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getОписание() {
		return (String)eGet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setОписание(String newОписание) {
		eSet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ, newОписание);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Комментарий> getКомментарии() {
		return (EList<Комментарий>)eGet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Изображение getИзображение() {
		return (Изображение)eGet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setИзображение(Изображение newИзображение) {
		eSet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ, newИзображение);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getИдентификатор() {
		return (String)eGet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setИдентификатор(String newИдентификатор) {
		eSet(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР, newИдентификатор);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Право> getПрава() {
		return (EList<Право>)eGet(LedgerPackage.Literals.ПОЛЬЗОВАТЕЛЬ__ПРАВА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ЭлементМодели.class) {
			switch (derivedFeatureID) {
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__НАИМЕНОВАНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ОПИСАНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__КОММЕНТАРИИ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИЗОБРАЖЕНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИДЕНТИФИКАТОР: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;
				default: return -1;
			}
		}
		if (baseClass == ХранительЖурналовОпераций.class) {
			switch (derivedFeatureID) {
				case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ЖУРНАЛЫ_ОПЕРАЦИЙ: return LedgerPackage.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ЭлементМодели.class) {
			switch (baseFeatureID) {
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__НАИМЕНОВАНИЕ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ОПИСАНИЕ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__КОММЕНТАРИИ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИЗОБРАЖЕНИЕ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИДЕНТИФИКАТОР;
				default: return -1;
			}
		}
		if (baseClass == ХранительЖурналовОпераций.class) {
			switch (baseFeatureID) {
				case LedgerPackage.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ЖУРНАЛЫ_ОПЕРАЦИЙ;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ПользовательImpl
