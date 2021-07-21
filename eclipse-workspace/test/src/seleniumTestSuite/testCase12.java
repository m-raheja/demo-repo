package seleniumTestSuite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

public class testCase12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	DesiredCapabilities ch= DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		WebDriver driver= new ChromeDriver(c);
		   */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikku\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.get("https://google.com");
	    File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mikku\\Desktop\\screenshot.png"));
		System.out.println("done");
		
	}

}
