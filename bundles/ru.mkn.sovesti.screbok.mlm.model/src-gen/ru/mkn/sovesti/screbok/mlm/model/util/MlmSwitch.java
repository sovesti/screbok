/**
 */
package ru.mkn.sovesti.screbok.mlm.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.mkn.sovesti.screbok.mlm.model.api.*;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage
 * @generated
 */
public class MlmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MlmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlmSwitch() {
		if (modelPackage == null) {
			modelPackage = MlmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MlmPackage.LOCATED: {
				Located located = (Located)theEObject;
				T result = caseLocated(located);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = caseLocated(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.SITE_RESOURCE: {
				SiteResource siteResource = (SiteResource)theEObject;
				T result = caseSiteResource(siteResource);
				if (result == null) result = caseLocated(siteResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.SITE_PAGE: {
				SitePage sitePage = (SitePage)theEObject;
				T result = caseSitePage(sitePage);
				if (result == null) result = caseSiteResource(sitePage);
				if (result == null) result = caseLocated(sitePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.SITE_MEDIA: {
				SiteMedia siteMedia = (SiteMedia)theEObject;
				T result = caseSiteMedia(siteMedia);
				if (result == null) result = caseSiteResource(siteMedia);
				if (result == null) result = caseLocated(siteMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.MARKUP_NODE: {
				MarkupNode markupNode = (MarkupNode)theEObject;
				T result = caseMarkupNode(markupNode);
				if (result == null) result = caseLocated(markupNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.NODE_ATTRIBUTE: {
				NodeAttribute nodeAttribute = (NodeAttribute)theEObject;
				T result = caseNodeAttribute(nodeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.WILDCARD: {
				Wildcard wildcard = (Wildcard)theEObject;
				T result = caseWildcard(wildcard);
				if (result == null) result = caseMarkupNode(wildcard);
				if (result == null) result = caseLocated(wildcard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseMarkupNode(placeholder);
				if (result == null) result = caseLocated(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.WRAPPING_NODE: {
				WrappingNode wrappingNode = (WrappingNode)theEObject;
				T result = caseWrappingNode(wrappingNode);
				if (result == null) result = caseMarkupNode(wrappingNode);
				if (result == null) result = caseLocated(wrappingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.IMAGINARY_NODE: {
				ImaginaryNode imaginaryNode = (ImaginaryNode)theEObject;
				T result = caseImaginaryNode(imaginaryNode);
				if (result == null) result = caseMarkupNode(imaginaryNode);
				if (result == null) result = caseLocated(imaginaryNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseMarkupNode(section);
				if (result == null) result = caseLocated(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseMarkupNode(anchor);
				if (result == null) result = caseLocated(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.MARKUP_LIST: {
				MarkupList markupList = (MarkupList)theEObject;
				T result = caseMarkupList(markupList);
				if (result == null) result = caseMarkupNode(markupList);
				if (result == null) result = caseLocated(markupList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.RAW_TEXT: {
				RawText rawText = (RawText)theEObject;
				T result = caseRawText(rawText);
				if (result == null) result = caseMarkupNode(rawText);
				if (result == null) result = caseLocated(rawText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.CODE_LISTING: {
				CodeListing codeListing = (CodeListing)theEObject;
				T result = caseCodeListing(codeListing);
				if (result == null) result = caseMarkupNode(codeListing);
				if (result == null) result = caseLocated(codeListing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseMarkupNode(reference);
				if (result == null) result = caseLocated(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseMarkupNode(image);
				if (result == null) result = caseLocated(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.EMPHASIZED: {
				Emphasized emphasized = (Emphasized)theEObject;
				T result = caseEmphasized(emphasized);
				if (result == null) result = caseMarkupNode(emphasized);
				if (result == null) result = caseLocated(emphasized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlmPackage.LINE_BREAK: {
				LineBreak lineBreak = (LineBreak)theEObject;
				T result = caseLineBreak(lineBreak);
				if (result == null) result = caseMarkupNode(lineBreak);
				if (result == null) result = caseLocated(lineBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocated(Located object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteResource(SiteResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSitePage(SitePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteMedia(SiteMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupNode(MarkupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeAttribute(NodeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildcard(Wildcard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapping Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapping Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappingNode(WrappingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaginary Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaginary Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImaginaryNode(ImaginaryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupList(MarkupList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawText(RawText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeListing(CodeListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasized(Emphasized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreak(LineBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MlmSwitch
