package org.orangeHRM.utilities.Object_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll_Actions 
{
	public static void scrollToElement(WebDriver driver, WebElement ele)
	{
		Object_Utilities.Scroll_Actions(driver).executeScript("arguments[0].scrollIntoView()",ele);
	}
	public static void scrollToElement(WebDriver driver, int x, int y)
	{
		Object_Utilities.Scroll_Actions(driver).executeScript("window.ScrollBy("+x+","+y+")");
	}
	public static void scrollToPageBottom(WebDriver driver)
	{
		Object_Utilities.Scroll_Actions(driver).executeScript("window.ScrollBy(0.docuemnt.body.scrollHeight");
	}
	public static void scrollToPageTop(WebDriver driver)
	{
		Object_Utilities.Scroll_Actions(driver).executeScript("window.ScrollBy(0.-docuemnt.body.scrollHeight");
	}
	
	
}
