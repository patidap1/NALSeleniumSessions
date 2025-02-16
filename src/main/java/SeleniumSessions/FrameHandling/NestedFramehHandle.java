package SeleniumSessions.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramehHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-scenario/"); //page

		String header = driver.switchTo().frame("pact1")
				.switchTo().frame("pact2")
					.switchTo().frame("pact3")
							.switchTo().parentFrame()
									.switchTo().parentFrame()
											.switchTo().defaultContent()
												.findElement(By.tagName("h3"))
													.getText();

		/*
		driver.switchTo().frame("pact1"); //f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");

		driver.switchTo().frame("pact2"); //f2
		driver.findElement(By.id("jex")).sendKeys("automation");

		driver.switchTo().frame("pact3"); //f3
		driver.findElement(By.id("glaf")).sendKeys("Google");

		//f3->F2
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" framework");

		//f2->f1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(" scenarios");

		//f1->main page (dc-Default Content)
		//driver.switchTo().defaultContent();
		//f1->page(PF) - parent frame
		driver.switchTo().parentFrame(); //if parent is browser page, then it will go back to the browser page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);


		//page -> f2: invalid
		//driver.switchTo().frame("pact2"); //returns error - can not switch directly to frame2
		//driver.findElement(By.id("jex")).sendKeys("failed");

		//page -> f1
		driver.switchTo().frame("pact1"); //f1
		driver.findElement(By.id("inp_val")).sendKeys(" testing");

		//f1 -> f3: invalid
		//driver.switchTo().frame("pact3"); //f3 //returns error - no frame element found
		//driver.findElement(By.id("glaf")).sendKeys("IBM");

		//page -> f1: yes
		//f1 -> f2: yes
		//f2 -> f3: yes
		//page -> f2: no
		//page -> f3: no
		//page--> F1->f2->f3: yes

		//f3 -> f2: yes
		//f2 -> f1: yes
		//f1 -> page: yes(PF, DC)
		//f3 -> f2(PF)->f1(PF)
		//f3 -> page: yes (DC)

		driver.switchTo().frame("pact2"); //f2
		driver.findElement(By.id("jex")).sendKeys(" labs");

		driver.switchTo().frame("pact3"); //f3
		driver.findElement(By.id("glaf")).sendKeys(" microsoft");

		//f3 -> page(DC): valid
		driver.switchTo().defaultContent();
		header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);


		//driver.close();
		//driver.quit();
		 * */
	}

}
