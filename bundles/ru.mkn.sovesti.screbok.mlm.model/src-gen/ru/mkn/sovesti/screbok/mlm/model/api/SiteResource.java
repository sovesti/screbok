/**
 */
package ru.mkn.sovesti.screbok.mlm.model.api;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSiteResource()
 * @model abstract="true"
 * @generated
 */
public interface SiteResource extends Located {

	/**
	 * Returns the value of the '<em><b>Site</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mkn.sovesti.screbok.mlm.model.api.Site#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' reference.
	 * @see #setSite(Site)
	 * @see ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage#getSiteResource_Site()
	 * @see ru.mkn.sovesti.screbok.mlm.model.api.Site#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link ru.mkn.sovesti.screbok.mlm.model.api.SiteResource#getSite <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);
} // SiteResource
