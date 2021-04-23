package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_027_UploadFile {

	public static void main(String[] args) throws InterruptedException {
		//https://cgi-lib.berkeley.edu/ex/fup.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement UploadButton=driver.findElement(By.name("upfile"));
		//path of the file
		UploadButton.sendKeys("C:\\Users\\Toshiba\\Desktop\\LAB1\\Table.html");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
       Thread.sleep(7000);
		
		driver.close();

	}

}
