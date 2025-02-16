package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpsHandling {

	public static void main(String[] args) throws InterruptedException {

		//alert JS pop up:
		//alert: normal text
		//confirm: are you sure?
		//prompt: only single input field

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		WebElement alertEle = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//
//		alertEle.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//		System.out.println(text);
//
//		alert.accept();//click on ok button
//		//alert.dismiss();//dismiss the alert

		//
//		WebElement confirmEle = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//
//		confirmEle.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept();//click on ok button
//		alert.dismiss();//dismiss the alert


		//
		WebElement promptEle = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

		promptEle.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("test automation selenium");
		alert.accept();//click on ok button
		//alert.dismiss();//dismiss the alert



	}

}