package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest {
	@Test
	public void titleTest() {
		driver.get("orangehrm.com/en/30-day-free-trial");
		String actTitle = driver.getTitle();
		System.out.println("Title ==> " + actTitle);
		Assert.assertEquals(actTitle, "30-Day Advanced Free Trial | OrangeHRM");
	}

	@Test
	public void whyOrangeHrmExistTest() {
		driver.get("orangehrm.com/en/30-day-free-trial");
		Assert.assertTrue(driver.findElement(By.linkText("Why OrangeHRM")).isDisplayed());
	}
}
