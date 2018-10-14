package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPop {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sajid");
		driver.findElement(By.xpath("(//button)[2]")).click();
	}

}
