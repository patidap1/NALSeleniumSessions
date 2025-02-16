package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// Xpath is not an attribute/property
		// address of the element in HTML DOM

		//1. absolute xpath: /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		//2. Relative Xpath: custom xpath: functions, text, axes,

		// using on attribute:
			//htmltag[@attr='value']
			// e.g. - naveen login page
			//input[@id='input-email']
			//input[@name='email']
			//input[@placeholder='E-Mail Address']

		//using two attributes:
			//htmltag[@attr1='value' and @attr2='value']
			//input[@type='submit' and @value='login']

		//using three attributes:
			//htmltag[@attr1='value' and @attr2='value' and @attr3='value']


		//input[@id] - to filter out how many elements of type id are availalbe
		//input[@id and @type]

		//text():
		//htmltag[text()='value']
		//a[text()='Forgotten Password']
		// HTML Code --> // <a href="https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten" class="list-group-item">Forgotten Password</a>

		//h1[text()='Register Account']
		//strong[text()='I am an returning customer']


		//text() and attribute together
		//htmltag[text()='value' and @attr='value']
		//htmltag[text()='value' and @attr1='value' and @attr2='value']
		//a[text()='Address Book' and @class='list-group-item']

		//contains():
		//htmltag[contains(@attr, 'value')]
			//a[contains(@href, 'route=account/recurring')]
			//input[contains(@id, 'email')]
		//htmltag[contains(@attr1, value) and @attr2='value']
		//htmltag[contains(@attr1, value) and contains(@attr2, 'value']

		//contains() with text()
		//htmltag[contains(text(), 'value')]
			//p[contains(text(), 'By creating')]
			//p[contains(text(), 'order's status')]
			//p[contains(text(), "order's status")]

		String text= driver.findElement(By.xpath("//p[contains(text(), \"order's status\")]")).getText();
		System.out.println(text);

		//contains() with text() and attribute
		//htmltag[contains(text(), 'value') and contains(@attr, 'value')]
		//a[contains(text(),'Recurring') and contains(@href,'route=account/recurring')]


		//dynamic attributes
		 //<input id="firstname_123">
		 //<input id="firstname_456">
		 //<input id="firstname_877">
		By.id("firstname_123"); //not a valid locator
		By.xpath("//input[contains(@id, 'firstname_)]");

		//starts-with():
		//htmltag[starts-with(text(), 'value')]
			//p[starts-with(text(), 'By creating')]

		//ends-with(): not available in xpath (deprecated)

		//indexing in xpath:
		//  --> (//input[@class='form-control'])[2]

		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("naveen");

		// --> (//input[@class='form-control'])[position()=3]
		// --> (//input[@class='form-control'])[last()]
		// --> (//input[@class='form-control'])[last()-1]

		// --> (//a[@class='list-group-item'])[last()]
		// --> (//a[@class='list-group-item'])[last()-1]

		//Excercise - Amazon - find xpath for 'Help'
		driver.findElement(By.xpath(("//a[@class='nav_a'])[22])")));  //help
		driver.findElement(By.xpath("//a[@class='nav_a' and text() = 'Help']"));  //help
		driver.findElement(By.xpath("(//div[@class = 'navFooterLinkCol navAccessibility'])[last()]"));  //last column
		driver.findElement(By.xpath("(//div[@class = 'navFooterLinkCol navAccessibility'])[last()]//li[@class='nav_last ']"));
		driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]"));




	}


}
