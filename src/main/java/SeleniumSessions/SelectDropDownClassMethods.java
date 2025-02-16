package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownClassMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		WebElement countryEle = driver.findElement(country);

		Select select = new Select(countryEle);

		String text = select.getFirstSelectedOption().getText();
		System.out.println(text);




	}

}