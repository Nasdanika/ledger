/**
 */
package org.nasdanika.ledger.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ФиксированныйОтчётныйПериод;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.ФиксированныйОтчётныйПериод} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ФиксированныйОтчётныйПериодItemProvider extends ОтчётныйПериодItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ФиксированныйОтчётныйПериодItemProvider(AdapterFactory adapterFactory) {
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

			addНачалоПериодаPropertyDescriptor(object);
			addКонецПериодаPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Начало Периода feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addНачалоПериодаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ФиксированныйОтчётныйПериод_началоПериода_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ФиксированныйОтчётныйПериод_началоПериода_feature", "_UI_ФиксированныйОтчётныйПериод_type"),
				 LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__НАЧАЛО_ПЕРИОДА,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Конец Периода feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addКонецПериодаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ФиксированныйОтчётныйПериод_конецПериода_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ФиксированныйОтчётныйПериод_конецПериода_feature", "_UI_ФиксированныйОтчётныйПериод_type"),
				 LedgerPackage.Literals.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__КОНЕЦ_ПЕРИОДА,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ФиксированныйОтчётныйПериод.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ФиксированныйОтчётныйПериод"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((ФиксированныйОтчётныйПериод)object).getНачалоПериода();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ФиксированныйОтчётныйПериод_type") :
			getString("_UI_ФиксированныйОтчётныйПериод_type") + " " + label;
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

		switch (notification.getFeatureID(ФиксированныйОтчётныйПериод.class)) {
			case LedgerPackage.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__НАЧАЛО_ПЕРИОДА:
			case LedgerPackage.ФИКСИРОВАННЫЙ_ОТЧЁТНЫЙ_ПЕРИОД__КОНЕЦ_ПЕРИОДА:
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

}
