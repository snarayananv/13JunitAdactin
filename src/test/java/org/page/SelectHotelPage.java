package org.page;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass  {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="radiobutton_0")
	WebElement  rdButton;
	@FindBy (id="continue")
	WebElement  btnContinue;
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement textSuccessSelectHotel;

	public WebElement getTextSuccessSelectHotel() {
		return textSuccessSelectHotel;
	}
	public WebElement getRdButton() {
		return rdButton;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectAHotel() {
		click(getRdButton());
		click(getBtnContinue());
	}
}
