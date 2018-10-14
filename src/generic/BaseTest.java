package generic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(Result.class)
public abstract class BaseTest implements IAutoConst {
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}
	public WebDriver driver;
	public String ITO=Utility.getProperty(CONFIG_PATH, "ITO");
	public long lngITO=Long.parseLong(ITO);
	public String ETO=Utility.getProperty(CONFIG_PATH, "ETO");
	public long lngETO=Long.parseLong(ETO);
	public String url=Utility.getProperty(CONFIG_PATH, "URL");

	@Parameters({"ip","browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApp(@Optional("localhost")String ip,@Optional("chrome")String browser){
		driver=Utility.openBrowser(ip, browser);
		driver.manage().timeouts().implicitlyWait(lngITO,TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod(alwaysRun=true)
	public void closeApp(ITestResult result){
		String name=result.getName();
		int status = result.getStatus();
		if(status==2){
			String p=Utility.getPhoto(driver, "./photo");
			Reporter.log("TestName:"+name+" Status: FAIL", true);
			Reporter.log("PHOTO:"+p, true);
		}
		else{
			Reporter.log("TestName:"+name+" Status: Pass", true);
		}
		driver.quit();
	}}
