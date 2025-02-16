package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//8 types of locators available

		//1. id: attribute   - I
		// We go with the 'id' if both ('id' and 'name') are available since it is unique
		driver.findElement(By.id("input-firstname")).sendKeys("Naveen");

		//2. name: attribute -  Can be duplicate  - II
		driver.findElement(By.name("lastname")).sendKeys("testing");

		//3. classname: class attribute : can be duplicate   - III
		// driver.findElement(By.className("form-control")).sendKeys("naveen@gmail.com");

		//4. xpath: is not an attribute, it's a locator - address of element in html DOM
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("2143223245");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("naveen@gmail.com");

		//5. css selector: is not an attribute, it's a locator -
		driver.findElement(By.cssSelector("#input-password")).sendKeys("naveen@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("naveen@123");

		//6. linkText: only for links: htmltag = <a> refers to a link (anchor link)
		driver.findElement(By.linkText("Login")).click();
		// driver.findElement(By.linkText("Register")).click();

		//7. partialLinkText: only for links: htmltag = <a>  use when there is a long link text present on the page
		//Forgotten Username
		//Forgotten Password
		driver.findElement(By.partialLinkText("Forgotten")).click();

		//8. tagName: htmltag: should be unique
		String forgotPwdHeader = driver.findElement(By.tagName("h1")).getText();
		System.out.println(forgotPwdHeader);
	}

}
