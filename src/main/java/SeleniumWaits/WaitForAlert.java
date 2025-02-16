package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement alertEle = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alertEle.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//will wait for the alert and switch to the alert automatically - no need to write switchTo()

		String text = alert.getText();
		System.out.println(text);
		alert.accept();


	}

	public static Alert waitForAlert(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(long timeout) {
		return waitForAlert(timeout).getText();
	}

	public static void acceptAlert(long timeout) {
		waitForAlert(timeout).accept();
	}

	public static void dismissAlert(long timeout) {
		waitForAlert(timeout).dismiss();
	}

	public static void alertSendKeys(String text, long timeout ) {
		waitForAlert(timeout).sendKeys(text);
	}


}