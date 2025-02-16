package HeadlessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		// Headless: no browser is visible
		// faster then the normal mode
		// use case - CI CD  - Jenkins linux, Docker
		// avoit it, this is not a real time user journey



		// toggle: true/false
		//phantomJS - ghostdriver: deprecated
		//HTMLUnitDriver: is external library: pom.xml



		// ChromeOptions co = new ChromeOptions();

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);


		//co.addArguments("--headless");
		// WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
