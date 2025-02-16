package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement firstname_ele = wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
		firstname_ele.sendKeys("naveen");


		waitForElementPresence(firstname, 10);

		driver.findElement(lastname).sendKeys("automation");

		//page: 25 elements
		//1st: 10 sec: webDriver wait
		//2nd to 20th : no waits

	}

	public static WebElement waitForElementPresence(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
