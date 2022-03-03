package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule1 {
	@Test(priority=1,invocationCount = 3)
	public void createCustomer()
	{
		Reporter.log("create customer",true);
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modify customer",true);
	}
	@Test(priority=3,dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("delete customer",true);
	}

}
