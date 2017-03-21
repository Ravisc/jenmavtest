package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;
import generic.Excel;
import generic.Utility;

public class VerifyLoginPage extends BaseTest{

	@Test
	
	public void testVerifyLoginPage() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//verify loginpage is displayed
		
		LoginPage l = new LoginPage(driver);
		String eTitle=Excel.getCellValue(Input_path, "VerifyLoginPage", 1, 0);
		l.VerifyTitle("actiTIME -  Login");
		Utility.getScreenshot(driver, "loginTitle");
		//l.VerifyTitle(eTitle);
	}
	
	
}
