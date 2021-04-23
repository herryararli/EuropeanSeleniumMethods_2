package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_034_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//Droppable id:droppable
		//Draggable id:draggable
		WebElement droppable=driver.findElement(By.id("droppable"));
		WebElement draggable=driver.findElement(By.id("draggable"));
		Actions actions=new Actions(driver);
		//clickandHold(),doubleClick(),dragandDrop(),keyDown,keyUp,release()
		//Double Click:actions.contextClick(elementlocator).perform();
		//1.Way to drag and drop
		
		actions.dragAndDrop(draggable, droppable).build().perform();
		
		//2.way to drag and drop
		//clickandHold,moveTo,release
		//actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		//build method=compile list of action into a single step
		Action drag_drop=actions.clickAndHold(draggable).moveToElement(droppable).release().build();
		drag_drop.perform();
		Thread.sleep(4000);
		driver.close();
	}

}
