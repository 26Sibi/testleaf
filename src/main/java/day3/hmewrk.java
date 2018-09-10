package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class hmewrk {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		    
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("http://leaftaps.com/opentaps/");
		    
		    driver.findElementById("username").sendKeys("DemoSalesManager");
		    driver.findElementById("password").sendKeys("crmsfa");
		    
		    driver.findElementByClassName("decorativeSubmit").click();
		    
		    driver.findElementByClassName("crmsfa").click();
		    driver.findElementByLinkText("Leads").click();
		    driver.findElementByLinkText("Find Leads").click();

		  		    
		    driver.findElementByXPath("//span[text()='Email']").click();
		    Thread.sleep(3000);
		    driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("harry@ramco.com");
		    driver.findElementByXPath("//button[text()='Find Leads']").click();
		    Thread.sleep(3000);
		    
		    String stri=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		    
		    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		    
		    driver.findElementByLinkText("Duplicate Lead").click();
		    if(driver.getTitle().contains("Duplicate Lead"))
		        //Pass
		        System.out.println("Page title contains \"Duplicate Lead\" ");
		    else
		        //Fail
		        System.out.println("Page title doesn't contains \"Duplicate Lead\" ");
		    
		    Thread.sleep(3000);
		    driver.findElementByClassName("smallSubmit").click();
		    if(stri.contains("Harry"))
		    {
		    	System.out.println("Confirmed");
		    }
		    else
		    {
		    	System.out.println("Not Confirmed");
		    }
		    driver.close();
	}

}
