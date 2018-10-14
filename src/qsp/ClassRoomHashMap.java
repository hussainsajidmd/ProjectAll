package qsp;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomHashMap {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("PC", 2);
		map.put("Projector", 2);
		map.put("Chair", 130);
		map.put("Marker", 4);
		
		System.out.println("Number of chairs are: "+map.get("Chair"));
		if(map.get("Projector").equals("Projector")){
			System.out.println("Yes class has projector");
		}
		else{
			System.out.println("No, class has no projector");
		}
				
	
}
}