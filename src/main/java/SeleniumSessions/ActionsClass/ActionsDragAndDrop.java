package SeleniumSessions.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetele = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		//all the actions method returning the Actions only -- builder pattern
		//build--> Action (I)
		//perform -- void

//		act
//			.clickAndHold(sourceEle)
//				.moveToElement(targetele)
//					.release()
//							.build()
//									.perform();

		Action myAction = act
							.clickAndHold(sourceEle)
									.moveToElement(targetele)
											.release()
													.build();

		myAction.perform();


		//act.dragAndDrop(sourceEle, targetele).build().perform();

	}

}