package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC005_MergeLead extends SeMethods{
	
	@Test
	public void EditLead() {
	
	click(locateElement("linktext","Merge Leads"));
	click(locateElement("xpath","//img[@alt='Lookup']"));
	switchToWindow(1);
	type(locateElement("xpath","//input[@name='firstName']"),"sibi");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	click(locateElement("xpath","//a[@class='linktext']"));
	switchToWindow(0);
	
	click(locateElement("xpath","//img[@alt='Lookup'])[2]"));
	switchToWindow(1);
	type(locateElement("xpath","//input[@name='firstName']"),"sibi");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	click(locateElement("xpath","//a[@class='linktext'])[7]"));
	switchToWindow(0);	
	
	click(locateElement("linktext","Merge"));
	acceptAlert();
	
	}
}