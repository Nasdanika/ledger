/**
 */
package org.nasdanika.ledger.provider;


import java.util.Collection;
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
import org.nasdanika.ledger.СвойствоАктива;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.СвойствоАктива} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class СвойствоАктиваItemProvider 
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
	public СвойствоАктиваItemProvider(AdapterFactory adapterFactory) {
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

			addНаименованиеPropertyDescriptor(object);
			addОписаниеPropertyDescriptor(object);
			addТипPropertyDescriptor(object);
			addНижняяГраницаPropertyDescriptor(object);
			addВерхняяГраницаPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Наименование feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addНаименованиеPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_СвойствоАктива_наименование_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_СвойствоАктива_наименование_feature", "_UI_СвойствоАктива_type"),
				 LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Описание feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addОписаниеPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_СвойствоАктива_описание_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_СвойствоАктива_описание_feature", "_UI_СвойствоАктива_type"),
				 LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ОПИСАНИЕ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Тип feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addТипPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_СвойствоАктива_тип_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_СвойствоАктива_тип_feature", "_UI_СвойствоАктива_type"),
				 LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ТИП,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Нижняя Граница feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addНижняяГраницаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_СвойствоАктива_нижняяГраница_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_СвойствоАктива_нижняяГраница_feature", "_UI_СвойствоАктива_type"),
				 LedgerPackage.Literals.СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Верхняя Граница feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addВерхняяГраницаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_СвойствоАктива_верхняяГраница_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_СвойствоАктива_верхняяГраница_feature", "_UI_СвойствоАктива_type"),
				 LedgerPackage.Literals.СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns СвойствоАктива.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/СвойствоАктива"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((СвойствоАктива)object).getНаименование();
		return label == null || label.length() == 0 ?
			getString("_UI_СвойствоАктива_type") :
			getString("_UI_СвойствоАктива_type") + " " + label;
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

		switch (notification.getFeatureID(СвойствоАктива.class)) {
			case LedgerPackage.СВОЙСТВО_АКТИВА__НАИМЕНОВАНИЕ:
			case LedgerPackage.СВОЙСТВО_АКТИВА__ОПИСАНИЕ:
			case LedgerPackage.СВОЙСТВО_АКТИВА__ТИП:
			case LedgerPackage.СВОЙСТВО_АКТИВА__НИЖНЯЯ_ГРАНИЦА:
			case LedgerPackage.СВОЙСТВО_АКТИВА__ВЕРХНЯЯ_ГРАНИЦА:
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
