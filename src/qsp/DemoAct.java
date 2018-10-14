package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAct {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pw = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		driver.navigate().refresh();
		un.sendKeys("sajid");
		pw.sendKeys("tester");
		login.click();
		
		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		LoginPage login=new LoginPage(driver);
//		login.setUsername("sajid");
//		login.setPassword("tester");
//		login.clickLogin();
//		Thread.sleep(3000);
//		login.setUsername("admin");
//		login.setPassword("manager");
//		login.clickLogin();

	}

}
