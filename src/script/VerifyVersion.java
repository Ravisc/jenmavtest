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

public class VerifyVersion extends BaseTest{

	@Test
	
	public void testVerifyVersion() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		LoginPage l = new LoginPage(driver);
		//l.VerifyVersion("actiTIME 2015.2");
		String ver = Excel.getCellValue(Input_path, "VerifyVersion", 1, 0);
		l.VerifyVersion(ver);
		Utility.getScreenshot(driver, "version");
		
	}
}
