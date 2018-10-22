package Grid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestLogin {
	public static void main(String[] args) throws Exception  {
		
		//Read from excel sheet
		/*FileInputStream pathRead=new FileInputStream("./input/Book1.xlsx");
		Workbook read = WorkbookFactory.create(pathRead);
		String username = read.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = read.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']" )).click();
		//Write in excel sheet
		FileOutputStream pathWrite = new FileOutputStream("./input/Book1.xlsx");
		read.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Sajid");
		read.write(pathWrite);
		read.close();*/
		//Read from excel sheet
				Workbook w = WorkbookFactory.create(new FileInputStream("./input/Book5.xlsx"));
				String v=w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(v);
				//write in excel sheet
				w.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Bhanu");
				w.write(new FileOutputStream("./input/Book2.xlsx"));
				w.close();
		
		
		
		

	}

}
