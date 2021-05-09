package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver , int tcid) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("C:\\Users\\Vaibhav\\Desktop\\screenshoot\\kitesite_"+tcid+".jpg");
		 
		 FileHandler.copy(src, dest);
	}
	
	public static String getPropertyfiledata(String key) throws IOException
	{
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\testData.properties");
		obj.load(objfile);
		String sh = obj.getProperty(key);
		return sh;
	}
}
