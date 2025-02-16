package SeleniumSessions.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Actions act = new Actions(driver);

		//partial scrolling:
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//
//		Thread.sleep(3000);
//
//		act.sendKeys(Keys.PAGE_UP).perform();

		//scroll to the footer of the page
		//windows:
		//Keys.CONTROL
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(3000);
//		//scroll to the top of the page
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();


		//scroll to the element:
		act.scrollToElement(driver.findElement(By.linkText("OpenCart")))
					.pause(200)
						.click(driver.findElement(By.linkText("OpenCart")))
							.build()
								.perform();
	}
}