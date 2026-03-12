/**
 */
package ru.mkn.sovesti.screbok.slm.model.api;

import org.eclipse.emf.common.util.EList;

import ru.mkn.sovesti.screbok.dsm.model.api.Book;

import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getBook <em>Book</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getPages <em>Pages</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getConvert()
 * @model
 * @generated
 */
public interface Convert extends Action {
	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(Book)
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getConvert_Book()
	 * @model
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getBook <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getConvert_Pages()
	 * @model
	 * @generated
	 */
	EList<SitePage> getPages();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.mkn.sovesti.screbok.slm.model.api.Format}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Format
	 * @see #setFormat(Format)
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getConvert_Format()
	 * @model
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Format
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Format value);

} // Convert
