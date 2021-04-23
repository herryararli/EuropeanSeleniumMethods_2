package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_035_JavaScriptExecuter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://todomvc.com/examples/vanillajs/");
		WebElement inputBox=driver.findElement(By.xpath("/html/body/section/header/input"));
		inputBox.sendKeys("Hello");
		inputBox.sendKeys(Keys.ENTER);
		inputBox.sendKeys("Europe");
		inputBox.sendKeys(Keys.ENTER);
		
		js.executeScript("document.querySelector('body > section > section > label').click()");
		JavaScriptUtil.flash(inputBox, driver);
		JavaScriptUtil.drawBorder(inputBox, driver);
		
		
		
		

	}

}


