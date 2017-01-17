/**
 */
package org.nasdanika.ledger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.cdo.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Пакет (package) Ledger содержит доменные модельные классы для учёта хозяйственных операций.
 * 
 * [[classifier>УчётныйЦентр|Учётный Центр]] является корневым элементом модели и содержит [[classifier>ХранительЖурналовОпераций|хранителей журналов операций]] - 
 * [[classifier>Пользователь|пользователей]] и [[classifier>Организация|организации]].
 * 
 * Хранитель журналов операций является абстрактным базовым классом для пользователей и организаций. Хранитель журналов операций содержит [[classifier>ЖурналОпераций|журналы операций]]. 
 * Пользователь это хранитель журналов операций с логином и паролем. Организации позволяют хранить журналы операций над которыми могут работать несколько пользователей. 
 * Пользователи могут давать доступ другим пользователям к своим журналам операций. Организации позволяют хранить журналы независимые от конкретного пользователя. Концепция пользователь-организация заимствована у GitHub и DockerHub.
 * 
 * [[classifier>ЖурналОпераций|Журнал операций]] содержит [[classifier>Операция|операции]] с [[classifier>Проводка|проводками]] и ссылочные данные - [[classifier>Счёт|счета]], [[classifier>Актив|активы]] и [[classifier>Субъект|субъекты]].
 * 
 * Каждая операция может содержать несколько проводок и ссылаться на нескольких субъектов. Проводка описывает движения актива по счёту как часть операции. 
 * Сумма движений активов по счетам в операции пересчитанная на базовый актив (например рубли) по курсу на дату совершения операции должна равнятся нулю (быть сбалансирована). 
 * Операция является расширением концепции двойной записи бухгалтерского учёта - в операций может принимать участие более чем два счёта и счета могут содержать разные активы (рубли, доллары, товар).
 * 
 * Документация элементов модели содержит подробное описание элементов и их атрибутов, связей и операций. [[todo|Модель пользовательских историй]] описывает функционирование программы учёта в терминах элементов доменной модели.
 * 
 * ## Метафора
 * 
 * Учётный центр это здание с квартирами (пользователи) и офисами (организации). И в квартирах и в офисах хранятся журналы операций. 
 * Журнал операций это тетрадь в которой записываются операции. 
 * Счёт это некий контейнер в котором можно держать определённые активы. Например в кошельке можно держать деньги, а в коробке товар. 
 * 
 * На заметку: Метафоры могут служить большим подспорьем в описании какой-либо концепции. Главное не забывать что метафоры не стоит принимать слишком буквально.
 * 
 * ## Пример
 * 
 * Марья Ивановна торгует на рынке молоком, помидорами и огурцами. Овощи она выращивает сама, молоко покупает у соседки. 
 * У Марьи Ивановны есть постоянные покупатели - Клавдия Петровна и Фёдор Семёнович -  которым она порой продаёт в кредит и берёт деньги вперёд (предоплата). 
 * Марья Ивановна хранит деньги в Сбербанке в рублях и долларах.
 * 
 * ### Субъекты
 * 
 * * Сбербанк
 * * Клавдия Петровна
 * * Фёдор Семёнович
 * 
 * ### Активы
 * 
 * * Деньги - группа активов, точность 2 (знака после запятой) - копейки или центы. Активы в группе наследуют точность.
 *     * Рубли 
 *     * Доллары
 * * Товары
 *     * Молоко - единица измерения литры, точность 3 (миллилитры)
 *     * Овощи - группа активов, единица измерения килограммы, точность 3 (грамы). Активы в группе наследуют единицу измерения равно как и точность.
 *         * Помидоры 
 *         * Огурцы
 * 
 * ### Счета
 * 
 * * Денежные 
 *     * Кошелёк - в кошельке можно хранить деньги (рубли и доллары), но нельзя хранить молко, помидоры и огурцы.
 *     * Банковские
 *         * Рублёвый счёт
 *         * Долларовый счёт
 * * Товарные
 *     * Бидон - в бидоне можно держать молоко. Если там уже есть молко то лучше туда не класть помидоры или огурцы.
 *     * Корзинка - в корзинке можно хранить и помидоры и огурцы одновременно. В принципе в корзинке можно держать и деньги - спрятать под овощи от хулиганов.
 * * Клиентские - на клиентских счетах могут "храниться" деньги в случае продажи в кредит или товар - деньги взяты вперёд под определённый товар.
 *     * Клавдия Петровна
 *     * Фёдор Семёнович
 * * Прибыли и убытки в пересчёте на рубли.
 * 
 * ### Операции
 * 
 * #### Покупка молока у соседки
 * 
 * * Деньги из кошелька.
 * * Молоко в бидон.
 * * "Курс" молока устанавливается по себестоимости.
 * 
 * #### Овощи с огорода
 * 
 * * "Курс" овощей устанавливается по магически расчитанной "себестоимости". 
 * * Овощи в корзинку.
 * * Тут нужен счёт чтобы учитывать труд, удобрения и т.д. Для простоты пусть это будет счёт "Прибыли и убытки". Себестоимость овощей списывается с прибылей и убытков.
 * 
 * 
 * #### Поездка в город на рынок
 * 
 * * Деньги из кошелька на билет на электричку, трамвай, и на оплату места на рынке.
 * * Стоимость вышеперечисленных затрат в прибыли и убытки.
 * 
 * #### Продажа случайному покупателю
 * 
 * Продажа килограмма огурцов и литра молока (хе-хе) со скидкой за "опт":
 * 
 * * Деньги в кошелёк
 * * Молоко из бидона
 * * Огурцы из корзинки
 * * Огурцы и молоко пересчитываются в рубли по "курсу". В случае товара это себестоимость. Разница между себестоимостью и выручкой записывается в прибыли/убытки чтобы операция была сбалансирована.
 * 
 * #### Продажа Клавдии Петровне
 * 
 * То-же самое как и случайному покупателю, но Клавдия Петровна указана как субъект операции.
 * 
 * #### Продажа овощей в кредит Фёдору Семёновичу
 * 
 * У Фёдора Семёновича не хватило наличных в кошельке чтобы расплатиться за все овощи.
 * 
 * * Деньги в кошелёк
 * * Деньги на счёт Фёдора Петровича (должен)
 * * Овощи из корзинки
 * * Разница между себестоимостью и выручкой в прибыли/убытки.
 * 
 * #### Фёдору Семёнович расплатился
 * 
 * * Деньги в кошелёк
 * * Деньги со счёта Фёдора Петровича (больше не должен)
 * 
 * #### Предоплата
 * 
 * Клавдия Петровна отдала деньги вперёд за кило помидоров.
 * 
 * * Деньги в кошелёк
 * * Овощи со счёта Клавдии Петровны (Марья Ивановна должна Клавдии Петровне кило помидор)
 * * Разница между себестоимостью и выручкой в прибыли/убытки.
 * 
 * #### Овощи Клавдии Петровне
 * 
 * * Овощи на счёт Клавдии Петровны (больше не должна)
 * * Овощи из корзинки
 * 
 * #### Покупка валюты
 * 
 * * Текущий курс в таблицу курсов
 * * Рубли из кошелька
 * * Доллары в кошелёк
 * 
 * #### Деньги в банк
 * 
 * * Деньги из кошелька
 * * Деньги на счёт
 * * Субъект операции - Сбербанк
 * 
 * ### Сверка проводок
 * 
 * Получив выписки и банка Клавдия Петровна сверяет проводки и остатки и отмечает проводки как "Сверено".
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 * @see org.nasdanika.ledger.LedgerFactory
 * @model kind="package"
 * @generated
 */
