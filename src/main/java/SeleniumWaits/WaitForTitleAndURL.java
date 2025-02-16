package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String title = driver.getTitle();
//		System.out.println(title);//Loading....

		String title = waitForTitleContains("Register", 5);
		System.out.println(title);

		title = waitForTitleIs("Register Account", 5);
		System.out.println(title);
	}

	public static String waitForTitleContains(String fractionTitle, long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleContains(fractionTitle))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title is not found after " + timeOut + " seconds");
		}

		return null;

	}

	public static String waitForTitleIs(String title, long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title is not found after " + timeOut + " seconds");
		}

		return null;

	}

}