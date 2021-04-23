package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_028_ElementVisibility {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		//Radio button1,2
		WebElement rb1=driver.findElement(By.id("vfb-7-1"));
		WebElement rb2=driver.findElement(By.id("vfb-7-2"));
		//checkbox elemnt1
		WebElement cb1=driver.findElement(By.id("vfb-6-0"));
		cb1.click();
		rb1.click();
		System.out.println("Is Radio button 1 selected : " + rb1.isSelected());
		System.out.println("Is Radio button 2 selected : " + rb2.isSelected());
		System.out.println("Is Radio checkbox 1 selected : " + cb1.isSelected());
		System.out.println("Is Radio checkbox 1 enabled : " + cb1.isEnabled());
		System.out.println("Is Radio checkbox 1 displayed : " + cb1.isDisplayed());
		
		//isSelected
		//isEnabled
		//isDisplayed//style="display:none"
		
		driver.close();

	}

}
