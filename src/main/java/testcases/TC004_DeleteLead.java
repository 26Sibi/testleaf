package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC004_DeleteLead extends TC001_Login{
	@BeforeClass
	public void setData()
	{
		sheetName="Delete";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String fname) {
	
	click(locateElement("linktext","Find Leads"));
	type(locateElement("xpath","(//input[@name='firstName'])[3]"),fname);
	click(locateElement("xpath","//button[text()='Find Leads']"));
	click(locateElement("xpath","(//a[@class='linktext'])[4]"));
	click(locateElement("linktext","Delete"));

	}
}
