package org.stepdefinition;

import org.base.SampleBase;
import org.pojo.StoryPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurStory extends SampleBase{
	
	StoryPojo sp;
	
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
	    sp = new StoryPojo();
	    sp.getAccountBtn().click();
	}

	@When("User pass the valid phone number in phone number field")
	public void user_pass_the_valid_phone_number_in_phone_number_field() throws InterruptedException {
	    Thread.sleep(3000);
	    sp = new StoryPojo();
	    sp.getPhNumber().sendKeys("8760502392");
	}

	@When("User pass valid password in password field")
	public void user_pass_valid_password_in_password_field() {
	    sp = new StoryPojo();
	    sp.getPassWord().sendKeys("9876543210");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		sp = new StoryPojo();
		sp.getLoginBtn().click();
	}

	@When("User click our story button")
	public void user_click_our_story_button() throws InterruptedException {
		Thread.sleep(3000);
	    sp = new StoryPojo();
	    sp.getOurStory().click();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    System.out.println("Browser closed......!");
	}

}
