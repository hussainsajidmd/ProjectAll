package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
//	@FindBy(id="username")
//	private WebElement unTB;
//
//	@FindBy(name="pwd")
//	private WebElement pwTB;
//
//	@FindBy(xpath="//div[text()='Login ']")
//	private WebElement loginBTN;
//	
//	public LoginPage(WebDriver driver){
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void setUsername(String un){
//		unTB.sendKeys(un);
//	}
//	
//	public void setPassword(String pw){
//		pwTB.sendKeys(pw);
//	}
//	
//	public void clickLogin(){
//		loginBTN.click();
//	}
	@FindBy(id="txtUsername")
	private WebElement unTB;

	@FindBy(id="txtPassword")
	private WebElement pwTB;

	@FindBy(id="btnLogin")
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin(){
		loginBTN.click();
	}


}
