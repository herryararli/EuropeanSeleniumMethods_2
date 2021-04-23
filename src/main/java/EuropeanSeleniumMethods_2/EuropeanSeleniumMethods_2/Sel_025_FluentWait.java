package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_025_FluentWait {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		// start button id : start
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		
		
		 
		
		
		

	}

}
