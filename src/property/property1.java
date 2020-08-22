package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class property1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prob=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Saiful\\eclipse-workspace\\FirstCode\\src\\mukul.properties");
		prob.load(fis);
		System.out.println(prob.getProperty("browser"));
		System.out.println(prob.getProperty("xpath"));
		System.out.println(prob.getProperty("css"));
		prob.setProperty("WebElement", "Driver.findElementsByXpath");
		prob.setProperty("email", "saiful@gmail.com");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Saiful\\eclipse-workspace\\FirstCode\\src\\mukul.properties");
		prob.store(fos, null);
		
		
		
		
		
				
	}

}
