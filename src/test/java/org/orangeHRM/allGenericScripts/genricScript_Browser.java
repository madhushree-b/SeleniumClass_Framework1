package org.orangeHRM.allGenericScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.orangeHRM.pageObjects.PIMPageObjects;
import org.orangeHRM.pageObjects.dashboardPageObjects;
import org.orangeHRM.pageObjects.loginPageObjects;
import org.orangeHRM.utilities.ReadFileProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class genricScript_Browser implements I_ApplicationContants
{
	//Global Variables
	public static WebDriver driver;
	public loginPageObjects loginPOM;
	public dashboardPageObjects dashboardPOM;
	public PIMPageObjects PIMpage;
	
	
	@BeforeClass
	@Parameters("browsername") //parameter value passing from the .xml file
	public void launchEmptybrowser(String browsername)
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		switch(browsername.trim().toLowerCase())  //trim() to trim empty spaces   &   toLowerCase() to convert all letters to lowercase
		{
		case "chrome": driver= new ChromeDriver();
						break;
		case "firefox": driver= new FirefoxDriver();
						break;
		case "edge": driver= new EdgeDriver();
						break;
		default: System.out.println("======Invalid Browser======");
		}
	}
	
	@BeforeMethod
	public void websiteURL() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(waitTimeDuration, TimeUnit.MINUTES);  //waitTimeDuration inherited from I_ApplicationContstans interface
		driver.manage().window().maximize(); //maximize the browser
		
		String baseurl = ReadFileProperty.readData("baseurl");
		driver.navigate().to(baseurl);
		loginPOM= new loginPageObjects(driver);   //import loginPageObjects class
		PIMpage= new PIMPageObjects(driver); //import PIMPageObjects class
		login();  //call login method
		
		dashboardPOM= new dashboardPageObjects(driver);
		
	}

	public void login() throws Exception
	{
		String usn = ReadFileProperty.readData("adminusn");
		String psw = ReadFileProperty.readData("adminpsw");
		loginPOM.userNameTF(usn);
		loginPOM.passwordTF(psw);
		loginPOM.loginBtn();
	}
	
	@AfterMethod
	public void logout()
	{
		dashboardPOM.profileDropdownClick();
		dashboardPOM.logoutBtnClick();
	}

	
	
	
	
}
