/**
 */
package org.nasdanika.ledger.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.LoginPasswordProtectionDomain;
import org.nasdanika.cdo.security.LoginUser;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.User;
import org.nasdanika.ledger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.ledger.LedgerPackage
 * @generated
 */
public class LedgerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LedgerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LedgerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LedgerSwitch<Adapter> modelSwitch =
		new LedgerSwitch<Adapter>() {
			@Override
			public Adapter caseЭлементМодели(ЭлементМодели object) {
				return createЭлементМоделиAdapter();
			}
			@Override
			public Adapter caseКомментарий(Комментарий object) {
				return createКомментарийAdapter();
			}
			@Override
			public Adapter caseИзображение(Изображение object) {
				return createИзображениеAdapter();
			}
			@Override
			public Adapter caseСсылкаНаИзображение(СсылкаНаИзображение object) {
				return createСсылкаНаИзображениеAdapter();
			}
			@Override
			public Adapter caseВстроенноеИзображение(ВстроенноеИзображение object) {
				return createВстроенноеИзображениеAdapter();
			}
			@Override
			public Adapter caseУчётныйЦентр(УчётныйЦентр object) {
				return createУчётныйЦентрAdapter();
			}
			@Override
			public Adapter caseХранительЖурналовОпераций(ХранительЖурналовОпераций object) {
				return createХранительЖурналовОперацийAdapter();
			}
			@Override
			public Adapter caseПользователь(Пользователь object) {
				return createПользовательAdapter();
			}
			@Override
			public Adapter caseГость(Гость object) {
				return createГостьAdapter();
			}
			@Override
			public Adapter caseПраво(Право object) {
				return createПравоAdapter();
			}
			@Override
			public Adapter caseОрганизация(Организация object) {
				return createОрганизацияAdapter();
			}
			@Override
			public Adapter caseЖурналОпераций(ЖурналОпераций object) {
				return createЖурналОперацийAdapter();
			}
			@Override
			public Adapter caseСчёт(Счёт object) {
				return createСчётAdapter();
			}
			@Override
			public Adapter caseАктив(Актив object) {
				return createАктивAdapter();
			}
			@Override
			public Adapter caseСвойствоАктива(СвойствоАктива object) {
				return createСвойствоАктиваAdapter();
			}
			@Override
			public Adapter caseЗначениеСвойстваАктива(ЗначениеСвойстваАктива object) {
				return createЗначениеСвойстваАктиваAdapter();
			}
			@Override
			public Adapter caseИсточникКурсаАктива(ИсточникКурсаАктива object) {
				return createИсточникКурсаАктиваAdapter();
			}
			@Override
			public Adapter caseФиксированныйКурс(ФиксированныйКурс object) {
				return createФиксированныйКурсAdapter();
			}
			@Override
			public Adapter caseВычислительКурса(ВычислительКурса object) {
				return createВычислительКурсаAdapter();
			}
			@Override
			public Adapter caseОперация(Операция object) {
				return createОперацияAdapter();
			}
			@Override
			public Adapter caseПроводка(Проводка object) {
				return createПроводкаAdapter();
			}
			@Override
			public Adapter caseСубъект(Субъект object) {
				return createСубъектAdapter();
			}
			@Override
			public <CR> Adapter caseProtectionDomain(ProtectionDomain<CR> object) {
				return createProtectionDomainAdapter();
			}
			@Override
			public Adapter caseLoginPasswordProtectionDomain(LoginPasswordProtectionDomain object) {
				return createLoginPasswordProtectionDomainAdapter();
			}
			@Override
			public Adapter casePrincipal(Principal object) {
				return createPrincipalAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseLoginUser(LoginUser object) {
				return createLoginUserAdapter();
			}
			@Override
			public Adapter caseLoginPasswordHashUser(LoginPasswordHashUser object) {
				return createLoginPasswordHashUserAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ЖурналОпераций <em>Журнал Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ЖурналОпераций
	 * @generated
	 */
	public Adapter createЖурналОперацийAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.УчётныйЦентр <em>Учётный Центр</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.УчётныйЦентр
	 * @generated
	 */
	public Adapter createУчётныйЦентрAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ЭлементМодели <em>Элемент Модели</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ЭлементМодели
	 * @generated
	 */
	public Adapter createЭлементМоделиAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Пользователь <em>Пользователь</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Пользователь
	 * @generated
	 */
	public Adapter createПользовательAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Гость <em>Гость</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Гость
	 * @generated
	 */
	public Adapter createГостьAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Право <em>Право</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Право
	 * @generated
	 */
	public Adapter createПравоAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Организация <em>Организация</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Организация
	 * @generated
	 */
	public Adapter createОрганизацияAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ХранительЖурналовОпераций <em>Хранитель Журналов Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ХранительЖурналовОпераций
	 * @generated
	 */
	public Adapter createХранительЖурналовОперацийAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Счёт <em>Счёт</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Счёт
	 * @generated
	 */
	public Adapter createСчётAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Актив <em>Актив</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Актив
	 * @generated
	 */
	public Adapter createАктивAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.СвойствоАктива <em>Свойство Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.СвойствоАктива
	 * @generated
	 */
	public Adapter createСвойствоАктиваAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ЗначениеСвойстваАктива <em>Значение Свойства Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ЗначениеСвойстваАктива
	 * @generated
	 */
	public Adapter createЗначениеСвойстваАктиваAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ИсточникКурсаАктива <em>Источник Курса Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива
	 * @generated
	 */
	public Adapter createИсточникКурсаАктиваAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ФиксированныйКурс <em>Фиксированный Курс</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ФиксированныйКурс
	 * @generated
	 */
	public Adapter createФиксированныйКурсAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ВычислительКурса <em>Вычислитель Курса</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ВычислительКурса
	 * @generated
	 */
	public Adapter createВычислительКурсаAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Операция <em>Операция</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Операция
	 * @generated
	 */
	public Adapter createОперацияAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Проводка <em>Проводка</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Проводка
	 * @generated
	 */
	public Adapter createПроводкаAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Субъект <em>Субъект</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Субъект
	 * @generated
	 */
	public Adapter createСубъектAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Комментарий <em>Комментарий</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Комментарий
	 * @generated
	 */
	public Adapter createКомментарийAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.Изображение <em>Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.Изображение
	 * @generated
	 */
	public Adapter createИзображениеAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.СсылкаНаИзображение <em>Ссылка На Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.СсылкаНаИзображение
	 * @generated
	 */
	public Adapter createСсылкаНаИзображениеAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ledger.ВстроенноеИзображение <em>Встроенное Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ledger.ВстроенноеИзображение
	 * @generated
	 */
	public Adapter createВстроенноеИзображениеAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.ProtectionDomain
	 * @generated
	 */
	public Adapter createProtectionDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.LoginPasswordProtectionDomain <em>Login Password Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.LoginPasswordProtectionDomain
	 * @generated
	 */
	public Adapter createLoginPasswordProtectionDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.LoginUser <em>Login User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.LoginUser
	 * @generated
	 */
	public Adapter createLoginUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.cdo.security.LoginPasswordHashUser <em>Login Password Hash User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.cdo.security.LoginPasswordHashUser
	 * @generated
	 */
	public Adapter createLoginPasswordHashUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LedgerAdapterFactory
