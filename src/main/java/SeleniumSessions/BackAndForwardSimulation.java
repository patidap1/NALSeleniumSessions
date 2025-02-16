package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardSimulation {

	public static void main(String[] args) throws MalformedURLException  {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle()); //Google

		// driver.navigate().to("https://www.amazon.com/"); //both works in the same way
		driver.navigate().to(new URL("https://www.google.com/"));

		// driver.get("https://www.amazon.com/"); // .get also maintain history and back and forward works here too
		System.out.println(driver.getTitle()); //Amazon

		driver.navigate().back();
		System.out.println(driver.getTitle()); //Google

		driver.navigate().forward();
		System.out.println(driver.getTitle()); //Amazon

		driver.navigate().back();
		System.out.println(driver.getTitle()); //Google

		//get() vs to():
		//both are same
		//to(0 is calling get(0 method internally
		//to() is overloaded: to(String url) and to (URL url)   (get only allows String type)
		//get(String url)


	}

}
