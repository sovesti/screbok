/**
 */
package ru.mkn.sovesti.screbok.slm.model.api;

import org.eclipse.emf.common.util.EList;

import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.api.Scrap#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getScrap()
 * @model
 * @generated
 */
public interface Scrap extends Action {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.SitePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#getScrap_Pages()
	 * @model
	 * @generated
	 */
	EList<SitePage> getPages();

} // Scrap
