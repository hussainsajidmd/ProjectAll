package qsp;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadCV {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		driver.findElement(By.id("block")).click();
		File f=new File("./CV/Sajid.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		String message = driver.findElement(By.className("success")).getText();
		System.out.println(message);
}}
