/**
 */
package ru.mkn.sovesti.screbok.slm.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Launch#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getLaunch()
 * @model
 * @generated
 */
public interface Launch extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.slm.model.api.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getLaunch_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Launch
