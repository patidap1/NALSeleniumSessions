package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsExistConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total Text Fields

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> emailList = driver.findElements(By.id("input-email"));
//
//		if(emailList.size() ==1) {
//			System.out.println("email field is displayed on the page");
//		}
//		else {
//			System.out.println("email field is not displayed on the page");
//		}

		By emailId = By.id("input-email");
		System.out.println(isElementDisplayed(emailId));

		By forgotPwdLink = By.linkText("Forgotten Password");
		System.out.println(isElementDisplayed(forgotPwdLink, 2));

//		try {
//		driver.findElement(By.id("naveen")).isDisplayed();
//		}
//		catch (NoSuchElementException e) {
//			System.out.println("element is not displayed");
//		}

		By naveen = By.id("naveen");
		System.out.println(doIsElementDisplayed(naveen));


	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static boolean isElementDisplayed(By locator) {
		if(getElements(locator).size() == 1) {
			System.out.println("element is available on the page one time");
			return true;
		}
		else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public static boolean isElementDisplayed(By locator, int elementCount) {
		if(getElements(locator).size() == elementCount) {
			System.out.println("element is available on the page " +elementCount + " times");
			return true;
		}
		else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doIsElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed");
			return false;
		}
	}

}
