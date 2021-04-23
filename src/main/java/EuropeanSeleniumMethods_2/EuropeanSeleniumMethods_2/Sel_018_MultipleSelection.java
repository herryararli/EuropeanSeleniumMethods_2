package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_018_MultipleSelection {

	public static void main(String[] args) {
		
		//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
		WebDriverManager.chromedriver().setup();
		ChromeOptions options_1=new ChromeOptions();
		options_1.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options_1);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> options=driver.findElements(By.className("ComboTreeItemChlid"));
		for (int i = 0; i < options.size(); i++) {
			//if (!options.get(i).getText().equals(""));
			if (!options.get(i).getText().isEmpty()) {
				System.out.println(options.get(i).getText());
				options.get(i).click();
			}
			
		}
		
		
	}

}
