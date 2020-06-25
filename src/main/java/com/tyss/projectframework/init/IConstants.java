package com.tyss.projectframework.init;

public interface IConstants 
{
	String projDir = System.getProperty("user.dir");
	String screemshotPath = projDir+"\\Screenshots";
	String DataexcelPath = projDir+"\\src\\test\\resources\\excel\\readdata.xlsx";
	String propData = projDir +"\\src\\main\\resources\\properties\\data.properties";
	String expectedexcelPath = projDir+"\\src\\test\\resources\\excel\\expectedexcelPath.xlsx";
}
