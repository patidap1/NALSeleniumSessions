package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageURL());

		By email = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "naveen@gmail.com");
		elUtil.doSendKeys(password, "naveen@123");

		//brUtil.quitBrowser();

	}

}