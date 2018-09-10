package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homepage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://accountmanager.smeco.coop/OUCSSPortal  ");
		
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("testacct1");
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("oucSStest1!");
		
		WebElement viw = driver.findElementByXPath("//*[@id=\"pt1:r1:ouptsf1:lobSelect1::content\"]");
		Select sel=new Select(viw);
		sel.selectByVisibleText("Single Account View");
		
		driver.findElementByXPath("//button[@title='Login']").click();	
		Thread.sleep(10000);
		
		driver.findElementByXPath("//a[@class='linkStyle4 af_goLink']").click();
	    Thread.sleep(8000);
		
		
		driver.findElementByXPath("//a[text()='Notification Preferences']").click();
	}	

}
