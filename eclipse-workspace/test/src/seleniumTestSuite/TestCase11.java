package seleniumTestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class TestCase11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> list= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<list.size();i++) {
			
		sum=sum+ Integer.parseInt(list.get(i).getText());
		
		}
		System.out.println(sum);
	int sumCompare=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, sumCompare);
	}

}
