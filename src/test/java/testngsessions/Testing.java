package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void addMethod() {
		System.out.println("addMethod");
		int a = 40;
		int b = 20;
		int sum = a + b;
		Assert.assertEquals(sum, 60, "both are not equal");
	}

	@Test
	public void divMethod() {
		System.out.println("divMethod");
		int a = 40;
		int b = 20;
		int sum = a + b;
		Assert.assertEquals(sum, 60, "both are not equal");
	}


	@Test
	public void mulMethod() {
		System.out.println("mulMethod");
		int a = 40;
		int b = 20;
		int sum = a + b;
		Assert.assertEquals(sum, 60, "both are not equal");
	}

}
