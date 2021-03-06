package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestCase1 {
	
	@AfterTest
	public void executeLast(){
		System.out.println("I will execute at the end");
	}  
	
	@Parameters({"url"})
	@Test(groups = {"smoke"})
	public void wemo(String urlName){
		System.out.println("HI");
		System.out.println(urlName);
	}

	@Test(dependsOnMethods = {"wemo"}, groups = {"smoke"})
	public void Demo(){
		System.out.println("BYE");
		Assert.assertTrue(false);
	}
	
	
	@BeforeTest
	public void prerequisite(){
		System.out.println("I will execute first");
	}
	
	
	@AfterSuite
	public void lastone(){
		System.out.println("In the last");
	}
	
	@BeforeMethod
	public void beforeeach(){
		System.out.println("before each method");
	}  
	
	@AfterMethod
	public void Aftereach(){
		System.out.println("After each method");
	} 
	
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class test case 3");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("After class test case 3");
	}
	
	

}
