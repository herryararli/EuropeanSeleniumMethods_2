package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_029_WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//id:tabButton
		//https://demoqa.com/browser-windows
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newTabButton=driver.findElement(By.id("tabButton"));
		newTabButton.click();
		WebElement newWindowButton=driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		//Get the handlers
		System.out.println(driver.getWindowHandles());
		Set<String> windowHandles=driver.getWindowHandles();
		ArrayList<String>  windowHandlesList=new ArrayList<String>(windowHandles);
		System.out.println(windowHandlesList);
		String parentWindow=windowHandlesList.get(0);
		String newTab=windowHandlesList.get(1);
		String newWindow=windowHandlesList.get(2);
		driver.switchTo().window(newWindow);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.quit();
		

	}

}
