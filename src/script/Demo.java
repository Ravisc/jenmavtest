package script;

import generic.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public  void verifytest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Time\\ActiTime\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
				
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();
Thread.sleep(10000);
String v=driver.getTitle();
driver.findElement(By.id("logoutLink")).click();
String x=driver.getTitle();

Reporter.log(v,true);
Reporter.log(x,true);
		
		
	}

}
