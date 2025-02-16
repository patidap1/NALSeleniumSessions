package BrowserWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(5000);

		//target="_blank": it will open a new tab/window in browser when clicked/selected

		driver.findElement(By.linkText("OrangeHRM")).click();  //child window

		//1. fetch the window ids
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);

		//2. switching work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window title " + driver.getTitle());

		//close the child window:
		driver.close();

		//driver is lost:
		//switch back to the parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window tite " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
