package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CustomerModule extends BaseClass
{
	@Test
	public void creatCustomer()
	{
		Reporter.log("Create Customer",true);	
	}
	@Test
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
