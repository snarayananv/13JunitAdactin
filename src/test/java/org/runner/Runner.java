package org.runner;

import org.baseclass.BaseClass;
import org.database.Data;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pageobject.PageObjectManager;

public class Runner extends BaseClass {
	
	Data value = getDataBaseValue();
	PageObjectManager pom = new PageObjectManager();
	@Test
	public void tc1() {
		getDriver("Chrome");
		loadUrl("https://adactinhotelapp.com/");
		implicitWait(10);
		pom.getLoginPage().login(value.getUser(), value.getPass());
		
		WebElement txtLoginMsg = pom.getSearchHotelPage().getTextSuccessLoginMessage();
		String actLoginSuccessMessage = attribute(txtLoginMsg);
		Assert.assertEquals("verify login success message","Hello nitish123!", actLoginSuccessMessage);
	}

	@Test
	public void tc2() {
		pom.getSearchHotelPage().searchHotelPage(value.getLocation(), value.getHotel(), value.getRoom(), value.getNoRoom(),
				value.getInDate(), value.getOutDate(), value.getAdult(), value.getChildren());
		WebElement textSuccessSelectHotel = pom.getSelectHotelPage().getTextSuccessSelectHotel();
		String actSuccessSelectHotel = text(textSuccessSelectHotel);		
		Assert.assertEquals("verify success message","Select Hotel", actSuccessSelectHotel);
	}

	@Test
	public void tc3() {
		pom.getSelectHotelPage().selectAHotel();
		WebElement textSuccessBookMessage = pom.getBookingHotelPage().getTextSuccessBookMessage();
		String actSuccessBookMessage = text(textSuccessBookMessage);
		Assert.assertEquals("verify success message","Book A Hotel", actSuccessBookMessage);
	}

	@Test
	public void tc4() {	
		pom.getBookingHotelPage().bookHotel(value.getFirstName(), value.getLastName(), value.getAddress(), value.getCardNo(),
				value.getCardType(), value.getMonth(), value.getYear(), value.getCvvNo());
		WebElement textBookingConfirmation = pom.getBookConfirmPage().getTextBookingConfirmation();
		String actBookingConfirmation = text(textBookingConfirmation);
		Assert.assertEquals("verify success message","Booking Confirmation", actBookingConfirmation);
	}
	@Test
	public void tc5() {		
		String orderIdNo = pom.getBookConfirmPage().bookConfirm();
		System.out.println("\t Order ID No :"+ orderIdNo);
	}

}
