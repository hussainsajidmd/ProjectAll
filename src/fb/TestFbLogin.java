package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFbLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Disable website notifications
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//Open Chrome Browser
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the Url
		driver.get("https://www.fb.com");
		//Login Page
		FbLogin login=new FbLogin(driver);
		login.setUsername("9718448533");
		login.setPassword("***");
		login.clickLogin();
		Thread.sleep(2000); //Be on homepage for 2 seconds
		//Homepage
		FbHomepage homepage=new FbHomepage(driver);
		homepage.dropClick();
		homepage.logoutClick();
			}
}










/*ChromeOptions opt=new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(opt);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.fb.com");
FbLogin login=new FbLogin(driver);
login.setUsername("9718448533");
login.setPassword("***");
login.clickLogin();
FbHomepage home=new FbHomepage(driver);
home.dropClick();
FbLogout log=new FbLogout(driver);
log.logoutClick();*/


