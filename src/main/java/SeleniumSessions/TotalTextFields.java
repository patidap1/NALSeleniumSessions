package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total Text Fields

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> allTextFields = driver.findElements(By.className("form-control"));

		List<WebElement> regFields = driver.findElements(By.xpath("//form//input[@class='form-control']"));

		System.out.println(allTextFields.size());  //7
		System.out.println(regFields.size()); //6

	}

}
