package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver){
	//print html code(source code of a web page)
		driver.get("http://www.google.com");		
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		Naukri.myTest(driver);
		driver.manage().window().maximize();
		
		
}
}
