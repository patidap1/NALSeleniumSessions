package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDomAttributesConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		WebElement emailIdEle = driver.findElement(By.id("input-email"));
//
////		String placeholderValue = emailIdEle.getAttribute("placeholder"); //deprecated
////		System.out.println(placeholderValue);
//
//		String placeholderValue = emailIdEle.getDomAttribute("placeholder");
//		System.out.println(placeholderValue);
//
//		String outerHtmlVal = emailIdEle.getDomProperty("outerHTML");
//		System.out.println(outerHtmlVal);
//
//		System.out.println("------------");
//
//		emailIdEle.sendKeys("naveen@gmail.com");
//		// String emailText = emailIdEle.getText(); // to retrieve entered value - gettext will not work
//		// String emailText = emailIdEle.getDomAttribute("value"); // blank value
//		String emailText = emailIdEle.getDomProperty("value"); //naveen@gmail.com
//
//		System.out.println(emailText);

		//dom-value
		//property - value

		By emailId = By.id("input-email");
		System.out.println(doGetDomAttribute(emailId, "placeholder"));

		getElement(emailId).sendKeys("naveen@gmail.com");
		System.out.println(doGetDomProperty(emailId, "value"));
	}

	public static String doGetDomAttribute(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}

	public static String doGetDomProperty(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


}
