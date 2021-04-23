package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_031_FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		//https://www.chase.com
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.chase.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//list the frames
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		//1) Switch to the iframe with index number
		//driver.switchTo().frame(0);
		//2)Switch to the frame with  id or name(frame's id or name)
		driver.switchTo().frame("logonbox");
		//Username id:userId-text-input-field
		driver.findElement(By.id("userId-text-input-field")).sendKeys("Abdulhaluk");
		
		//Password id:password-text-input-field
		driver.findElement(By.id("password-text-input-field")).sendKeys("12345");
		//Sign in Button id=signin-button 
		driver.findElement(By.id("signin-button"));
		Thread.sleep(5000);
		driver.close();
	

	}

}
