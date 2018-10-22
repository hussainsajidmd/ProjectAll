package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.IAutoConst;


public class Tes implements IAutoConst {
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

	public WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void open() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void test() {
		Reporter.log("hi", true);
	
	}
	@AfterMethod(alwaysRun=true)
	public void close() {
		driver.close();
	}
	

}
