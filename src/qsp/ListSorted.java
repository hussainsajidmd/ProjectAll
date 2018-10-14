package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSorted {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<String> a=new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		System.out.println(a);
		
		List<String> b=new ArrayList<String>();
		b.addAll(a);
		Collections.sort(b);
		System.out.println(b);
		
		System.out.println(a.equals(b));
		
		if(a.equals(b)){
			System.out.println("a list is sorted");
			
		}
		else{
			System.out.println("a list is not sorted");
		}
		
		
		b.add("A");
		b.add("B");
		b.add("C");
		System.out.println(b);
		
	
	

}
}