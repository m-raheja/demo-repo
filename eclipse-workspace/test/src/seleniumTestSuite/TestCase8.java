package seleniumTestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		// how to handles frames
		driver.get("https://jqueryui.com/droppable/");
//	System.out.println(	driver.findElements(By.tagName("iframe")).size());
		WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();  	//to get out of frames
	
	
	}

}
