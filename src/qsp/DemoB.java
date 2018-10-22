package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		

		FirefoxDriver driver=new FirefoxDriver();
		driver.close();


	}
}
