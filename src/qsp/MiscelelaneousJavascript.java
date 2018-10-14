package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscelelaneousJavascript {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/license-agreement");
		WebElement e = driver.findElement(By.xpath("//h2[text()='15. Miscellaneous']"));
		int x = e.getLocation().getX();
		int y = e.getLocation().getY();
		WebElement h = driver.findElement(By.cssSelector("header.header"));
		int height = h.getSize().getHeight();
		y=y-height;
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo("+x+","+y+")");
	  //((JavascriptExecutor)driver).executeScript("window.scrollTo("+x+","+y+")");   
}
}
