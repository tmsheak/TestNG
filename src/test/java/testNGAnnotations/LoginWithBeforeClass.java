package testNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithBeforeClass {
    @BeforeSuite
	public void beforeSuite() {
	System.out.println("This is before Suite.");	
	}
    @AfterSuite
   	public void afterSuite() {
   	System.out.println("This is after Suite.");	
   	}
    
	//This type of design suitable for BDD/End to End Testing 
	@BeforeTest  // Run only once at class
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
	@AfterTest
	public void closeApp() {
		System.out.println("Closing the App.");
	}
}
