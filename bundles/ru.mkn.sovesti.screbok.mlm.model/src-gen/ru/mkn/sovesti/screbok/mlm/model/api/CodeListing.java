/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.CodeListing#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getCodeListing()
 * @model
 * @generated
 */
public interface CodeListing extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(MarkupNode)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getCodeListing_Content()
	 * @model containment="true"
	 * @generated
	 */
	MarkupNode getContent();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.CodeListing#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(MarkupNode value);

} // CodeListing
