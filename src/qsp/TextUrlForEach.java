package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextUrlForEach {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/Demo3.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));	
		for(WebElement link:allLinks){
			String text = link.getText();
			String url = link.getAttribute("href");
			System.out.println(text+"--->"+url);
		}
	}
}
