package org.stepdefinition;

import org.base.SampleBase;
import org.pojo.RegisterPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BistoRegisteration extends SampleBase{
	
	RegisterPojo rp;
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		launchBrowser();
		windowMaximize();
	}

	@When("User launch the url of the application")
	public void user_launch_the_url_of_the_application() {
	    launchUrl("https://bistrobitesdc.com/");
	}

	@When("User click the account button")
	public void user_click_the_account_button() {
	    rp = new RegisterPojo();
	    rp.getAccountBtn().click();
	}

	@When("User pass the valid name in name field")
	public void user_pass_the_valid_name_in_name_field() throws InterruptedException {
		Thread.sleep(3000);
		rp = new RegisterPojo();
		rp.getName().sendKeys("Sutheep S");
	}

	@When("User pass the valid email in email field")
	public void user_pass_the_valid_email_in_email_field() {
		rp = new RegisterPojo();
		rp.getEmail().sendKeys("s@gmail.com");
	}

	@When("User pass the valid phone number in phone number field")
	public void user_pass_the_valid_phone_number_in_phone_number_field() {
		rp = new RegisterPojo();
		rp.getPhone().sendKeys("7598439021");
	}

	@When("User pass the password field")
	public void user_pass_the_password_field() {
		rp = new RegisterPojo();
		rp.getPassword().sendKeys("9876543210");
	}

	@When("User click the register button")
	public void user_click_the_register_button() {
		rp = new RegisterPojo();
		rp.getRegisterBtn().click();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    System.out.println("Browser closed.............!");
	}

}
