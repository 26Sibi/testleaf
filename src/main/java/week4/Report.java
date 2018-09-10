package week4;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	public ExtentTest test,testData;
	public ExtentReports extent;
	//@BeforeSuite
	public void startResult()
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	public void reportStep(String stepdesc ,String status)
	{
		if(status.equalsIgnoreCase("PASS"))
		{
			testData.pass(stepdesc);
		}
		else if(status.equalsIgnoreCase("FAIL"))
		{
			testData.fail(stepdesc);
		}
		else if(status.equalsIgnoreCase("WARNING"))
		{
			testData.warning(stepdesc);
		}
		else if(status.equalsIgnoreCase("INFO"))
		{
			testData.info(stepdesc);
		}
	}
	//@BeforeClass
	public void startTestCase(String testname , String desc)
	{
		test= extent.createTest(testname,desc);
	}
	//@BeforeMethod
	public void beforeMethod(String author , String category)
	{
		testData = test.createNode("Leads");
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	//@AfterSuite
	public void endResult()
	{
		extent.flush();
	}
}
