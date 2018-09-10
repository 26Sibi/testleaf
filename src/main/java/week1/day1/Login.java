package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public final class Login {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("http://leaftaps.com/opentaps/");
    
    driver.findElementById("username").sendKeys("DemoSalesManager");
    driver.findElementById("password").sendKeys("crmsfa");
    
    driver.findElementByClassName("decorativeSubmit").click();
    
    driver.findElementByClassName("crmsfa").click();
    driver.findElementByLinkText("Leads").click();
    driver.findElementByLinkText("Create Lead").click();	
    
    driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
    driver.findElementById("createLeadForm_firstName").sendKeys("Sibi");
    driver.findElementById("createLeadForm_lastName").sendKeys("Masilamani");
    driver.findElementById("createLeadForm_dataSourceId").sendKeys("Employee");
    driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Car and Driver");
    driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
    driver.findElementById("createLeadForm_departmentName").sendKeys("Computer");
    driver.findElementById("createLeadForm_currencyUomId").sendKeys("INR - Indian Rupee");
    driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Software");
    driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
    driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Partnership");
    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("63700");
    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("965527972");
    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("DemoSalesManager");
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("sibitennis@gmail.com");
    driver.findElementById("createLeadForm_generalToName").sendKeys("sibi");
    
    
    
   //driver.findElementByClassName("smallSubmit").click(); 
    
	}

}
