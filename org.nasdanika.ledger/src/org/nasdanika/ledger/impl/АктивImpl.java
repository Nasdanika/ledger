/**
 */
package org.nasdanika.ledger.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ИсточникКурсаАктива;
import org.nasdanika.ledger.СвойствоАктива;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Актив</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#getИсточникиКурсов <em>Источники Курсов</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#isГруппа <em>Группа</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#getСубАктивы <em>Суб Активы</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#getЕдиницаИзмерения <em>Единица Измерения</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#getТочность <em>Точность</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.АктивImpl#getСвойства <em>Свойства</em>}</li>
 * </ul>
 *
 * @generated
 */
public class АктивImpl extends ЭлементМоделиImpl implements Актив {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected АктивImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.АКТИВ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ИсточникКурсаАктива> getИсточникиКурсов() {
		return (EList<ИсточникКурсаАктива>)eGet(LedgerPackage.Literals.АКТИВ__ИСТОЧНИКИ_КУРСОВ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Актив> getСубАктивы() {
		return (EList<Актив>)eGet(LedgerPackage.Literals.АКТИВ__СУБ_АКТИВЫ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getТочность() {
		return (Integer)eGet(LedgerPackage.Literals.АКТИВ__ТОЧНОСТЬ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setТочность(Integer newТочность) {
		eSet(LedgerPackage.Literals.АКТИВ__ТОЧНОСТЬ, newТочность);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<СвойствоАктива> getСвойства() {
		return (EList<СвойствоАктива>)eGet(LedgerPackage.Literals.АКТИВ__СВОЙСТВА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getЕдиницаИзмерения() {
		return (String)eGet(LedgerPackage.Literals.АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setЕдиницаИзмерения(String newЕдиницаИзмерения) {
		eSet(LedgerPackage.Literals.АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ, newЕдиницаИзмерения);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isГруппа() {
		return (Boolean)eGet(LedgerPackage.Literals.АКТИВ__ГРУППА, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setГруппа(boolean newГруппа) {
		eSet(LedgerPackage.Literals.АКТИВ__ГРУППА, newГруппа);
	}

} //АктивImpl
