package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC003_EditLead extends TC001_Login {
	@BeforeTest
		public void setData()
		{
			sheetName="Edit";
			author="Sibi";
			testname="TC003_EditLead";
			desc="To Edit a Lead";
		}
	
	@Test(dataProvider="fetchData")
	public void EditLead(String fname, String ucname, String ufname, String ulname) {
		
	
	click(locateElement("linktext","Find Leads"));
	type(locateElement("xpath","(//input[@name='firstName'])[3]"),fname);
	click(locateElement("xpath","//button[text()='Find Leads']"));
	click(locateElement("xpath","(//a[@class='linktext'])[4]"));
	click(locateElement("linktext","Edit"));
	
	type(locateElement("id","updateLeadForm_companyName"),ucname);
	type(locateElement("id","updateLeadForm_firstName"),ufname);
	type(locateElement("id","updateLeadForm_lastName"),ulname);
	click(locateElement("class","smallSubmit"));
	}
}
