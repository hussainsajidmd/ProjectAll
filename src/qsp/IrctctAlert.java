package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctctAlert {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		//click login without un and pwd
		driver.findElement(By.id("loginbutton")).click();
		//switch to pop-up, get the msg and click ok
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	//	alert.dismiss();
		
	}
}
