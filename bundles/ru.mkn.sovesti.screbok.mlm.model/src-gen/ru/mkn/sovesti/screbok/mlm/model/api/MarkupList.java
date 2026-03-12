/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getType <em>Type</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupList()
 * @model
 * @generated
 */
public interface MarkupList extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.mkn.sovesti.screbok.mlm.model.api.ListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ListType
	 * @see #setType(ListType)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupList_Type()
	 * @model
	 * @generated
	 */
	ListType getType();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupList#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.ListType
	 * @see #getType()
	 * @generated
	 */
	void setType(ListType value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getMarkupList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getItems();

} // MarkupList
