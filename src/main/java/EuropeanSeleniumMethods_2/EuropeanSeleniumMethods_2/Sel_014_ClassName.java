package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_014_ClassName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 Sel_011_Tagname.login(driver);
	
		 driver.findElement(By.className("firstLevelMenu")).click();
		 List<WebElement> firstLevelMenus=driver.findElements(By.className("firstLevelMenu"));
		 System.out.println(firstLevelMenus.size());
	}

}
