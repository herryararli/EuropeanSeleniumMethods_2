package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2_1 {

	public static void main(String[] args) throws InterruptedException {
		//linktext
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.typing.com/");
		
		By locater0=By.linkText("student login");
		WebElement element0=driver.findElement(locater0);
		element0.click();
		
		//id=twotabsearchtextbox
//		By locater1=By.id("twotabsearchtextbox");
//		WebElement element1=driver.findElement(locater1);
//		element1.sendKeys("Mobile Phone");;
	
		

	}

}
