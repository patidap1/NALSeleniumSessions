package testngsessions;

import org.testng.annotations.Test;

	//TCs should be independent
	//AAA -> Arrange Act Assert

public class DependsOnMethod {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/3;
	}

	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("hom test");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "homeTest")
	public void cartTest() {
		System.out.println("cart test");
	}
}
