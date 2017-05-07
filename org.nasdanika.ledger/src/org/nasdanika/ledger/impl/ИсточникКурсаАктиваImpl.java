/**
 */
package org.nasdanika.ledger.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.ЗначениеСвойстваАктива;
import org.nasdanika.ledger.ИсточникКурсаАктива;
import org.nasdanika.ledger.КурсАктива;
import org.nasdanika.ledger.Субъект;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Источник Курса Актива</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl#getНачалоПериодаДействия <em>Начало Периода Действия</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl#getКонецПериодаДействия <em>Конец Периода Действия</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl#getБазовыйАктив <em>Базовый Актив</em>}</li>
 *   <li>{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl#getКомментарий <em>Комментарий</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ИсточникКурсаАктиваImpl extends CDOObjectImpl implements ИсточникКурсаАктива {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ИсточникКурсаАктиваImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА;
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
	public Date getНачалоПериодаДействия() {
		return (Date)eGet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setНачалоПериодаДействия(Date newНачалоПериодаДействия) {
		eSet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ, newНачалоПериодаДействия);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getКонецПериодаДействия() {
		return (Date)eGet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКонецПериодаДействия(Date newКонецПериодаДействия) {
		eSet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ, newКонецПериодаДействия);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Актив getБазовыйАктив() {
		return (Актив)eGet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setБазовыйАктив(Актив newБазовыйАктив) {
		eSet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ, newБазовыйАктив);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getКомментарий() {
		return (String)eGet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setКомментарий(String newКомментарий) {
		eSet(LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ, newКомментарий);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public КурсАктива получитьКурс(Date дата, BigDecimal количество, EList<ЗначениеСвойстваАктива> значенияСвойств, КурсАктива базовыйКурс, EList<Субъект> субъект) {
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
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST:
				return получитьКурс((Date)arguments.get(0), (BigDecimal)arguments.get(1), (EList<ЗначениеСвойстваАктива>)arguments.get(2), (КурсАктива)arguments.get(3), (EList<Субъект>)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ИсточникКурсаАктиваImpl
