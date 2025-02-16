package BrowserWindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(5000);

		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='facebook logo']")).click();
		driver.findElement(By.xpath("//img[@alt='linkedin logo']")).click();
		driver.findElement(By.xpath("//img[@alt='youtube logo']")).click();

		Set<String> handles = driver.getWindowHandles();

		for (String windowId : handles) {
			driver.switchTo().window(windowId);
			System.out.println("windows url: " +driver.getCurrentUrl());
			Thread.sleep(2000);

			if(!windowId.equals(parentWindowId)){
			driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title: " + driver.getTitle());
	}

}
