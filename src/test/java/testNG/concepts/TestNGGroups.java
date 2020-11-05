package testNG.concepts;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	// What is TestNG Groups
	// TestNG groups allows us to group certain tests and run them from TestNG.xml
	// (Test Suite)
	// Why we use them?
	// We can group our test cases such as Smoke, Regression and run them from suite
	// regardless of their
	// class location.
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method executes before each Test");
	}
	
	@Test (groups = {"smoke"})
	public void testSmoke() {
	}
	
	@Test (groups = {"smoke"})
	public void testSmoke_two() {
	}
	
	@Test (groups = {"smoke"})
	public void testSmoke_three() {
	}
	
	@Test (groups = {"regression"})
	public void testRegression() {
	}
	
	@Test (groups = {"regression"})
	public void testRegression_two() {
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method executes after each Test");
		
		
	}
}