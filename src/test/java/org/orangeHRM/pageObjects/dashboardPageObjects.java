package org.orangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.orangeHRM.utilities.pageInitializer;

public class dashboardPageObjects extends pageInitializer
{
	
	//Step1: Declaration
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement profileDropDown;
	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement PIMbutton;
	
	//Step2: Initialization
	public dashboardPageObjects(WebDriver driver) 
	{
		super(driver);
	}
/*	public dashboardPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}  */
	
	
	
	
	//Step3: Implementation
	public void profileDropdownClick()
	{
		profileDropDown.click();
	}
	public void logoutBtnClick()
	{
		logoutBtn.click();
	}
	public void PIMLinkClick()
	{
		PIMbutton.click();
	}
	
	

}
