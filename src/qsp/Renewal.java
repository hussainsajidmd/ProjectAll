package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Renewal {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://retail.starhealth.in/renewal");
		//Enter policy number
		driver.findElement(By.id("nqame2")).sendKeys("YBHGJK");
		//click DOB
		driver.findElement(By.id("dtDOB")).click();
		//My DOB is 20-Feb-1994
		//select the month
		driver.findElement(By.xpath("//option[@value='1']")).click();
		//select the year
		driver.findElement(By.xpath("//option[@value='1992']")).click();
		//select the day of that month
		driver.findElement(By.xpath("(//a[text()='14'])[1]")).click();
		driver.findElement(By.id("proceed")).click();
		String msg = driver.findElement(By.id("errorExplanation")).getText();
		System.out.println(msg);
	}
}


