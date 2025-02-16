package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		//By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		By options = By.cssSelector("select#Form_getForm_Country > option");

		List<WebElement> optionsList = driver.findElements(options);

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("India")) {
				e.click();
				break;
			}
		}

	}



}