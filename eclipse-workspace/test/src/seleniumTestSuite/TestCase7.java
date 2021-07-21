package seleniumTestSuite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		// how to switch from parent to child - new tab or new window is handled as new
		// window in selenium
		Set<String> windows = driver.getWindowHandles(); // [parent id, child id]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String email = driver.findElement(By.cssSelector("[class='im-para red'] a")).getText();
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
