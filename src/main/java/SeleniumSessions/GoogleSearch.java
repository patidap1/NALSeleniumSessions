package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");

		doSearch(searchField, suggestions, "naveen automation labs", "youtube");

		Thread.sleep(5000);

	}

	public static void doSearch(By searchField, By suggestions, String searchKey, String actualValue)
			throws InterruptedException {
		getElement(searchField).sendKeys(searchKey);
		Thread.sleep(2000);

		List<WebElement> suggList = getElements(suggestions);
		System.out.println(suggList.size());
		boolean flag = false;

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("interview questions")) {
				e.click();
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(actualValue + " is available and clicked");
		} else {
			System.out.println(actualValue + " is not available and not clicked");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
