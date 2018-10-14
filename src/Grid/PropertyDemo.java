package Grid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyDemo {
	@Test
	public static void gridProperty() throws FileNotFoundException, IOException{
		Properties p=new Properties();
		p.load(new FileInputStream("./input/data.properties"));
		String v=p.getProperty("area");
		System.out.println(v);
	}

}
