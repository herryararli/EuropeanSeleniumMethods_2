package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation1Assign2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Assignment 2:

Create a maven project
Starts from google.com
Navigate learnsdet.com
Go back to Google
Forward to learnsdet.com
Go back to Google again and refresh the page
Close the browser
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.learnsdet.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
