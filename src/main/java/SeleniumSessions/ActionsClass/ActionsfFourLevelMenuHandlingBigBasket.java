package SeleniumSessions.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsfFourLevelMenuHandlingBigBasket {

static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");

		Thread.sleep(5000);

		By level1Menu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2Menu = By.linkText("Beverages");
		By level3Menu = By.linkText("Tea");
		By level4Menu = By.linkText("Green Tea");

//		Actions act = new Actions(driver);
//
//		driver.findElement(level1Menu).click();
//		Thread.sleep(4000);
//		act.moveToElement(driver.findElement(level2Menu)).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(driver.findElement(level3Menu)).build().perform();
//		Thread.sleep(3000);
//		driver.findElement(level4Menu).click();

		level4MenuSubMenuHandling(level1Menu, level2Menu, level3Menu, level4Menu);

	}

	public static void level4MenuSubMenuHandling(By level1Menu, By level2Menu, By level3Menu, By level4Menu) throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(level1Menu).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level2Menu)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level3Menu)).build().perform();
		Thread.sleep(2000);
		driver.findElement(level4Menu).click();

	}

}
