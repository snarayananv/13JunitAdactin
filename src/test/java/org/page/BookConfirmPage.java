package org.page;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmPage extends BaseClass {
	public BookConfirmPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	WebElement orderNo;
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement textBookingConfirmation;

	
	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}
	public void setTextBookingConfirmation(WebElement textBookingConfirmation) {
		this.textBookingConfirmation = textBookingConfirmation;
	}
	public WebElement getTextBookingConfirmation() {
		return textBookingConfirmation;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	public String bookConfirm() {
		String attribute = attribute(getOrderNo());
		return attribute;

	}
	
	

}
