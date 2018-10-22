package qsp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.IAutoConst;
import org.testng.annotations.Test;
import generic.Utility;

public class DemK implements IAutoConst{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public WebDriver driver;
	public String ito=Utility.getProperty(CONFIG_PATH,"ITO");
	public long l=Long.parseLong(ito);
	@Test
	public void open() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(l,TimeUnit.SECONDS);
		driver.get("http://www.fb.com");
		
		
	}

}
