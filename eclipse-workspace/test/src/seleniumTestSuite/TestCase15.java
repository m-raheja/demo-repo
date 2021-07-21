package seleniumTestSuite;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//webtable sort
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		/*		driver.findElement(By.xpath("//tr//th[1]")).click();
	List<WebElement> list= driver.findElements(By.xpath("//tr//td[1]"));
	List<String> originalList=list.stream().map(s->s.getText()).collect(Collectors.toList());
	
	List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));  
	List<String> priceOfVeggi;
	do {
		List<WebElement> list1= driver.findElements(By.xpath("//tr//td[1]"));
priceOfVeggi= list1.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
	priceOfVeggi.forEach(a->System.out.println(a));
	if(priceOfVeggi.size()<1) {
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
	}
	}while(priceOfVeggi.size()<1);
	
	}
	
	private static String  getPrice(WebElement s) {
		String p= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		
		return p;
		
	}   
	
	
	 */
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement>list= driver.findElements(By.xpath("//tr//td[1]"));
		List<WebElement> list1= list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(list.size(), list1.size());
	
		
	}
	
}
