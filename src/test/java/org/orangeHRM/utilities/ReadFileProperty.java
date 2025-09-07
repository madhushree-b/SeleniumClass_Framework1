package org.orangeHRM.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.orangeHRM.allGenericScripts.I_ApplicationContants;

public class ReadFileProperty implements I_ApplicationContants 
{
	public static String readData(String key) throws Exception
	{
		FileInputStream fis= new FileInputStream(propertyPath);  //propertyPath inherited from I_ApplicationContstans interface
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
