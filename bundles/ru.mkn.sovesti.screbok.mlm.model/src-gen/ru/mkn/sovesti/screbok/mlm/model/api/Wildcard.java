/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getKey <em>Key</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getRepeated <em>Repeated</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWildcard()
 * @model
 * @generated
 */
public interface Wildcard extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWildcard_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Wildcard#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Repeated</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeated</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getWildcard_Repeated()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getRepeated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MarkupNode get(int index);

} // Wildcard
