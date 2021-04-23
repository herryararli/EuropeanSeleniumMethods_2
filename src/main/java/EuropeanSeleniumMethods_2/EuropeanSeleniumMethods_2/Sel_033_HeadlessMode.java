package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_033_HeadlessMode {

	public static void main(String[] args) {
		//Headless mode(run selenium program without opening a browswer)
		//Chromeoption or Firefoxoption argument called (headless) 
		//HtmlUnitDriver--faster
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		//Headless mode with htmlUnit driver
		
		WebDriver driver2=new HtmlUnitDriver();
		driver2.get("https://www.siliconelabs.com");
		System.out.println(driver2.getTitle());
		driver2.close();
		
		//Firefox headless mode
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options2=new FirefoxOptions();
		options2.setHeadless(true);
		options2.addArguments("--headless");
		WebDriver driver3=new FirefoxDriver(options2);
		driver3.get("https://www.facebook.com"); 
		System.out.println(driver3.getTitle());
		driver3.close();
	
		System.exit(0);
		
	}

}
