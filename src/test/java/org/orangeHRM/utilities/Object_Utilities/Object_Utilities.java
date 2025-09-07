package org.orangeHRM.utilities.Object_Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Object_Utilities 
{
	public static Actions MouseActions(WebDriver driver)
	{
		Actions a = new Actions(driver);
		return a;
	}
	public static Select HandelingDropdrowns(WebElement dropdownElement)
	{
		return new Select(dropdownElement);
	}
	public static JavascriptExecutor Scroll_Actions(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		return js;
	
	}
	
}
