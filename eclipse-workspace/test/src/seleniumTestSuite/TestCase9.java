package seleniumTestSuite;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase9 {

	public static void main(String[] args) {
		// count of links on the page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// count all the links only under the footer section
		WebElement footer = driver.findElement(By.id("gf-BIG")); // limiting the scope of driver
		System.out.println(footer.findElements(By.tagName("a")).size());

		// find the count in one of the footer coloumn
		WebElement footerColoumn = footer.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int size = footerColoumn.findElements(By.tagName("a")).size();
		System.out.println(size);

		// click on each link and checking if the pages are opening
		for (int i = 0; i < size; i++) {

			String KeyAction = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			a.moveToElement(footerColoumn.findElements(By.tagName("a")).get(i)).keyDown(Keys.CONTROL).click().build()
			// .perform();
			footerColoumn.findElements(By.tagName("a")).get(i).sendKeys(KeyAction);

		}
		driver.close();
		Set<String> url = driver.getWindowHandles();
		Iterator<String> it = url.iterator();

		/*
		 * for (int i = 0; i < size; i++) { String pageId = it.next();
		 * System.out.println(pageId); }
		 */

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
