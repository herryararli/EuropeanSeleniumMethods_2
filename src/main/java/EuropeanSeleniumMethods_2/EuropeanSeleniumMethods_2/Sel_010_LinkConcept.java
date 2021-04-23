package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_010_LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//forgotPassword//linkText:Forgot your password?
		WebElement element=driver.findElement(By.linkText("Forgot your password?"));
		element.click();
		
		//link :OrangeHRM, Inc
		WebElement element2=driver.findElement(By.partialLinkText("OrangeHRM, Inc"));
		element2.click();
		Thread.sleep(5000);
		//driver.close();
		
		

	}

}
