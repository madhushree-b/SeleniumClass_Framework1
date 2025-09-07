package org.orangeHRM.runnerScripts;

import org.orangeHRM.allGenericScripts.genricScript_Browser;
import org.testng.annotations.Test;

public class testcase2_ClickClear extends genricScript_Browser
{
	@Test
	public void loginTC() throws Exception
	{
		
		dashboardPOM.PIMLinkClick();
		PIMpage.addEmployeeClick(); 
		
		PIMpage.enterEmpFirstname("madhu");
		PIMpage.clearEmpFirstname();   //Not working
		
		PIMpage.enterEmpMiddlename("shree");
		PIMpage.clearEmpMiddlename();  //Not working
		
		PIMpage.enterEmpLastname("B");
		PIMpage.clearEmpLastname();   //Not working
		
		
	//	PIMpage.saveButton();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}