package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is: " + browserName);

		switch (browserName.trim().toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			throw new RuntimeException("====Invalid browser=======");
		}

		return driver;
	}

	public void launchUrl(String url) {
		if(url == null) {
			throw new RuntimeException ("====url can not be null======");
		}

		if(url.length() == 0) {
			throw new RuntimeException ("====url can not be blank or empty");
		}

		if(url.indexOf("http")==0) {
			driver.get(url);
		}
		else {
			throw new RuntimeException("=====invalid url: http/s is missing in the url======");
		}
	}

	public void launchUrl(URL url) {
		if(url == null) {
			throw new RuntimeException ("====url can not be null======");
		}

		if(String.valueOf(url).indexOf("http")==0) {
			driver.navigate().to(url);
		}
		else {
			throw new RuntimeException("=====invalid url: http/s is missing in the url======");
		}


	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title: " + title);
		return title;
	}
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url: " + url);
		return url;
	}

	public void closeBrowser() {
		System.out.println("browser is closed");
		driver.close();
	}

	public void quitBrowser() {
		System.out.println("browser is quit");
		driver.quit();
	}

}