public interface LedgerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ledger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.ledger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.ledger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerPackage eINSTANCE = org.nasdanika.ledger.impl.LedgerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl <em>Журнал Операций</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ЖурналОперацийImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЖурналОпераций()
	 * @generated
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl <em>Элемент Модели</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ЭлементМоделиImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЭлементМодели()
	 * @generated
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl <em>Учётный Центр</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.УчётныйЦентрImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getУчётныйЦентр()
	 * @generated
	 */
	int УЧЁТНЫЙ_ЦЕНТР = 5;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ = 0;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ = 1;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ = 2;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ = 3;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР = 4;

	/**
	 * The number of structural features of the '<em>Элемент Модели</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Элемент Модели</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ПользовательImpl <em>Пользователь</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ПользовательImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getПользователь()
	 * @generated
	 */
	int ПОЛЬЗОВАТЕЛЬ = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ОрганизацияImpl <em>Организация</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ОрганизацияImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getОрганизация()
	 * @generated
	 */
	int ОРГАНИЗАЦИЯ = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ХранительЖурналовОперацийImpl <em>Хранитель Журналов Операций</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ХранительЖурналовОперацийImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getХранительЖурналовОпераций()
	 * @generated
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.СчётImpl <em>Счёт</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.СчётImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСчёт()
	 * @generated
	 */
	int СЧЁТ = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.АктивImpl <em>Актив</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.АктивImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getАктив()
	 * @generated
	 */
	int АКТИВ = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl <em>Свойство Актива</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.СвойствоАктиваImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСвойствоАктива()
	 * @generated
	 */
	int СВОЙСТВО_АКТИВА = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl <em>Значение Свойства Актива</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЗначениеСвойстваАктива()
	 * @generated
	 */
	int ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl <em>Источник Курса Актива</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getИсточникКурсаАктива()
	 * @generated
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ФиксированныйКурсImpl <em>Фиксированный Курс</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ФиксированныйКурсImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getФиксированныйКурс()
	 * @generated
	 */
	int ФИКСИРОВАННЫЙ_КУРС = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ВычислительКурсаImpl <em>Вычислитель Курса</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ВычислительКурсаImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getВычислительКурса()
	 * @generated
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ОперацияImpl <em>Операция</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ОперацияImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getОперация()
	 * @generated
	 */
	int ОПЕРАЦИЯ = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ПроводкаImpl <em>Проводка</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ПроводкаImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getПроводка()
	 * @generated
	 */
	int ПРОВОДКА = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.СубъектImpl <em>Субъект</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.СубъектImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСубъект()
	 * @generated
	 */
	int СУБЪЕКТ = 19;

	/**
	 * The meta object id for the '<em>Курс Актива</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.КурсАктива
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getКурсАктива()
	 * @generated
	 */
	int КУРС_АКТИВА = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.КомментарийImpl <em>Комментарий</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.КомментарийImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getКомментарий()
	 * @generated
	 */
	int КОММЕНТАРИЙ = 1;

	/**
	 * The feature id for the '<em><b>Автор</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int КОММЕНТАРИЙ__АВТОР = 0;

	/**
	 * The feature id for the '<em><b>Содержание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int КОММЕНТАРИЙ__СОДЕРЖАНИЕ = 1;

	/**
	 * The feature id for the '<em><b>Дата</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int КОММЕНТАРИЙ__ДАТА = 2;

	/**
	 * The number of structural features of the '<em>Комментарий</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int КОММЕНТАРИЙ_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Комментарий</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int КОММЕНТАРИЙ_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ИзображениеImpl <em>Изображение</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ИзображениеImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getИзображение()
	 * @generated
	 */
	int ИЗОБРАЖЕНИЕ = 2;

	/**
	 * The number of structural features of the '<em>Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИЗОБРАЖЕНИЕ_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИЗОБРАЖЕНИЕ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.СсылкаНаИзображениеImpl <em>Ссылка На Изображение</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.СсылкаНаИзображениеImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСсылкаНаИзображение()
	 * @generated
	 */
	int ССЫЛКА_НА_ИЗОБРАЖЕНИЕ = 3;

	/**
	 * The feature id for the '<em><b>Ссылка</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ССЫЛКА_НА_ИЗОБРАЖЕНИЕ__ССЫЛКА = ИЗОБРАЖЕНИЕ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ссылка На Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ССЫЛКА_НА_ИЗОБРАЖЕНИЕ_FEATURE_COUNT = ИЗОБРАЖЕНИЕ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ссылка На Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ССЫЛКА_НА_ИЗОБРАЖЕНИЕ_OPERATION_COUNT = ИЗОБРАЖЕНИЕ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl <em>Встроенное Изображение</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl
	 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getВстроенноеИзображение()
	 * @generated
	 */
	int ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ = 4;

	/**
	 * The feature id for the '<em><b>Содержание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__СОДЕРЖАНИЕ = ИЗОБРАЖЕНИЕ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Формат</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__ФОРМАТ = ИЗОБРАЖЕНИЕ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Встроенное Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ_FEATURE_COUNT = ИЗОБРАЖЕНИЕ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Встроенное Изображение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ_OPERATION_COUNT = ИЗОБРАЖЕНИЕ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ROOT = SecurityPackage.LOGIN_PASSWORD_REALM__ROOT;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__GUEST = SecurityPackage.LOGIN_PASSWORD_REALM__GUEST;

	/**
	 * The feature id for the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__EVERYONE = SecurityPackage.LOGIN_PASSWORD_REALM__EVERYONE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__PACKAGES = SecurityPackage.LOGIN_PASSWORD_REALM__PACKAGES;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__НАИМЕНОВАНИЕ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ОПИСАНИЕ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__КОММЕНТАРИИ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ИЗОБРАЖЕНИЕ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ИДЕНТИФИКАТОР = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Хранители Журналов Операций</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Учётный Центр</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР___AUTHENTICATE__OBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР___GET_ALL_USERS = SecurityPackage.LOGIN_PASSWORD_REALM___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР___CLEAR_PERMISSIONS__EOBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = SecurityPackage.LOGIN_PASSWORD_REALM___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР___GET_USER__STRING = SecurityPackage.LOGIN_PASSWORD_REALM___GET_USER__STRING;

	/**
	 * The number of operations of the '<em>Учётный Центр</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int УЧЁТНЫЙ_ЦЕНТР_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Журналы Операций</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Хранитель Журналов Операций</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Хранитель Журналов Операций</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__MEMBER_OF = SecurityPackage.LOGIN_PASSWORD_HASH_USER__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__PERMISSIONS = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__DISABLED = SecurityPackage.LOGIN_PASSWORD_HASH_USER__DISABLED;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__LOGIN = SecurityPackage.LOGIN_PASSWORD_HASH_USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__PASSWORD_HASH = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__НАИМЕНОВАНИЕ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__ОПИСАНИЕ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__КОММЕНТАРИИ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__ИЗОБРАЖЕНИЕ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__ИДЕНТИФИКАТОР = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Журналы Операций</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ__ЖУРНАЛЫ_ОПЕРАЦИЙ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Пользователь</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = SecurityPackage.LOGIN_PASSWORD_HASH_USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ___ACCEPT__PRINCIPALVISITOR = SecurityPackage.LOGIN_PASSWORD_HASH_USER___ACCEPT__PRINCIPALVISITOR;

	/**
	 * The operation id for the '<em>Get Realm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ___GET_REALM = SecurityPackage.LOGIN_PASSWORD_HASH_USER___GET_REALM;

	/**
	 * The number of operations of the '<em>Пользователь</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПОЛЬЗОВАТЕЛЬ_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__НАИМЕНОВАНИЕ = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__ОПИСАНИЕ = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__КОММЕНТАРИИ = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__ИЗОБРАЖЕНИЕ = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__ИДЕНТИФИКАТОР = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Журналы Операций</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ__ЖУРНАЛЫ_ОПЕРАЦИЙ = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ;

	/**
	 * The number of structural features of the '<em>Организация</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ_FEATURE_COUNT = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Организация</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОРГАНИЗАЦИЯ_OPERATION_COUNT = ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Операции</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Счёта</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Активы</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Субъекты</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Отчётные Активы</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_АКТИВЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Счёт По Умолчанию Для Балансировки Операций</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Журнал Операций</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Журнал Операций</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖУРНАЛ_ОПЕРАЦИЙ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Группа</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__ГРУППА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Суб Счета</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__СУБ_СЧЕТА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Активы</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__АКТИВЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Проводки</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ__ПРОВОДКИ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Счёт</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Счёт</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СЧЁТ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Источники Курсов</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ИСТОЧНИКИ_КУРСОВ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Группа</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ГРУППА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Суб Активы</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__СУБ_АКТИВЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Единица Измерения</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Точность</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ТОЧНОСТЬ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Свойства</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__СВОЙСТВА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Счета</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__СЧЕТА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Проводки</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ__ПРОВОДКИ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Актив</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Актив</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int АКТИВ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ = 0;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА__ОПИСАНИЕ = 1;

	/**
	 * The feature id for the '<em><b>Тип</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА__ТИП = 2;

	/**
	 * The feature id for the '<em><b>Нижняя Граница</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА = 3;

	/**
	 * The feature id for the '<em><b>Верхняя Граница</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА = 4;

	/**
	 * The number of structural features of the '<em>Свойство Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Свойство Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СВОЙСТВО_АКТИВА_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Свойство</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__СВОЙСТВО = 0;

	/**
	 * The feature id for the '<em><b>Значения</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__ЗНАЧЕНИЯ = 1;

	/**
	 * The number of structural features of the '<em>Значение Свойства Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Значение Свойства Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Начало Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ = 0;

	/**
	 * The feature id for the '<em><b>Конец Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ = 1;

	/**
	 * The feature id for the '<em><b>Базовый Актив</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ = 2;

	/**
	 * The feature id for the '<em><b>Комментарий</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ = 3;

	/**
	 * The number of structural features of the '<em>Источник Курса Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Получить Курс</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST = 0;

	/**
	 * The number of operations of the '<em>Источник Курса Актива</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ИСТОЧНИК_КУРСА_АКТИВА_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Начало Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ = ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ;

	/**
	 * The feature id for the '<em><b>Конец Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ = ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ;

	/**
	 * The feature id for the '<em><b>Базовый Актив</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС__БАЗОВЫЙ_АКТИВ = ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ;

	/**
	 * The feature id for the '<em><b>Комментарий</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС__КОММЕНТАРИЙ = ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ;

	/**
	 * The feature id for the '<em><b>Курс</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС__КУРС = ИСТОЧНИК_КУРСА_АКТИВА_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Фиксированный Курс</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС_FEATURE_COUNT = ИСТОЧНИК_КУРСА_АКТИВА_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Получить Курс</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST = ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST;

	/**
	 * The number of operations of the '<em>Фиксированный Курс</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ФИКСИРОВАННЫЙ_КУРС_OPERATION_COUNT = ИСТОЧНИК_КУРСА_АКТИВА_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Начало Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ = ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ;

	/**
	 * The feature id for the '<em><b>Конец Периода Действия</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ = ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ;

	/**
	 * The feature id for the '<em><b>Базовый Актив</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА__БАЗОВЫЙ_АКТИВ = ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ;

	/**
	 * The feature id for the '<em><b>Комментарий</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА__КОММЕНТАРИЙ = ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ;

	/**
	 * The feature id for the '<em><b>Код</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА__КОД = ИСТОЧНИК_КУРСА_АКТИВА_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Вычислитель Курса</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА_FEATURE_COUNT = ИСТОЧНИК_КУРСА_АКТИВА_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Получить Курс</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST = ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST;

	/**
	 * The number of operations of the '<em>Вычислитель Курса</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ВЫЧИСЛИТЕЛЬ_КУРСА_OPERATION_COUNT = ИСТОЧНИК_КУРСА_АКТИВА_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Первичный Ввод</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__ПЕРВИЧНЫЙ_ВВОД = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Проводки</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__ПРОВОДКИ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Создатель</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__СОЗДАТЕЛЬ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Субъекты</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ__СУБЪЕКТЫ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Операция</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Операция</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ОПЕРАЦИЯ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Сверено</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__СВЕРЕНО = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Счёт</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__СЧЁТ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Актив</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__АКТИВ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Количество</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__КОЛИЧЕСТВО = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Значения Свойств Актива</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__ЗНАЧЕНИЯ_СВОЙСТВ_АКТИВА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Балансирующая Проводка</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА__БАЛАНСИРУЮЩАЯ_ПРОВОДКА = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Проводка</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Проводка</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПРОВОДКА_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Наименование</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__НАИМЕНОВАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ;

	/**
	 * The feature id for the '<em><b>Описание</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__ОПИСАНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ;

	/**
	 * The feature id for the '<em><b>Комментарии</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__КОММЕНТАРИИ = ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ;

	/**
	 * The feature id for the '<em><b>Изображение</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__ИЗОБРАЖЕНИЕ = ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ;

	/**
	 * The feature id for the '<em><b>Идентификатор</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__ИДЕНТИФИКАТОР = ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР;

	/**
	 * The feature id for the '<em><b>Операции</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ__ОПЕРАЦИИ = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Субъект</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ_FEATURE_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Субъект</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int СУБЪЕКТ_OPERATION_COUNT = ЭЛЕМЕНТ_МОДЕЛИ_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ЖурналОпераций <em>Журнал Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Журнал Операций</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций
	 * @generated
	 */
	EClass getЖурналОпераций();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ЖурналОпераций#getОперации <em>Операции</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Операции</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getОперации()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_Операции();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ЖурналОпераций#getСчёта <em>Счёта</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Счёта</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getСчёта()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_Счёта();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ЖурналОпераций#getАктивы <em>Активы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Активы</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getАктивы()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_Активы();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ЖурналОпераций#getСубъекты <em>Субъекты</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Субъекты</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getСубъекты()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_Субъекты();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.ЖурналОпераций#getОтчётныеАктивы <em>Отчётные Активы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Отчётные Активы</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getОтчётныеАктивы()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_ОтчётныеАктивы();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.ЖурналОпераций#getСчётПоУмолчаниюДляБалансировкиОпераций <em>Счёт По Умолчанию Для Балансировки Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Счёт По Умолчанию Для Балансировки Операций</em>'.
	 * @see org.nasdanika.ledger.ЖурналОпераций#getСчётПоУмолчаниюДляБалансировкиОпераций()
	 * @see #getЖурналОпераций()
	 * @generated
	 */
	EReference getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.УчётныйЦентр <em>Учётный Центр</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Учётный Центр</em>'.
	 * @see org.nasdanika.ledger.УчётныйЦентр
	 * @generated
	 */
	EClass getУчётныйЦентр();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.УчётныйЦентр#getХранителиЖурналовОпераций <em>Хранители Журналов Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Хранители Журналов Операций</em>'.
	 * @see org.nasdanika.ledger.УчётныйЦентр#getХранителиЖурналовОпераций()
	 * @see #getУчётныйЦентр()
	 * @generated
	 */
	EReference getУчётныйЦентр_ХранителиЖурналовОпераций();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ЭлементМодели <em>Элемент Модели</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Элемент Модели</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели
	 * @generated
	 */
	EClass getЭлементМодели();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ЭлементМодели#getНаименование <em>Наименование</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Наименование</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getНаименование()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EAttribute getЭлементМодели_Наименование();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ЭлементМодели#getОписание <em>Описание</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Описание</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getОписание()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EAttribute getЭлементМодели_Описание();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ЭлементМодели#getКомментарии <em>Комментарии</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Комментарии</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getКомментарии()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EReference getЭлементМодели_Комментарии();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.ledger.ЭлементМодели#getИзображение <em>Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Изображение</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getИзображение()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EReference getЭлементМодели_Изображение();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ЭлементМодели#getИдентификатор <em>Идентификатор</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Идентификатор</em>'.
	 * @see org.nasdanika.ledger.ЭлементМодели#getИдентификатор()
	 * @see #getЭлементМодели()
	 * @generated
	 */
	EAttribute getЭлементМодели_Идентификатор();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Пользователь <em>Пользователь</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Пользователь</em>'.
	 * @see org.nasdanika.ledger.Пользователь
	 * @generated
	 */
	EClass getПользователь();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Организация <em>Организация</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Организация</em>'.
	 * @see org.nasdanika.ledger.Организация
	 * @generated
	 */
	EClass getОрганизация();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ХранительЖурналовОпераций <em>Хранитель Журналов Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Хранитель Журналов Операций</em>'.
	 * @see org.nasdanika.ledger.ХранительЖурналовОпераций
	 * @generated
	 */
	EClass getХранительЖурналовОпераций();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.ХранительЖурналовОпераций#getЖурналыОпераций <em>Журналы Операций</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Журналы Операций</em>'.
	 * @see org.nasdanika.ledger.ХранительЖурналовОпераций#getЖурналыОпераций()
	 * @see #getХранительЖурналовОпераций()
	 * @generated
	 */
	EReference getХранительЖурналовОпераций_ЖурналыОпераций();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Счёт <em>Счёт</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Счёт</em>'.
	 * @see org.nasdanika.ledger.Счёт
	 * @generated
	 */
	EClass getСчёт();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.Счёт#getСубСчета <em>Суб Счета</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Суб Счета</em>'.
	 * @see org.nasdanika.ledger.Счёт#getСубСчета()
	 * @see #getСчёт()
	 * @generated
	 */
	EReference getСчёт_СубСчета();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.Счёт#getАктивы <em>Активы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Активы</em>'.
	 * @see org.nasdanika.ledger.Счёт#getАктивы()
	 * @see #getСчёт()
	 * @generated
	 */
	EReference getСчёт_Активы();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.Счёт#getПроводки <em>Проводки</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Проводки</em>'.
	 * @see org.nasdanika.ledger.Счёт#getПроводки()
	 * @see #getСчёт()
	 * @generated
	 */
	EReference getСчёт_Проводки();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Счёт#isГруппа <em>Группа</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Группа</em>'.
	 * @see org.nasdanika.ledger.Счёт#isГруппа()
	 * @see #getСчёт()
	 * @generated
	 */
	EAttribute getСчёт_Группа();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Актив <em>Актив</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Актив</em>'.
	 * @see org.nasdanika.ledger.Актив
	 * @generated
	 */
	EClass getАктив();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.Актив#getИсточникиКурсов <em>Источники Курсов</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Источники Курсов</em>'.
	 * @see org.nasdanika.ledger.Актив#getИсточникиКурсов()
	 * @see #getАктив()
	 * @generated
	 */
	EReference getАктив_ИсточникиКурсов();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.Актив#getСубАктивы <em>Суб Активы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Суб Активы</em>'.
	 * @see org.nasdanika.ledger.Актив#getСубАктивы()
	 * @see #getАктив()
	 * @generated
	 */
	EReference getАктив_СубАктивы();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Актив#getТочность <em>Точность</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Точность</em>'.
	 * @see org.nasdanika.ledger.Актив#getТочность()
	 * @see #getАктив()
	 * @generated
	 */
	EAttribute getАктив_Точность();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.Актив#getСвойства <em>Свойства</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Свойства</em>'.
	 * @see org.nasdanika.ledger.Актив#getСвойства()
	 * @see #getАктив()
	 * @generated
	 */
	EReference getАктив_Свойства();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.Актив#getСчета <em>Счета</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Счета</em>'.
	 * @see org.nasdanika.ledger.Актив#getСчета()
	 * @see #getАктив()
	 * @generated
	 */
	EReference getАктив_Счета();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.Актив#getПроводки <em>Проводки</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Проводки</em>'.
	 * @see org.nasdanika.ledger.Актив#getПроводки()
	 * @see #getАктив()
	 * @generated
	 */
	EReference getАктив_Проводки();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Актив#getЕдиницаИзмерения <em>Единица Измерения</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Единица Измерения</em>'.
	 * @see org.nasdanika.ledger.Актив#getЕдиницаИзмерения()
	 * @see #getАктив()
	 * @generated
	 */
	EAttribute getАктив_ЕдиницаИзмерения();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Актив#isГруппа <em>Группа</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Группа</em>'.
	 * @see org.nasdanika.ledger.Актив#isГруппа()
	 * @see #getАктив()
	 * @generated
	 */
	EAttribute getАктив_Группа();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.СвойствоАктива <em>Свойство Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Свойство Актива</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива
	 * @generated
	 */
	EClass getСвойствоАктива();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СвойствоАктива#getНаименование <em>Наименование</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Наименование</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива#getНаименование()
	 * @see #getСвойствоАктива()
	 * @generated
	 */
	EAttribute getСвойствоАктива_Наименование();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СвойствоАктива#getОписание <em>Описание</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Описание</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива#getОписание()
	 * @see #getСвойствоАктива()
	 * @generated
	 */
	EAttribute getСвойствоАктива_Описание();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СвойствоАктива#getТип <em>Тип</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Тип</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива#getТип()
	 * @see #getСвойствоАктива()
	 * @generated
	 */
	EAttribute getСвойствоАктива_Тип();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СвойствоАктива#getНижняяГраница <em>Нижняя Граница</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Нижняя Граница</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива#getНижняяГраница()
	 * @see #getСвойствоАктива()
	 * @generated
	 */
	EAttribute getСвойствоАктива_НижняяГраница();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СвойствоАктива#getВерхняяГраница <em>Верхняя Граница</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Верхняя Граница</em>'.
	 * @see org.nasdanika.ledger.СвойствоАктива#getВерхняяГраница()
	 * @see #getСвойствоАктива()
	 * @generated
	 */
	EAttribute getСвойствоАктива_ВерхняяГраница();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ЗначениеСвойстваАктива <em>Значение Свойства Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Значение Свойства Актива</em>'.
	 * @see org.nasdanika.ledger.ЗначениеСвойстваАктива
	 * @generated
	 */
	EClass getЗначениеСвойстваАктива();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.ЗначениеСвойстваАктива#getСвойство <em>Свойство</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Свойство</em>'.
	 * @see org.nasdanika.ledger.ЗначениеСвойстваАктива#getСвойство()
	 * @see #getЗначениеСвойстваАктива()
	 * @generated
	 */
	EReference getЗначениеСвойстваАктива_Свойство();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.ledger.ЗначениеСвойстваАктива#getЗначения <em>Значения</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Значения</em>'.
	 * @see org.nasdanika.ledger.ЗначениеСвойстваАктива#getЗначения()
	 * @see #getЗначениеСвойстваАктива()
	 * @generated
	 */
	EAttribute getЗначениеСвойстваАктива_Значения();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ИсточникКурсаАктива <em>Источник Курса Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Источник Курса Актива</em>'.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива
	 * @generated
	 */
	EClass getИсточникКурсаАктива();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getНачалоПериодаДействия <em>Начало Периода Действия</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Начало Периода Действия</em>'.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива#getНачалоПериодаДействия()
	 * @see #getИсточникКурсаАктива()
	 * @generated
	 */
	EAttribute getИсточникКурсаАктива_НачалоПериодаДействия();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКонецПериодаДействия <em>Конец Периода Действия</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Конец Периода Действия</em>'.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива#getКонецПериодаДействия()
	 * @see #getИсточникКурсаАктива()
	 * @generated
	 */
	EAttribute getИсточникКурсаАктива_КонецПериодаДействия();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getБазовыйАктив <em>Базовый Актив</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Базовый Актив</em>'.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива#getБазовыйАктив()
	 * @see #getИсточникКурсаАктива()
	 * @generated
	 */
	EReference getИсточникКурсаАктива_БазовыйАктив();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ИсточникКурсаАктива#getКомментарий <em>Комментарий</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Комментарий</em>'.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива#getКомментарий()
	 * @see #getИсточникКурсаАктива()
	 * @generated
	 */
	EAttribute getИсточникКурсаАктива_Комментарий();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.ledger.ИсточникКурсаАктива#получитьКурс(java.util.Date, java.math.BigDecimal, org.eclipse.emf.common.util.EList, org.nasdanika.ledger.КурсАктива, org.eclipse.emf.common.util.EList) <em>Получить Курс</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Получить Курс</em>' operation.
	 * @see org.nasdanika.ledger.ИсточникКурсаАктива#получитьКурс(java.util.Date, java.math.BigDecimal, org.eclipse.emf.common.util.EList, org.nasdanika.ledger.КурсАктива, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ФиксированныйКурс <em>Фиксированный Курс</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Фиксированный Курс</em>'.
	 * @see org.nasdanika.ledger.ФиксированныйКурс
	 * @generated
	 */
	EClass getФиксированныйКурс();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ФиксированныйКурс#getКурс <em>Курс</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Курс</em>'.
	 * @see org.nasdanika.ledger.ФиксированныйКурс#getКурс()
	 * @see #getФиксированныйКурс()
	 * @generated
	 */
	EAttribute getФиксированныйКурс_Курс();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ВычислительКурса <em>Вычислитель Курса</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Вычислитель Курса</em>'.
	 * @see org.nasdanika.ledger.ВычислительКурса
	 * @generated
	 */
	EClass getВычислительКурса();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ВычислительКурса#getКод <em>Код</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Код</em>'.
	 * @see org.nasdanika.ledger.ВычислительКурса#getКод()
	 * @see #getВычислительКурса()
	 * @generated
	 */
	EAttribute getВычислительКурса_Код();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Операция <em>Операция</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Операция</em>'.
	 * @see org.nasdanika.ledger.Операция
	 * @generated
	 */
	EClass getОперация();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.ledger.Операция#getПроводки <em>Проводки</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Проводки</em>'.
	 * @see org.nasdanika.ledger.Операция#getПроводки()
	 * @see #getОперация()
	 * @generated
	 */
	EReference getОперация_Проводки();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Операция#getСоздатель <em>Создатель</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Создатель</em>'.
	 * @see org.nasdanika.ledger.Операция#getСоздатель()
	 * @see #getОперация()
	 * @generated
	 */
	EReference getОперация_Создатель();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Операция#isПервичныйВвод <em>Первичный Ввод</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Первичный Ввод</em>'.
	 * @see org.nasdanika.ledger.Операция#isПервичныйВвод()
	 * @see #getОперация()
	 * @generated
	 */
	EAttribute getОперация_ПервичныйВвод();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Операция#getСубъекты <em>Субъекты</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Субъекты</em>'.
	 * @see org.nasdanika.ledger.Операция#getСубъекты()
	 * @see #getОперация()
	 * @generated
	 */
	EReference getОперация_Субъекты();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Проводка <em>Проводка</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Проводка</em>'.
	 * @see org.nasdanika.ledger.Проводка
	 * @generated
	 */
	EClass getПроводка();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Проводка#isСверено <em>Сверено</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Сверено</em>'.
	 * @see org.nasdanika.ledger.Проводка#isСверено()
	 * @see #getПроводка()
	 * @generated
	 */
	EAttribute getПроводка_Сверено();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Проводка#getСчёт <em>Счёт</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Счёт</em>'.
	 * @see org.nasdanika.ledger.Проводка#getСчёт()
	 * @see #getПроводка()
	 * @generated
	 */
	EReference getПроводка_Счёт();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Проводка#getАктив <em>Актив</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Актив</em>'.
	 * @see org.nasdanika.ledger.Проводка#getАктив()
	 * @see #getПроводка()
	 * @generated
	 */
	EReference getПроводка_Актив();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Проводка#getКоличество <em>Количество</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Количество</em>'.
	 * @see org.nasdanika.ledger.Проводка#getКоличество()
	 * @see #getПроводка()
	 * @generated
	 */
	EAttribute getПроводка_Количество();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Проводка#getЗначенияСвойствАктива <em>Значения Свойств Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Значения Свойств Актива</em>'.
	 * @see org.nasdanika.ledger.Проводка#getЗначенияСвойствАктива()
	 * @see #getПроводка()
	 * @generated
	 */
	EReference getПроводка_ЗначенияСвойствАктива();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Проводка#isБалансирующаяПроводка <em>Балансирующая Проводка</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Балансирующая Проводка</em>'.
	 * @see org.nasdanika.ledger.Проводка#isБалансирующаяПроводка()
	 * @see #getПроводка()
	 * @generated
	 */
	EAttribute getПроводка_БалансирующаяПроводка();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Субъект <em>Субъект</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Субъект</em>'.
	 * @see org.nasdanika.ledger.Субъект
	 * @generated
	 */
	EClass getСубъект();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.ledger.Субъект#getОперации <em>Операции</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Операции</em>'.
	 * @see org.nasdanika.ledger.Субъект#getОперации()
	 * @see #getСубъект()
	 * @generated
	 */
	EReference getСубъект_Операции();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.ledger.КурсАктива <em>Курс Актива</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Курс Актива</em>'.
	 * @see org.nasdanika.ledger.КурсАктива
	 * @model instanceClass="org.nasdanika.ledger.КурсАктива"
	 * @generated
	 */
	EDataType getКурсАктива();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Комментарий <em>Комментарий</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Комментарий</em>'.
	 * @see org.nasdanika.ledger.Комментарий
	 * @generated
	 */
	EClass getКомментарий();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.ledger.Комментарий#getАвтор <em>Автор</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Автор</em>'.
	 * @see org.nasdanika.ledger.Комментарий#getАвтор()
	 * @see #getКомментарий()
	 * @generated
	 */
	EReference getКомментарий_Автор();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Комментарий#getСодержание <em>Содержание</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Содержание</em>'.
	 * @see org.nasdanika.ledger.Комментарий#getСодержание()
	 * @see #getКомментарий()
	 * @generated
	 */
	EAttribute getКомментарий_Содержание();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.Комментарий#getДата <em>Дата</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Дата</em>'.
	 * @see org.nasdanika.ledger.Комментарий#getДата()
	 * @see #getКомментарий()
	 * @generated
	 */
	EAttribute getКомментарий_Дата();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.Изображение <em>Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Изображение</em>'.
	 * @see org.nasdanika.ledger.Изображение
	 * @generated
	 */
	EClass getИзображение();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.СсылкаНаИзображение <em>Ссылка На Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ссылка На Изображение</em>'.
	 * @see org.nasdanika.ledger.СсылкаНаИзображение
	 * @generated
	 */
	EClass getСсылкаНаИзображение();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.СсылкаНаИзображение#getСсылка <em>Ссылка</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ссылка</em>'.
	 * @see org.nasdanika.ledger.СсылкаНаИзображение#getСсылка()
	 * @see #getСсылкаНаИзображение()
	 * @generated
	 */
	EAttribute getСсылкаНаИзображение_Ссылка();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.ledger.ВстроенноеИзображение <em>Встроенное Изображение</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Встроенное Изображение</em>'.
	 * @see org.nasdanika.ledger.ВстроенноеИзображение
	 * @generated
	 */
	EClass getВстроенноеИзображение();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ВстроенноеИзображение#getСодержание <em>Содержание</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Содержание</em>'.
	 * @see org.nasdanika.ledger.ВстроенноеИзображение#getСодержание()
	 * @see #getВстроенноеИзображение()
	 * @generated
	 */
	EAttribute getВстроенноеИзображение_Содержание();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.ledger.ВстроенноеИзображение#getФормат <em>Формат</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Формат</em>'.
	 * @see org.nasdanika.ledger.ВстроенноеИзображение#getФормат()
	 * @see #getВстроенноеИзображение()
	 * @generated
	 */
	EAttribute getВстроенноеИзображение_Формат();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LedgerFactory getLedgerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ЖурналОперацийImpl <em>Журнал Операций</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ЖурналОперацийImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЖурналОпераций()
		 * @generated
		 */
		EClass ЖУРНАЛ_ОПЕРАЦИЙ = eINSTANCE.getЖурналОпераций();

		/**
		 * The meta object literal for the '<em><b>Операции</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ = eINSTANCE.getЖурналОпераций_Операции();

		/**
		 * The meta object literal for the '<em><b>Счёта</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТА = eINSTANCE.getЖурналОпераций_Счёта();

		/**
		 * The meta object literal for the '<em><b>Активы</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ = eINSTANCE.getЖурналОпераций_Активы();

		/**
		 * The meta object literal for the '<em><b>Субъекты</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ = eINSTANCE.getЖурналОпераций_Субъекты();

		/**
		 * The meta object literal for the '<em><b>Отчётные Активы</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_АКТИВЫ = eINSTANCE.getЖурналОпераций_ОтчётныеАктивы();

		/**
		 * The meta object literal for the '<em><b>Счёт По Умолчанию Для Балансировки Операций</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ = eINSTANCE.getЖурналОпераций_СчётПоУмолчаниюДляБалансировкиОпераций();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.УчётныйЦентрImpl <em>Учётный Центр</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.УчётныйЦентрImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getУчётныйЦентр()
		 * @generated
		 */
		EClass УЧЁТНЫЙ_ЦЕНТР = eINSTANCE.getУчётныйЦентр();

		/**
		 * The meta object literal for the '<em><b>Хранители Журналов Операций</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ = eINSTANCE.getУчётныйЦентр_ХранителиЖурналовОпераций();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ЭлементМоделиImpl <em>Элемент Модели</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ЭлементМоделиImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЭлементМодели()
		 * @generated
		 */
		EClass ЭЛЕМЕНТ_МОДЕЛИ = eINSTANCE.getЭлементМодели();

		/**
		 * The meta object literal for the '<em><b>Наименование</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ = eINSTANCE.getЭлементМодели_Наименование();

		/**
		 * The meta object literal for the '<em><b>Описание</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ = eINSTANCE.getЭлементМодели_Описание();

		/**
		 * The meta object literal for the '<em><b>Комментарии</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ = eINSTANCE.getЭлементМодели_Комментарии();

		/**
		 * The meta object literal for the '<em><b>Изображение</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ = eINSTANCE.getЭлементМодели_Изображение();

		/**
		 * The meta object literal for the '<em><b>Идентификатор</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР = eINSTANCE.getЭлементМодели_Идентификатор();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ПользовательImpl <em>Пользователь</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ПользовательImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getПользователь()
		 * @generated
		 */
		EClass ПОЛЬЗОВАТЕЛЬ = eINSTANCE.getПользователь();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ОрганизацияImpl <em>Организация</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ОрганизацияImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getОрганизация()
		 * @generated
		 */
		EClass ОРГАНИЗАЦИЯ = eINSTANCE.getОрганизация();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ХранительЖурналовОперацийImpl <em>Хранитель Журналов Операций</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ХранительЖурналовОперацийImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getХранительЖурналовОпераций()
		 * @generated
		 */
		EClass ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ = eINSTANCE.getХранительЖурналовОпераций();

		/**
		 * The meta object literal for the '<em><b>Журналы Операций</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ = eINSTANCE.getХранительЖурналовОпераций_ЖурналыОпераций();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.СчётImpl <em>Счёт</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.СчётImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСчёт()
		 * @generated
		 */
		EClass СЧЁТ = eINSTANCE.getСчёт();

		/**
		 * The meta object literal for the '<em><b>Суб Счета</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference СЧЁТ__СУБ_СЧЕТА = eINSTANCE.getСчёт_СубСчета();

		/**
		 * The meta object literal for the '<em><b>Активы</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference СЧЁТ__АКТИВЫ = eINSTANCE.getСчёт_Активы();

		/**
		 * The meta object literal for the '<em><b>Проводки</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference СЧЁТ__ПРОВОДКИ = eINSTANCE.getСчёт_Проводки();

		/**
		 * The meta object literal for the '<em><b>Группа</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СЧЁТ__ГРУППА = eINSTANCE.getСчёт_Группа();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.АктивImpl <em>Актив</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.АктивImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getАктив()
		 * @generated
		 */
		EClass АКТИВ = eINSTANCE.getАктив();

		/**
		 * The meta object literal for the '<em><b>Источники Курсов</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference АКТИВ__ИСТОЧНИКИ_КУРСОВ = eINSTANCE.getАктив_ИсточникиКурсов();

		/**
		 * The meta object literal for the '<em><b>Суб Активы</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference АКТИВ__СУБ_АКТИВЫ = eINSTANCE.getАктив_СубАктивы();

		/**
		 * The meta object literal for the '<em><b>Точность</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute АКТИВ__ТОЧНОСТЬ = eINSTANCE.getАктив_Точность();

		/**
		 * The meta object literal for the '<em><b>Свойства</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference АКТИВ__СВОЙСТВА = eINSTANCE.getАктив_Свойства();

		/**
		 * The meta object literal for the '<em><b>Счета</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference АКТИВ__СЧЕТА = eINSTANCE.getАктив_Счета();

		/**
		 * The meta object literal for the '<em><b>Проводки</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference АКТИВ__ПРОВОДКИ = eINSTANCE.getАктив_Проводки();

		/**
		 * The meta object literal for the '<em><b>Единица Измерения</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ = eINSTANCE.getАктив_ЕдиницаИзмерения();

		/**
		 * The meta object literal for the '<em><b>Группа</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute АКТИВ__ГРУППА = eINSTANCE.getАктив_Группа();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.СвойствоАктиваImpl <em>Свойство Актива</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.СвойствоАктиваImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСвойствоАктива()
		 * @generated
		 */
		EClass СВОЙСТВО_АКТИВА = eINSTANCE.getСвойствоАктива();

		/**
		 * The meta object literal for the '<em><b>Наименование</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ = eINSTANCE.getСвойствоАктива_Наименование();

		/**
		 * The meta object literal for the '<em><b>Описание</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СВОЙСТВО_АКТИВА__ОПИСАНИЕ = eINSTANCE.getСвойствоАктива_Описание();

		/**
		 * The meta object literal for the '<em><b>Тип</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СВОЙСТВО_АКТИВА__ТИП = eINSTANCE.getСвойствоАктива_Тип();

		/**
		 * The meta object literal for the '<em><b>Нижняя Граница</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА = eINSTANCE.getСвойствоАктива_НижняяГраница();

		/**
		 * The meta object literal for the '<em><b>Верхняя Граница</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА = eINSTANCE.getСвойствоАктива_ВерхняяГраница();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl <em>Значение Свойства Актива</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ЗначениеСвойстваАктиваImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getЗначениеСвойстваАктива()
		 * @generated
		 */
		EClass ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА = eINSTANCE.getЗначениеСвойстваАктива();

		/**
		 * The meta object literal for the '<em><b>Свойство</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__СВОЙСТВО = eINSTANCE.getЗначениеСвойстваАктива_Свойство();

		/**
		 * The meta object literal for the '<em><b>Значения</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЗНАЧЕНИЕ_СВОЙСТВА_АКТИВА__ЗНАЧЕНИЯ = eINSTANCE.getЗначениеСвойстваАктива_Значения();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl <em>Источник Курса Актива</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ИсточникКурсаАктиваImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getИсточникКурсаАктива()
		 * @generated
		 */
		EClass ИСТОЧНИК_КУРСА_АКТИВА = eINSTANCE.getИсточникКурсаАктива();

		/**
		 * The meta object literal for the '<em><b>Начало Периода Действия</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ = eINSTANCE.getИсточникКурсаАктива_НачалоПериодаДействия();

		/**
		 * The meta object literal for the '<em><b>Конец Периода Действия</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ = eINSTANCE.getИсточникКурсаАктива_КонецПериодаДействия();

		/**
		 * The meta object literal for the '<em><b>Базовый Актив</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ = eINSTANCE.getИсточникКурсаАктива_БазовыйАктив();

		/**
		 * The meta object literal for the '<em><b>Комментарий</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ = eINSTANCE.getИсточникКурсаАктива_Комментарий();

		/**
		 * The meta object literal for the '<em><b>Получить Курс</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ИСТОЧНИК_КУРСА_АКТИВА___ПОЛУЧИТЬ_КУРС__DATE_BIGDECIMAL_ELIST_КУРСАКТИВА_ELIST = eINSTANCE.getИсточникКурсаАктива__ПолучитьКурс__Date_BigDecimal_EList_КурсАктива_EList();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ФиксированныйКурсImpl <em>Фиксированный Курс</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ФиксированныйКурсImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getФиксированныйКурс()
		 * @generated
		 */
		EClass ФИКСИРОВАННЫЙ_КУРС = eINSTANCE.getФиксированныйКурс();

		/**
		 * The meta object literal for the '<em><b>Курс</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ФИКСИРОВАННЫЙ_КУРС__КУРС = eINSTANCE.getФиксированныйКурс_Курс();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ВычислительКурсаImpl <em>Вычислитель Курса</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ВычислительКурсаImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getВычислительКурса()
		 * @generated
		 */
		EClass ВЫЧИСЛИТЕЛЬ_КУРСА = eINSTANCE.getВычислительКурса();

		/**
		 * The meta object literal for the '<em><b>Код</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ВЫЧИСЛИТЕЛЬ_КУРСА__КОД = eINSTANCE.getВычислительКурса_Код();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ОперацияImpl <em>Операция</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ОперацияImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getОперация()
		 * @generated
		 */
		EClass ОПЕРАЦИЯ = eINSTANCE.getОперация();

		/**
		 * The meta object literal for the '<em><b>Проводки</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ОПЕРАЦИЯ__ПРОВОДКИ = eINSTANCE.getОперация_Проводки();

		/**
		 * The meta object literal for the '<em><b>Создатель</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ОПЕРАЦИЯ__СОЗДАТЕЛЬ = eINSTANCE.getОперация_Создатель();

		/**
		 * The meta object literal for the '<em><b>Первичный Ввод</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ОПЕРАЦИЯ__ПЕРВИЧНЫЙ_ВВОД = eINSTANCE.getОперация_ПервичныйВвод();

		/**
		 * The meta object literal for the '<em><b>Субъекты</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ОПЕРАЦИЯ__СУБЪЕКТЫ = eINSTANCE.getОперация_Субъекты();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ПроводкаImpl <em>Проводка</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ПроводкаImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getПроводка()
		 * @generated
		 */
		EClass ПРОВОДКА = eINSTANCE.getПроводка();

		/**
		 * The meta object literal for the '<em><b>Сверено</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ПРОВОДКА__СВЕРЕНО = eINSTANCE.getПроводка_Сверено();

		/**
		 * The meta object literal for the '<em><b>Счёт</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ПРОВОДКА__СЧЁТ = eINSTANCE.getПроводка_Счёт();

		/**
		 * The meta object literal for the '<em><b>Актив</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ПРОВОДКА__АКТИВ = eINSTANCE.getПроводка_Актив();

		/**
		 * The meta object literal for the '<em><b>Количество</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ПРОВОДКА__КОЛИЧЕСТВО = eINSTANCE.getПроводка_Количество();

		/**
		 * The meta object literal for the '<em><b>Значения Свойств Актива</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ПРОВОДКА__ЗНАЧЕНИЯ_СВОЙСТВ_АКТИВА = eINSTANCE.getПроводка_ЗначенияСвойствАктива();

		/**
		 * The meta object literal for the '<em><b>Балансирующая Проводка</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ПРОВОДКА__БАЛАНСИРУЮЩАЯ_ПРОВОДКА = eINSTANCE.getПроводка_БалансирующаяПроводка();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.СубъектImpl <em>Субъект</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.СубъектImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСубъект()
		 * @generated
		 */
		EClass СУБЪЕКТ = eINSTANCE.getСубъект();

		/**
		 * The meta object literal for the '<em><b>Операции</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference СУБЪЕКТ__ОПЕРАЦИИ = eINSTANCE.getСубъект_Операции();

		/**
		 * The meta object literal for the '<em>Курс Актива</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.КурсАктива
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getКурсАктива()
		 * @generated
		 */
		EDataType КУРС_АКТИВА = eINSTANCE.getКурсАктива();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.КомментарийImpl <em>Комментарий</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.КомментарийImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getКомментарий()
		 * @generated
		 */
		EClass КОММЕНТАРИЙ = eINSTANCE.getКомментарий();

		/**
		 * The meta object literal for the '<em><b>Автор</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference КОММЕНТАРИЙ__АВТОР = eINSTANCE.getКомментарий_Автор();

		/**
		 * The meta object literal for the '<em><b>Содержание</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute КОММЕНТАРИЙ__СОДЕРЖАНИЕ = eINSTANCE.getКомментарий_Содержание();

		/**
		 * The meta object literal for the '<em><b>Дата</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute КОММЕНТАРИЙ__ДАТА = eINSTANCE.getКомментарий_Дата();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ИзображениеImpl <em>Изображение</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ИзображениеImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getИзображение()
		 * @generated
		 */
		EClass ИЗОБРАЖЕНИЕ = eINSTANCE.getИзображение();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.СсылкаНаИзображениеImpl <em>Ссылка На Изображение</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.СсылкаНаИзображениеImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getСсылкаНаИзображение()
		 * @generated
		 */
		EClass ССЫЛКА_НА_ИЗОБРАЖЕНИЕ = eINSTANCE.getСсылкаНаИзображение();

		/**
		 * The meta object literal for the '<em><b>Ссылка</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ССЫЛКА_НА_ИЗОБРАЖЕНИЕ__ССЫЛКА = eINSTANCE.getСсылкаНаИзображение_Ссылка();

		/**
		 * The meta object literal for the '{@link org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl <em>Встроенное Изображение</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.ledger.impl.ВстроенноеИзображениеImpl
		 * @see org.nasdanika.ledger.impl.LedgerPackageImpl#getВстроенноеИзображение()
		 * @generated
		 */
		EClass ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ = eINSTANCE.getВстроенноеИзображение();

		/**
		 * The meta object literal for the '<em><b>Содержание</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__СОДЕРЖАНИЕ = eINSTANCE.getВстроенноеИзображение_Содержание();

		/**
		 * The meta object literal for the '<em><b>Формат</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ВСТРОЕННОЕ_ИЗОБРАЖЕНИЕ__ФОРМАТ = eINSTANCE.getВстроенноеИзображение_Формат();

	}

} //LedgerPackage
