package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// Total links - <a> tag
		// print the text of each link

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));  //no actions here - return list of web elements

		System.out.println("total Links : " + allLinks.size());

		for (WebElement link : allLinks) {
			String linkText = link.getText();
				if(linkText.length()!=0) {
					System.out.println(linkText);
				}
		}

		System.out.println("-----------------------");

		for(WebElement e : allLinks) {
			String textLink = e.getText();
			if(textLink.length()!=0) {
				System.out.println(textLink);
			}
		}

	}

}
