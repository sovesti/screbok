/**
 */
package ru.mkn.sovesti.screbok.dsm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Rules#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRules()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Rules extends Named {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.dsm.model.api.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRules_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Rules
