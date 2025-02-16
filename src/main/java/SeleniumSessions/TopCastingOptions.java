package SeleniumSessions;

public class TopCastingOptions {

	public static void main(String[] args) {
		//Top casting options:

		//0th - not topcasting - valid but only for specific browser - local executions only
		//ChromeDriver driver = new ChromeDriver(); //only for chrome
		//FirefoxDriver driver = new FirefoxDriver(); //only for firefox


		//1. Valid and Recommended  -- local executions - cross browser
		// Child class object referring by the parent reference variable
//		WebDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
		// driver.get("https://www.google.com");
		// driver.quit();

		//2. SearchContext = new ChromeDriver
		//valid but not recommended
		// SearchContext driver = new ChromeDriver();

		//3. RemoteWebDriver = new CD() -- local executions - cross browser
		// Valid and Recommended
		// RemoteWebDriver driver = new ChromeDriver();

		//4. WebDriver = new RemoteWebDriver()
		//valid and recommended  -- remote
		//only to run test cases on remote machine - grid, server, docker, cloud, machine
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		//5. SearchContext = new RemoteWebDriver
		// valid but not recommended
		// SearchContext driverContext = new RemoteWebDriver(remoteAddress, capabilities);

		//6.
		//Valid but not recommended
//		ChromiumDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		driver = new FireFoxDriver():    // not accessible


	}

}
