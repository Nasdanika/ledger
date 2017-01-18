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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ledger.LedgerFactory;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.ЖурналОпераций;

/**
 * This is the item provider adapter for a {@link org.nasdanika.ledger.ЖурналОпераций} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ЖурналОперацийItemProvider extends ЭлементМоделиItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ЖурналОперацийItemProvider(AdapterFactory adapterFactory) {
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

			addОтчётныеАктивыPropertyDescriptor(object);
			addСчётПоУмолчаниюДляБалансировкиОперацийPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Отчётные Активы feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addОтчётныеАктивыPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ЖурналОпераций_отчётныеАктивы_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ЖурналОпераций_отчётныеАктивы_feature", "_UI_ЖурналОпераций_type"),
				 LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОТЧЁТНЫЕ_АКТИВЫ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Счёт По Умолчанию Для Балансировки Операций feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addСчётПоУмолчаниюДляБалансировкиОперацийPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ЖурналОпераций_счётПоУмолчаниюДляБалансировкиОпераций_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ЖурналОпераций_счётПоУмолчаниюДляБалансировкиОпераций_feature", "_UI_ЖурналОпераций_type"),
				 LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТ_ПО_УМОЛЧАНИЮ_ДЛЯ_БАЛАНСИРОВКИ_ОПЕРАЦИЙ,
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
			childrenFeatures.add(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ);
			childrenFeatures.add(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТА);
			childrenFeatures.add(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ);
			childrenFeatures.add(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ);
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
	 * This returns ЖурналОпераций.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ЖурналОпераций"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ЖурналОпераций)object).getНаименование();
		return label == null || label.length() == 0 ?
			getString("_UI_ЖурналОпераций_type") :
			getString("_UI_ЖурналОпераций_type") + " " + label;
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

		switch (notification.getFeatureID(ЖурналОпераций.class)) {
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ:
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТА:
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ:
			case LedgerPackage.ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ:
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
				(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__ОПЕРАЦИИ,
				 LedgerFactory.eINSTANCE.createОперация()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СЧЁТА,
				 LedgerFactory.eINSTANCE.createСчёт()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__АКТИВЫ,
				 LedgerFactory.eINSTANCE.createАктив()));

		newChildDescriptors.add
			(createChildParameter
				(LedgerPackage.Literals.ЖУРНАЛ_ОПЕРАЦИЙ__СУБЪЕКТЫ,
				 LedgerFactory.eINSTANCE.createСубъект()));
	}

}
