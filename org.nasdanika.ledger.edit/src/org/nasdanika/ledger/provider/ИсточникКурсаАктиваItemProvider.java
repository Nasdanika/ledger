/**
 */
package org.nasdanika.ledger.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ИсточникКурсаАктива;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.ИсточникКурсаАктива} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ИсточникКурсаАктиваItemProvider 
	extends CDOItemProviderAdapterEx
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ИсточникКурсаАктиваItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addНачалоПериодаДействияPropertyDescriptor(object);
			addКонецПериодаДействияPropertyDescriptor(object);
			addБазовыйАктивPropertyDescriptor(object);
			addКомментарийPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Начало Периода Действия feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addНачалоПериодаДействияPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ИсточникКурсаАктива_началоПериодаДействия_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ИсточникКурсаАктива_началоПериодаДействия_feature", "_UI_ИсточникКурсаАктива_type"),
				 LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Конец Периода Действия feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addКонецПериодаДействияPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ИсточникКурсаАктива_конецПериодаДействия_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ИсточникКурсаАктива_конецПериодаДействия_feature", "_UI_ИсточникКурсаАктива_type"),
				 LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Базовый Актив feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addБазовыйАктивPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ИсточникКурсаАктива_базовыйАктив_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ИсточникКурсаАктива_базовыйАктив_feature", "_UI_ИсточникКурсаАктива_type"),
				 LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__БАЗОВЫЙ_АКТИВ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Комментарий feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addКомментарийPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ИсточникКурсаАктива_комментарий_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ИсточникКурсаАктива_комментарий_feature", "_UI_ИсточникКурсаАктива_type"),
				 LedgerPackage.Literals.ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((ИсточникКурсаАктива)object).getНачалоПериодаДействия();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ИсточникКурсаАктива_type") :
			getString("_UI_ИсточникКурсаАктива_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ИсточникКурсаАктива.class)) {
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА__НАЧАЛО_ПЕРИОДА_ДЕЙСТВИЯ:
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА__КОНЕЦ_ПЕРИОДА_ДЕЙСТВИЯ:
			case LedgerPackage.ИСТОЧНИК_КУРСА_АКТИВА__КОММЕНТАРИЙ:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ledgerEditPlugin.INSTANCE;
	}

}
