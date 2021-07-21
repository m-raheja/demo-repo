package seleniumTestSuite;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);    //implicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);					//Explicit wait
		String[] veggiArray = { "Cucumber", "Brocolli", "Beans", "Onion" }; // array
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//		Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.product-name")));
		TestCase4 obj = new TestCase4();
		obj.addItem(driver, veggiArray);
		obj.checkout(driver, w);
	}

	public void addItem(WebDriver driver1, String[] Veggies) throws InterruptedException {

		int j = 0;
		List<String> item = Arrays.asList(Veggies);

		// selecting just one veggie and adding it to the cart
		List<WebElement> listOfVeggies = driver1.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < listOfVeggies.size(); i++) {
			String[] name = listOfVeggies.get(i).getText().split("-"); // Brocolli - 1 Kg
			String formattedName = name[0].trim();

			if (item.contains(formattedName)) {
				j++;
				// driver.findElements(By.xpath("//button[text() ='ADD TO
				// CART']")).get(i).click();
				driver1.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				if (j == item.size()) {
					break;
				}
			}
		}

	}
	
	public void checkout(WebDriver driver1, WebDriverWait x) throws InterruptedException {
		
		driver1.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver1.findElement(By.xpath("//div[@class='action-block']/button")).click();
//		Thread.sleep(5000);             instead use implicit wait
		x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promocode"))).sendKeys("rahulshettyacademy");
//		driver1.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver1.findElement(By.cssSelector("button.promoBtn")).click();
		
		System.out.println(x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))).getText());
//		System.out.println(driver1.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	
	
	
}
