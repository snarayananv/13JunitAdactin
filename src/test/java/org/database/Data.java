package org.database;

import org.baseclass.BaseClass;

public class Data extends BaseClass{
	private String user;
	private String pass;
	private String location;
	private String hotel;
	private String room;
	private String noRoom;
	private String inDate;
	private String outDate;
	private String adult;
	private String children;
	private String firstName;
	private String lastName;
	private String address;
	private String cardNo;
	private String cardType;
	private String month;
	private String year;
	private String cvvNo;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getNoRoom() {
		return noRoom;
	}
	public void setNoRoom(String noRoom) {
		this.noRoom = noRoom;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public String getAdult() {
		return adult;
	}
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}
	public Data(String user, String pass, String location, String hotel, String room, String noRoom, String inDate,
			String outDate, String adult, String children, String firstName, String lastName, String address,
			String cardNo, String cardType, String month, String year, String cvvNo) {
		this.user = user;
		this.pass = pass;
		this.location = location;
		this.hotel = hotel;
		this.room = room;
		this.noRoom = noRoom;
		this.inDate = inDate;
		this.outDate = outDate;
		this.adult = adult;
		this.children = children;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.month = month;
		this.year = year;
		this.cvvNo = cvvNo;
	}
	

}
