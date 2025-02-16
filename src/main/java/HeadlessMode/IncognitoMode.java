package HeadlessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);

		// Firefox
		// FirefoxOptions fo = new FirefoxOptions();
		// co.addArguments("--incognito");
		// WebDriver driver = new FirefoxDriver(fo);


		// Edge browser:
		// EdgeBrowserOptions eo = new EdgebrowserOptions();
		// co.addArguments("--incognito");
		// WebDriver driver = new FirefoxDriver(eo);




		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
