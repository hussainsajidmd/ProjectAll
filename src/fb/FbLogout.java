package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLogout {
	private WebElement logout; //declaration

		public FbLogout(WebDriver driver){    //Initialization
		 logout=driver.findElement(By.xpath("//span[text()='Log Out']/../.."));
			
		}
	public void logoutClick(){
		logout.click();
	}


}
