package testNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

	//For TDD, Functionality Test 
	@BeforeMethod
	public void openApp() {
		System.out.println("Open the app.");
	}

	@Test
	public void m1() {
		System.out.println("This is m1 method.");
		m2(); // m1 and m2 both are instance method
	}

	public void m2() {
		System.out.println("This is m2 method.");
	}

	@Test
	public void m3() {
		System.out.println("This is m3 method.");
	}
	@AfterMethod
	public void closeApp() {
		System.out.println("Closing app.");
	}
}
