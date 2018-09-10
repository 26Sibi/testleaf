package week2.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		    driver.findElementById("password").sendKeys("crmsfa");
		    driver.findElementByClassName("decorativeSubmit").click();    
		    driver.findElementByClassName("crmsfa").click();
		    driver.findElementByLinkText("Leads").click();
		    driver.findElementByLinkText("Merge Leads").click();
		    
			//Selecting FROM Value
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		//Handling From Window
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList=new ArrayList<String>();
		allList.addAll(allWin);
		
		driver.switchTo().window(allList.get(1));
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("karthick");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String from = driver.findElementByXPath("//a[@class='linktext']").getText();
		driver.findElementByXPath("//a[@class='linktext']").click();
		driver.switchTo().window(allList.get(0));
		System.out.println(from);
		//Selecting TO Value
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
        //Handling To Window
        Set<String> allWin1 = driver.getWindowHandles();
        List<String> allList1=new ArrayList<String>();
        allList1.addAll(allWin1);
        
        driver.switchTo().window(allList1.get(1));
        
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("karthick");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String to = driver.findElementByXPath("(//a[@class='linktext'])[7]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[7]").click();
		driver.switchTo().window(allList1.get(0));
		System.out.println(to);
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		String confi = driver.findElementById("viewLead_companyName_sp").getText();
			if(confi.contains(to))
				{
					System.out.println("It is Merged");
				}
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(from);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String fin = driver.findElementByXPath("//div[text()='No records to display']").getText();
			if(fin.contains("No records"))
				{
					System.out.println("Tested");
				}
	}
		
}


