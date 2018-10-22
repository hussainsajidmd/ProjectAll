package qsp;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		//To change the Chrome setting
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.get("http://www.yatra.com");
	}
}
