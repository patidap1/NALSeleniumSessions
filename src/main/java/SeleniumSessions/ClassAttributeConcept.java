package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAttributeConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login/legacy");

		// compound classes not permitted error - invalid selector exception
		// driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");

		//Invalid
		// driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");

		//Valid
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
								.sendKeys("test@gmail.com");

		//Invalid
		driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("test@gmail.com");

		//Valid
		driver.findElement(By.xpath("//input[conatins(@class, 'login-email')]")).sendKeys("test@gmail.com");

		//Valid - CSS - Compound classes with .
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"))
								.sendKeys("test@gmail.com");

		//valid
		driver.findElement(By.cssSelector("input.login-email")).sendKeys("test@gmail.com");

		//InvalidSelectorException : Invalid selector
		driver.findElement(By.xpath("//input@[@id==='username' @]")).sendKeys("test@gmail.com");

		//NoSuchElement: NSE
		driver.findElement(By.xpath("//input[@id='naveen']")).sendKeys("test@gmail.com");

	}

}
