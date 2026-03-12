/**
 */
package ru.mkn.sovesti.screbok.dsm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.dsm.model.api.Parameter#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Named {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(String)
	 * @see ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage#getParameter_Initial()
	 * @model
	 * @generated
	 */
	String getInitial();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.dsm.model.api.Parameter#getInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(String value);

} // Parameter
