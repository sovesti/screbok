/**
 */
package ru.mkn.sovesti.screbok.dsm.model.api;

import org.eclipse.emf.common.util.EList;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPattern <em>Pattern</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getResult <em>Result</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Named {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRule_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getPattern();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRule_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupNode> getResult();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getRule_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // Rule
