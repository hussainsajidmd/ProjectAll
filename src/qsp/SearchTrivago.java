package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTrivago {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.trivago.com");
		driver.findElement(By.id("horus-querytext")).sendKeys("b");
		 List<WebElement> allB = driver.findElements(By.xpath("//span[contains(text(),'B')]"));
		 System.out.println(allB.size());
		for(WebElement e:allB){
			System.out.println(e.getText());
		}
		allB.get(0).click();
	}
}


