package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {
static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By footer = By.xpath("//footer//a");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// List<WebElement> footerList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));

		//An expectation for checking that all elements present on the web page that match the locatorare visible.
		// Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.

		List<WebElement> footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));

		System.out.println(footerList.size());
		for(WebElement e : footerList) {
			System.out.println(e.getText());
		}


	}

	public static List<WebElement> waitForElementsPresence(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public static List<WebElement> waitForElementsVisible(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
