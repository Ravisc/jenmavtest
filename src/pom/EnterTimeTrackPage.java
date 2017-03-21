package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class EnterTimeTrackPage extends BasePage {
	
@FindBy(xpath="//a[@href='/tasks/otasklist.do']")
private WebElement task;
@FindBy(xpath="//a[@onclick='editTask(41); return false;']")
            private WebElement email;

@FindBy(id="closeTaskEditPopupButton")
WebElement close;

	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")	
	private WebElement icon;
	
	@FindBy(xpath="//a[.='User Guide']")
	private WebElement guide;
	
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}

	public void clickemailcontent(){
		email.click();
	}
	public void closebutton(){
		close.click();
	}
	
	public void clickSupportIcon(){
		icon.click();
	}
	
	public void ClickLogout(){
		logoutlink.click();
	
	}
	
	public void clicktask(){
		task.click();
	}
	
	public void clickGuide(){
		guide.click();
	}
}


