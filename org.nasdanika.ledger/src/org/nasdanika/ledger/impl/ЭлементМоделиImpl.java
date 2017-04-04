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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.ЭлементМодели;
import org.nasdanika.ledger.util.LedgerValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Элемент Модели</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl#getКомментарии <em>Комментарии</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl#getИзображение <em>Изображение</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl#getИдентификатор <em>Идентификатор</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ЭлементМоделиImpl extends CDOObjectImpl implements ЭлементМодели {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЭлементМоделиImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ;
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
	
	static class ValidationHelper {
		
		private String source;
		private int code;
		private DiagnosticChain diagnostics;
		private Object owner;

		ValidationHelper(DiagnosticChain diagnostics, String source, int code, Object owner) {
			this.diagnostics = diagnostics;
			this.source = source;
			this.code = code;
			this.owner = owner;
		}
		
		boolean success = true;
		
		boolean isSuccess() {
			return success;
		}
		
		void addDiagnostic(int severity, String message, Object feature) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(severity, source, code, message, feature == null ? new Object[] { owner } : new Object[] { owner, feature }));
			
				if (Diagnostic.ERROR == severity) {
					success = false;
				}
				
			}
		}
		
		void error(String message, Object feature) {
			addDiagnostic(Diagnostic.ERROR, message, feature);
		}
		
		void error(String message) {
			error(message, null);
		}
		
		void warning(String message, Object feature) {
			addDiagnostic(Diagnostic.WARNING, message, feature);
		}
		
		void warning(String message) {
			warning(message, null);
		}
		
		void info(String message, Object feature) {
			addDiagnostic(Diagnostic.INFO, message, feature);
		}
		
		void info(String message) {
			info(message, null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics == null) {
			return true;
		}
		ValidationHelper validationHelper = new ValidationHelper(diagnostics, LedgerValidator.DIAGNOSTIC_SOURCE, LedgerValidator.ЭЛЕМЕНТ_МОДЕЛИ__VALIDATE, this);
		// For testing purposes
		if ("error".equals(getНаименование())) {
			validationHelper.error("Error message", LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ);
		} else if ("warning".equals(getНаименование())) {
			validationHelper.error("Warning message", LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ);
		} else if ("class-error".equals(getНаименование())) {
			validationHelper.error("Class error message");
		}
		return validationHelper.isSuccess();
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
			case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ЭлементМоделиImpl
