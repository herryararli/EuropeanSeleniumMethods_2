package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;



public class ElementUtil {
	
	/**
	 * 
	 * @param driver
	 */
	public static void acceptAlert(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
	}
	
	/**
	 * Threshol
	 * @param driver
	 */
	public static void dismissAlert(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.dismiss();
	}
/**
 * 
 * @param driver
 * @param text
 */
	public static void sendKeystoAlert(WebDriver driver, String text){
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
}
