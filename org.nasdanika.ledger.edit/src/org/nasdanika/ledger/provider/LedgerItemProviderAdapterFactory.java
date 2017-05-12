/**
 */
package org.nasdanika.ledger.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.nasdanika.ledger.util.LedgerAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LedgerItemProviderAdapterFactory extends LedgerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Комментарий} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected КомментарийItemProvider комментарийItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Комментарий}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createКомментарийAdapter() {
		if (комментарийItemProvider == null) {
			комментарийItemProvider = new КомментарийItemProvider(this);
		}

		return комментарийItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.СсылкаНаИзображение} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СсылкаНаИзображениеItemProvider ссылкаНаИзображениеItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.СсылкаНаИзображение}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createСсылкаНаИзображениеAdapter() {
		if (ссылкаНаИзображениеItemProvider == null) {
			ссылкаНаИзображениеItemProvider = new СсылкаНаИзображениеItemProvider(this);
		}

		return ссылкаНаИзображениеItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ВстроенноеИзображение} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ВстроенноеИзображениеItemProvider встроенноеИзображениеItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ВстроенноеИзображение}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createВстроенноеИзображениеAdapter() {
		if (встроенноеИзображениеItemProvider == null) {
			встроенноеИзображениеItemProvider = new ВстроенноеИзображениеItemProvider(this);
		}

		return встроенноеИзображениеItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.УчётныйЦентр} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected УчётныйЦентрItemProvider учётныйЦентрItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.УчётныйЦентр}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createУчётныйЦентрAdapter() {
		if (учётныйЦентрItemProvider == null) {
			учётныйЦентрItemProvider = new УчётныйЦентрItemProvider(this);
		}

		return учётныйЦентрItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Пользователь} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПользовательItemProvider пользовательItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Пользователь}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createПользовательAdapter() {
		if (пользовательItemProvider == null) {
			пользовательItemProvider = new ПользовательItemProvider(this);
		}

		return пользовательItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Организация} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ОрганизацияItemProvider организацияItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Организация}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createОрганизацияAdapter() {
		if (организацияItemProvider == null) {
			организацияItemProvider = new ОрганизацияItemProvider(this);
		}

		return организацияItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ЖурналОпераций} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЖурналОперацийItemProvider журналОперацийItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ЖурналОпераций}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createЖурналОперацийAdapter() {
		if (журналОперацийItemProvider == null) {
			журналОперацийItemProvider = new ЖурналОперацийItemProvider(this);
		}

		return журналОперацийItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Счёт} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СчётItemProvider счётItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Счёт}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createСчётAdapter() {
		if (счётItemProvider == null) {
			счётItemProvider = new СчётItemProvider(this);
		}

		return счётItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Актив} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected АктивItemProvider активItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Актив}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createАктивAdapter() {
		if (активItemProvider == null) {
			активItemProvider = new АктивItemProvider(this);
		}

		return активItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.СвойствоАктива} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СвойствоАктиваItemProvider свойствоАктиваItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.СвойствоАктива}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createСвойствоАктиваAdapter() {
		if (свойствоАктиваItemProvider == null) {
			свойствоАктиваItemProvider = new СвойствоАктиваItemProvider(this);
		}

		return свойствоАктиваItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ЗначениеСвойстваАктива} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЗначениеСвойстваАктиваItemProvider значениеСвойстваАктиваItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ЗначениеСвойстваАктива}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createЗначениеСвойстваАктиваAdapter() {
		if (значениеСвойстваАктиваItemProvider == null) {
			значениеСвойстваАктиваItemProvider = new ЗначениеСвойстваАктиваItemProvider(this);
		}

		return значениеСвойстваАктиваItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ФиксированныйКурс} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ФиксированныйКурсItemProvider фиксированныйКурсItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ФиксированныйКурс}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createФиксированныйКурсAdapter() {
		if (фиксированныйКурсItemProvider == null) {
			фиксированныйКурсItemProvider = new ФиксированныйКурсItemProvider(this);
		}

		return фиксированныйКурсItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ВычислительКурса} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ВычислительКурсаItemProvider вычислительКурсаItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ВычислительКурса}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createВычислительКурсаAdapter() {
		if (вычислительКурсаItemProvider == null) {
			вычислительКурсаItemProvider = new ВычислительКурсаItemProvider(this);
		}

		return вычислительКурсаItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Операция} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ОперацияItemProvider операцияItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Операция}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createОперацияAdapter() {
		if (операцияItemProvider == null) {
			операцияItemProvider = new ОперацияItemProvider(this);
		}

		return операцияItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Проводка} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПроводкаItemProvider проводкаItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Проводка}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createПроводкаAdapter() {
		if (проводкаItemProvider == null) {
			проводкаItemProvider = new ПроводкаItemProvider(this);
		}

		return проводкаItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.Субъект} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected СубъектItemProvider субъектItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.Субъект}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createСубъектAdapter() {
		if (субъектItemProvider == null) {
			субъектItemProvider = new СубъектItemProvider(this);
		}

		return субъектItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ПредыдущийМесяц} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПредыдущийМесяцItemProvider предыдущийМесяцItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ПредыдущийМесяц}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createПредыдущийМесяцAdapter() {
		if (предыдущийМесяцItemProvider == null) {
			предыдущийМесяцItemProvider = new ПредыдущийМесяцItemProvider(this);
		}

		return предыдущийМесяцItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ПредыдущийГод} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ПредыдущийГодItemProvider предыдущийГодItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ПредыдущийГод}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createПредыдущийГодAdapter() {
		if (предыдущийГодItemProvider == null) {
			предыдущийГодItemProvider = new ПредыдущийГодItemProvider(this);
		}

		return предыдущийГодItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ТекущийМесяц} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ТекущийМесяцItemProvider текущийМесяцItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ТекущийМесяц}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createТекущийМесяцAdapter() {
		if (текущийМесяцItemProvider == null) {
			текущийМесяцItemProvider = new ТекущийМесяцItemProvider(this);
		}

		return текущийМесяцItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ТекущийГод} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ТекущийГодItemProvider текущийГодItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ТекущийГод}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createТекущийГодAdapter() {
		if (текущийГодItemProvider == null) {
			текущийГодItemProvider = new ТекущийГодItemProvider(this);
		}

		return текущийГодItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ФиксированныйОтчётныйПериодItemProvider фиксированныйОтчётныйПериодItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createФиксированныйОтчётныйПериодAdapter() {
		if (фиксированныйОтчётныйПериодItemProvider == null) {
			фиксированныйОтчётныйПериодItemProvider = new ФиксированныйОтчётныйПериодItemProvider(this);
		}

		return фиксированныйОтчётныйПериодItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (комментарийItemProvider != null) комментарийItemProvider.dispose();
		if (ссылкаНаИзображениеItemProvider != null) ссылкаНаИзображениеItemProvider.dispose();
		if (встроенноеИзображениеItemProvider != null) встроенноеИзображениеItemProvider.dispose();
		if (учётныйЦентрItemProvider != null) учётныйЦентрItemProvider.dispose();
		if (пользовательItemProvider != null) пользовательItemProvider.dispose();
		if (организацияItemProvider != null) организацияItemProvider.dispose();
		if (журналОперацийItemProvider != null) журналОперацийItemProvider.dispose();
		if (счётItemProvider != null) счётItemProvider.dispose();
		if (активItemProvider != null) активItemProvider.dispose();
		if (свойствоАктиваItemProvider != null) свойствоАктиваItemProvider.dispose();
		if (значениеСвойстваАктиваItemProvider != null) значениеСвойстваАктиваItemProvider.dispose();
		if (фиксированныйКурсItemProvider != null) фиксированныйКурсItemProvider.dispose();
		if (вычислительКурсаItemProvider != null) вычислительКурсаItemProvider.dispose();
		if (операцияItemProvider != null) операцияItemProvider.dispose();
		if (проводкаItemProvider != null) проводкаItemProvider.dispose();
		if (субъектItemProvider != null) субъектItemProvider.dispose();
		if (предыдущийМесяцItemProvider != null) предыдущийМесяцItemProvider.dispose();
		if (предыдущийГодItemProvider != null) предыдущийГодItemProvider.dispose();
		if (текущийМесяцItemProvider != null) текущийМесяцItemProvider.dispose();
		if (текущийГодItemProvider != null) текущийГодItemProvider.dispose();
		if (фиксированныйОтчётныйПериодItemProvider != null) фиксированныйОтчётныйПериодItemProvider.dispose();
	}

}
