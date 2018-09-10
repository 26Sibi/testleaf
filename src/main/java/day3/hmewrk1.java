package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class hmewrk1 {

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
		    
		    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("James");
		    driver.findElementByXPath("//button[text()='Find Leads']").click();
		    Thread.sleep(3000);
		    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		    
		    if(driver.getTitle().contains("View Lead"))
		        //Pass
		        System.out.println("Page title contains \"View Lead\" ");
		    else
		        //Fail
		        System.out.println("Page title doesn't contains \"View Lead\" ");
		    
		    Thread.sleep(3000);
		    
		    driver.findElementByLinkText("Edit").click(); 	
		    driver.findElementById("updateLeadForm_companyName").clear();
		    driver.findElementById("updateLeadForm_companyName").sendKeys("Infosys");
		    driver.findElementByXPath("//input[@value='Update']").click();
		    
		    String str=driver.findElementById("viewLead_companyName_sp").getText();
		    if(str.contains("Infosys"))
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