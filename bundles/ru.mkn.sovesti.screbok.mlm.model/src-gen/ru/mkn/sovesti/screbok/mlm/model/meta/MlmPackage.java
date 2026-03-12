/**
 */
package ru.mkn.sovesti.screbok.mlm.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory
 * @model kind="package"
 * @generated
 */
public interface MlmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mlm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sovesti.ru/screbok/mlm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mlm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MlmPackage eINSTANCE = ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.LocatedImpl <em>Located</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.LocatedImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getLocated()
	 * @generated
	 */
	int LOCATED = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED__URI = 0;

	/**
	 * The number of structural features of the '<em>Located</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Located</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__URI = LOCATED__URI;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__RESOURCES = LOCATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = LOCATED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteResourceImpl <em>Site Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteResourceImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSiteResource()
	 * @generated
	 */
	int SITE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RESOURCE__URI = LOCATED__URI;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RESOURCE__SITE = LOCATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RESOURCE_FEATURE_COUNT = LOCATED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RESOURCE_OPERATION_COUNT = LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SitePageImpl <em>Site Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SitePageImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSitePage()
	 * @generated
	 */
	int SITE_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE__URI = SITE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE__SITE = SITE_RESOURCE__SITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE__NAME = SITE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE__ROOT = SITE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Site Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE_FEATURE_COUNT = SITE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Site Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_PAGE_OPERATION_COUNT = SITE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteMediaImpl <em>Site Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteMediaImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSiteMedia()
	 * @generated
	 */
	int SITE_MEDIA = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_MEDIA__URI = SITE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_MEDIA__SITE = SITE_RESOURCE__SITE;

	/**
	 * The number of structural features of the '<em>Site Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_MEDIA_FEATURE_COUNT = SITE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_MEDIA_OPERATION_COUNT = SITE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.MarkupNodeImpl <em>Markup Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MarkupNodeImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getMarkupNode()
	 * @generated
	 */
	int MARKUP_NODE = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE__URI = LOCATED__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE__LANGUAGE = LOCATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE__NAME = LOCATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE__ATTRIBUTES = LOCATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Markup Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE_FEATURE_COUNT = LOCATED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Markup Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_NODE_OPERATION_COUNT = LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.NodeAttributeImpl <em>Node Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.NodeAttributeImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getNodeAttribute()
	 * @generated
	 */
	int NODE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Node Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.WildcardImpl <em>Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.WildcardImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getWildcard()
	 * @generated
	 */
	int WILDCARD = 7;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__KEY = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__REPEATED = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD___GET__INT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.PlaceholderImpl <em>Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.PlaceholderImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getPlaceholder()
	 * @generated
	 */
	int PLACEHOLDER = 8;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__KEY = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.WrappingNodeImpl <em>Wrapping Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.WrappingNodeImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getWrappingNode()
	 * @generated
	 */
	int WRAPPING_NODE = 9;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__CHILDREN = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE__TRANSIENT = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wrapping Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wrapping Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_NODE_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ImaginaryNodeImpl <em>Imaginary Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ImaginaryNodeImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getImaginaryNode()
	 * @generated
	 */
	int IMAGINARY_NODE = 10;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__KEY = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE__ORIGIN = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imaginary Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imaginary Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGINARY_NODE_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 11;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LEVEL = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CHILDREN = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ANCHOR = MARKUP_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.AnchorImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 12;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.MarkupListImpl <em>Markup List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MarkupListImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getMarkupList()
	 * @generated
	 */
	int MARKUP_LIST = 13;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__TYPE = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__ITEMS = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Markup List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Markup List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.RawTextImpl <em>Raw Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.RawTextImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getRawText()
	 * @generated
	 */
	int RAW_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT__TEXT = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raw Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_TEXT_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.CodeListingImpl <em>Code Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.CodeListingImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getCodeListing()
	 * @generated
	 */
	int CODE_LISTING = 15;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING__CONTENT = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTING_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ReferenceImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TITLE = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LINK = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCED = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ImageImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINK = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.EmphasizedImpl <em>Emphasized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.EmphasizedImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getEmphasized()
	 * @generated
	 */
	int EMPHASIZED = 18;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__TYPE = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED__PARTS = MARKUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Emphasized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Emphasized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZED_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.LineBreakImpl
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 19;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__URI = MARKUP_NODE__URI;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LANGUAGE = MARKUP_NODE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__NAME = MARKUP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__ATTRIBUTES = MARKUP_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = MARKUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = MARKUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.api.ListType <em>List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ListType
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 20;


	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType <em>Emphasis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType
	 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getEmphasisType()
	 * @generated
	 */
	int EMPHASIS_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Located <em>Located</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Located
	 * @generated
	 */
	EClass getLocated();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Located#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Located#getUri()
	 * @see #getLocated()
	 * @generated
	 */
	EAttribute getLocated_Uri();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.Site#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Site#getResources()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Resources();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource <em>Site Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Resource</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteResource
	 * @generated
	 */
	EClass getSiteResource();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite()
	 * @see #getSiteResource()
	 * @generated
	 */
	EReference getSiteResource_Site();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage <em>Site Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Page</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SitePage
	 * @generated
	 */
	EClass getSitePage();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getName()
	 * @see #getSitePage()
	 * @generated
	 */
	EAttribute getSitePage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getRoot()
	 * @see #getSitePage()
	 * @generated
	 */
	EReference getSitePage_Root();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia <em>Site Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Media</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia
	 * @generated
	 */
	EClass getSiteMedia();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode <em>Markup Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Node</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode
	 * @generated
	 */
	EClass getMarkupNode();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getLanguage()
	 * @see #getMarkupNode()
	 * @generated
	 */
	EAttribute getMarkupNode_Language();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getName()
	 * @see #getMarkupNode()
	 * @generated
	 */
	EAttribute getMarkupNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getAttributes()
	 * @see #getMarkupNode()
	 * @generated
	 */
	EReference getMarkupNode_Attributes();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute <em>Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Attribute</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute
	 * @generated
	 */
	EClass getNodeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute#getName()
	 * @see #getNodeAttribute()
	 * @generated
	 */
	EAttribute getNodeAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute#getValue()
	 * @see #getNodeAttribute()
	 * @generated
	 */
	EAttribute getNodeAttribute_Value();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Wildcard
	 * @generated
	 */
	EClass getWildcard();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getKey()
	 * @see #getWildcard()
	 * @generated
	 */
	EAttribute getWildcard_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeated</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getRepeated()
	 * @see #getWildcard()
	 * @generated
	 */
	EReference getWildcard_Repeated();

	/**
	 * Returns the meta object for the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#get(int) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#get(int)
	 * @generated
	 */
	EOperation getWildcard__Get__int();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Placeholder
	 * @generated
	 */
	EClass getPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Placeholder#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Placeholder#getKey()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EAttribute getPlaceholder_Key();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode <em>Wrapping Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapping Node</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode
	 * @generated
	 */
	EClass getWrappingNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#getChildren()
	 * @see #getWrappingNode()
	 * @generated
	 */
	EReference getWrappingNode_Children();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#isTransient()
	 * @see #getWrappingNode()
	 * @generated
	 */
	EAttribute getWrappingNode_Transient();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode <em>Imaginary Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imaginary Node</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode
	 * @generated
	 */
	EClass getImaginaryNode();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getKey()
	 * @see #getImaginaryNode()
	 * @generated
	 */
	EAttribute getImaginaryNode_Key();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getOrigin()
	 * @see #getImaginaryNode()
	 * @generated
	 */
	EReference getImaginaryNode_Origin();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section#getLevel()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Level();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section#getChildren()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Children();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anchor</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Section#getAnchor()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Anchor();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList <em>Markup List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup List</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupList
	 * @generated
	 */
	EClass getMarkupList();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getType()
	 * @see #getMarkupList()
	 * @generated
	 */
	EAttribute getMarkupList_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getItems()
	 * @see #getMarkupList()
	 * @generated
	 */
	EReference getMarkupList_Items();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.RawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Text</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.RawText
	 * @generated
	 */
	EClass getRawText();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.RawText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.RawText#getText()
	 * @see #getRawText()
	 * @generated
	 */
	EAttribute getRawText_Text();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.CodeListing <em>Code Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Listing</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.CodeListing
	 * @generated
	 */
	EClass getCodeListing();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.CodeListing#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.CodeListing#getContent()
	 * @see #getCodeListing()
	 * @generated
	 */
	EReference getCodeListing_Content();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Reference#getTitle()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Title();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Reference#getLink()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Link();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Reference#getReferenced()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Referenced();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Image#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Image#getLink()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Link();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized <em>Emphasized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasized</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Emphasized
	 * @generated
	 */
	EClass getEmphasized();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getType()
	 * @see #getEmphasized()
	 * @generated
	 */
	EAttribute getEmphasized_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getParts()
	 * @see #getEmphasized()
	 * @generated
	 */
	EReference getEmphasized_Parts();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.mlm.model.api.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for enum '{@link ru.mkn.sovesti.screbok.mlm.model.api.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Type</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ListType
	 * @generated
	 */
	EEnum getListType();

	/**
	 * Returns the meta object for enum '{@link ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType <em>Emphasis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emphasis Type</em>'.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType
	 * @generated
	 */
	EEnum getEmphasisType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MlmFactory getMlmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.LocatedImpl <em>Located</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.LocatedImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getLocated()
		 * @generated
		 */
		EClass LOCATED = eINSTANCE.getLocated();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED__URI = eINSTANCE.getLocated_Uri();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__RESOURCES = eINSTANCE.getSite_Resources();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteResourceImpl <em>Site Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteResourceImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSiteResource()
		 * @generated
		 */
		EClass SITE_RESOURCE = eINSTANCE.getSiteResource();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_RESOURCE__SITE = eINSTANCE.getSiteResource_Site();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SitePageImpl <em>Site Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SitePageImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSitePage()
		 * @generated
		 */
		EClass SITE_PAGE = eINSTANCE.getSitePage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_PAGE__NAME = eINSTANCE.getSitePage_Name();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_PAGE__ROOT = eINSTANCE.getSitePage_Root();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteMediaImpl <em>Site Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SiteMediaImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSiteMedia()
		 * @generated
		 */
		EClass SITE_MEDIA = eINSTANCE.getSiteMedia();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.MarkupNodeImpl <em>Markup Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MarkupNodeImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getMarkupNode()
		 * @generated
		 */
		EClass MARKUP_NODE = eINSTANCE.getMarkupNode();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_NODE__LANGUAGE = eINSTANCE.getMarkupNode_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_NODE__NAME = eINSTANCE.getMarkupNode_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_NODE__ATTRIBUTES = eINSTANCE.getMarkupNode_Attributes();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.NodeAttributeImpl <em>Node Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.NodeAttributeImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getNodeAttribute()
		 * @generated
		 */
		EClass NODE_ATTRIBUTE = eINSTANCE.getNodeAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ATTRIBUTE__NAME = eINSTANCE.getNodeAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ATTRIBUTE__VALUE = eINSTANCE.getNodeAttribute_Value();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.WildcardImpl <em>Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.WildcardImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getWildcard()
		 * @generated
		 */
		EClass WILDCARD = eINSTANCE.getWildcard();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILDCARD__KEY = eINSTANCE.getWildcard_Key();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILDCARD__REPEATED = eINSTANCE.getWildcard_Repeated();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WILDCARD___GET__INT = eINSTANCE.getWildcard__Get__int();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.PlaceholderImpl <em>Placeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.PlaceholderImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getPlaceholder()
		 * @generated
		 */
		EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER__KEY = eINSTANCE.getPlaceholder_Key();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.WrappingNodeImpl <em>Wrapping Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.WrappingNodeImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getWrappingNode()
		 * @generated
		 */
		EClass WRAPPING_NODE = eINSTANCE.getWrappingNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRAPPING_NODE__CHILDREN = eINSTANCE.getWrappingNode_Children();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPING_NODE__TRANSIENT = eINSTANCE.getWrappingNode_Transient();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ImaginaryNodeImpl <em>Imaginary Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ImaginaryNodeImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getImaginaryNode()
		 * @generated
		 */
		EClass IMAGINARY_NODE = eINSTANCE.getImaginaryNode();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGINARY_NODE__KEY = eINSTANCE.getImaginaryNode_Key();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGINARY_NODE__ORIGIN = eINSTANCE.getImaginaryNode_Origin();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__LEVEL = eINSTANCE.getSection_Level();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CHILDREN = eINSTANCE.getSection_Children();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ANCHOR = eINSTANCE.getSection_Anchor();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.AnchorImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.MarkupListImpl <em>Markup List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MarkupListImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getMarkupList()
		 * @generated
		 */
		EClass MARKUP_LIST = eINSTANCE.getMarkupList();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_LIST__TYPE = eINSTANCE.getMarkupList_Type();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_LIST__ITEMS = eINSTANCE.getMarkupList_Items();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.RawTextImpl <em>Raw Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.RawTextImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getRawText()
		 * @generated
		 */
		EClass RAW_TEXT = eINSTANCE.getRawText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_TEXT__TEXT = eINSTANCE.getRawText_Text();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.CodeListingImpl <em>Code Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.CodeListingImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getCodeListing()
		 * @generated
		 */
		EClass CODE_LISTING = eINSTANCE.getCodeListing();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTING__CONTENT = eINSTANCE.getCodeListing_Content();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ReferenceImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TITLE = eINSTANCE.getReference_Title();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__LINK = eINSTANCE.getReference_Link();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCED = eINSTANCE.getReference_Referenced();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.ImageImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LINK = eINSTANCE.getImage_Link();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.EmphasizedImpl <em>Emphasized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.EmphasizedImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getEmphasized()
		 * @generated
		 */
		EClass EMPHASIZED = eINSTANCE.getEmphasized();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIZED__TYPE = eINSTANCE.getEmphasized_Type();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIZED__PARTS = eINSTANCE.getEmphasized_Parts();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.LineBreakImpl
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.api.ListType <em>List Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.api.ListType
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getListType()
		 * @generated
		 */
		EEnum LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType <em>Emphasis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType
		 * @see ru.mkn.sovesti.screbok.mlm.model.impl.MlmPackageImpl#getEmphasisType()
		 * @generated
		 */
		EEnum EMPHASIS_TYPE = eINSTANCE.getEmphasisType();

	}

} //MlmPackage
