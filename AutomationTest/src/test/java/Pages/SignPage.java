package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.Base;

public class SignPage extends Base {
	static WebDriver driver;
	
	@FindBy(id = "")
	static WebElement uname;

	@FindBy(xpath = "")
	WebElement pw;

	@FindBy(xpath = "")
	WebElement btn;
/*	
	public SignPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this); // To initialize the page factory elements

	}
	*/

	/*
	public void initializePageFactoryForSignPage()
	{
		PageFactory.initElements(driver, this);
	}

*/
		public static void enterUname() throws IOException {
		// WebElement uname=driver.findElement(By.id(""));
		uname.sendKeys(Base.readExcelData("Sheet1", 1, 0));
	}

	public void enterPwd() throws IOException {

		// WebElement pw=driver.findElement(By.id(""));
		pw.sendKeys(Base.readExcelData("Sheet1", 1, 0));

	}
	
	public void clickBtn() {
		
		if(btn.isEnabled())
		{
			test.log(Status.PASS, "Button is enabled");
		}
		else
		{
			test.log(Status.FAIL, "Button is disabled");
		}
		

		
	}

}
