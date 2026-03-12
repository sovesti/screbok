/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.RawText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getRawText()
 * @model
 * @generated
 */
public interface RawText extends MarkupNode {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getRawText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.RawText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
} // RawText
