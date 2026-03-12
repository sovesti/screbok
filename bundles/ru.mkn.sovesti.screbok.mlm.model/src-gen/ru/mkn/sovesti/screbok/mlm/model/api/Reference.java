/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getTitle <em>Title</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getLink <em>Link</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getReferenced <em>Referenced</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupNode)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getReference_Title()
	 * @model containment="true"
	 * @generated
	 */
	MarkupNode getTitle();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupNode value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getReference_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference.
	 * @see #setReferenced(Located)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getReference_Referenced()
	 * @model
	 * @generated
	 */
	Located getReferenced();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Reference#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(Located value);

} // Reference
