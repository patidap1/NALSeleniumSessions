package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total images : <img>

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		List<WebElement> allImages = driver.findElements(By.tagName("img"));  //no actions here - return list of web elements

		System.out.println("total images: "+ allImages.size());


	}

}
