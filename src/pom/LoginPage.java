package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;
import generic.Utility;

public class LoginPage extends BasePage{
	
	@FindBy(id="username")
	private WebElement UnTB;
	
	@FindBy(name="pwd")
	private WebElement PwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement Errmsg;
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void SetUserName(String un){
		UnTB.sendKeys(un);
	}
		
		public void SetPassword(String pw){
			PwTB.sendKeys(pw);
		}
		
 public void ClickLogin() throws IOException{
	 LoginBtn.click();
	}
 public void VerifyVersion(String eVersion){
	 String aTitle= version.getText();
	 Assert.assertEquals(aTitle, eVersion);
	 Reporter.log(aTitle,true);
 }
 
 
 public void VerifyErrIsPresent(SoftAssert s){
	 WebDriverWait wait = new WebDriverWait(driver,10);
	 try{
	 wait.until(ExpectedConditions.visibilityOf(Errmsg));
		 Reporter.log("Error message is displayed",true);
	 }
	 
	 catch(Exception e){
		 Reporter.log("Error message is not displayed",true);
	 }
 }
}
