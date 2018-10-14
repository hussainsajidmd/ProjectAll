package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html3Sep {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MD%20SAJID%20HUSSAIN/Desktop/Demo3.html");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));	
       int count = allLinks.size();
       System.out.println(count);
      WebElement link = allLinks.get(1); //index is 1 that means get 2nd link from the list
      link.click();
	}
}
