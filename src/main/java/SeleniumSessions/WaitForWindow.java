package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By orangeHRMLink = By.linkText("OrangeHRM");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickElementWhenReady(orangeHRMLink, 10);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		if(waitForWindow(2,5)) {


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

		}
		// Thread.sleep(3000);

		driver.quit();


	}
	public static boolean waitForWindow(int numberOfWindows, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			return wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindows));
		}
		catch(TimeoutException e) {
			System.out.println("Number of windows are not matched");
			return false;
		}
	}

}
