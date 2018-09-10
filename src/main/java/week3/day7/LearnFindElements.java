package week3.day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByName("q").sendKeys("sibi",Keys.ENTER);
		List<WebElement> all = driver.findElementsByPartialLinkText("sibi");
		System.out.println(all.size());
		System.out.println(all.get(3).getText());
		for (WebElement fu : all) 
		{
			System.out.println(fu.getText());
		}
		
		
	}
	
}
