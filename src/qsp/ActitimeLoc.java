package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActitimeLoc {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url
		driver.get("https://demo.actitime.com/login.do");
		//Verify Login page is displayed
		//1 Verify Title
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected Title: "+expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title: "+actualTitle);
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Pass: Title is matching!");
		}
		else{
			System.out.println("Fail: Title is not matching!");
		}
		//2 Verify Elements are present or not
		//username
		WebElement username = driver.findElement(By.id("username"));
		if(username.isDisplayed()){
			System.out.println("\nPass: Login page has username");
		}
		else{
			System.out.println("\nFail: Login page doesn't have username");
		}
		//password
		WebElement password = driver.findElement(By.name("pwd"));
		if(password.isDisplayed()){
			System.out.println("Pass: Login page has password");
		}
		else{
			System.out.println("Fail: Login page doesn't have password");
		}
		//login button
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(login.isDisplayed()){
			System.out.println("Pass: Login page has login button");
		}
		else{
			System.out.println("Fail: Login page doesn't have login button");
		}
		//3 Enter username and password and click on Login button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']" )).click();
		//Use thread.sleep() as selenium speed is faster than application.
		//By using it, we can decrease the selenium speed.
		Thread.sleep(3000);
		String expHomeTitle="actiTIME - Enter Time-Track";
		System.out.println("Expected Homepage Title: "+expHomeTitle);
		String actHomeTitle = driver.getTitle();
		System.out.println("Actual Homepage Title: "+actHomeTitle);
		if(actHomeTitle.equals(expHomeTitle)){
			System.out.println("Pass: Homepage is displayed ");
		}
		else{
			System.out.println("Fail: Homepage is not displayed");
		}
		driver.close();
	}}

