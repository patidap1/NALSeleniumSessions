package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		try {
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		}
		catch(NoSuchElementException e) {
			//wait for the element
		}

		//NoSuchElementException: NSE
		//ElementNotFoundException: NA
	}
}
