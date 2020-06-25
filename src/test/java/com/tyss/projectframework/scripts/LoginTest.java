package com.tyss.projectframework.scripts;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.projectframework.init.IConstants;
import com.tyss.projectframework.lib.BaseLib;
import com.tyss.projectframework.lib.ExcelLib;
import com.tyss.projectframework.pages.BookPage;
import com.tyss.projectframework.pages.HomePage;
import com.tyss.projectframework.pages.MyCartPage;
import com.tyss.projectframework.pages.SignInPage;

//@Listeners(com.tyss.projectframework.listeners.MyListners.class)
public class LoginTest extends BaseLib
{
	@Test
	public void tc_01() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		Assert.assertEquals(hp.getHomePage(), ExcelLib.getData("Sheet1", 1, 1, IConstants.expectedexcelPath));
		hp.myAccountBtnClick();
		Thread.sleep(5000);
		SignInPage sip = new SignInPage(driver);
		Assert.assertEquals(sip.getSignInPage(), ExcelLib.getData("Sheet1", 1, 2, IConstants.expectedexcelPath));
	    String un = ExcelLib.getData("Sheet1",1,1,IConstants.DataexcelPath);
	    String pw = ExcelLib.getData("Sheet1",1,2,IConstants.DataexcelPath);
	    sip.doLogin(un, pw);
	    MyCartPage mcp = new MyCartPage(driver);
	    Assert.assertEquals(mcp.getWelcomeName(), ExcelLib.getData("Sheet1", 1, 3, IConstants.expectedexcelPath));
	    Thread.sleep(5000);
	    BookPage bp = new BookPage(driver);
	    Thread.sleep(4000);
	    bp.BooksClick();
     }
}