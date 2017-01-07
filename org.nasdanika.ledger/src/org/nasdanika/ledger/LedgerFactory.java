/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.ledger.LedgerPackage
 * @generated
 */
public interface LedgerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerFactory eINSTANCE = org.nasdanika.ledger.impl.LedgerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Журнал Операций</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Журнал Операций</em>'.
	 * @generated
	 */
	ЖурналОпераций createЖурналОпераций();

	/**
	 * Returns a new object of class '<em>Учётный Центр</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Учётный Центр</em>'.
	 * @generated
	 */
	УчётныйЦентр createУчётныйЦентр();

	/**
	 * Returns a new object of class '<em>Пользователь</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Пользователь</em>'.
	 * @generated
	 */
	Пользователь createПользователь();

	/**
	 * Returns a new object of class '<em>Гость</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Гость</em>'.
	 * @generated
	 */
	Гость createГость();

	/**
	 * Returns a new object of class '<em>Право</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Право</em>'.
	 * @generated
	 */
	Право createПраво();

	/**
	 * Returns a new object of class '<em>Организация</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Организация</em>'.
	 * @generated
	 */
	Организация createОрганизация();

	/**
	 * Returns a new object of class '<em>Счёт</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Счёт</em>'.
	 * @generated
	 */
	Счёт createСчёт();

	/**
	 * Returns a new object of class '<em>Актив</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Актив</em>'.
	 * @generated
	 */
	Актив createАктив();

	/**
	 * Returns a new object of class '<em>Свойство Актива</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Свойство Актива</em>'.
	 * @generated
	 */
	СвойствоАктива createСвойствоАктива();

	/**
	 * Returns a new object of class '<em>Значение Свойства Актива</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Значение Свойства Актива</em>'.
	 * @generated
	 */
	ЗначениеСвойстваАктива createЗначениеСвойстваАктива();

	/**
	 * Returns a new object of class '<em>Фиксированный Курс</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Фиксированный Курс</em>'.
	 * @generated
	 */
	ФиксированныйКурс createФиксированныйКурс();

	/**
	 * Returns a new object of class '<em>Вычислитель Курса</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Вычислитель Курса</em>'.
	 * @generated
	 */
	ВычислительКурса createВычислительКурса();

	/**
	 * Returns a new object of class '<em>Операция</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Операция</em>'.
	 * @generated
	 */
	Операция createОперация();

	/**
	 * Returns a new object of class '<em>Проводка</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Проводка</em>'.
	 * @generated
	 */
	Проводка createПроводка();

	/**
	 * Returns a new object of class '<em>Субъект</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Субъект</em>'.
	 * @generated
	 */
	Субъект createСубъект();

	/**
	 * Returns a new object of class '<em>Комментарий</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Комментарий</em>'.
	 * @generated
	 */
	Комментарий createКомментарий();

	/**
	 * Returns a new object of class '<em>Ссылка На Изображение</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ссылка На Изображение</em>'.
	 * @generated
	 */
	СсылкаНаИзображение createСсылкаНаИзображение();

	/**
	 * Returns a new object of class '<em>Встроенное Изображение</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Встроенное Изображение</em>'.
	 * @generated
	 */
	ВстроенноеИзображение createВстроенноеИзображение();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LedgerPackage getLedgerPackage();

} //LedgerFactory
