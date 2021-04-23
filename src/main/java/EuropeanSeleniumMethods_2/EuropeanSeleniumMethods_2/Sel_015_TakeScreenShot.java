package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_015_TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver2
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		//File src=((TakescreenShot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Toshiba\\Desktop\\haluk.png"));

	}

}
