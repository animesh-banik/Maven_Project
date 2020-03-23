package Test_Seleniim;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test_Selenium {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\Maven_Project\\Driver\\chromedriver.exe");
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Laptop with touch");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		options.addArguments("mobileEmulation");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("animeshbanik2018@gmail.com");
		
	}

}
