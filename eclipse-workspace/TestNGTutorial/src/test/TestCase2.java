package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test(dataProvider = "getData")
	public void Demo3(String username, String password){
		System.out.println("HELLO");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= new Object[3][2];
		data[0][0]= "firstUsername";
		data[0][1]= "password";
		
		
		data[1][0]="secondUsername";
		data[1][1]="password2";
		
		data[2][0]="thirdUsername";
		data[2][1]="password3";
		
		return data;
	}
}
