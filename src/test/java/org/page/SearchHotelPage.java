package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement ddLocation;
	@FindBy(id = "hotels")
	private WebElement ddHostel;
	@FindBy(id = "room_type")
	private WebElement ddRoomType;
	@FindBy(id = "room_nos")
	private WebElement ddnoRoom;
	@FindBy(id = "datepick_in")
	private WebElement txtInDate;
	@FindBy(id = "datepick_out")
	private WebElement txtOutDate;
	@FindBy(id = "adult_room")
	private WebElement ddAdult;
	@FindBy(id = "child_room")
	private WebElement ddChild;
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	@FindBy(id = "username_show")
	private WebElement textSuccessLoginMessage;
	
	

	public WebElement getTextSuccessLoginMessage() {
		return textSuccessLoginMessage;
	}

	public void setTextSuccessLoginMessage(WebElement textSuccessLoginMessage) {
		this.textSuccessLoginMessage = textSuccessLoginMessage;
	}

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHostel() {
		return ddHostel;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getDdnoRoom() {
		return ddnoRoom;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtOutDate() {
		return txtOutDate;
	}

	public WebElement getDdAdult() {
		return ddAdult;
	}

	public WebElement getDdChild() {
		return ddChild;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void searchHotelPage(String ddlocation, String ddHostel, String ddRoomType, String ddnoRoom,
			String txtInDate, String txtOutDate, String ddAdult, String ddChild) {
		dateClear();
		selectValue(getDdLocation(), ddlocation);
		selectValue(getDdHostel(), ddHostel);
		selectValue(getDdRoomType(), ddRoomType);
		selectValue(getDdnoRoom(), ddnoRoom);
		value(getTxtInDate(), txtInDate);
		value(getTxtOutDate(), txtOutDate);
		selectValue(getDdAdult(), ddAdult);
		selectValue(getDdChild(), ddChild);
		click(getBtnSearch());
	}
	public void dateClear() {
		getTxtInDate().clear();
		getTxtOutDate().clear();

	}

}
