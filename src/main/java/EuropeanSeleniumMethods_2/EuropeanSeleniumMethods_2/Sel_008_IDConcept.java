package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_008_IDConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//loginInoutBox/ id:txtUsername
		//passwordInputBox
		//LoginButton/id:btnLogin
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement passwordInputBox=driver.findElement(By.id("txtPassword"));
		passwordInputBox.sendKeys("admin123");
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
