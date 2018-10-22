package qsp;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException{
		
		WebDriver driver=new ChromeDriver(); //up-casting
		driver.get("http://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver; //type-casting
		//File s = ts.getScreenshotAs(OutputType.FILE);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/a.png"); //png- portable network graphics
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}

