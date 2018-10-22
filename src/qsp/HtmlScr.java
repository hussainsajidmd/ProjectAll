package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlScr {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/DemoA.html");
		//WebElement e = driver.findElement(By.tagName("a"));
		// driver.findElement(By.tagName("a")).click(); //optimise
		 //In browser, find the element by using tag name 'a' and click it. 
		
		
}
}


