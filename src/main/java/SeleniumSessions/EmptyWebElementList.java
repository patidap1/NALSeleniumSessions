package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyWebElementList {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total Text Fields

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> myList = driver.findElements(By.className("naveen"));

		System.out.println(myList); //[]
		System.out.println(myList.size()); //0



	}

}
