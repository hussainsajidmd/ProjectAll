package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoC {
	static{
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
	}

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver1=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver1.navigate().to("http://www.google.com");
		
		
System.out.println();
	}
}
