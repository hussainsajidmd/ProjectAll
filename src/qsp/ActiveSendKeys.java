package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveSendKeys {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver){
		driver.get("http://demo.actitime.com");
		WebElement w = driver.switchTo().activeElement();
		w.sendKeys("Sajid");		
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		ActiveSendKeys.myTest(driver);
		
}
}
