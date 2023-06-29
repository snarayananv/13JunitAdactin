package org.pageobject;

import org.page.BookConfirmPage;
import org.page.BookingHotelPage;
import org.page.Loginpage;
import org.page.SearchHotelPage;
import org.page.SelectHotelPage;

public class PageObjectManager {
	private Loginpage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingHotelPage bookingHotelPage;
	private BookConfirmPage bookConfirmPage;

	public Loginpage getLoginPage() {
		return (loginPage == null ? loginPage = new Loginpage() : loginPage);
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null ? searchHotelPage = new SearchHotelPage() : searchHotelPage);
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null ? selectHotelPage = new SelectHotelPage() : selectHotelPage);
	}

	public BookingHotelPage getBookingHotelPage() {
		return (bookingHotelPage == null ? bookingHotelPage = new BookingHotelPage() : bookingHotelPage);
	}

	public BookConfirmPage getBookConfirmPage() {
		return (bookConfirmPage == null ? bookConfirmPage = new BookConfirmPage() : bookConfirmPage);
	}

}
