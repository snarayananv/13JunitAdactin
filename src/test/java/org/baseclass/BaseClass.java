package org.baseclass;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.database.Data;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public Data getDataBaseValue() {
		Data data=null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String password = "ramesh";
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection(url, username, password);
			String sql = "select * from ADACTIN where TESTCASE_NO='TC03'";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				String testCase = res.getString("TESTCASE_NO");
				String user = res.getString("USERNAME");
				String pass = res.getString("PASSWORD");
				String location = res.getString("LOCATION");
				String hotel = res.getString("HOTELS");
				String room = res.getString("ROOM_TYPE");
				String noRoom = res.getString("NO_OF_ROOM");
				Date in = res.getDate("CHECK_IN_DATE");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String inDate = dateFormat.format(in);
				Date out = res.getDate("CHECK_OUT_DATE");
				String outDate = dateFormat.format(out);
				String adult = res.getString("ADULTS_PER_ROOM");
				String children = res.getString("CHILDREN_PER_ROOM");
				String firstName = res.getString("FIRST_NAME");
				String lastName = res.getString("LAST_NAME");
				String address = res.getString("BILLING_ADDRESS");
				String cardNo = res.getString("CREDIT_CARD_NO");
				String cardType = res.getString("CREDIT_CARD_TYPE");
				String month = res.getString("MONTH");
				String year = res.getString("YEAR");
				String cvvNo = res.getString("CVV");
				System.out.println(testCase);
				System.out.println(user);
				System.out.println(pass);
				System.out.println(location);
				System.out.println(hotel);
				System.out.println(room);
				System.out.println(noRoom);
				System.out.println(inDate);
				System.out.println(outDate);
				System.out.println(adult);
				System.out.println(children);
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(address);
				System.out.println(cardNo);
				System.out.println(cardType);
				System.out.println(month);
				System.out.println(year);
				System.out.println(cvvNo);
				 data = new Data(user, pass, location, hotel, room, noRoom, inDate, outDate, adult, children,
						firstName, lastName, address, cardNo, cardType, month, year, cvvNo);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
return data;
	}

	public static void getDriver(String Browser) {
		switch (Browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public String title() {
		String title = driver.getTitle();
		return title;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

	public Options manage() {
		Options manage = driver.manage();
		return manage;
	}

	public TargetLocator switchTo() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public String windowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getAllWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}

	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}

	// webElement
	public void value(WebElement e, String data) {
		e.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public String text(WebElement e) {
		String text = e.getText();
		return text;
	}

	public String attribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}

	public boolean displayed(WebElement e, String data) {
		boolean displayed = e.isDisplayed();
		return displayed;
	}

	public boolean enabled(WebElement e, String data) {
		boolean enabled = e.isEnabled();
		return enabled;
	}

	public boolean selected(WebElement e, String data) {
		boolean selected = e.isSelected();
		return selected;
	}

	// Navigation
	public void front() {
		navigate().forward();
	}

	public void backward() {
		navigate().back();
	}

	public void to(String data) {
		navigate().to(data);
	}

	public void refresh() {
		navigate().refresh();
	}

	// Action
	public void moveToElement(WebElement e) {
		Actions action = new Actions(driver);
		action.moveToElement(e).perform();
	}

	public void contextclick(WebElement e) {
		Actions action = new Actions(driver);
		action.contextClick(e).perform();
	}

	public void doubleClick(WebElement e) {
		Actions action = new Actions(driver);
		action.doubleClick(e).perform();
	}

	public void dropdown(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}

	// Select
	public void selectText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectValue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public void selectIndex(WebElement element, int a) {
		Select s = new Select(element);
		s.selectByIndex(a);
	}

	public void deselectIndex(WebElement element, int a) {
		Select s = new Select(element);
		s.deselectByIndex(a);
	}

	public void deselectValue(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByValue(data);
	}

	public void deselectText(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByVisibleText(data);
	}

	public List<WebElement> getoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public boolean multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public List<WebElement> allSelected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> Options = s.getAllSelectedOptions();
		return Options;
	}

	public WebElement firstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement firstOption = s.getFirstSelectedOption();
		return firstOption;
	}

	public Alert switchToAlert() {
		Alert al = switchToElement().alert();
		return al;
	}

	public void acceptAlert() {
		Alert al = switchToAlert();
		al.accept();
	}

	public void dismissAlert() {
		Alert al = switchToAlert();
		al.dismiss();
	}

	public String text() {
		Alert al = switchToAlert();
		String text = al.getText();
		return text;
	}

	public void sendtext(String data) {
		switchToAlert().sendKeys(data);
	}

	// Frame
	public TargetLocator switchToElement() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public void frameIndex(int index) {
		switchToElement().frame(index);
	}

	public void frameNameOrId(String nameorid) {
		switchToElement().frame(nameorid);
	}

	public void frameWebElement(WebElement e) {
		switchToElement().frame(e);
	}

	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

}
