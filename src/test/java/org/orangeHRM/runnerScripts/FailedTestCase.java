package org.orangeHRM.runnerScripts;

import org.orangeHRM.allGenericScripts.genricScript_Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase extends genricScript_Browser
{
	@Test //(dataProvider = "newEmployeeData", dataProviderClass = ReadExcelData.class)  //ReadExcelData is class name
	public void loginTC() throws Exception
	{
		dashboardPOM.PIMLinkClick();
		PIMpage.addEmployeeClick(); 
		
		PIMpage.enterEmpFirstname("xxx");
		PIMpage.enterEmpMiddlename("xxxx");
		PIMpage.enterEmpLastname("xxxx");
		PIMpage.saveButton();
		Assert.fail();
	}

}