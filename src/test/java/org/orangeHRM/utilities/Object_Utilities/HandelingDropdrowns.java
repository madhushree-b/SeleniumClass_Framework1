package org.orangeHRM.utilities.Object_Utilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class HandelingDropdrowns 
{
	//select options
		public static void selectDropdown(WebElement element, Object val)
		{
			if(val instanceof String)
			{
				try 
				{
					Object_Utilities.HandelingDropdrowns(element).selectByValue((String) val);
				}
				catch(Exception e)
				{
					Object_Utilities.HandelingDropdrowns(element).selectByVisibleText((String) val);
				}
			}
			else if(val instanceof Integer)
			{
				Object_Utilities.HandelingDropdrowns(element).selectByIndex((int) val);
			}
		}
		
	//deselect options
		public static void deselect(WebElement element)
		{
			Object_Utilities.HandelingDropdrowns(element).deselectAll();
		}
		public static void deselect(WebElement element, Object val)
		{
			if(val instanceof String)
			{
				try 
				{
					Object_Utilities.HandelingDropdrowns(element).deselectByValue((String) val);
				}
				catch(Exception e)
				{
					Object_Utilities.HandelingDropdrowns(element).deselectByVisibleText((String) val);
				}
			}
			else if(val instanceof Integer)
			{
				Object_Utilities.HandelingDropdrowns(element).deselectByIndex((int) val);
			}
		}
		
	//fetchOptions()
	//getOptions()
	//getFirstSelectOption()
	//getAllSelectedOptions()
		public static void readOptions(WebElement element,String action)
		{
			switch (action.toLowerCase()) 
		    {
		        case "allSelectedOption": 	List<WebElement> allSelected = Object_Utilities.HandelingDropdrowns(element).getAllSelectedOptions();
		            			for (WebElement option : allSelected) 
			            		{
			            			System.out.println("Selected option: " + option.getText());
			            		}
			            		break;

		        case "firstselected": 	WebElement firstSelected = Object_Utilities.HandelingDropdrowns(element).getFirstSelectedOption();
		            			System.out.println("First selected: " + firstSelected.getText());
		            			break;

		        case "alloptions":	List<WebElement> allOptions = Object_Utilities.HandelingDropdrowns(element).getOptions();
		            				for (WebElement option : allOptions) 
		            				{
		            					System.out.println("Available option: " + option.getText());
		            				}
		            				break;

		        default: 	System.out.println("Invalid action");
		            		break;
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
