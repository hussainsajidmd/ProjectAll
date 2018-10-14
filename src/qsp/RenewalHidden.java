package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenewalHidden {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		//Enter policy number
		driver.findElement(By.id("nqame2")).sendKeys("YBHGJK");
		//click DOB
		driver.findElement(By.id("dtDOB")).click();
		//select a date
		driver.findElement(By.cssSelector("li.currentdate>a")).click();
		driver.findElement(By.id("proceed")).click();
	}
}
