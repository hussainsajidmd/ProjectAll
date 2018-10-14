package qsp;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaukriPopup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh:allwhs){
			driver.switchTo().window(wh);
			String amazon = driver.getTitle();
			if(amazon.equalsIgnoreCase("Amazon")){
				driver.close();
			}
		}	
}
}








/*Set<String> v = driver.getWindowHandles();
for(String h:v){
	driver.switchTo().window(h);
	System.out.println(driver.getTitle());
	driver.close();
}*/

/*String parent = driver.getWindowHandle();
Set<String> allwhs = driver.getWindowHandles();
allwhs.remove(parent);*/