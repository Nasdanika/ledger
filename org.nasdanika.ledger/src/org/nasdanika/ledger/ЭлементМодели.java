/**
 */
package org.nasdanika.ledger;

import java.util.Map;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Элемент Модели</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Абстрактный базовый класс для ряда элементов модели содержащий общие атрибуты и ссылки. 
 * Подклассы могут использовать только некоторые ссылки и аттрибуты определённые в суперклассе.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getКомментарии <em>Комментарии</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getИзображение <em>Изображение</em>}</li>
 *   <li>{@link org.nasdanika.ledger.ЭлементМодели#getИдентификатор <em>Идентификатор</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели()
 * @model abstract="true"
 *        annotation="org.nasdanika.cdo.web.render label='{{\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435}}'"
 * @extends CDOObject
 * @generated
 */
public interface ЭлементМодели extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Наименование</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Наименование элемента.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Наименование</em>' attribute.
	 * @see #setНаименование(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Наименование()
	 * @model
	 * @generated
	 */
	String getНаименование();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Наименование</em>' attribute.
	 * @see #getНаименование()
	 * @generated
	 */
	void setНаименование(String value);

	/**
	 * Returns the value of the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Описание</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание элемента в формате HTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Описание</em>' attribute.
	 * @see #setОписание(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Описание()
	 * @model
	 * @generated
	 */
	String getОписание();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Описание</em>' attribute.
	 * @see #getОписание()
	 * @generated
	 */
	void setОписание(String value);

	/**
	 * Returns the value of the '<em><b>Комментарии</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ledger.Комментарий}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Комментарии</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Комментарии к элементу. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Комментарии</em>' containment reference list.
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Комментарии()
	 * @model containment="true"
	 * @generated
	 */
	EList<Комментарий> getКомментарии();

	/**
	 * Returns the value of the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Изображение</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Изображение элемента. Например, фотография пользователя или товара, или иконка для счёта - кошелёк для наличных, здание для банка, корабль или машина для товаров в пути.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Изображение</em>' containment reference.
	 * @see #setИзображение(Изображение)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Изображение()
	 * @model containment="true"
	 * @generated
	 */
	Изображение getИзображение();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getИзображение <em>Изображение</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Изображение</em>' containment reference.
	 * @see #getИзображение()
	 * @generated
	 */
	void setИзображение(Изображение value);

	/**
	 * Returns the value of the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Идентификатор элемента, например номер банковского счёта
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Идентификатор</em>' attribute.
	 * @see #setИдентификатор(String)
	 * @see org.nasdanika.ledger.LedgerPackage#getЭлементМодели_Идентификатор()
	 * @model
	 * @generated
	 */
	String getИдентификатор();

	/**
	 * Sets the value of the '{@link org.nasdanika.ledger.ЭлементМодели#getИдентификатор <em>Идентификатор</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Идентификатор</em>' attribute.
	 * @see #getИдентификатор()
	 * @generated
	 */
	void setИдентификатор(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ЭлементМодели
