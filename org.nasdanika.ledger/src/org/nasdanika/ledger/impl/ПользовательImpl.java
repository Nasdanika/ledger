/**
 */
package org.nasdanika.ledger.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.impl.LoginUserImpl;
import org.nasdanika.html.Theme;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.util.LedgerValidator;
import org.nasdanika.ledger.ЖурналОпераций;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.Пользователь;
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
 *   <li>{@link org.nasdanika.ledger.impl.ПользовательImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ПользовательImpl extends LoginUserImpl<LoginPasswordCredentials> implements Пользователь {
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
	public Theme getTheme() {
		return (Theme)eGet(LedgerPackage.Literals.ПОЛЬЗОВАТЕЛЬ__THEME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		eSet(LedgerPackage.Literals.ПОЛЬЗОВАТЕЛЬ__THEME, newTheme);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ЭлементМодели.class) {
			switch (baseOperationID) {
				case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ___VALIDATE__DIAGNOSTICCHAIN_MAP: return LedgerPackage.ПОЛЬЗОВАТЕЛЬ___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == ХранительЖурналовОпераций.class) {
			switch (baseOperationID) {
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
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ПользовательImpl
