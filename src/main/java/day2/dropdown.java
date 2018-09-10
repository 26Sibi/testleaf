package day2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws IOException {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("http://leaftaps.com/opentaps/");
	    
	    driver.findElementById("username").sendKeys("DemoSalesManager");
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	    driver.findElementByClassName("decorativeSubmit").click();
	    
	    driver.findElementByClassName("crmsfa").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Create Lead").click();	
	    
	    /*driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
	    driver.findElementById("createLeadForm_firstName").sendKeys("Sibi");
	    driver.findElementById("createLeadForm_lastName").sendKeys("Masilamani");
	    driver.findElementById("createLeadForm_dataSourceId").sendKeys("Employee");
	    driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Car and Driver");
	    driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
	    driver.findElementById("createLeadForm_departmentName").sendKeys("Computer");
	    driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
	    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("63700");
	    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("965527972");
	    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("DemoSalesManager");
	    driver.findElementById("createLeadForm_primaryEmail").sendKeys("sibitennis@gmail.com");
	    driver.findElementById("createLeadForm_generalToName").sendKeys("sibi");
	    */
	    
	   WebElement src= driver.findElementById("createLeadForm_dataSourceId");
	   Select sel= new Select(src);
	   sel.selectByVisibleText("Employee");
	   
	   WebElement val = driver.findElementById("createLeadForm_marketingCampaignId");
	    Select sal=new Select(val);
	    sal.selectByValue("DEMO_MKTG_CAMP");
	    
	    //Print all values
	    /*WebElement vel = driver.findElementById("createLeadForm_industryEnumId");
	    Select sle=new Select(vel);
	    List<WebElement> alloptions = sle.getOptions();
	    int count = alloptions.size();
	    System.out.println(count);
	    for (WebElement web : alloptions) 
	    {
			System.out.println(web.getText());
		}
	    */
	    
	    //Print last value
	    WebElement sre = driver.findElementById("createLeadForm_ownershipEnumId");
	    Select vell=new Select(sre);
	    List<WebElement> option = vell.getOptions();
	    int cnt = option.size();
	    //System.out.println(option.get(cnt-1).getText()); --to get output in console
  	    vell.selectByIndex(cnt-1);
	    
	    //Take Snapshot
  	    /*File src1 = driver.getScreenshotAs(OutputType.FILE);
  	    File dest=new File("./snaps/img1.png");
  	    FileUtils.copyFile(src1, dest);*/
  	    
	   //driver.findElementByClassName("smallSubmit").click(); 
	}

}
