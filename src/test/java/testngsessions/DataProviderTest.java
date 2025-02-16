package testngsessions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	//dp - test data
	@DataProvider()
	public Object[][] getTestData() {
		return new Object[][] {
			{4,  5,   9},
			{3,  4,   8},
			{-4, -4, -8},
			{0,  3,   3}
		};
	}


	//TDD - Test Driven Development
	//tc with different test data -- data driven test approach : Parameterization
	@Test(dataProvider = "getTestData")
	public void addTest(int num1, int num2, int expSum) {
		int actSum = add(num1, num2);
		Assert.assertEquals(actSum, expSum);
	}

	//functionality
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
