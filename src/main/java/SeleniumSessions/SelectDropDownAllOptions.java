package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		if(getDropDownOptionsCount(country) == 233) {
			System.out.println("count is correct");
		}

		List<String> countryOptionsList = getDropDownOptionsTextList(country);
		System.out.println(countryOptionsList);
		System.out.println(countryOptionsList.contains("India"));

	}

	public static void printDropDownOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("options size: " + optionsList.size());

		List<String> optionsValueList = new ArrayList<>();// []
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOptionsList = select.getOptions();
		System.out.println("options size: " + countryOptionsList.size());
		return countryOptionsList.size();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}