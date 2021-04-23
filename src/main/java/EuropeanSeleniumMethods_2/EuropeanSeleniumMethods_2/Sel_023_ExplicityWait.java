package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_023_ExplicityWait {

	
		public static void main(String[] args) throws InterruptedException {
			
              // Implictly wait ignores NoSuchElementException in given time
	            WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
              // start button id : start
					driver.findElement(By.xpath("//*[@id='start']/button")).click();

					// Thread.sleep, Explicitlywait
					WebDriverWait wait = new WebDriverWait(driver, 10);
					//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='finish']/h4"))));
					wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
					System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
		}}

