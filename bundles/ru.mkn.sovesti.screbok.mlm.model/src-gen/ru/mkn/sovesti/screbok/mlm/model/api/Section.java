/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getLevel <em>Level</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getChildren <em>Children</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSection_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupNode)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSection_Title()
	 * @model containment="true"
	 * @generated
	 */
	MarkupNode getTitle();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupNode value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSection_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference.
	 * @see #setAnchor(Anchor)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSection_Anchor()
	 * @model containment="true"
	 * @generated
	 */
	Anchor getAnchor();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Section#getAnchor <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' containment reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(Anchor value);

} // Section
