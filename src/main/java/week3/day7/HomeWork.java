package week3.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    List<WebElement> ele = driver.findElementsByXPath("//div[@class='row result clickcard'or@class='lastRow row result clickcard']/h2/a");
	    System.out.println("No of Job Links:"+ele.size());
	    for (WebElement Joblink : ele)
	    {
	    Actions builder = new Actions(driver);
	    builder.sendKeys(Joblink,Keys.CONTROL).click(Joblink).perform();
	    Set<String> win1 = driver.getWindowHandles();
	    List<String> list1 = new ArrayList<String>();
	    list1.addAll(win1);
	    driver.switchTo().window(list1.get(1));
	    System.out.println(driver.getTitle());
	    driver.close();
	    driver.switchTo().window(list1.get(0));
		}
	    driver.quit();
	}

}
