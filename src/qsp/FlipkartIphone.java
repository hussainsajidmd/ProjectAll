package qsp;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartIphone {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		//  We should avoid using any numbers while using locators.
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone X");
		driver.findElement(By.xpath("//span[text()='iphone x mobile']/..")).click();
		String path="//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allPrice=driver.findElements(By.xpath(path));
		System.out.println("Total number of product is "+allPrice.size());
		//We can use ArrayList also, but to sort it we have to use Collections.sort()
		TreeSet<Integer> price=new TreeSet<Integer>();
		for(WebElement pr:allPrice){
			String n = pr.getText().substring(1).replaceAll(",", "");
			int n1 = Integer.parseInt(n);
			price.add(n1);
		}
		System.out.println("Lowest price: "+price.first());
		System.out.println("Highest price: "+price.last());
	}	
}	

