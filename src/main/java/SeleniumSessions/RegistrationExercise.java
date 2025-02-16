package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationExercise {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confPassword = By.id("input-confirm");
		By policyCheck = By.name("agree");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By myAccount = By.xpath("//*[@id=\"column-right\"]/div/a[1]");


		doSendKeys(firstName, "Pans");
		doSendKeys(lastName, "Patidar");
		doSendKeys(email, "pawa@gmail.com");
		doSendKeys(telephone, "98873504583");
		doSendKeys(password, "Diebold@123");
		doSendKeys(confPassword, "Diebold@123");
		doClick(policyCheck);
		doClick(continueBtn);
		doClick(myAccount);


//		driver.findElement(By.id("input-firstname")).sendKeys("Pawan");
//		driver.findElement(By.id("input-lastname")).sendKeys("Patidar");
//		driver.findElement(By.id("input-email")).sendKeys("pawan@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9887350583");
//		driver.findElement(By.id("input-password")).sendKeys("P@ssw0rd");
//		driver.findElement(By.id("input-confirm")).sendKeys("P@ssw0rd");
//
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).click();

		Thread.sleep(5000);

		driver.quit();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

}


