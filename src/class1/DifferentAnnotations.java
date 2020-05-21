package class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class running");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class running");
	}

	@AfterMethod
	public void beforeMethod() {
		System.out.println("After method running");
	}

	@BeforeMethod

	public void afterMethod() {
		System.out.println("Before method running ");
	}

	@Test
	public void test1() {
		System.out.println("test1 is running ");
	}

	@Test
	public void test2() {
		System.out.println("test2 is running ");
	}

	@Test
	public void test3() {
		System.out.println("test3 is running ");
	}
}