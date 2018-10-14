package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Istqb {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.istqb.org");
		WebElement menu = driver.findElement(By.linkText("Certification"));
		//Mouse hover on the menu
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.linkText("Why ISTQB® Certification?")).click();
       
        
	}

}
