package qsp;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> s = driver.getWindowHandles();
		System.out.println("Number of window is "+s.size());
		System.out.println(s);
		driver.quit();
	}
}


