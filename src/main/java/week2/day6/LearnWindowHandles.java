package week2.day6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList=new ArrayList<String>();
		allList.addAll(allWin);
		
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElementByLinkText("View Offer»").click();
		
		allWin=driver.getWindowHandles();
		allList=new ArrayList<String>();
		allList.addAll(allWin);
		
		driver.switchTo().window(allList.get(2));
		System.out.println(driver.getTitle());
		
		//Snapshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img3.png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
