package SeleniumSessions.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		Thread.sleep(10000);
//
//		driver.manage().window().maximize();
//
//		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
//
//		WebElement visaServices = driver.findElement(By.xpath("dic[text()='Visa Services']"));
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(addons).build().perform();

		//act.moveToElement(addons).perform();


		//a1.build.perform  -- correct
		//a1.build  -- will not work
		//a1.perform  -- correct
		//a1 -- will not work

//		Thread.sleep(2000);
//
//		visaServices.click();
		By addonsLoc = By.xpath("//div[text()='Add-ons']");
		By visaServicesLoc = By.xpath("dic[text()='Visa Services']");


	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleTwoLevelMenuSubMenuHandling(By parentMenuLocator, By childMenuLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		getElement(childMenuLocator).click();

	}

}
