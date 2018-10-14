package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PgPractice {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  //Enter the Url
		driver.get("https://www.irctc.co.in/nget/train-search");
	  //Click on login
		
		driver.findElement(By.id("loginText")).click();
	  //Enter valid username & password
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userId"))).sendKeys("dijass");
		driver.findElement(By.id("pwd")).sendKeys("dijasS1!");
	  //Enter the captcha manually, you have only 15 seconds to fill it
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Close']"));
		
		if(ele.isDisplayed()){
			ele.click();
		}
		
	  //Enter the station name from where you have to start the journey
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From*']"))).sendKeys("BHAGALPUR");
		Thread.sleep(500);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	  //Enter the station name of the destination
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("PNBE");
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
	  //Enter date of journey
		String date="//input[@placeholder='Journey Date(dd-mm-yyyy)*']";
		driver.findElement(By.xpath(date)).click();
	  //Select the month by clicking on the right arrow, here I've selected October, means next to this month.So only 1 time click
		driver.findElement(By.xpath("//span[@class='fa fa-angle-right']/..")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//button[text()='Find trains']")).click();
	  //Enter the number of passengers
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(text(),'Number Of Passengers')])[2]"))).click();
		driver.findElement(By.xpath("//span[text()='1']/..")).click();
	  //Enter the class name
		WebElement coach = driver.findElement(By.xpath("(//select[@formcontrolname='classInput'])[4]"));
		Select select1=new Select(coach);
		select1.selectByValue("1: 3A");
	  //Choose the train
		driver.findElement(By.xpath("//span[contains(text(),'FARAKKA')]/../../../../../div[3]//button")).click();
	  //Book the seat
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Book Now'])[2]"))).click();
	  //Enter the passenger details
		wait.until(ExpectedConditions.elementToBeClickable(By.id("psgn-name"))).sendKeys("MD SAJID HUSSAIN");
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("24");
		WebElement gender = driver.findElement(By.xpath("//select[@formcontrolname='passengerGender']"));
		Select select2=new Select(gender);
		select2.selectByValue("M");
		WebElement berth= driver.findElement(By.xpath("//select[@formcontrolname='passengerBerthChoice']"));
		Select select3=new Select(berth);
		select3.selectByValue("UB");
	    driver.findElement(By.xpath("//label[starts-with(text(),'Yes')]")).click();
//        WebElement b = driver.findElement(By.xpath(("//input[@id='nlpAnswer'])[1]")));
//        if(b.isDisplayed()){
//        	b.click();
//        }
//	    //Enter the captcha manually, you have only 15 seconds to fill it
	    Thread.sleep(15000);
	    
	    driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Continue Booking'])[1]"))).click();
	  //Choose the payment option
	    driver.findElement(By.xpath("(//span[@class='ui-tabview-title'])[4]/..")).click();
	  //Choose the bank
	    driver.findElement(By.xpath("(//span[contains(text(),'State Bank')])[1]")).click();
	    driver.findElement(By.xpath("(//button[text()='Make Payment'])[7]")).click();
      //Provide card details
		
				
		
		
		
		
	
	}

}
