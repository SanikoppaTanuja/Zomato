package com.Zomato.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Zomato.pageobjects.Loginpage;

public class SearcTestcase_002 extends Baseclass {
	@Test
	public void serchritems() throws InterruptedException
	{	driver.get(baseURL);
		logger.info("URL launched");
		SoftAssert asser=new SoftAssert();
		String actualtitle=driver.getTitle();
		String expectedtile="Zomat";
		asser.assertEquals(actualtitle, expectedtile);
		
		driver.manage().window().maximize();
		Loginpage loginpage=new Loginpage(driver);
		
		loginpage.searcdishes("Pizza");
		
		Thread.sleep(12000);
		
		asser.assertAll();

		

	}
	

}
