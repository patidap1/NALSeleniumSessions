package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OpenCartTest extends BaseTest{
	
	@Test
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	
	@Test
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	
	

}