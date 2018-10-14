package qsp;
import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJavascript {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		for(int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(300);
		}
		for(int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(300);
		}
	}
}
