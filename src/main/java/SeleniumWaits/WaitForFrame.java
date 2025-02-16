package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.ElementUtil;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page

		By formImage = By.cssSelector("div#imageTemplateContainer > img");
		By frame = By.xpath("//iframe[contains(@id, 'frame-one')]");
		By firstName = By.id("RESULT_TextField-8");
		By lastName = By.id("RESULT_TextField-9");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.waitForElementVisible(formImage, 10).click();

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		eleUtil.waitForFrameByLocatorAndSwitchToIt(frame, 10);


		eleUtil.waitForElementPresence(firstName, 10).sendKeys("Test Automation");
		eleUtil.doSendKeys(lastName, "selenium");

		driver.switchTo().defaultContent();
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);

	}

	public static void waitForFrameByLocatorAndSwitchToIt(By frameLocator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public static void waitForFrameByIndexAndSwitchToIt(int frameIndex, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static void waitForFrameByLocatorAndSwitchToIt(String frameIDorName, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDorName));
	}

	public static void waitForFrameByLocatorAndSwitchToIt(WebElement frameElement, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

}
