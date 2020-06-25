package com.tyss.projectframework.lib;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel 
{
	public static String writeDataFromExcel() 
	{
		try 
		{
			File f=new File("C:\\Users\\thanu\\new-eclipse\\ProjectFamework\\src\\test\\resources\\excel\\readdata.xlsx");
			FileOutputStream fos=new FileOutputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sh=wb.createSheet();
			sh.createRow(2).createCell(1).setCellValue("admin");
			sh.createRow(2).createCell(2).setCellValue("Test@123");
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		return null;
	}
}
