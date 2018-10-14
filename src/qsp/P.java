package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class P {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		WebElement d = driver.findElement(By.xpath("//h2[text()='15. Miscellaneous']"));
		 int x = d.getLocation().getX();
		 int y=d.getLocation().getY();
		 WebElement height = driver.findElement(By.cssSelector("header.header"));
		 int he = height.getSize().getHeight();
		y= y-he;
		 j.executeScript("window.scrollTo("+x+","+y+")");
			
}
}