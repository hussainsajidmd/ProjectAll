package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class ScriptLess {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		for(int i=1;i<=3;i++) {
			String k1=Utility.getDataFromXL("./input/data.xlsx","Keys", i, 0);
			String k2=Utility.getDataFromXL("./input/data.xlsx","Keys", i, 1);
			String k3=Utility.getDataFromXL("./input/data.xlsx","Keys", i, 2);
			System.out.println("k1:"+k1);
			System.out.println("k2:"+k2);
			System.out.println("k3:"+k3);
			
			String xpath=Utility.getProperty("./input/elements.properties", k2);
			if(k1.equals("enter")) {
				driver.findElement(By.xpath(xpath)).sendKeys(k3);
			}
			else if(k1.equals("click")) {
				driver.findElement(By.xpath(xpath)).click();
			}
			else {
				System.out.println("invalid k1");
			}
			Thread.sleep(1000);
		}
		driver.close();
	}
	

}
