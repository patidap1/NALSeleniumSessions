package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		//Wait(I): until();
				//-----> FluentWait(C): until(){} + other individual methods
												//----> WebDriverWait(C): no individual methods + inherited methods


			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

			By fn = By.id("input-firstname");

//			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//											.withTimeout(Duration.ofSeconds(10))
//											.pollingEvery(Duration.ofSeconds(2))
//											.ignoring(NoSuchElementException.class)
//											.ignoring(StaleElementReferenceException.class)
//											.withMessage("====element is not found====");


			//WebDriverWait with FluentWait Features
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.pollingEvery(Duration.ofSeconds(2))
//						.ignoring(NoSuchElementException.class)
//							.withMessage("====element is not found====");


			//wait.until(ExpectedConditions.visibilityOfElementLocated(fn)).sendKeys("testing");

			waitForElementVisibleUsingFluentFeatures(fn, 2, 10).sendKeys("testing");

	}


	public static WebElement waitForElementVisibleUsingFluentFeatures(By locator, long timeOut, long pollingTime) {

		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("====element is not found====");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}



}

