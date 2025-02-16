package testngsessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//global pre conditions
	//pre-conditions
	//test cases = test steps ==> actual vs expected results
	//post steps
	//post global steps

	//before -- test(A)  -- after

	/**
	BS - ConectedWithDB
	BT - CreateUser
	BC - LanuchBrowser

		BM - logintoApp
		Search test
		AM - logout

		BM - logintoApp
		Title test
		AM - logout

		BM - logintoApp
		URL test
		AM - logout

	AC - close browser
	AT - Delete User
	AS - disconectDB
	*/

	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - ConectedWithDB");
	}

	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT - CreateUser");
	}

	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - LanuchBrowser");
	}

	//4  //7  //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM - logintoApp");
	}

	//8
	@Test
	public void titleTest() {
		System.out.println("Title test");
		Assert.assertEquals(false, true);
	}


	//11
	@Test
	public void urlTest() {
		System.out.println("URL test");
		Assert.assertEquals(true, true);
	}

	//5 - if no priority given it picks alphabetically
	@Test
	public void searchTest() {
		System.out.println("Search test");
		Assert.assertEquals(false, true);
	}

	//6  //9  //12
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}

	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - close browser");
	}

	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - Delete User");
	}


	//15
	@AfterSuite
	public void disconnetDB() {
		System.out.println("AS - disconectDB");
	}
}
