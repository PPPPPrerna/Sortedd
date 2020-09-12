package objectrepositiory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import quick.Sort.Base;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import quick.Sort.SoTest;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;


public class Obj {
	
	private static Logger log = LogManager.getLogger(SoTest.class.getName());

	
	
	WebDriver driver;
	
	public Obj(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	public void cal() {
	
List<WebElement> list = driver.findElements(By.xpath("//tr/td[2]"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=0;i<list.size();i++) {
			al.add(list.get(i).getText());
		}
		
		log.info(al);
		
		ArrayList<String> ob= new ArrayList<String>();
		log.info("Changes values");
		ob.addAll(al);
		
		Collections.sort(ob);
		log.info(ob);
		
		if(ob.equals(al)) {
			log.info("True");
		}
		
	}
	
	public void screen() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\screenshots"+"\\scre.png";
		
		FileUtils.copyFile(src, new File(path));
	}
		

	}
	
	


