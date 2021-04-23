package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ispeakBetter {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ispeakbetter.com/?lang=en");
		driver.findElement(By.id("cmdSiginLink")).click();
		driver.findElement(By.id("_email")).sendKeys("yararliahaluk@gmail.com");
		driver.findElement(By.id("_password")).sendKeys("haluk12");
		driver.findElement(By.id("cmdSignin")).click();
		
		
		

	}

}
