package qsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriveActions {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://drive.google.com/drive/my-drive");
		driver.findElement(By.id("identifierId")).sendKeys("hussainsajid.md");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("******");
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Najaf and honey']/..")));
		Actions actions=new Actions(driver);
		actions.doubleClick(target).perform();
		String t = driver.getTitle();
		System.out.println(t);	
}}