/**
 */
package org.nasdanika.ledger.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.Актив} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class АктивItemProvider extends ЭлементМоделиItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public АктивItemProvider(AdapterFactory adapterFactory) {
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

			addГруппаPropertyDescriptor(object);
			addЕдиницаИзмеренияPropertyDescriptor(object);
			addТочностьPropertyDescriptor(object);
			addСчетаPropertyDescriptor(object);
			addПроводкиPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Группа feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addГруппаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Актив_группа_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Актив_группа_feature", "_UI_Актив_type"),
				 LedgerPackage.Literals.АКТИВ__ГРУППА,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Единица Измерения feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addЕдиницаИзмеренияPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Актив_единицаИзмерения_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Актив_единицаИзмерения_feature", "_UI_Актив_type"),
				 LedgerPackage.Literals.АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Точность feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addТочностьPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Актив_точность_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Актив_точность_feature", "_UI_Актив_type"),
				 LedgerPackage.Literals.АКТИВ__ТОЧНОСТЬ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Счета feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addСчетаPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Актив_счета_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Актив_счета_feature", "_UI_Актив_type"),
				 LedgerPackage.Literals.АКТИВ__СЧЕТА,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Проводки feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addПроводкиPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Актив_проводки_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Актив_проводки_feature", "_UI_Актив_type"),
				 LedgerPackage.Literals.АКТИВ__ПРОВОДКИ,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(LedgerPackage.Literals.АКТИВ__ИСТОЧНИКИ_КУРСОВ);
			childrenFeatures.add(LedgerPackage.Literals.АКТИВ__СУБ_АКТИВЫ);
			childrenFeatures.add(LedgerPackage.Literals.АКТИВ__СВОЙСТВА);
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
	 * This returns Актив.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Актив"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Актив)object).getНаименование();
		return label == null || label.length() == 0 ?
			getString("_UI_Актив_type") :
			getString("_UI_Актив_type") + " " + label;
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

		switch (notification.getFeatureID(Актив.class)) {
			case LedgerPackage.АКТИВ__ГРУППА:
			case LedgerPackage.АКТИВ__ЕДИНИЦА_ИЗМЕРЕНИЯ:
			case LedgerPackage.АКТИВ__ТОЧНОСТЬ:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LedgerPackage.АКТИВ__ИСТОЧНИКИ_КУРСОВ:
			case LedgerPackage.АКТИВ__СУБ_АКТИВЫ:
			case LedgerPackage.АКТИВ__СВОЙСТВА:
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
				(LedgerPackage.Literals.АКТИВ__ИСТОЧНИКИ_КУРСОВ,
				 LedgerFactory.eINSTANCE.createФиксированныйКурс()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.АКТИВ__ИСТОЧНИКИ_КУРСОВ,
				 LedgerFactory.eINSTANCE.createВычислительКурса()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.АКТИВ__СУБ_АКТИВЫ,
				 LedgerFactory.eINSTANCE.createАктив()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.АКТИВ__СВОЙСТВА,
				 LedgerFactory.eINSTANCE.createСвойствоАктива()));
	}

}
