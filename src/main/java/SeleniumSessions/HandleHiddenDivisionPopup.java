package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.yatra.com/");
	Thread.sleep(5000);

	driver.switchTo().alert().accept();

	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='css-rd021u']//div[@class='MuiBox-root css-0']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@aria-label='Choose Friday, December 27th, 2024']")).click();
	}

}
