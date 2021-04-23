package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_006_AlertHandling_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("Alert with OK & C")).click();
		driver.findElement(By.partialLinkText("CancelTab")).click();
		//Handle the alert,press cancel-dismiss
		//dismissAlert(driver)
		
		ElementUtil.acceptAlert(driver);
				
				
			
	}
	

}
