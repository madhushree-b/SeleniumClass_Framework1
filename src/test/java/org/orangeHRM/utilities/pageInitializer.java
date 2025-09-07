package org.orangeHRM.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageInitializer 
{
	public pageInitializer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
