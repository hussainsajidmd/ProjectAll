package qsp;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateScrPath {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String v = d.toString();
		System.out.println(v); //OS will not allow : as file name
		String v2=v.replaceAll(":","-"); //so replace it
		System.out.println(v2);
		WebDriver driver=new ChromeDriver(); //up-casting
		driver.get("http://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver; //type-casting
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		String path="./pic/"+v2+".png";
		System.out.println(path);
		File destFile=new File(path);
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}
