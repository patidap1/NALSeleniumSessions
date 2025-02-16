package testngsessions;

import org.testng.annotations.Test;

	//TCs should be independent
	//AAA -> Arrange Act Assert
public class PriorityTest {

	@Test(priority = 0)
	public void aTest() {
		System.out.println("a test");
	}

	@Test
	public void bTest() {
		System.out.println("b test");
	}

	@Test
	public void cTest() {
		System.out.println("c test");
	}

	@Test(priority = 5)
	public void dTest() {
		System.out.println("d test");
	}

	@Test(priority = 2)
	public void eTest() {
		System.out.println("e test");
	}



}
