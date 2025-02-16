package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		By choiceDropDown = By.id("justAnInputBox");
		By choices = By.xpath(
				"//h3[text()='Multi Selection']/following-sibling::div//ul//span[contains(@class, 'comboTreeItemTitle')]");

		// tc1 L single choice
		// selectChoice(choiceDropDown, choices, "choice 3");

		// tc2: multiple choices
		// selectChoice(choiceDropDown, choices, "choice 3", "choice 2", "choice 2 2", "choice 7");

		// tc3: all choices
		selectChoice(choiceDropDown, choices, "all");

	}

	/**
	 * This method is handling single/multiple and all choices selection, Please
	 * pass "all" to select all the choices selectChoice(choiceDropDown, choices,
	 * "all")
	 * @param choiceDropDown
	 * @param choices
	 * @param choiceValue
	 * @throws InterruptedException
	 */
	public static void selectChoice(By choiceDropDown, By choices, String... choiceValue) throws InterruptedException {
		driver.findElement(choiceDropDown).click();

		List<WebElement> choicesList = driver.findElements(choices);
		System.out.println(choicesList.size());

		Thread.sleep(4000);

		if (choiceValue[0].equalsIgnoreCase("all")) {
			// select all the choices one by one
			for (WebElement e : choicesList) {
				e.click();
			}
		}

		else {
			for (WebElement e : choicesList) {
				String text = e.getText();
				System.out.println(text);
				for (String ch : choiceValue) {
					if (text.equals(ch)) {
						e.click();
					}
				}

			}
		}

	}

}
