package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinksHrefvValues {

	static WebDriver driver;

	public static void main(String[] args) {

		//total links: <a>
		//print the href attribute value of each link

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));  //no actions here - return list of web elements
		List<WebElement> allImages = driver.findElements(By.tagName("img"));

		System.out.println("------links href data-----------");

		for(WebElement e: allLinks) {
			String hrefVal = e.getDomAttribute("href");
			System.out.println(hrefVal);
		}

		//excercise -- capture all the image - src values
		//web scraping
		System.out.println("------images data-----------");

		for(WebElement e: allImages) {
			String srcVal = e.getDomAttribute("src");
			System.out.println(srcVal);
		}
	}

}
