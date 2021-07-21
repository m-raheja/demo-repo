package seleniumTestSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase10 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@name=\"travel_date\"]")).click();
		// I want to select date from august
	
	
		while(! driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		}
		
		
/*		List<WebElement> list = driver.findElements(By.cssSelector(".month"));
		int count = driver.findElements(By.cssSelector(".month")).size();
		for (int i = 0; i < count; i++) {
			String month = list.get(i).getText();
			String aug = "Aug";
			if (aug.contains(month)) {
				driver.findElements(By.cssSelector(".month")).get(i).click();
			}
		}
		
		*/
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count1 = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count1; i++) {

			String date = dates.get(i).getText();
			System.out.println(date);
			if (date.equalsIgnoreCase("23")) {
				dates.get(i).click();
				break;
			}
		}
	}

}
