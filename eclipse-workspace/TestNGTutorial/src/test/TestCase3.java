package test;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 {

	@Parameters({"url" , "key"})
	@Test(groups = {"smoke"})
	public void Demo4(String urlname, String Key1){
		System.out.println("WHY");
		System.out.println(urlname);
		System.out.println(Key1);
	}
	
	@BeforeSuite
	public void thiswillrun(){
		System.out.println("I am telling u");
	}
	

}
