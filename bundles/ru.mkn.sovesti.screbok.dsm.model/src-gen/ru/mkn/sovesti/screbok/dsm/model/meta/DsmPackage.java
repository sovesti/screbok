/**
 */
package ru.mkn.sovesti.screbok.dsm.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmFactory
 * @model kind="package"
 * @generated
 */
public interface DsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sovesti.ru/screbok/dsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsmPackage eINSTANCE = ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Named
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.LibraryImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RULES = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rules <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rules
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__RULES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationLanguageImpl <em>Documentation Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationLanguageImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getDocumentationLanguage()
	 * @generated
	 */
	int DOCUMENTATION_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_LANGUAGE__NAME = RULES__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_LANGUAGE__RULES = RULES__RULES;

	/**
	 * The number of structural features of the '<em>Documentation Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_LANGUAGE_FEATURE_COUNT = RULES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Documentation Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_LANGUAGE_OPERATION_COUNT = RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationEngineImpl <em>Documentation Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationEngineImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getDocumentationEngine()
	 * @generated
	 */
	int DOCUMENTATION_ENGINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ENGINE__NAME = RULES__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ENGINE__RULES = RULES__RULES;

	/**
	 * The number of structural features of the '<em>Documentation Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ENGINE_FEATURE_COUNT = RULES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Documentation Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ENGINE_OPERATION_COUNT = RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.OrganizationImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = RULES__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__RULES = RULES__RULES;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = RULES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.BookImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = RULES__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__RULES = RULES__RULES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PARAMETERS = RULES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LANGUAGE = RULES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ENGINE = RULES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ORGANIZATION = RULES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = RULES_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = RULES_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.ParameterImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INITIAL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.RuleImpl
	 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESULT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.dsm.model.api.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.dsm.model.api.Library#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Library#getRules()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Rules();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rules#getRules()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Rules();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.DocumentationLanguage <em>Documentation Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Language</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.DocumentationLanguage
	 * @generated
	 */
	EClass getDocumentationLanguage();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.DocumentationEngine <em>Documentation Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Engine</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.DocumentationEngine
	 * @generated
	 */
	EClass getDocumentationEngine();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Book#getParameters()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Parameters();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Book#getLanguage()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Language();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Book#getEngine()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Engine();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Book#getOrganization()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Organization();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.dsm.model.api.Parameter#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Parameter#getInitial()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Initial();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rule#getResult()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Result();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsmFactory getDsmFactory();

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
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.api.Named
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.LibraryImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__RULES = eINSTANCE.getLibrary_Rules();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rules <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.api.Rules
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__RULES = eINSTANCE.getRules_Rules();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationLanguageImpl <em>Documentation Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationLanguageImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getDocumentationLanguage()
		 * @generated
		 */
		EClass DOCUMENTATION_LANGUAGE = eINSTANCE.getDocumentationLanguage();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationEngineImpl <em>Documentation Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DocumentationEngineImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getDocumentationEngine()
		 * @generated
		 */
		EClass DOCUMENTATION_ENGINE = eINSTANCE.getDocumentationEngine();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.OrganizationImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.BookImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__PARAMETERS = eINSTANCE.getBook_Parameters();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__LANGUAGE = eINSTANCE.getBook_Language();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__ENGINE = eINSTANCE.getBook_Engine();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__ORGANIZATION = eINSTANCE.getBook_Organization();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.ParameterImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__INITIAL = eINSTANCE.getParameter_Initial();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.dsm.model.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.RuleImpl
		 * @see ru.mkn.sovesti.screbok.dsm.model.impl.DsmPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RESULT = eINSTANCE.getRule_Result();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

	}

} //DsmPackage
