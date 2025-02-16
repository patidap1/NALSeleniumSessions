package SeleniumSessions.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));


		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

		//frame: multiple frames & iframe - for Selenium both are same
		// iframe: w3c
		// modern apps uses iframe


	}

}
