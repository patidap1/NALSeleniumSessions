package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver(); //session id - 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//create a Web Element + perform a action (click, sendkeys, gettext, isDiplayed....)
		// FE - Find Element   + click, sendKeys, getText, ...

		//1. no re-usability
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		// By - Class - no. of static methods


		//2. Create a WebElement  - offers re-usabiity
//		WebElement emailid_ele = driver.findElement(By.id("input-email"));
//		WebElement pwd_ele = driver.findElement(By.id("input-password"));

//		emailid_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("Naveen@123");


		//3. By locator : object repository - load will be less on the server with this approach

//		  By email = By.id("input-email"); //does not hit the server By password =
//		  By.id("input-password");
//
//		  WebElement emailId_ele = driver.findElement(email); WebElement pwd_ele =
//		  driver.findElement(password);
//
//		  emailId_ele.sendKeys("naveen@gmail.com"); pwd_ele.sendKeys("naveen@123");


		//4. By Locator + generic function for webElement

//		  By email = By.id("input-email");
//		  By password = By.id("input-password");
//
//		  getElement(email).sendKeys("naveen@gmail.com");
//		  getElement(password).sendKeys("naveen@123");


		//5. By Locator + generic function for webelement + generic function for action(sendKeys)
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(email, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");

		//6. By Locator + generic function for webelement + generic function for action(sendKeys) - ElementUtil
		By email = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(email, "naveen@gmail.com");
		eUtil.doSendKeys(password, "naveen@123");

		// 7. By Locator = BrowserUtil + ElementUtil

	}

//	public static WebElement getElement(By locator) { //call by reference
//		return driver.findElement(locator);
//	}
//
//	// do not use static keyword -  prevents the parallel execution
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//

}
