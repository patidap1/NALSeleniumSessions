package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String email_id = "input-email";
		String password_id = "inpu-password";
		String login_btn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";

		//7th approach
//		doSendKeys(getLocator("ID", email_id), "naveen@gmail.com");
//		doSendKeys(getLocator("ID", password_id), "naveen@123");
//		doClick(getLocator("XPATH", login_btn_xpath));

		//8th approach
		doSendKeys("ID", email_id, "naveen@gmail.com");
		doSendKeys("ID", password_id, "naveen@123");
		doClick("XPATH", login_btn_xpath);

	}


	public static WebElement getElement(By locator) { //call by reference
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// Overloaded with String Locator
	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getLocator(locatorType, locatorValue)).sendKeys(value);
	}


	public static void doClick(By locator) {
		getElement(locator).click();
	}
	//Overloaded method
	public static void doClick(String locatorType, String locatorValue) {
		getElement(getLocator(locatorType, locatorValue)).click();
	}


	public static By getLocator(String locatorType, String locatorValue) {
		By locator = null;

		switch(locatorType.toUpperCase().trim()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.id(locatorValue);
			break;
		case "CLASSNAME":
			locator = By.id(locatorValue);
			break;
		case "XPATH":
			locator = By.id(locatorValue);
			break;
		case "CSS":
			locator = By.id(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.id(locatorValue);
			break;
		case "TAGNAME":
			locator = By.id(locatorValue);
			break;


		default:
			System.out.println("invalid locator, please use the right locator...");
			break;

		}
		return locator;

	}
}
