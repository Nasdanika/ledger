/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.User;
import org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.Пользователь;
import org.nasdanika.ledger.УчётныйЦентр;
import org.nasdanika.ledger.ХранительЖурналовОпераций;
import org.nasdanika.ledger.ЭлементМодели;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Учётный Центр</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getКомментарии <em>Комментарии</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getИзображение <em>Изображение</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getХранителиЖурналовОпераций <em>Хранители Журналов Операций</em>}</li>
 * </ul>
 *
 * @generated
 */
public class УчётныйЦентрImpl extends LoginPasswordProtectionDomainImpl implements УчётныйЦентр {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected УчётныйЦентрImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР;
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
	@SuppressWarnings("unchecked")
	public EList<ХранительЖурналовОпераций> getХранителиЖурналовОпераций() {
		return (EList<ХранительЖурналовОпераций>)eGet(LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ, true);
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
				case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__НАИМЕНОВАНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;
				case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ОПИСАНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;
				case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__КОММЕНТАРИИ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;
				case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИЗОБРАЖЕНИЕ: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;
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
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__НАИМЕНОВАНИЕ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ОПИСАНИЕ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__КОММЕНТАРИИ;
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИЗОБРАЖЕНИЕ;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public EList<User> getAllUsers() {
		EList<User> ret = ECollections.newBasicEList();
		for (ХранительЖурналовОпераций ledgerKeeper: getХранителиЖурналовОпераций()) {
			if (ledgerKeeper instanceof Пользователь) {
				ret.add((User) ledgerKeeper);
			}
			
		}
		return ret;
	}

} //УчётныйЦентрImpl
