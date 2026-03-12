/**
 */
package ru.mkn.sovesti.screbok.mlm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.mlm.model.api.*;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage
 * @generated
 */
public class MlmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MlmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MlmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MlmSwitch<Adapter> modelSwitch =
		new MlmSwitch<Adapter>() {
			@Override
			public Adapter caseLocated(Located object) {
				return createLocatedAdapter();
			}
			@Override
			public Adapter caseSite(Site object) {
				return createSiteAdapter();
			}
			@Override
			public Adapter caseSiteResource(SiteResource object) {
				return createSiteResourceAdapter();
			}
			@Override
			public Adapter caseSitePage(SitePage object) {
				return createSitePageAdapter();
			}
			@Override
			public Adapter caseSiteMedia(SiteMedia object) {
				return createSiteMediaAdapter();
			}
			@Override
			public Adapter caseMarkupNode(MarkupNode object) {
				return createMarkupNodeAdapter();
			}
			@Override
			public Adapter caseNodeAttribute(NodeAttribute object) {
				return createNodeAttributeAdapter();
			}
			@Override
			public Adapter caseWildcard(Wildcard object) {
				return createWildcardAdapter();
			}
			@Override
			public Adapter casePlaceholder(Placeholder object) {
				return createPlaceholderAdapter();
			}
			@Override
			public Adapter caseWrappingNode(WrappingNode object) {
				return createWrappingNodeAdapter();
			}
			@Override
			public Adapter caseImaginaryNode(ImaginaryNode object) {
				return createImaginaryNodeAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseAnchor(Anchor object) {
				return createAnchorAdapter();
			}
			@Override
			public Adapter caseMarkupList(MarkupList object) {
				return createMarkupListAdapter();
			}
			@Override
			public Adapter caseRawText(RawText object) {
				return createRawTextAdapter();
			}
			@Override
			public Adapter caseCodeListing(CodeListing object) {
				return createCodeListingAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseEmphasized(Emphasized object) {
				return createEmphasizedAdapter();
			}
			@Override
			public Adapter caseLineBreak(LineBreak object) {
				return createLineBreakAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Located <em>Located</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Located
	 * @generated
	 */
	public Adapter createLocatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource <em>Site Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteResource
	 * @generated
	 */
	public Adapter createSiteResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage <em>Site Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SitePage
	 * @generated
	 */
	public Adapter createSitePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia <em>Site Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia
	 * @generated
	 */
	public Adapter createSiteMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode <em>Markup Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode
	 * @generated
	 */
	public Adapter createMarkupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute <em>Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute
	 * @generated
	 */
	public Adapter createNodeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Wildcard
	 * @generated
	 */
	public Adapter createWildcardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Placeholder
	 * @generated
	 */
	public Adapter createPlaceholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode <em>Wrapping Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode
	 * @generated
	 */
	public Adapter createWrappingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode <em>Imaginary Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode
	 * @generated
	 */
	public Adapter createImaginaryNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Anchor
	 * @generated
	 */
	public Adapter createAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList <em>Markup List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupList
	 * @generated
	 */
	public Adapter createMarkupListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.RawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.RawText
	 * @generated
	 */
	public Adapter createRawTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.CodeListing <em>Code Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.CodeListing
	 * @generated
	 */
	public Adapter createCodeListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized <em>Emphasized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Emphasized
	 * @generated
	 */
	public Adapter createEmphasizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mkn.sovesti.screbok.mlm.model.api.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.LineBreak
	 * @generated
	 */
	public Adapter createLineBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MlmAdapterFactory
