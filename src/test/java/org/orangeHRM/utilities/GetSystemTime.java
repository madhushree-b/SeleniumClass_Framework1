package org.orangeHRM.utilities;

import java.util.Date;

public class GetSystemTime 
{
	public static String getcurrentTime()
	{
		Date d= new Date();
		String sDate = d.toString();
		String newDate = sDate.replace(":", "_");
		return newDate;
		
	}
	
}
