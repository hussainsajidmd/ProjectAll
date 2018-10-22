package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn; 
	
//	private WebElement unTB;
//	private WebElement pwd;
//	private WebElement loginBtn; //declaration

	public LoginPage(WebDriver driver){    //initialisation
		PageFactory.initElements(driver, this);
//		unTB=driver.findElement(By.id("username"));
//		pwd=driver.findElement(By.name("pwd"));
//		loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}

	public void setUsername(String un){   //utilisation
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}
	public void clickLogin(){
		loginBtn.click();
	}

}
