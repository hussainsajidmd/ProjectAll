package qsp;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	//Declaration
	@FindBy(xpath="//a")     
	private List<WebElement> allLinks;

	//Initialization
	public SearchPage(WebDriver driver){    
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void printLinkCount(){  
		int count = allLinks.size();
		System.out.println("Total number of link is "+count);
	}
}
