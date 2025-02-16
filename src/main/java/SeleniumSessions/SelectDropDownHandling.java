package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	//drop down --> htmltag = <select> --> <option>
	//Select class: default class in Selenium to handle dropdown

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		WebElement countryEle = driver.findElement(country);

		Select select = new Select(countryEle);

		//select.selectByIndex(5);
		//select.selectByVisibleText("Australia");
		//select.selectByValue("Brazil");
		select.selectByContainsVisibleText("Herzegowina");
	}

}