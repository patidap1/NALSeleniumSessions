package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));


		String name = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Lab");
		String space = " ";

		//String, StringBuilder, StringBuffer

		firstName.sendKeys(name, space, sb, space,  sf, space, "selenium");
		// lastName.sendKeys(null);  //Exception - SendKeys() does not accept Null as input - gives exception



	}

}
