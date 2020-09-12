package quick.Sort;

import java.io.IOException;
import java.util.ArrayList;
import quick.Sort.Base;

import objectrepositiory.Logger;
import objectrepositiory.Obj;
import objectrepositiory.SoTest;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositiory.Obj;
import org.apache.logging.log4j.*;

public class SoTest extends Base{
	

	@Test
	public void rodn() throws IOException {
		Base b=new Base();
		driver=b.initializeDriver();
		
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		Obj obi = new Obj(driver);
		
		obi.cal();	
		
		System.out.println("Nice joke");
		
		System.out.println("Colle");
		
		System.out.println("heheheh");
		
		System.out.println("heheheh");
		System.out.println("yeah");
		System.out.println("Pagal");
		
		//obi.screen();

	}
}
