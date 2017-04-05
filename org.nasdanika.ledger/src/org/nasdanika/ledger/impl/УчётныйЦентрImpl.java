/**
 */
package org.nasdanika.ledger.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.User;
import org.nasdanika.cdo.security.impl.LoginPasswordRealmImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.util.LedgerValidator;
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
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getИдентификатор <em>Идентификатор</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl#getХранителиЖурналовОпераций <em>Хранители Журналов Операций</em>}</li>
 * </ul>
 *
 * @generated
 */
public class УчётныйЦентрImpl extends LoginPasswordRealmImpl implements УчётныйЦентр {
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
	public EList<ХранительЖурналовОпераций> getХранителиЖурналовОпераций() {
		return (EList<ХранительЖурналовОпераций>)eGet(LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 LedgerValidator.DIAGNOSTIC_SOURCE,
						 LedgerValidator.ЭЛЕМЕНТ_МОДЕЛИ__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
				case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИДЕНТИФИКАТОР: return LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;
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
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИДЕНТИФИКАТОР;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ЭлементМодели.class) {
			switch (baseOperationID) {
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ___VALIDATE__DIAGNOSTICCHAIN_MAP: return LedgerPackage.УЧЁТНЫЙ_ЦЕНТР___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public EList<User<LoginPasswordCredentials>> getAllUsers() {
		EList<User<LoginPasswordCredentials>> ret = ECollections.newBasicEList();
		for (ХранительЖурналовОпераций ledgerKeeper: getХранителиЖурналовОпераций()) {
			if (ledgerKeeper instanceof Пользователь) {
				ret.add((Пользователь) ledgerKeeper);
			}
			
		}
		return ret;
	}

} //УчётныйЦентрImpl
