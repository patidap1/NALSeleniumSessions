package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); //session id - 123 // 2. Enter URL:
		 * driver.get("https://www.google.com"); // 3. Get the page title String title =
		 * driver.getTitle(); //session id - 123 System.out.println("Page Title = " +
		 * title);
		 *
		 * // 4. get URL String url = driver.getCurrentUrl(); //session id - 123
		 * System.out.println("page url: " + url);
		 *
		 * // 5. Close the browser driver.quit(); //session id - 123
		 *
		 *
		 * driver = new ChromeDriver(); //session id - 456
		 * driver.get("https://www.google.com"); //session id - 456
		 *
		 * System.out.println(driver.getTitle()); //session id - 456, Session id = null
		 * without line 24,25
		 */
		//close
		WebDriver driver = new ChromeDriver(); //session id - 123
		// 2. Enter URL:
		driver.get("https://www.google.com");
		// 3. Get the page title
		String title = driver.getTitle(); //session id - 123
		System.out.println("Page Title = " + title);

		// 4. get URL
		String url = driver.getCurrentUrl(); //session id - 123
		System.out.println("page url: " + url);

		// 5. Close the browser
		driver.close();  //session id - 123

		// sid == //NoSuchSesssionException: Invalid session id

		driver = new ChromeDriver(); //456
		driver.get("https://www.google.com"); //456
		title = driver.getTitle(); //456
		System.out.println(title);

	}

}
