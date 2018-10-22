package gmail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the Url
		driver.get("http://www.gmail.com");
		LoginPage login=new LoginPage(driver);
		login.setEmail("hussainsajid.md");
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		login.setPassword("***");
		r.keyPress(KeyEvent.VK_ENTER);
		
		
					}


}
