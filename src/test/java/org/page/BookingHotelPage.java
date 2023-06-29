package org.page;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelPage extends BaseClass{
	 public BookingHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	WebElement firstName;
	@FindBy(id="last_name")
	WebElement lastName;
	@FindBy(id="address")	
	WebElement txtAddress; 
	@FindBy(id="cc_num")	
	WebElement  ccNumber;
	@FindBy(id="cc_type")	
	WebElement  ddCreditType;
	@FindBy(id="cc_exp_month")
	WebElement  ddMonth;
	@FindBy(id="cc_exp_year")
	WebElement ddYear;
	@FindBy(id="cc_cvv")
	WebElement txtCvv;
    @FindBy(id="book_now")
    WebElement btnBook;
    @FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement textSuccessBookMessage;
    
    
    
	public WebElement getTextSuccessBookMessage() {
		return textSuccessBookMessage;
	}
	public void setTextSuccessBookMessage(WebElement textSuccessBookMessage) {
		this.textSuccessBookMessage = textSuccessBookMessage;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getDdCreditType() {
		return ddCreditType;
	}
	public WebElement getDdMonth() {
		return ddMonth;
	}
	public WebElement getDdYear() {
		return ddYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
  public void bookHotel(String firstName,String lastName,String txtAddress,String ccNumber,String ddCreditType,String ddMonth,String ddYear,String txtCvv) {
	value(getFirstName(),firstName );
	value(getLastName(),lastName );
	value(getTxtAddress(), txtAddress);
	value(getCcNumber(),  ccNumber);
	selectValue(getDdCreditType(), ddCreditType);
	selectValue(getDdMonth(), ddMonth);
	selectValue(getDdYear(),ddYear);
	value(getTxtCvv(), txtCvv);
	click(getBtnBook());

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
