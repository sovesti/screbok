/**
 */
package ru.mkn.sovesti.screbok.dsm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Library#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.dsm.model.api.Rules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getLibrary_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getRules();

} // Library
