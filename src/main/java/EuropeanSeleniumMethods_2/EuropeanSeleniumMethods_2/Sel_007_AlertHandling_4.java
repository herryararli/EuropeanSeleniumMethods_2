package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_AlertHandling_4 {

	public static void main(String[] args) throws InterruptedException {
		/*Assignment 2:

Create a maven project
Starts from google.com
Navigate learnsdet.com
Go back to Google
Forward to learnsdet.com
Go back to Google again and refresh the page
Close the browser
		 * 
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		//Partial link Text
		driver.findElement(By.partialLinkText("Alert with T")).click();
		//id:-textBox
		Thread.sleep(2000);
		driver.findElement(By.id("Textbox")).click();
		//Switch to alert
		
		Alert alert=driver.switchTo().alert();
		//Send Key to alertbox
		
//		Thread.sleep(2000);
//		alert.sendKeys("Automation Class");
//		//Clicck accept
//		Thread.sleep(2000);
//		alert.accept();
//		
  driver.findElement(By.name("proceed"));
  
		ElementUtil.sendKeystoAlert(driver, "This is the text");
		
	}
	
	
		
		
	}
	


