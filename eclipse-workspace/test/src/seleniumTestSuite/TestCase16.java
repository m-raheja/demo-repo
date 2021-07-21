package seleniumTestSuite;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
//import static org.openqa.selenium.support.locators.RelativeLocator.withtagName;

public class TestCase16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	//	driver.findElement(By.tagName("label")).above(driver.findElement(By.xpath("[@name='name']")).getText());

/*		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle= driver.getWindowHandles();
		Iterator<String> it= handle.iterator();
		String parentID= it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/#/index");	*/
		WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
	System.out.println(	name.getRect().getDimension().getHeight());
	System.out.println(name.getRect().getDimension().getWidth());
	
	}

}
