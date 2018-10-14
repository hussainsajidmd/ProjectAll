package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) throws InterruptedException{
	
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("http://www.gmail.com");	
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Navigate.myTest(driver);
		Thread.sleep(2000);
		driver.navigate().back(); //method chaining
		
}
}
