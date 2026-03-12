/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.Site#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends Located {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource}.
	 * It is bidirectional and its opposite is '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSite_Resources()
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite
	 * @model opposite="site"
	 * @generated
	 */
	EList<SiteResource> getResources();

} // Site
