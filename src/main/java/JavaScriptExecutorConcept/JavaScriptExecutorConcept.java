package JavaScriptExecutorConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//WebDriver -- I
		//JavascriptExecutor -- I

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		jsUtil.generateJSAlert("login page is displayed");

//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Import & Export")) {
//			System.out.println("PASS");
//		}
//
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();

//		WebElement forgotPWdLink = driver.findElement(By.linkText("Forgot Password?"));
//		jsUtil.scrollIntoView(forgotPWdLink);
//
//		jsUtil.drawBorder(forgotPWdLink);
//
//		WebElement loginForm = driver.findElement(By.id("loginForm"));
//		jsUtil.drawBorder(loginForm);

//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		jsUtil.flash(emailId);
//		emailId.sendKeys("test@gmail.com");
//
//		jsUtil.flash(password);
//		password.sendKeys("test@gmail.com");


//		WebElement forgotPwd = driver.findElement(By.linkText("Forgotten Password"));
//		jsUtil.clickElementByJS(forgotPwd);
		//normal click is not working ---> use Actions click ---> JS Click

		jsUtil.sendKeysByJSUsingId("input-email", "naveen@test.com");

//		document.querySelector('#id'); -- this for css selector
//		document.evaluate("//input[@id='input-email']", document, null, XPathResult.ANY_TYPE, null); -- xpath

	}

}