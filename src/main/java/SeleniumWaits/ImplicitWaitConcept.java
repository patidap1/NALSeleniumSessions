package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Sel 3.x depricated

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x

		//1. Global wait
		//2. This is only for Web Elements
		//3. Once it is applied, it will be applied for all the upcoming WebElements
		//4. It can not be applied for a specific element, explicity wait can not be applied for a WebElement
		//5. It can not be applied for non WebElements: title, url, alerts, window

		//webelement
		driver.findElement(By.id("input-firstname")).sendKeys("testing");
		//e2
		//e3
		//e4

		//home page: 5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e5, e6, e7

		//registration page: 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//e2, e3, e4

		//forgot pwd page: 0 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));


		//for alerts:
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert();

	}

}
