package Academy;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public abstract class AppTest {
	@BeforeSuite
	public void test1() {
		System.out.println("@BeforeSuite");	
	}
	@BeforeTest
	public void test2() {
		System.out.println("@BeforeTest");	
	}
	@BeforeClass
	public void test3() {
		System.out.println("@BeforeClass");	
	}
	@BeforeMethod
	public void test44() {
		System.out.println("BeforeMethod");	
	}
	
    
}
