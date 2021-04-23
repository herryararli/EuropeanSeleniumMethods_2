package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebdriverbasicsFF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//Toshiba//Downloads//geckodriver-v0.29.0-win64.zip");
		WebDriver driver=new FirefoxDriver();
		driver.get("https//youtube.com/");
		//Thread.sleep(4000);
		driver.close();
	}

}
