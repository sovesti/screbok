/**
 */
package ru.mkn.sovesti.screbok.mlm.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;

import org.eclipse.emf.edit.provider.ViewerNotification;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * This is the item provider adapter for a {@link ru.mkn.sovesti.screbok.mlm.model.api.Reference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceItemProvider extends MarkupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addLinkPropertyDescriptor(object);
			addReferencedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_title_feature", "_UI_Reference_type"),
				 MlmPackage.Literals.REFERENCE__TITLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_link_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_link_feature", "_UI_Reference_type"),
				 MlmPackage.Literals.REFERENCE__LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_referenced_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_referenced_feature", "_UI_Reference_type"),
				 MlmPackage.Literals.REFERENCE__REFERENCED,
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
			childrenFeatures.add(MlmPackage.Literals.REFERENCE__TITLE);
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
	 * This returns Reference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Reference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return ((StyledString)getStyledText(object)).getString();
	}

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((Reference)object).getName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_Reference_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_Reference_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
		}
		return styledLabel;
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

		switch (notification.getFeatureID(Reference.class)) {
			case MlmPackage.REFERENCE__LINK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MlmPackage.REFERENCE__TITLE:
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
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createPlaceholder()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createWrappingNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createImaginaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createMarkupList()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createRawText()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createCodeListing()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createEmphasized()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.REFERENCE__TITLE,
				 MlmFactory.eINSTANCE.createLineBreak()));
	}

}
