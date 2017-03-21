package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.BaseTest;
import generic.Excel;
import generic.Utility;

public class VerifyLoginLogout extends BaseTest{

	@Test
	
	public void testVerifyLoginLogout() throws EncryptedDocumentException, InvalidFormatException, IOException{
/**		
		//enter valid username
	LoginPage l = new LoginPage(driver);
	
	l.SetUserName("admin");
	
	//enter valid password
	
	l.SetPassword("manager");
	
	//click on login
	
	l.ClickLogin();
	
	// verify home page is displayed
	
	EnterTimeTrackPage et = new EnterTimeTrackPage(driver);
	et.VerifyTitle("actiTIME -  Enter Time-Track");
	
		//click on logout
	
		et.ClickLogout();
		
		// verify login page displayed
		l.VerifyTitle("actiTIME -  Login");
		
		**/
		
		LoginPage l=new LoginPage(driver);
		String un=Excel.getCellValue(Input_path,"VerifyLoginLogout", 1, 0);
		String pw=Excel.getCellValue(Input_path, "VerifyLoginLogout", 1,1);
		String eTitle=Excel.getCellValue(Input_path, "VerifyLoginLogout", 1,2);
		String etTitle=Excel.getCellValue(Input_path, "VerifyLoginLogout", 2, 2);
		l.SetUserName(un);
		l.SetPassword(pw);
		l.ClickLogin();
		
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		et.VerifyTitle(etTitle);
		Utility.getScreenshot(driver, "HomepageTitle");
		et.clicktask();
		et.clickemailcontent();
		et.closebutton();
		et.clickSupportIcon();
		et.clickGuide();
		et.ClickLogout();
		l.VerifyTitle(eTitle);
		Utility.getScreenshot(driver, "logintitle");
		
	}
}
