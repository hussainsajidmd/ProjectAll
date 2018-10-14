package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dawny {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException{
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
	
	
	}
}
