/**
 */
package org.nasdanika.ledger.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Permission;
import org.nasdanika.cdo.security.PrincipalVisitor;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.SecurityPolicy;

import org.nasdanika.core.AuthorizationProvider.AccessDecision;

import org.nasdanika.core.Context;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Гость;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Гость</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ГостьImpl#getMemberOf <em>Member Of</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ГостьImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ГостьImpl#getProtectionDomain <em>Protection Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ГостьImpl extends CDOObjectImpl implements Гость {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ГостьImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ГОСТЬ;
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
	@SuppressWarnings("unchecked")
	public EList<Group> getMemberOf() {
		return (EList<Group>)eGet(SecurityPackage.Literals.PRINCIPAL__MEMBER_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eGet(SecurityPackage.Literals.PRINCIPAL__PERMISSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionDomain<?> getProtectionDomain() {
		return (ProtectionDomain<?>)eGet(SecurityPackage.Literals.PRINCIPAL__PROTECTION_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessDecision authorize(SecurityPolicy securityPolicy, Context context, Object target, String action, String qualifier, Map<String, Object> environment) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(PrincipalVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LedgerPackage.ГОСТЬ___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP:
				return authorize((SecurityPolicy)arguments.get(0), (Context)arguments.get(1), arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Map<String, Object>)arguments.get(5));
			case LedgerPackage.ГОСТЬ___ACCEPT__PRINCIPALVISITOR:
				accept((PrincipalVisitor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ГостьImpl
