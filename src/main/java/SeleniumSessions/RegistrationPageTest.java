package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstname = By.id("input-firstname");
		By lastname = By.name("lastname");
		By search = By.className("form-control");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By passwordconfirm = By.cssSelector("#input-confirm");
		By policyCheck = By.name("agree");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successMsg = By.tagName("h1");
		By myAccountLink = By.linkText("My Account");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstname, "Naveen");
		eleUtil.doSendKeys(lastname, "automation");
		eleUtil.doSendKeys(search, "macbook");
		eleUtil.doSendKeys(email, "naveen@42114.com");
		eleUtil.doSendKeys(telephone, "98772342342");
		eleUtil.doSendKeys(password, "naveen@123");
		eleUtil.doSendKeys(passwordconfirm, "naveen@123");
		eleUtil.doClick(policyCheck);
		Thread.sleep(5000);


		eleUtil.doClick(continueBtn);
		String successMessage = eleUtil.doElementGetText(successMsg);
		System.out.println(successMessage);

		if(successMessage.contains("Your Account Has Been Created")) {
			System.out.println("user is created -- pass");
		} else {
			System.out.println("user registration is failed");
		}

		eleUtil.doClick(myAccountLink);

	}

}
