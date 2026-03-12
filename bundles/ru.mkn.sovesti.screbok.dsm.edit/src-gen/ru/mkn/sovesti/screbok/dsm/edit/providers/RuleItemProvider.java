/**
 */
package ru.mkn.sovesti.screbok.dsm.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.mkn.sovesti.screbok.dsm.model.api.Rule;

import ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

/**
 * This is the item provider adapter for a {@link ru.mkn.sovesti.screbok.dsm.model.api.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemStyledLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 DsmPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_priority_feature", "_UI_Rule_type"),
				 DsmPackage.Literals.RULE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(DsmPackage.Literals.RULE__PATTERN);
			childrenFeatures.add(DsmPackage.Literals.RULE__RESULT);
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
	 * This returns Rule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rule"));
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
		String label = ((Rule)object).getName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_Rule_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_Rule_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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

		switch (notification.getFeatureID(Rule.class)) {
			case DsmPackage.RULE__NAME:
			case DsmPackage.RULE__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DsmPackage.RULE__PATTERN:
			case DsmPackage.RULE__RESULT:
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
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createPlaceholder()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createWrappingNode()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createImaginaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createMarkupList()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createRawText()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createCodeListing()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createEmphasized()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__PATTERN,
				 MlmFactory.eINSTANCE.createLineBreak()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createPlaceholder()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createWrappingNode()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createImaginaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createMarkupList()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createRawText()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createCodeListing()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createEmphasized()));

		newChildDescriptors.add
			(createChildParameter
				(DsmPackage.Literals.RULE__RESULT,
				 MlmFactory.eINSTANCE.createLineBreak()));
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
			childFeature == DsmPackage.Literals.RULE__PATTERN ||
			childFeature == DsmPackage.Literals.RULE__RESULT;

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
		return DsmEditPlugin.INSTANCE;
	}

}
