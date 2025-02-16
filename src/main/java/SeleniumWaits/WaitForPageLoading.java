package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.ElementUtil;

public class WaitForPageLoading {
	static WebDriver driver;

	public static void main(String[] args) {
		//when page is completely loaded then only I will interact with the elements

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		ElementUtil eleUtil = new ElementUtil(driver);

		if(eleUtil.isPageLoaded(10)) {
			System.out.println("page is fully loaded");
		}
	}

	public static boolean isPageLoaded(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		String isPageLoaded =
				wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
		return Boolean.parseBoolean(isPageLoaded);  //converts "true" to true
	}

}
