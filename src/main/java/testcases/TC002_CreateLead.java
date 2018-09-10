package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
  
public class TC002_CreateLead extends TC001_Login {
	@BeforeTest
		public void setData()
		{
			sheetName="Create";
			author="Sibi";
			category="Smoke";
			testname="TC002_CreateLead";
			desc="To Create a Lead";
		}
	@Test(dataProvider="fetchData")
	public void CreateLead(String cname,String fname,String lname) {
	
	click(locateElement("linktext","Create Lead"));
	type(locateElement("id","createLeadForm_companyName"),cname);
	type(locateElement("id","createLeadForm_firstName"),fname);
	type(locateElement("id","createLeadForm_lastName"),lname);
	click(locateElement("class","smallSubmit"));

	}

}
