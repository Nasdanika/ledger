/**
 */
package org.nasdanika.ledger.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.LoginPasswordRealm;
import org.nasdanika.cdo.security.LoginUser;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.Realm;
import org.nasdanika.cdo.security.User;
import org.nasdanika.ledger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.ledger.LedgerPackage
 * @generated
 */
public class LedgerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LedgerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerSwitch() {
		if (modelPackage == null) {
			modelPackage = LedgerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LedgerPackage.ЭЛЕМЕНТ_МОДЕЛИ: {
				ЭлементМодели элементМодели = (ЭлементМодели)theEObject;
				T result = caseЭлементМодели(элементМодели);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.КОММЕНТАРИЙ: {
				Комментарий комментарий = (Комментарий)theEObject;
				T result = caseКомментарий(комментарий);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ИЗОБРАЖЕНИЕ: {
				Изображение изображение = (Изображение)theEObject;
				T result = caseИзображение(изображение);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ССЫЛКА_НА_ИЗОБРАЖЕНИЕ: {
				СсылкаНаИзображение ссылкаНаИзображение = (СсылкаНаИзображение)theEObject;
				T result = caseСсылкаНаИзображение(ссылкаНаИзображение);
				if (result == null) result = caseИзображение(ссылкаНаИзображение);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ: {
				ВстроенноеИзображение встроенноеИзображение = (ВстроенноеИзображение)theEObject;
				T result = caseВстроенноеИзображение(встроенноеИзображение);
				if (result == null) result = caseИзображение(встроенноеИзображение);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР: {
				УчётныйЦентр учётныйЦентр = (УчётныйЦентр)theEObject;
				T result = caseУчётныйЦентр(учётныйЦентр);
				if (result == null) result = caseLoginPasswordRealm(учётныйЦентр);
				if (result == null) result = caseЭлементМодели(учётныйЦентр);
				if (result == null) result = caseRealm(учётныйЦентр);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ: {
				ХранительЖурналовОпераций хранительЖурналовОпераций = (ХранительЖурналовОпераций)theEObject;
				T result = caseХранительЖурналовОпераций(хранительЖурналовОпераций);
				if (result == null) result = caseЭлементМодели(хранительЖурналовОпераций);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ: {
				Пользователь пользователь = (Пользователь)theEObject;
				T result = caseПользователь(пользователь);
				if (result == null) result = caseLoginPasswordHashUser(пользователь);
				if (result == null) result = caseХранительЖурналовОпераций(пользователь);
				if (result == null) result = caseLoginUser(пользователь);
				if (result == null) result = caseЭлементМодели(пользователь);
				if (result == null) result = caseUser(пользователь);
				if (result == null) result = casePrincipal(пользователь);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ОРГАНИЗАЦИЯ: {
				Организация организация = (Организация)theEObject;
				T result = caseОрганизация(организация);
				if (result == null) result = caseХранительЖурналовОпераций(организация);
				if (result == null) result = caseЭлементМодели(организация);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ: {
				ЖурналОпераций журналОпераций = (ЖурналОпераций)theEObject;
				T result = caseЖурналОпераций(журналОпераций);
				if (result == null) result = caseЭлементМодели(журналОпераций);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.СЧЁТ: {
				Счёт счёт = (Счёт)theEObject;
				T result = caseСчёт(счёт);
				if (result == null) result = caseЭлементМодели(счёт);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.АКТИВ: {
				Актив актив = (Актив)theEObject;
				T result = caseАктив(актив);
				if (result == null) result = caseЭлементМодели(актив);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.СВОЙСТВО_АКТИВА: {
				СвойствоАктива свойствоАктива = (СвойствоАктива)theEObject;
				T result = caseСвойствоАктива(свойствоАктива);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА: {
				ЗначениеСвойстваАктива значениеСвойстваАктива = (ЗначениеСвойстваАктива)theEObject;
				T result = caseЗначениеСвойстваАктива(значениеСвойстваАктива);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА: {
				ИсточникКурсаАктива источникКурсаАктива = (ИсточникКурсаАктива)theEObject;
				T result = caseИсточникКурсаАктива(источникКурсаАктива);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ФИКСИРОВАННЫЙ_КУРС: {
				ФиксированныйКурс фиксированныйКурс = (ФиксированныйКурс)theEObject;
				T result = caseФиксированныйКурс(фиксированныйКурс);
				if (result == null) result = caseИсточникКурсаАктива(фиксированныйКурс);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ВЫЧИСЛИТЕЛЬ_КУРСА: {
				ВычислительКурса вычислительКурса = (ВычислительКурса)theEObject;
				T result = caseВычислительКурса(вычислительКурса);
				if (result == null) result = caseИсточникКурсаАктива(вычислительКурса);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ОПЕРАЦИЯ: {
				Операция операция = (Операция)theEObject;
				T result = caseОперация(операция);
				if (result == null) result = caseЭлементМодели(операция);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ПРОВОДКА: {
				Проводка проводка = (Проводка)theEObject;
				T result = caseПроводка(проводка);
				if (result == null) result = caseЭлементМодели(проводка);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.СУБЪЕКТ: {
				Субъект субъект = (Субъект)theEObject;
				T result = caseСубъект(субъект);
				if (result == null) result = caseЭлементМодели(субъект);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ОТЧЁТНЫЙ_ПЕРИОД: {
				ОтчётныйПериод отчётныйПериод = (ОтчётныйПериод)theEObject;
				T result = caseОтчётныйПериод(отчётныйПериод);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ПРЕДЫДУЩИЙ_МЕСЯЦ: {
				ПредыдущийМесяц предыдущийМесяц = (ПредыдущийМесяц)theEObject;
				T result = caseПредыдущийМесяц(предыдущийМесяц);
				if (result == null) result = caseОтчётныйПериод(предыдущийМесяц);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ПРЕДЫДУЩИЙ_ГОД: {
				ПредыдущийГод предыдущийГод = (ПредыдущийГод)theEObject;
				T result = caseПредыдущийГод(предыдущийГод);
				if (result == null) result = caseОтчётныйПериод(предыдущийГод);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ТЕКУЩИЙ_МЕСЯЦ: {
				ТекущийМесяц текущийМесяц = (ТекущийМесяц)theEObject;
				T result = caseТекущийМесяц(текущийМесяц);
				if (result == null) result = caseОтчётныйПериод(текущийМесяц);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ТЕКУЩИЙ_ГОД: {
				ТекущийГод текущийГод = (ТекущийГод)theEObject;
				T result = caseТекущийГод(текущийГод);
				if (result == null) result = caseОтчётныйПериод(текущийГод);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LedgerPackage.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД: {
				ФиксированныйОтчётныйПериод фиксированныйОтчётныйПериод = (ФиксированныйОтчётныйПериод)theEObject;
				T result = caseФиксированныйОтчётныйПериод(фиксированныйОтчётныйПериод);
				if (result == null) result = caseОтчётныйПериод(фиксированныйОтчётныйПериод);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Журнал Операций</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Журнал Операций</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЖурналОпераций(ЖурналОпераций object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Учётный Центр</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Учётный Центр</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseУчётныйЦентр(УчётныйЦентр object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Элемент Модели</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Элемент Модели</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЭлементМодели(ЭлементМодели object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Пользователь</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Пользователь</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseПользователь(Пользователь object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Организация</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Организация</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseОрганизация(Организация object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Хранитель Журналов Операций</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Хранитель Журналов Операций</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseХранительЖурналовОпераций(ХранительЖурналовОпераций object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Счёт</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Счёт</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseСчёт(Счёт object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Актив</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Актив</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseАктив(Актив object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Свойство Актива</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Свойство Актива</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseСвойствоАктива(СвойствоАктива object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Значение Свойства Актива</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Значение Свойства Актива</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЗначениеСвойстваАктива(ЗначениеСвойстваАктива object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Источник Курса Актива</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Источник Курса Актива</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseИсточникКурсаАктива(ИсточникКурсаАктива object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Фиксированный Курс</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Фиксированный Курс</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseФиксированныйКурс(ФиксированныйКурс object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Вычислитель Курса</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Вычислитель Курса</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseВычислительКурса(ВычислительКурса object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Операция</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Операция</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseОперация(Операция object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Проводка</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Проводка</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseПроводка(Проводка object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Субъект</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Субъект</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseСубъект(Субъект object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Отчётный Период</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Отчётный Период</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseОтчётныйПериод(ОтчётныйПериод object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Предыдущий Месяц</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Предыдущий Месяц</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseПредыдущийМесяц(ПредыдущийМесяц object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Предыдущий Год</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Предыдущий Год</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseПредыдущийГод(ПредыдущийГод object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Текущий Месяц</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Текущий Месяц</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseТекущийМесяц(ТекущийМесяц object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Текущий Год</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Текущий Год</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseТекущийГод(ТекущийГод object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Фиксированный Отчётный Период</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Фиксированный Отчётный Период</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseФиксированныйОтчётныйПериод(ФиксированныйОтчётныйПериод object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CR> T caseRealm(Realm<CR> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Password Realm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Password Realm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginPasswordRealm(LoginPasswordRealm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Комментарий</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Комментарий</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseКомментарий(Комментарий object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Изображение</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Изображение</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseИзображение(Изображение object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ссылка На Изображение</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ссылка На Изображение</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseСсылкаНаИзображение(СсылкаНаИзображение object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Встроенное Изображение</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Встроенное Изображение</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseВстроенноеИзображение(ВстроенноеИзображение object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipal(Principal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CR> T caseUser(User<CR> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CR> T caseLoginUser(LoginUser<CR> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Password Hash User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Password Hash User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginPasswordHashUser(LoginPasswordHashUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LedgerSwitch
