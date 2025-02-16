package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementWithXpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(3000);

		//Browser --> Page DOM --> iframe DOM --> SVG

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));

		//svg#map-svg g#regions>g

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";

		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			act.moveToElement(e).perform();

			String stateId = e.getDomAttribute("id");
			System.out.println(stateId);
		}

	}

}