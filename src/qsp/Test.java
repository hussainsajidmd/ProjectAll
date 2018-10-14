package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

		static{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void myTest(WebDriver driver){
			driver.get("http://www.google.com");
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}

		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			Test.myTest(driver);
				
	}
	}

