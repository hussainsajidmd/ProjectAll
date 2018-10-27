package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/qsp.html");
		String s = driver.findElement(By.id("t1")).getAttribute("value");
		String s1=driver.findElement(By.id("t2")).getAttribute("value");
		String s2=driver.findElement(By.id("t3")).getAttribute("value");
		int ss=Integer.parseInt(s);
		int s11=Integer.parseInt(s1);
		int s22=Integer.parseInt(s2);
		
		if(ss*s11==s22) {
			System.out.println("Right");
		}
		else {
			System.out.println("Wrong");
		}
		
		
//		//Mouse hover on the menu
//		Actions actions=new Actions(driver);
//		actions.moveToElement(menu).perform();
//		driver.findElement(By.linkText("Simple Time Tracking")).click();
//		WebDriver driver1= new ChromeDriver();
//		
			
		
}
}