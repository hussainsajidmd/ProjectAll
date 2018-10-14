package qsp;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(Result.class)
public class DemoResult {

	@Test
	public void createCustomer(){
		Reporter.log("Create a Customer", true);
	}

	@Test
	public void editCustomer(){
		Reporter.log("Edit a Customer", true);
	}

	@Test
	public void deleteCustomer(){
		Reporter.log("Delete a Customer", true);
	}
}
