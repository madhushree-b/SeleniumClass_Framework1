package org.orangeHRM.runnerScripts;

import org.orangeHRM.allGenericScripts.genricScript_Browser;
import org.orangeHRM.utilities.ReadExcelData;
import org.testng.annotations.Test;

public class testcase1_LoginTest extends genricScript_Browser
{
	@Test(dataProvider = "newEmployeeData", dataProviderClass = ReadExcelData.class)  //ReadExcelData is class name
	public void loginTC(String fn, String mn, String ln) throws Exception
	{
		dashboardPOM.PIMLinkClick();
		PIMpage.addEmployeeClick(); 
		
		PIMpage.enterEmpFirstname(fn);
		PIMpage.enterEmpMiddlename(ln);
		PIMpage.enterEmpLastname(mn);
		PIMpage.saveButton();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}