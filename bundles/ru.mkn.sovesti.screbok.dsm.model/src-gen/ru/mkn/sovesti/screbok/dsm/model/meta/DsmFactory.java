/**
 */
package ru.mkn.sovesti.screbok.dsm.model.meta;

import org.eclipse.emf.ecore.EFactory;

import ru.mkn.sovesti.screbok.dsm.model.api.Book;
import ru.mkn.sovesti.screbok.dsm.model.api.DocumentationEngine;
import ru.mkn.sovesti.screbok.dsm.model.api.DocumentationLanguage;
import ru.mkn.sovesti.screbok.dsm.model.api.Library;
import ru.mkn.sovesti.screbok.dsm.model.api.Organization;
import ru.mkn.sovesti.screbok.dsm.model.api.Parameter;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage
 * @generated
 */
public interface DsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsmFactory eINSTANCE = ru.mkn.sovesti.screbok.dsm.model.impl.DsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Documentation Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation Language</em>'.
	 * @generated
	 */
	DocumentationLanguage createDocumentationLanguage();

	/**
	 * Returns a new object of class '<em>Documentation Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation Engine</em>'.
	 * @generated
	 */
	DocumentationEngine createDocumentationEngine();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DsmPackage getDsmPackage();

} //DsmFactory
