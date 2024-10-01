package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	
	XSSFWorkbook workb;
	public void getdata() throws IOException 
	{
		String excelpath = System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
		//String excelpath1 = "C:\\Users\\sures\\eclipse-workspace\\QDTAS_HRM_HYBRIDFRAMEWORK\\TestData\\LoginData.xlsx";
		
		File src = new File(excelpath);
		FileInputStream file = new FileInputStream(src);
		workb= new XSSFWorkbook(file);
		
	}

public String getStringData(String sheetname, int row,int column) {
		
		
		return workb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	//public double getNumericData(String sheetname, int row,int column) {
		
	//return workb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	//}
	
	
}
