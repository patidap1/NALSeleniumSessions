package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// Manual test cases:
		// 1. open browser(chrome, ff, safari, edge)
		ChromeDriver driver = new ChromeDriver();
		// 2. Enter URL:
		driver.get("https://www.google.com");
		// 3. Get the page title
		String title = driver.getTitle();
		System.out.println("Page Title = " + title);
		// 4. Verify the actual title is as expected
		// validation point/checkpoint
		if (title.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.err.println("FAIL");
		}
		// 5. Close the browser
		driver.quit();
	}

}
