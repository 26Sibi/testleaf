package wdMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import week4.Report;

public class SeMethods extends Report implements WdMethods
{
        public int i=1;
	public RemoteWebDriver driver;
	
	public void startApp(String browser, String url) {
		
			try {
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				try {
					reportStep("The Browser "+browser+" Launched Successfully","PASS");
				} catch (Exception e) {
					reportStep("The Browser "+browser+"is not Launched Successfully","PASS");
				}
			} catch (WebDriverException e) {
				System.err.println("Unknow Exception is Occured");
			}finally {
				takeSnap();
			}
		
	}

	
	public WebElement locateElement(String locator, String locValue) {
		
			try {
				switch(locator) {
				case "id"	 : return driver.findElementById(locValue);
				case "class" : return driver.findElementByClassName(locValue);
				case "xpath" : return driver.findElementByXPath(locValue);
				case "linktext": return driver.findElementByLinkText(locValue);
				
				}
			} catch (Exception e) {
				System.out.println("No Such Element Exception");
				throw new RuntimeException();
				
			}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void type(WebElement ele, String data) {
		    try {
				ele.clear();
				ele.sendKeys(data);
				reportStep("The data "+data+" is Entered Successfully","PASS");
			} catch (Exception e) {
				reportStep("The data "+data+" is Not Entered Successfully","FAIL");
			}
		
	}

	
	public void clickWithNoSnap(WebElement ele) {
		
			ele.click();
			try {
				reportStep("The Element "+ele+" Clicked Successfully","PASS");
			} catch (Exception e) {
				reportStep("The Element "+ele+" is not Clicked Successfully","FAIL");
			}
		
	}
	
	
	@Override
	public void click(WebElement ele) {
		
			ele.click();
			try {
				reportStep("The Element "+ele+" Clicked Successfully","PASS");
			} catch (Exception e) {
				reportStep("The Element "+ele+" is not Clicked Successfully","FAIL");
			}
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList=new ArrayList<String>();
		allList.addAll(allWin);
		
		driver.switchTo().window(allList.get(index));
		

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
