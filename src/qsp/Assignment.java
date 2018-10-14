package qsp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/SLV.html");
		WebElement list = driver.findElement(By.id("SLV"));
		Select sel=new Select(list);
		List<WebElement> m = sel.getOptions();
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(WebElement option:m){
			String  key=option.getText();
			if(map.containsKey(key)){
				Integer value=map.get(key);
				value++;
				map.put(key, value);
			}
			else{
				map.put(key,1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		String s="Idly";
		if(map.get(s)>1){
			System.out.println(s+" is duplicate");
		}
		else{
			System.out.println(s+" is not duplicate");
		}
		System.out.println(map.keySet());
	for(String key:map.keySet()){
		if(map.get(key)==1){
			System.out.println(key);
		}}
		for(String key:map.keySet()){
			if(map.get(key)>1){
				System.out.println(key);
		
		}
	}

	driver.close();
}
}








