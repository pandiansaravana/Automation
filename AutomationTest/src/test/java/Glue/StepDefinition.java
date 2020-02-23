package Glue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base;
import Pages.SignPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	


	@Given("^User launches the browser$")
	public void userLaunchesBrowser() {

		Base.initializeBrowser();
		
		
	}

	@And("^Opens the URL$")
	public void opensURL() throws IOException {
		Base.opensApplication();
	}

	@When("^I Enters user name$")
	public void i_Enters_user_name() throws Throwable {
		SignPage page=new SignPage();
		//page.initializePageFactoryForSignPage();
		SignPage.enterUname();;
		
	
	}

	@When("^Enters password$")
	public void enters_password() throws Throwable {

	}

	@Then("^Login should be success$")
	public void login_should_be_success() throws Throwable {
		
		

	}

	@Then("^Login should Not be success$")
	public void login_should_Not_be_success() throws Throwable {

	}

}
