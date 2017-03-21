package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.steadystate.css.util.Output;



public class Utility {
	//public static WebDriver driver;
	
	public static void getScreenshot(WebDriver driver, String EnterScreenshotName) throws IOException{
		
		try{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		File descfile= new File("E://Time//ActiTime//screenshot//"+EnterScreenshotName+".png");
		FileUtils.copyFile(srcfile,descfile);
		}
		catch(Exception e){}
	}
	
	

}
