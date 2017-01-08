/**
 */
package org.nasdanika.ledger;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Источник Курса Актива</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ИсточникКурсаАктива#getНачалоПериодаДействия <em>Начало Периода Действия</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКонецПериодаДействия <em>Конец Периода Действия</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ИсточникКурсаАктива#getБазовыйАктив <em>Базовый Актив</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКомментарий <em>Комментарий</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getИсточникКурсаАктива()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ИсточникКурсаАктива extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Начало Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Начало Периода Действия</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Начало Периода Действия</em>' attribute.
	 * @see #setНачалоПериодаДействия(Date)
	 * @see org.nasdanika.ledger.LedgerPackage#getИсточникКурсаАктива_НачалоПериодаДействия()
	 * @model
	 * @generated
	 */
	Date getНачалоПериодаДействия();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getНачалоПериодаДействия <em>Начало Периода Действия</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Начало Периода Действия</em>' attribute.
	 * @see #getНачалоПериодаДействия()
	 * @generated
	 */
	void setНачалоПериодаДействия(Date value);

	/**
	 * Returns the value of the '<em><b>Конец Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Конец Периода Действия</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Конец Периода Действия</em>' attribute.
	 * @see #setКонецПериодаДействия(Date)
	 * @see org.nasdanika.ledger.LedgerPackage#getИсточникКурсаАктива_КонецПериодаДействия()
	 * @model
	 * @generated
	 */
	Date getКонецПериодаДействия();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКонецПериодаДействия <em>Конец Периода Действия</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Конец Периода Действия</em>' attribute.
	 * @see #getКонецПериодаДействия()
	 * @generated
	 */
	void setКонецПериодаДействия(Date value);

	/**
	 * Returns the value of the '<em><b>Базовый Актив</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Базовый Актив</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Базовый Актив</em>' reference.
	 * @see #setБазовыйАктив(Актив)
	 * @see org.nasdanika.ledger.LedgerPackage#getИсточникКурсаАктива_БазовыйАктив()
	 * @model
	 * @generated
	 */
	Актив getБазовыйАктив();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getБазовыйАктив <em>Базовый Актив</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Базовый Актив</em>' reference.
	 * @see #getБазовыйАктив()
	 * @generated
	 */
	void setБазовыйАктив(Актив value);

	/**
	 * Returns the value of the '<em><b>Комментарий</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Комментарий</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Комментарий</em>' attribute.
	 * @see #setКомментарий(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getИсточникКурсаАктива_Комментарий()
	 * @model
	 * @generated
	 */
	String getКомментарий();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКомментарий <em>Комментарий</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Комментарий</em>' attribute.
	 * @see #getКомментарий()
	 * @generated
	 */
	void setКомментарий(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * @param дата 
	 * @param количество 
	 * @param значенияСвойств 
	 * @param базовыйКурс 
	 * @param субъект 
	 * <!-- end-model-doc -->
	 * @model dataType="org.nasdanika.ledger.КурсАктива" датаRequired="true" значенияСвойствMany="true" базовыйКурсDataType="org.nasdanika.ledger.КурсАктива" субъектMany="true"
	 * @generated
	 */
	КурсАктива получитьКурс(Date дата, BigDecimal количество, EList<ЗначениеСвойстваАктива> значенияСвойств, КурсАктива базовыйКурс, EList<Субъект> субъект);

} // ИсточникКурсаАктива
