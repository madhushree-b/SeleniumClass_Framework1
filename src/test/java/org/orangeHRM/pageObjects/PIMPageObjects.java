package org.orangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.orangeHRM.utilities.pageInitializer;

public class PIMPageObjects extends pageInitializer
{
		//step1: Declaration
		@FindBy (xpath="//a[.='Add Employee']") //find element by xpath
		private WebElement addEmployee;
		@FindBy (xpath = "//input[@name='firstName']")
		private WebElement firstNameTF;
		@FindBy (xpath = "//input[@name='middleName']")
		private WebElement middleNameTF;
		@FindBy (xpath = "//input[@name='lastName']")
		private WebElement lastNameTF;
		@FindBy (xpath = "//button[@type='submit']")
		private WebElement saveBtn;
		
		
		//step2: Initialization
		public PIMPageObjects(WebDriver driver) 
		{
			super(driver);
		}
		/*
		public PIMPageObjects(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		*/
		
		//step3: Declaration
		public void addEmployeeClick()
		{
			addEmployee.click();
		}
		public void enterEmpFirstname(String fn)
		{
			firstNameTF.sendKeys(fn);
		}
		public void clearEmpFirstname()
		{
			firstNameTF.clear();
		}
		public void enterEmpMiddlename(String mn)
		{
			middleNameTF.sendKeys(mn);
		}
		public void clearEmpMiddlename()
		{
			middleNameTF.clear();
		}
		public void enterEmpLastname(String ln)
		{
			lastNameTF.sendKeys(ln);
		}
		public void clearEmpLastname()
		{
			lastNameTF.clear();
		}
		public void saveButton()
		{
			saveBtn.click();
		}

}		


