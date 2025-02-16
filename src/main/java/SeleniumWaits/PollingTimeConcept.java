package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

static WebDriver driver;

	public static void main(String[] args) {
		//when page is completely loaded then only I will interact with the elements

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// polling time/interval/sleep time:
		// default polling time = 500 ms

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("werer")));
	}

}
