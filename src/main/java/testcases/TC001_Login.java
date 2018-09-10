package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001_Login extends SeMethods{
	public String sheetName,testname,desc,author,category;
	@BeforeSuite
	public void beforeSuite()
	{
		startResult();
	}
	@BeforeClass
	public void beforeClass()
	{
		startTestCase(testname , desc);
	}
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void login(String url, String uname ,String pwd) {
		
		startApp("chrome", url);
		beforeMethod(author,category);
		type(locateElement("id", "username"),uname);
		type(locateElement("id","password"),pwd);
		click(locateElement("class","decorativeSubmit"));
		click(locateElement("id","button"));
		click(locateElement("linktext","Leads"));
		}
	@AfterMethod	
   public void close() {
		closeBrowser();
   }
	@AfterSuite
	public void afterSuite()
	{
		endResult();
	}
	@DataProvider(name="fetchData")
	
		public String[][] excelData() throws IOException{
			ReadExcel excel = new ReadExcel();	
			return excel.getData(sheetName);
		}
	
}










