package SeleniumSessions.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		}

	public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}

	public static void doSendKeysWithPause(By locator, String value, long pauseTime) {

		Actions act = new Actions(driver);
		char val[] = value.toCharArray();

		for(char ch : val) {

			act.sendKeys(getElement(locator), String.valueOf(ch))
				.pause(pauseTime).perform();

		}
	}

}

