/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emphasized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getType <em>Type</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getEmphasized()
 * @model
 * @generated
 */
public interface Emphasized extends MarkupNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType
	 * @see #setType(EmphasisType)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getEmphasized_Type()
	 * @model
	 * @generated
	 */
	EmphasisType getType();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.Emphasized#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType
	 * @see #getType()
	 * @generated
	 */
	void setType(EmphasisType value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getEmphasized_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getParts();

} // Emphasized
