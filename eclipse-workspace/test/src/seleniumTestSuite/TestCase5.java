package seleniumTestSuite;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestCase5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id=\"start\"]/button")).click();
		Wait wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
	WebElement foo=	(WebElement) wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
		if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
			return driver.findElement(By.cssSelector("[id='finish'] h4"));
		}
		else 
			return null;
				}
	});
	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());
	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}		
}