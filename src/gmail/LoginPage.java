package gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration

	@FindBy(id="identifierId")
	private WebElement emailId;

	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd; 

	//Initialization
	public LoginPage(WebDriver driver){    
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public void setEmail(String email){   
		emailId.sendKeys(email);
	}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}



}
