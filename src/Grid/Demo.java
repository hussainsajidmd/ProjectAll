package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	@Parameters({"ip","browser"})
	@Test
	public static void testGrid(String ip, String browser) throws MalformedURLException {
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String msg="What is your name?";
		j.executeScript("alert('"+msg+"')");
	
		}
	}

