/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaginary Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getKey <em>Key</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getImaginaryNode()
 * @model
 * @generated
 */
public interface ImaginaryNode extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getImaginaryNode_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(MarkupNode)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getImaginaryNode_Origin()
	 * @model
	 * @generated
	 */
	MarkupNode getOrigin();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(MarkupNode value);

} // ImaginaryNode
