package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})

	public void loginTest() {
		System.out.println("login test");
		int i = 9/0; //AE
		ExpectedExceptionConcept obj = null;
		obj.name = "tom"; //NPE
	}

	//Don't do this -- may be used for demo only -- in case of needed to be passed

//	@Test(expectedExceptions = Exception.class)
//	public void aTest() {
//		System.out.println("a test");
//		int i = 9/0; //AE
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void bTest() {
//		System.out.println("b test");
//		int i = 9/0; //AE
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void cTest() {
//		System.out.println("c test");
//		int i = 9/0; //AE
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void dTest() {
//		System.out.println("d test");
//		int i = 9/0; //AE
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void eTest() {
//		System.out.println("e test");
//		int i = 9/0; //AE
//	}

}
