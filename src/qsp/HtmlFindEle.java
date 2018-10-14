package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HtmlFindEle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/DemoA.html");
		driver.findElement(By.tagName("a")).click(); 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click(); 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click(); 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click(); 
		//driver.findElement(By.linkText("Google")).click(); 
		//driver.findElement(By.partialLinkText("Go")).click(); 
		driver.findElement(By.cssSelector("a[id='a1']")).click();;
		
		

}
}
