package mytests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "Google");
	}

	//@Ignore
	@Test(enabled = false, priority = 2)
	public void urlTest() {
		String actURL = driver.getCurrentUrl();
		System.out.println("URL==>" + actURL);
		Assert.assertTrue(actURL.contains("google"));
	}

}