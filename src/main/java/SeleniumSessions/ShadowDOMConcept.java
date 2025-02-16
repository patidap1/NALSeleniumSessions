package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");

		Thread.sleep(3000);

		//browser-->Page DOM-->shadow dom(open) -->shadow dom (open) --> input#pizza

		//using JS Path:

		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(jsPath);//htmlElement --->WebElement
		pizza.sendKeys("veg pizza");

		//driver.findElement(By.id("pizza")).sendKeys("veg pizza");//NSE

		//shadown dom:
		//xpath: is not supported
		//css: only css is supported

	}

}