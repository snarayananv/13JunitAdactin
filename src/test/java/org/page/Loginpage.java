package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClass;
public class Loginpage extends BaseClass {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	 private WebElement passWord;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
 public void login(String userName,String passWord) {
	value(getUserName(),userName);
	value(getPassWord(), passWord);
	click(getBtnLogin());

}
}
