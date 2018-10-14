package qsp;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
		map.put("City", "Bangalore");
		map.put("Name", "Sajid");
		map.put("Eid", "A1");
		map.put("Name", "Hussain");
		System.out.println(map.get("Name"));
		System.out.println(map.get("name"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey("Name"));
		System.out.println(map.containsKey("Area"));
	

}
}