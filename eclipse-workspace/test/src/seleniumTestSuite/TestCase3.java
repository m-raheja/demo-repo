package seleniumTestSuite;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] veggiArray = {"Cucumber" , "Brocolli", "Beans", "Onion"}; //array
		List<String> item = Arrays.asList(veggiArray);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		int j= 0;
		//selecting just one veggie and adding it to the cart
		List<WebElement> listOfVeggies = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < listOfVeggies.size(); i++) {
			String[] name = listOfVeggies.get(i).getText().split("-"); //Brocolli - 1 Kg
			String formattedName= name[0].trim();
			
			if (item.contains(formattedName)) {
				j++;
	//			driver.findElements(By.xpath("//button[text() ='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();	
				if(j == item.size()) {
					break;
				}
			}
		}
		// selecting number of veggies in to the cart. Do it using array:
		//Array of Strings
		// String[] veggiArray = {"cucumber" , "Brocolli", "Beans"};
		
	//	driver.quit();
		
		
		
		
	}

}
