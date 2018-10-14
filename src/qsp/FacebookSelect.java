package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement list = driver.findElement(By.id("month"));
		Select sel=new Select(list);
		List<WebElement> txt1 = sel.getOptions();
		List<String> txt=new ArrayList<String>();
		for(WebElement op:txt1){
			txt.add(op.getText());
		}
		List<String> txt2=new ArrayList<String>(txt);
		Collections.sort(txt2);
		System.out.println(txt);
		System.out.println(txt2);
		if(txt.equals(txt2)){
			System.out.println("LB is in sorted order");
		}
		else{
			System.out.println("LB is not in sorted order");
		}
}
}



/*	for(int i=1;i<m.size();i++){
WebElement o = m.get(i);
System.out.println(o.getText());
}*/
/*for(WebElement s:m){
System.out.println(s.getText());
}
driver.close();*/