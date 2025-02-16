package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");

		// type=file
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\patid\\Desktop\\JAVA_SELENIUM_NOTES\\YT_PrashantJain\\Java_Complete_Youtube-main\\.classpath");


		//Robot Class: only for Windows
		//AutoIT: only for Windows
		//Sikuli lib: based on image processing

	}

}
