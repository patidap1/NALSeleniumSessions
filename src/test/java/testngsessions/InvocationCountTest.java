package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10)
	public void createUser() {
		System.out.println("Create user");
	}

}
