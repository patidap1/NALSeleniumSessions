package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchBrowser {

	public static void main(String[] args) {
		//Windows:
		//system.setProperty(webdriver.chrome.driver", "")

		//Mac/linux: selenium 3.x
		//system.setProperty(webdriver.chrome.driver", "")

		//selenium 4.6.x+ - Selenium Manager : SM

		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\patid\\.cache\\selenium\\chromedriver\\win64\\131.0.6778.85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
