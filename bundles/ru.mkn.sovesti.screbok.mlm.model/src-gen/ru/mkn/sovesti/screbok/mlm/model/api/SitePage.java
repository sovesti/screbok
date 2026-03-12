/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getName <em>Name</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSitePage()
 * @model
 * @generated
 */
public interface SitePage extends SiteResource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSitePage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(MarkupNode)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSitePage_Root()
	 * @model containment="true"
	 * @generated
	 */
	MarkupNode getRoot();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(MarkupNode value);

} // SitePage
