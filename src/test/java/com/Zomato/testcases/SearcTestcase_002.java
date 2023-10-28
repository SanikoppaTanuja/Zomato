package com.Zomato.testcases;

import org.testng.annotations.Test;

import com.Zomato.pageobjects.Loginpage;

public class SearcTestcase_002 extends Baseclass {
	@Test
	public void serchritems() throws InterruptedException
	{	driver.get(baseURL);
		driver.manage().window().maximize();
		Loginpage loginpage=new Loginpage(driver);
		
		loginpage.searcdishes("Pizza");
		
		Thread.sleep(12000);

		
	loginpage.clickonpizza();
	}
	

}
