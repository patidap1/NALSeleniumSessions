package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsHandle {

	public static void main(String[] args) {

		// ::before
		// ::after
		// ::has
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String scriptMandatory = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		String scriptColor = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color');";

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(scriptMandatory).toString();
		System.out.println(content);

		if(content.contains("*")) {
			System.out.println("FN element is a mandatory field");
		}

		String color = js.executeScript(scriptColor).toString();
		System.out.println(color);



	}
}