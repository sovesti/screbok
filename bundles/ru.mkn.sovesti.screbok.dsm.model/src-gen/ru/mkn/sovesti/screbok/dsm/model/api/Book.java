/**
 */
package ru.mkn.sovesti.screbok.dsm.model.api;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getLanguage <em>Language</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getEngine <em>Engine</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends Rules {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.dsm.model.api.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getBook_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(DocumentationLanguage)
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getBook_Language()
	 * @model
	 * @generated
	 */
	DocumentationLanguage getLanguage();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(DocumentationLanguage value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(DocumentationEngine)
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getBook_Engine()
	 * @model
	 * @generated
	 */
	DocumentationEngine getEngine();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(DocumentationEngine value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getBook_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Book#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);
} // Book
