package week3.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://jqueryui.com/droppable/");
		//driver.get("http://jqueryui.com/draggable/");
		//driver.get("http://jqueryui.com/selectable/");
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.switchTo().frame(0);
	   //Drag and Drop
	    
	    /*WebElement drag = driver.findElementById("draggable");
	    WebElement drop = driver.findElementById("droppable");
	    Actions builder = new Actions(driver);
	    builder.dragAndDrop(drag, drop).perform();*/
	  
	    //Drag
	    
	    /*WebElement drag = driver.findElementById("draggable");
	    Actions builder = new Actions(driver);
	    builder.dragAndDropBy(drag, 150, 22).perform();*/
	    
	    //Select
	    
   	   /* WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
	    WebElement ele2 = driver.findElementByXPath("//li[text()='Item 3']");
	    WebElement ele3 = driver.findElementByXPath("//li[text()='Item 4']");
	    WebElement ele4 = driver.findElementByXPath("//li[text()='Item 7']");
	    Actions builder = new Actions(driver);
	    builder.sendKeys(Keys.CONTROL).click(ele1).click(ele2).click(ele3).click(ele4).perform();*/
	    
	    //Sort
	    
	    WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
	    WebElement ele2 = driver.findElementByXPath("//li[text()='Item 4']");
	    int y = ele2.getLocation().getY();
	    Actions builder = new Actions(driver);
	    builder.dragAndDropBy(ele1,0 , y).release().perform();
	    //builder.clickAndHold(ele1).moveByOffset(0, y).perform();
	}

}
