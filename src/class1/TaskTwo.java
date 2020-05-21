package class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskTwo {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class presented");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class presented");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method presented");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method presented");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 presented");

	}

	@Test
	public void test2() {

		System.out.println("Test2 presented");

	}
}