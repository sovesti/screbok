/**
 */
package ru.mkn.sovesti.screbok.mlm.model.meta;

import org.eclipse.emf.ecore.EFactory;

import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;
import ru.mkn.sovesti.screbok.mlm.model.api.CodeListing;
import ru.mkn.sovesti.screbok.mlm.model.api.Emphasized;
import ru.mkn.sovesti.screbok.mlm.model.api.Image;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.LineBreak;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupList;
import ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute;
import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;
import ru.mkn.sovesti.screbok.mlm.model.api.Site;
import ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage
 * @generated
 */
public interface MlmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MlmFactory eINSTANCE = ru.mkn.sovesti.screbok.mlm.model.impl.MlmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site</em>'.
	 * @generated
	 */
	Site createSite();

	/**
	 * Returns a new object of class '<em>Site Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site Page</em>'.
	 * @generated
	 */
	SitePage createSitePage();

	/**
	 * Returns a new object of class '<em>Site Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site Media</em>'.
	 * @generated
	 */
	SiteMedia createSiteMedia();

	/**
	 * Returns a new object of class '<em>Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Attribute</em>'.
	 * @generated
	 */
	NodeAttribute createNodeAttribute();

	/**
	 * Returns a new object of class '<em>Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wildcard</em>'.
	 * @generated
	 */
	Wildcard createWildcard();

	/**
	 * Returns a new object of class '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placeholder</em>'.
	 * @generated
	 */
	Placeholder createPlaceholder();

	/**
	 * Returns a new object of class '<em>Wrapping Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapping Node</em>'.
	 * @generated
	 */
	WrappingNode createWrappingNode();

	/**
	 * Returns a new object of class '<em>Imaginary Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaginary Node</em>'.
	 * @generated
	 */
	ImaginaryNode createImaginaryNode();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anchor</em>'.
	 * @generated
	 */
	Anchor createAnchor();

	/**
	 * Returns a new object of class '<em>Markup List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup List</em>'.
	 * @generated
	 */
	MarkupList createMarkupList();

	/**
	 * Returns a new object of class '<em>Raw Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Text</em>'.
	 * @generated
	 */
	RawText createRawText();

	/**
	 * Returns a new object of class '<em>Code Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Listing</em>'.
	 * @generated
	 */
	CodeListing createCodeListing();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Emphasized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emphasized</em>'.
	 * @generated
	 */
	Emphasized createEmphasized();

	/**
	 * Returns a new object of class '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Break</em>'.
	 * @generated
	 */
	LineBreak createLineBreak();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MlmPackage getMlmPackage();

} //MlmFactory
