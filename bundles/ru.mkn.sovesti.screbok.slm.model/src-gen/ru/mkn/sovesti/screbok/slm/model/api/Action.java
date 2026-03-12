/**
 */
package ru.mkn.sovesti.screbok.slm.model.api;

import org.eclipse.core.runtime.CoreException;
import ru.mkn.sovesti.screbok.dsm.model.api.Named;
import ru.mkn.sovesti.screbok.slm.model.LaunchContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Action#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends Named {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getAction_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.slm.model.api.Action#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ru.mkn.sovesti.screbok.slm.model.api.CoreException" contextDataType="ru.mkn.sovesti.screbok.slm.model.api.LaunchContext"
	 * @generated
	 */
	void run(LaunchContext context) throws CoreException;

} // Action
