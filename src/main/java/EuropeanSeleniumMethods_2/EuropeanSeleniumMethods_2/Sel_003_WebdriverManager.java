package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebdriverManager {

	public static void main(String[] args) throws InterruptedException {
		// This Class demonsrates web driver manager concept
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.siliconelabs.com");
		Thread.sleep(2000);
		//Navigate Method
		//Navigate methods provides extra methods such as back .forward ,refresh
		//navigate.to() vs get() :get method waits until web page is load.Navigate to doesnt
		driver.navigate().to("https://www.amazon.com");
	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//manage()-windows()-maximize(),fullscreen
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		

	}

}
