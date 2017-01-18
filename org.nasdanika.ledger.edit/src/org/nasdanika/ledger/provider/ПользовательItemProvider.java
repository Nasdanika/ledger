/**
 */
package org.nasdanika.ledger.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.cdo.security.provider.LoginUserItemProvider;

import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Пользователь;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.Пользователь} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ПользовательItemProvider extends LoginUserItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ПользовательItemProvider(AdapterFactory adapterFactory) {
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

			addPasswordHashPropertyDescriptor(object);
			addНаименованиеPropertyDescriptor(object);
			addОписаниеPropertyDescriptor(object);
			addИдентификаторPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Password Hash feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordHashPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoginPasswordHashUser_passwordHash_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoginPasswordHashUser_passwordHash_feature", "_UI_LoginPasswordHashUser_type"),
				 SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ЭлементМодели_наименование_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ЭлементМодели_наименование_feature", "_UI_ЭлементМодели_type"),
				 LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__НАИМЕНОВАНИЕ,
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
				 getString("_UI_ЭлементМодели_описание_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ЭлементМодели_описание_feature", "_UI_ЭлементМодели_type"),
				 LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ОПИСАНИЕ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Идентификатор feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addИдентификаторPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ЭлементМодели_идентификатор_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ЭлементМодели_идентификатор_feature", "_UI_ЭлементМодели_type"),
				 LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИДЕНТИФИКАТОР,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ);
			childrenFeatures.add(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ);
			childrenFeatures.add(LedgerPackage.Literals.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Пользователь.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Пользователь"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Пользователь пользователь = (Пользователь)object;
		return getString("_UI_Пользователь_type") + " " + пользователь.getLogin()+" ("+пользователь.getНаименование()+")";
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

		switch (notification.getFeatureID(Пользователь.class)) {
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__PASSWORD_HASH:
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__НАИМЕНОВАНИЕ:
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ОПИСАНИЕ:
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИДЕНТИФИКАТОР:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__КОММЕНТАРИИ:
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ИЗОБРАЖЕНИЕ:
			case LedgerPackage.ПОЛЬЗОВАТЕЛЬ__ЖУРНАЛЫ_ОПЕРАЦИЙ:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__КОММЕНТАРИИ,
				 LedgerFactory.eINSTANCE.createКомментарий()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ,
				 LedgerFactory.eINSTANCE.createСсылкаНаИзображение()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЭЛЕМЕНТ_МОДЕЛИ__ИЗОБРАЖЕНИЕ,
				 LedgerFactory.eINSTANCE.createВстроенноеИзображение()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ХРАНИТЕЛЬ_ЖУРНАЛОВ_ОПЕРАЦИЙ__ЖУРНАЛЫ_ОПЕРАЦИЙ,
				 LedgerFactory.eINSTANCE.createЖурналОпераций()));
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
