package com.tyss.projectframework.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.tyss.projectframework.lib.GenericLib;

public class rough 
{
	@Test
	public void demo1()
	{
		System.out.println(GenericLib.getPropData("browservalue"));
	}
}
