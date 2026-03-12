/**
 */
package ru.mkn.sovesti.screbok.slm.model.impl;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.mkn.sovesti.screbok.dsm.model.api.Book;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.slm.model.ConversionRun;
import ru.mkn.sovesti.screbok.slm.model.LaunchContext;
import ru.mkn.sovesti.screbok.slm.model.api.Convert;
import ru.mkn.sovesti.screbok.slm.model.api.Format;
import ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl#getBook <em>Book</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvertImpl extends ActionImpl implements Convert {
	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected Book book;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<SitePage> pages;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format FORMAT_EDEFAULT = Format.MARKDOWN;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Format format = FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlmPackage.Literals.CONVERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Book getBook() {
		if (book != null && book.eIsProxy()) {
			InternalEObject oldBook = (InternalEObject)book;
			book = (Book)eResolveProxy(oldBook);
			if (book != oldBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlmPackage.CONVERT__BOOK, oldBook, book));
			}
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book basicGetBook() {
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBook(Book newBook) {
		Book oldBook = book;
		book = newBook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlmPackage.CONVERT__BOOK, oldBook, book));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SitePage> getPages() {
		if (pages == null) {
			pages = new EObjectResolvingEList<SitePage>(SitePage.class, this, SlmPackage.CONVERT__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Format getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(Format newFormat) {
		Format oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlmPackage.CONVERT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlmPackage.CONVERT__BOOK:
				if (resolve) return getBook();
				return basicGetBook();
			case SlmPackage.CONVERT__PAGES:
				return getPages();
			case SlmPackage.CONVERT__FORMAT:
				return getFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlmPackage.CONVERT__BOOK:
				setBook((Book)newValue);
				return;
			case SlmPackage.CONVERT__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends SitePage>)newValue);
				return;
			case SlmPackage.CONVERT__FORMAT:
				setFormat((Format)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlmPackage.CONVERT__BOOK:
				setBook((Book)null);
				return;
			case SlmPackage.CONVERT__PAGES:
				getPages().clear();
				return;
			case SlmPackage.CONVERT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlmPackage.CONVERT__BOOK:
				return book != null;
			case SlmPackage.CONVERT__PAGES:
				return pages != null && !pages.isEmpty();
			case SlmPackage.CONVERT__FORMAT:
				return format != FORMAT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException
	 * @generated not
	 */
	@Override
	public void run(LaunchContext context) throws CoreException {
		new ConversionRun(this, context).perform();
	}

} //ConvertImpl
