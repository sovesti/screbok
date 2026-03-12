/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getLanguage <em>Language</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getName <em>Name</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupNode()
 * @model abstract="true"
 * @generated
 */
public interface MarkupNode extends Located {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupNode_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupNode_Attributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NodeAttribute> getAttributes();

} // MarkupNode
