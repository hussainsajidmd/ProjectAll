package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWays {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/Page1.html");
	   
	    //using index
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("t2")).sendKeys("A");
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("t1")).sendKeys("A");
	    
	   
	   // using id
	    driver.switchTo().frame("f1");
	    driver.findElement(By.id("t2")).sendKeys("B");
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t1")).sendKeys("B");
	    
	   //using address
	   WebElement e = driver.findElement(By.tagName("iframe"));
	   driver.switchTo().frame(e);
	   driver.findElement(By.id("t2")).sendKeys("C");
	   driver.switchTo().parentFrame();
	   driver.findElement(By.id("t1")).sendKeys("C");
	   
	   
	}}
	    

