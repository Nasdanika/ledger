/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Изображение;
import org.nasdanika.ledger.Комментарий;
import org.nasdanika.ledger.ЭлементМодели;

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

} //ЭлементМоделиImpl
