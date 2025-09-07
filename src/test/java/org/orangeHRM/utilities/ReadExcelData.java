package org.orangeHRM.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.orangeHRM.allGenericScripts.I_ApplicationContants;
import org.testng.annotations.DataProvider;

public class ReadExcelData implements I_ApplicationContants
{
	@DataProvider(name= "newEmployeeData")
	public static String[][] readCSVdata() throws Exception
	{
		FileInputStream fis= new FileInputStream(excelPath);  //excelPath inherited from I_ApplicationContstans interface
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet(ReadFileProperty.readData("sheetName")); //sheet name we have declared in the Property files
		int lastRow =sheet.getLastRowNum();
		
		String[][] data= new String[lastRow][sheet.getRow(0).getLastCellNum()];
		
		for (int r=1; r<=lastRow; r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++)
			{
				XSSFCell cell = row.getCell(c);
				String value = cell.getStringCellValue();
				data[r-1][c]=value;
			}
		}
		
		book.close();
		fis.close();
		return data;
		
	}
}
