package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total Text Fields

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//get all the footer links and print the link text
		List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));

		System.out.println("total footer links: "+ footerList.size());

		for(WebElement e : footerList) {
			System.out.println(e.getText());
		}
	}

	//assignment  - right links --> Login....NewsLetter

}
