package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownValueWithoutSelectClassMethods {

	static WebDriver driver;

	public static void main(String[] args) {
		// not allowed to use 3 methods of select class [by value, by index, by visibletext]

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		selectValueFromDropDown(country, "India");
		//selectValueFromDropDown(country, "Brazil");


	}

	public static void selectValueFromDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		boolean flag = false;

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				flag = true;
				break;
			}
		}

		if(flag) {
			System.out.println(value + " is available and selected");
		}
		else {
			System.out.println(value + " is not available");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}