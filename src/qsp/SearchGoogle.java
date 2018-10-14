package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		 List<WebElement> allJava = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		 System.out.println(allJava.size());
		for(WebElement e:allJava){
			System.out.println(e.getText());
		}
		allJava.get(1).click();
	}
}

