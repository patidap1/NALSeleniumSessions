package BrowserWindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial"); //parent window
		String parentWindowId = driver.getWindowHandle();

		//selenium 4.x
		driver.switchTo().newWindow(WindowType.TAB); //open a new blank tab and switch automatically to it

		driver.switchTo().newWindow(WindowType.WINDOW); //open a new blank window and switch automatically to it

		driver.get("https://www.google.com");
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("main window title: " + driver.getTitle());


		//cmd+click on a link

	}

}
