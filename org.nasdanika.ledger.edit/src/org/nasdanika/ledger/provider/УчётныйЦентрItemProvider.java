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
import org.nasdanika.cdo.security.provider.LoginPasswordRealmItemProvider;

import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.УчётныйЦентр;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.УчётныйЦентр} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class УчётныйЦентрItemProvider extends LoginPasswordRealmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public УчётныйЦентрItemProvider(AdapterFactory adapterFactory) {
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
			addИдентификаторPropertyDescriptor(object);
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
			childrenFeatures.add(LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ);
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
	 * This returns УчётныйЦентр.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/УчётныйЦентр"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((УчётныйЦентр)object).getНаименование();
		return label == null || label.length() == 0 ?
			getString("_UI_УчётныйЦентр_type") :
			getString("_UI_УчётныйЦентр_type") + " " + label;
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

		switch (notification.getFeatureID(УчётныйЦентр.class)) {
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__НАИМЕНОВАНИЕ:
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ОПИСАНИЕ:
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИДЕНТИФИКАТОР:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__КОММЕНТАРИИ:
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ИЗОБРАЖЕНИЕ:
			case LedgerPackage.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ:
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
				(SecurityPackage.Literals.REALM__GUEST,
				 LedgerFactory.eINSTANCE.createПользователь()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPackage.Literals.REALM__EVERYONE,
				 LedgerFactory.eINSTANCE.createПользователь()));

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
				(LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ,
				 LedgerFactory.eINSTANCE.createПользователь()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ,
				 LedgerFactory.eINSTANCE.createОрганизация()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SecurityPackage.Literals.REALM__GUEST ||
			childFeature == SecurityPackage.Literals.REALM__EVERYONE ||
			childFeature == LedgerPackage.Literals.УЧЁТНЫЙ_ЦЕНТР__ХРАНИТЕЛИ_ЖУРНАЛОВ_ОПЕРАЦИЙ;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
