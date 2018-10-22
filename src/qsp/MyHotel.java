package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyHotel {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/MyHotel.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select sel=new Select(listBox);
		sel.selectByIndex(0);
		sel.selectByValue("v");
		sel.selectByVisibleText("Idly");
		List<WebElement> p = sel.getAllSelectedOptions();
		System.out.println(p.size());
		WebElement f = sel.getFirstSelectedOption();
		System.out.println(f.getText());
		List<WebElement> o = sel.getOptions();
		System.out.println(o.size());
		if(sel.isMultiple()){
			System.out.println("Yes, we can deselect...");
			sel.deselectByIndex(0);
			sel.deselectByValue("v");
			sel.deselectByVisibleText("Dosa");
			sel.deselectAll();
		}
		else{
			System.out.println("Sorry, we cant use deselect on Single select list box");
		}
}
}