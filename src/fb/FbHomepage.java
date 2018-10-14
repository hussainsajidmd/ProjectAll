package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbHomepage {
	//Declaration
	@FindBy(id="pageLoginAnchor")    
	private  WebElement dropdown;
	
	@FindBy(xpath="//span[text()='Log Out']/../..")
	private  WebElement logout; 

	//Initialization
	public FbHomepage(WebDriver driver){    
		 PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void dropClick(){
		dropdown.click();
	}
	public void logoutClick(){
		logout.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private  WebElement dropdown,logout; //declaration

	public FbHomepage(WebDriver driver){    //Initialization
		 dropdown=driver.findElement(By.id("pageLoginAnchor"));
		
	}
	
	
	public void dropClick(){
		dropdown.click();
	}
	
*/

