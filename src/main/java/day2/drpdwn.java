package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdwn {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		    
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("http://www.leafground.com/");
		    driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a").click();
		   
		    WebElement web = driver.findElementById("dropdown1");
		    Select sel=new Select(web);
		    sel.selectByIndex(2);
		    
		    WebElement seb = driver.findElementByName("dropdown2");
		    Select sab=new Select(seb);
		    sab.selectByVisibleText("Selenium");
		    
		    WebElement grp = driver.findElementById("dropdown3");
		    Select srp=new Select(grp);
		    srp.selectByValue("3"); 
		  
		    WebElement drp = driver.findElementByClassName("dropdown");
		    Select dre=new Select(drp);
		    List<WebElement> option = dre.getOptions();
		    int count=option.size();
		    System.out.println(count);    
		    
		    driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select").sendKeys("Selenium");
		    
		    WebElement mul = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select");
		    Select multi=new Select(mul);
		    multi.selectByVisibleText("Appium");
		    multi.selectByVisibleText("Selenium");

			}

}
