package script;

import java.io.IOException;

import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.LoginPage;
import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import generic.Utility;

public class VerifyInvalidLogin extends BaseTest{


	@Test
	
	public void testVerifyInvalidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		/*
		 SoftAssert s = new SoftAssert();
		 // enter invalid username
		LoginPage l = new LoginPage(driver);
		
		l.SetUserName("abc");
		
		//enter invalid password
		
		l.SetPassword("xyz");
		
		//click on login
		
		l.ClickLogin();
		
		// verify err msg is displayed
		
		l.VerifyErrIsPresent(s);
		
		s.assertAll();
		
		*/
		SoftAssert s = new SoftAssert();
		LoginPage l= new LoginPage(driver);
		int rc = Excel.getRowCount(Input_path, "VerifyInvalidLogin");
		
		for(int i=0; i<=rc;i++){
			String un =Excel.getCellValue(Input_path, "VerifyInvalidLogin", i, 0);
			String pw=Excel.getCellValue(Input_path, "VerifyInvalidLogin", i, 1);
			l.SetUserName(un);
			l.SetPassword(pw);
			l.ClickLogin();
			l.VerifyErrIsPresent(s);
			Utility.getScreenshot(driver, "errmsg");
		}
		s.assertAll();
		}
		
	}


