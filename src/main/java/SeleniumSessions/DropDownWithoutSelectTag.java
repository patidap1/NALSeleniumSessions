package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.cardekho.com/");
		driver.manage().window().maximize();

		Thread.sleep(8000);
		driver.findElement(By.id("vehicleTypeName")).click();
		List<WebElement> vehicleTypes = driver
				.findElements(By.xpath("//div[@class='gs_ta_results width100   ']/ul/li"));
		System.out.println(vehicleTypes.size());

		List<String> vehicleTypeList = new ArrayList<>();
		for (WebElement e : vehicleTypes) {
			String text = e.getText();
			System.out.println(text);
			vehicleTypeList.add(text);
		}
	}
}
