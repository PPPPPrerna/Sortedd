package quick.Sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;
	
	
	public WebDriver initializeDriver() throws IOException {
	
	Properties prop=new Properties();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Sort\\resources\\data.properties");

	prop.load(fis);
	
	String browserName =prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//so dis will be applilied to entire test case.
	
	return driver;
}
}
