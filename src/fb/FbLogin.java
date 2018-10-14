package fb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {
	//Declaration
	@FindBy(id="email")     
	private WebElement unTB;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn; 

	//Initialization
	public FbLogin(WebDriver driver){    
	PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUsername(String un){   
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}
	public void clickLogin(){
		loginBtn.click();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private WebElement unTB,pwd,loginBtn; //declaration

	public FbLogin(WebDriver driver){    //Initialization
		unTB=driver.findElement(By.id("email"));
		pwd=driver.findElement(By.id("pass"));
		loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
	}

	public void setUsername(String un){   //Utilization
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}
	public void clickLogin(){
		loginBtn.click();
	}
*/

