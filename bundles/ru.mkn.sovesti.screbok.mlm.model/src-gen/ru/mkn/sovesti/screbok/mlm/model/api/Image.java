/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Image#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getImage_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Image#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // Image
