package seleniumTestSuite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCase13 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// check if the link is broken or not
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String URL = driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		HttpURLConnection con = (HttpURLConnection) new URL(URL).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int response = con.getResponseCode();
		System.out.println(response);

		// but I have 200 links on my home page, I want to check all the links
	//	WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		
		
		for (WebElement link : links) {

			String link1 = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(link1).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode < 400, "the link with text:"+ link.getText()+ " is broken with code "+(resCode));
			
			
		}
		a.assertAll();
	}

}
