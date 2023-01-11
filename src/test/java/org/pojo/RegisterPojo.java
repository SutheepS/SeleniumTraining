package org.pojo;

import org.base.SampleBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPojo extends SampleBase{
	public RegisterPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement accountBtn;
	@FindBy(id = "name")
	private WebElement name;
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "phone")
	private WebElement phone;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement registerBtn;
	
	
	public WebElement getAccountBtn() {
		return accountBtn;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRegisterBtn() {
		return registerBtn;
	}

}
