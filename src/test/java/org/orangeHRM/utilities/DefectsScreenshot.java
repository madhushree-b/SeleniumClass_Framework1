package org.orangeHRM.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.orangeHRM.allGenericScripts.genricScript_Browser;

public class DefectsScreenshot extends genricScript_Browser
{

	public static void defectscreenshot(String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(screenShotsPath + filename + GetSystemTime.getcurrentTime()+ ".png");  //screenShotsPath inherited from I_ApplicationContstans interface
		FileHandler.copy(temp, perm);
	}
}
