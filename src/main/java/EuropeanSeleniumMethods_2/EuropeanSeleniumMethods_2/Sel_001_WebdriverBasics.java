package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_001_WebdriverBasics {

	public static void main(String[] args) throws InterruptedException  {
//Set environment for my driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Get method is opening the web browswer
		driver.get("https://youtube.com");
		Thread.sleep(4000);
		driver.close();
	}


}