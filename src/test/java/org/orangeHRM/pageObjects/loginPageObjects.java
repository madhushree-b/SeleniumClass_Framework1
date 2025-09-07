package org.orangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.orangeHRM.utilities.pageInitializer;

public class loginPageObjects extends pageInitializer
{
	//step1: Declaration
	@FindBy (name="username")   //find element by name
	private WebElement usn;
	
	@FindBy (name="password")
	private WebElement pass;
	
	@FindBy (xpath = "//button[@type='submit']")   //find element by xpath
	private WebElement login;
	
	
	//step2: Initialization
	public loginPageObjects(WebDriver driver) 
	{
		super(driver);
	}
	/*
	public loginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}  */
	
	//step3: Declaration
	public void userNameTF(String username)
	{
		usn.sendKeys(username);
	}
	public void passwordTF(String password)
	{
		pass.sendKeys(password);
	}
	public void loginBtn()
	{
		login.click();
	}
}
