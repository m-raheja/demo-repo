package seleniumTestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		/*
		 * driver1.get("https://www.google.com");
		 * driver1.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).
		 * sendKeys("Mehak Raheja");
		 * driver1.findElement(By.xpath("//*[text() ='Store']")).click();
		 * 
		 * 
		 * driver1.get("https://rahulshettyacademy.com/dropdownsPractise/"); // Static
		 * dropdown WebElement dropdown=
		 * driver1.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); Select
		 * obj= new Select(dropdown); obj.selectByIndex(3);
		 * System.out.println(obj.getFirstSelectedOption().getText());
		 * obj.selectByVisibleText("AED");
		 * System.out.println(obj.getFirstSelectedOption().getText());
		 * obj.selectByValue("USD");
		 * System.out.println(obj.getFirstSelectedOption().getText());
		 */

		/*
		 * driver1.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 * //dynamic dropdown
		 * driver1.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click
		 * (); driver1.findElement(By.xpath("//a[@value='MAA']")).click();
		 * Thread.sleep(3000); driver1.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"
		 * )).click();
		 */

		/*
		 * driver1.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 * //autosuggestive dropdown
		 * driver1.findElement(By.id("autosuggest")).sendKeys("ind");
		 * Thread.sleep(3000); List<WebElement> options=
		 * driver1.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * 
		 * for(WebElement option :options) {
		 * 
		 * if(option.getText().equalsIgnoreCase("India")){
		 * 
		 * option.click(); break; } }
		
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver1.findElement(By.id("name")).sendKeys("mehak");
		driver1.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver1.switchTo().alert().getText());
		driver1.switchTo().alert().accept();
		driver1.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver1.switchTo().alert().dismiss();   */
		System.out.println(2);
	}

}
