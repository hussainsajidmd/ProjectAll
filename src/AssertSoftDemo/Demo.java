package AssertSoftDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
	@Test
	public void testLogin1(){
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String actTitle=driver.getTitle();
		String expTitle="invalid";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
	}
	
	@Test
	public void testLogin2(){
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String actTitle=driver.getTitle();
		String expTitle="invalid";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actTitle, expTitle);
		driver.close();
		s.assertAll();
	}
}
