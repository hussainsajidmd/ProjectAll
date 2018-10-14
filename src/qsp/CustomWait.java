package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']" )).click();
		while(true){
			try{
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout link is present and clicked.");
				break;
				}
			catch (Exception e) {
				System.out.println("Logout link is not present.");		
			}
		}
		driver.close();
}}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=1;i<=100;i++){  //we can use while also.
			String title=driver.getTitle();
			if(title.contains("Enter")){
				System.out.println(title);
				break;
			}
			else{
				System.out.println("Still in login page: Iteration -> "+i);
			}
		}*/
		
