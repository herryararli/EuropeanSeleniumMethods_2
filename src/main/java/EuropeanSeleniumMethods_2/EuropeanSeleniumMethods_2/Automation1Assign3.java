package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation1Assign3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get(" https://demoqa.com/alerts");
		
		//id="alertButton"
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		alert.accept();
		
		if (alertText.equals("You clicked a button")) {
			System.out.println("Correct alert");
		}else{
			System.out.println("Incorrect alert");
		}
		
		driver.close();
	}

}
