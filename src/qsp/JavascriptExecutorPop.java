package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPop {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor j=(JavascriptExecutor)driver;
	//	String msg="Happy festivals";
	//	j.executeScript("alert('"+msg+"')");
		j.executeScript("alert('priyanka chopra')");
	
}
}