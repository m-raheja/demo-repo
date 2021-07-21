package seleniumTestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		// create driver object for chrome browser
		// invoke .exe file first
		// webdriver.chrome.driver = C:\Users\Mikku\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://google.com");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		// driver.navigate().back();
		// driver.quit();
		/*
		 * driver.get("http://facebook.com");
		 * driver.findElement(By.id("email")).sendKeys("mehakraheja1993@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("1122");
		 * driver.findElement(By.linkText("Forgot Password?")).click();
		 * 
		 * driver.get("https://login.salesforce.com/");
		 * driver.findElement(By.id("username")).sendKeys("blah");
		 * driver.findElement(By.cssSelector("#password")).sendKeys("blah");
		 * driver.findElement(By.cssSelector("#forgot_password_link")).click();
		 * driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		 * System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		 */
		driver.get("https://login.salesforce.com");
		/*
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
		 * "mehakraheja");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 * 
		 * driver.findElement(By.cssSelector("input[id='username']")).sendKeys(
		 * "mehakraheja");
		 * driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
		 * driver.findElement(By.cssSelector("input[value='Log In']")).click();
		 */

		driver.findElement(By.cssSelector("[id='username']")).sendKeys("blah");
		;

	}

}
