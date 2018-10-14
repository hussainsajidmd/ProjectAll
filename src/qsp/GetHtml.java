package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHtml {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver){
	//print html code(source code of a web page)
		driver.get("http://www.google.com");
		String ps=driver.getPageSource();
		System.out.println(ps);
	//get the url present in address bar
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		GetHtml.myTest(driver);
		driver.quit();
		
}
}