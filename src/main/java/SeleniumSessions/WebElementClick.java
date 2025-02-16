package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClick {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By fullName = By.id("Form_getForm_Name");
		By emailId = By.id("Form_getForm_Email");
		By phone = By.id("Form_getForm_Contact");
		By getYourFreeTrial = By.id("Form_getForm_action_submitForm");
		By header = By.className("form-title");

//		driver.findElement(fullName).sendKeys("naveen");
//		driver.findElement(emailId).sendKeys("naveen@gmail.com");
//		driver.findElement(phone).sendKeys("9845345343");
//		driver.findElement(getYourFreeTrial).click();

		doSendKeys(fullName, "naveen");
		doSendKeys(emailId, "naveen@gmail.com");
		doSendKeys(phone, "345345345");
		doClick(getYourFreeTrial);

		//String headerText = driver.findElement(header).getText();

		String headerText = doElementGetText(header);
		System.out.println(headerText);
	}


			public static String doElementGetText(By locator) {
				return getElement(locator).getText();
			}


			public static void doClick(By locator) {
				getElement(locator).click();
			}

			public static void doSendKeys(By locator, String value) {
				getElement(locator).sendKeys(value);
			}

			public static WebElement getElement(By locator) {
				return driver.findElement(locator);
			}

	}



