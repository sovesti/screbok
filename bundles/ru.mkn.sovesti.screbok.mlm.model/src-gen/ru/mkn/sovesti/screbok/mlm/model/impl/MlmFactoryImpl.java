/**
 */
package ru.mkn.sovesti.screbok.mlm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mkn.sovesti.screbok.mlm.model.api.*;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MlmFactoryImpl extends EFactoryImpl implements MlmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MlmFactory init() {
		try {
			MlmFactory theMlmFactory = (MlmFactory)EPackage.Registry.INSTANCE.getEFactory(MlmPackage.eNS_URI);
			if (theMlmFactory != null) {
				return theMlmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MlmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MlmPackage.SITE: return createSite();
			case MlmPackage.SITE_PAGE: return createSitePage();
			case MlmPackage.SITE_MEDIA: return createSiteMedia();
			case MlmPackage.NODE_ATTRIBUTE: return createNodeAttribute();
			case MlmPackage.WILDCARD: return createWildcard();
			case MlmPackage.PLACEHOLDER: return createPlaceholder();
			case MlmPackage.WRAPPING_NODE: return createWrappingNode();
			case MlmPackage.IMAGINARY_NODE: return createImaginaryNode();
			case MlmPackage.SECTION: return createSection();
			case MlmPackage.ANCHOR: return createAnchor();
			case MlmPackage.MARKUP_LIST: return createMarkupList();
			case MlmPackage.RAW_TEXT: return createRawText();
			case MlmPackage.CODE_LISTING: return createCodeListing();
			case MlmPackage.REFERENCE: return createReference();
			case MlmPackage.IMAGE: return createImage();
			case MlmPackage.EMPHASIZED: return createEmphasized();
			case MlmPackage.LINE_BREAK: return createLineBreak();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MlmPackage.LIST_TYPE:
				return createListTypeFromString(eDataType, initialValue);
			case MlmPackage.EMPHASIS_TYPE:
				return createEmphasisTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MlmPackage.LIST_TYPE:
				return convertListTypeToString(eDataType, instanceValue);
			case MlmPackage.EMPHASIS_TYPE:
				return convertEmphasisTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SitePage createSitePage() {
		SitePageImpl sitePage = new SitePageImpl();
		return sitePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteMedia createSiteMedia() {
		SiteMediaImpl siteMedia = new SiteMediaImpl();
		return siteMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeAttribute createNodeAttribute() {
		NodeAttributeImpl nodeAttribute = new NodeAttributeImpl();
		return nodeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wildcard createWildcard() {
		WildcardImpl wildcard = new WildcardImpl();
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Placeholder createPlaceholder() {
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WrappingNode createWrappingNode() {
		WrappingNodeImpl wrappingNode = new WrappingNodeImpl();
		return wrappingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImaginaryNode createImaginaryNode() {
		ImaginaryNodeImpl imaginaryNode = new ImaginaryNodeImpl();
		return imaginaryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupList createMarkupList() {
		MarkupListImpl markupList = new MarkupListImpl();
		return markupList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawText createRawText() {
		RawTextImpl rawText = new RawTextImpl();
		return rawText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListing createCodeListing() {
		CodeListingImpl codeListing = new CodeListingImpl();
		return codeListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emphasized createEmphasized() {
		EmphasizedImpl emphasized = new EmphasizedImpl();
		return emphasized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineBreak createLineBreak() {
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListTypeFromString(EDataType eDataType, String initialValue) {
		ListType result = ListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisType createEmphasisTypeFromString(EDataType eDataType, String initialValue) {
		EmphasisType result = EmphasisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmphasisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlmPackage getMlmPackage() {
		return (MlmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MlmPackage getPackage() {
		return MlmPackage.eINSTANCE;
	}

} //MlmFactoryImpl
