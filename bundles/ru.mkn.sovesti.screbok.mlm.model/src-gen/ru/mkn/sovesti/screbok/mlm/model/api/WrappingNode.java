/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wrapping Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#getChildren <em>Children</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#isTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWrappingNode()
 * @model
 * @generated
 */
public interface WrappingNode extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWrappingNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWrappingNode_Transient()
	 * @model default="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

} // WrappingNode
