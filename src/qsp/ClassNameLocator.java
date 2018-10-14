package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameLocator {	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/Demo.html");
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(1000);
		driver.navigate().back();
        //partialLinkText()
		driver.findElement(By.partialLinkText("Goo")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
}