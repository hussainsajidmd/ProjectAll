package qsp;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionControlClick {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions action=new Actions(driver);
		//control+click is an example of composite action i.e multiple action at a time
		action.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(2000);
		Set<String> allWH = driver.getWindowHandles();
		System.out.println(allWH.size());
		for(String wh:allWH){
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
        driver.close();
        driver.quit();
}
}