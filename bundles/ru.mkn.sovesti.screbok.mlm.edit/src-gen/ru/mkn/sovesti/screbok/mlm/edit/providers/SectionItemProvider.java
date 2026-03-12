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

import ru.mkn.sovesti.screbok.mlm.model.api.Section;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * This is the item provider adapter for a {@link ru.mkn.sovesti.screbok.mlm.model.api.Section} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SectionItemProvider extends MarkupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionItemProvider(AdapterFactory adapterFactory) {
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

			addLevelPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Section_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Section_level_feature", "_UI_Section_type"),
				 MlmPackage.Literals.SECTION__LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Section_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Section_title_feature", "_UI_Section_type"),
				 MlmPackage.Literals.SECTION__TITLE,
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
			childrenFeatures.add(MlmPackage.Literals.SECTION__TITLE);
			childrenFeatures.add(MlmPackage.Literals.SECTION__CHILDREN);
			childrenFeatures.add(MlmPackage.Literals.SECTION__ANCHOR);
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
	 * This returns Section.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Section"));
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
		String label = ((Section)object).getName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_Section_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_Section_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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

		switch (notification.getFeatureID(Section.class)) {
			case MlmPackage.SECTION__LEVEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MlmPackage.SECTION__TITLE:
			case MlmPackage.SECTION__CHILDREN:
			case MlmPackage.SECTION__ANCHOR:
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
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createPlaceholder()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createWrappingNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createImaginaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createMarkupList()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createRawText()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createCodeListing()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createEmphasized()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__TITLE,
				 MlmFactory.eINSTANCE.createLineBreak()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createPlaceholder()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createWrappingNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createImaginaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createMarkupList()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createRawText()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createCodeListing()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createEmphasized()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__CHILDREN,
				 MlmFactory.eINSTANCE.createLineBreak()));

		newChildDescriptors.add
			(createChildParameter
				(MlmPackage.Literals.SECTION__ANCHOR,
				 MlmFactory.eINSTANCE.createAnchor()));
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
			childFeature == MlmPackage.Literals.SECTION__TITLE ||
			childFeature == MlmPackage.Literals.SECTION__CHILDREN ||
			childFeature == MlmPackage.Literals.SECTION__ANCHOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
