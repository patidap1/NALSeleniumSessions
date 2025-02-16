package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserUseCases {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver = new ChromeDriver();
		// driver = new ChromeDriver();
		// driver = new ChromeDriver();

		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver = new ChromeDriver();
		driver.quit();

		// driver.quit(); - will close the most recent instance of chrome



	}

}
