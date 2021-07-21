package seleniumTestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("[id='nav-link-accountList']"));
		WebElement search = driver.findElement(By.id("nav-search-bar-form"));
		a.moveToElement(move).contextClick().perform(); // mouseover action
		// composite action - move to specefic element and write in CAPS and entire text
		// should be selected with double click
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("sweater").doubleClick().build().perform();

	}

}
