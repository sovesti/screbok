/**
 */
package ru.mkn.sovesti.screbok.dsm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mkn.sovesti.screbok.dsm.model.api.*;

import ru.mkn.sovesti.screbok.dsm.model.meta.DsmFactory;
import ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsmFactoryImpl extends EFactoryImpl implements DsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsmFactory init() {
		try {
			DsmFactory theDsmFactory = (DsmFactory)EPackage.Registry.INSTANCE.getEFactory(DsmPackage.eNS_URI);
			if (theDsmFactory != null) {
				return theDsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmFactoryImpl() {
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
			case DsmPackage.LIBRARY: return createLibrary();
			case DsmPackage.DOCUMENTATION_LANGUAGE: return createDocumentationLanguage();
			case DsmPackage.DOCUMENTATION_ENGINE: return createDocumentationEngine();
			case DsmPackage.ORGANIZATION: return createOrganization();
			case DsmPackage.BOOK: return createBook();
			case DsmPackage.PARAMETER: return createParameter();
			case DsmPackage.RULE: return createRule();
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
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationLanguage createDocumentationLanguage() {
		DocumentationLanguageImpl documentationLanguage = new DocumentationLanguageImpl();
		return documentationLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationEngine createDocumentationEngine() {
		DocumentationEngineImpl documentationEngine = new DocumentationEngineImpl();
		return documentationEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmPackage getDsmPackage() {
		return (DsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsmPackage getPackage() {
		return DsmPackage.eINSTANCE;
	}

} //DsmFactoryImpl
