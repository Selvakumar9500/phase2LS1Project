package com.redbus.qa.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.redbus.qa.base.TestBase;
import com.redbus.qa.pages.HomePage;

public class TestHomePage extends TestBase {
	
	HomePage hp;
	
	@BeforeClass
	public void openApp()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	@Test(testName="title",priority='1')
	public void test_homepagegettitle()
	{
		hp.gettitle();
		extentTest.pass("Test Passed");
	}
	
	
	@Test(testName="busticket", priority='2')
	public void test_Clickonbusticket()
	{
		hp.Clickonbusticket();
		System.out.println(driver.getTitle());
		extentTest.pass("Test Passed");
	}
	

	@Test(testName="cabrental", priority='3')
	public void test_Clickoncabrental()
	{
		hp.Clickoncabrental();
		System.out.println(driver.getTitle());
		extentTest.pass("Test Passed");
	}
	

	
	@Test(testName="redRail",priority='4')
	public void test_ClickonredRail() throws InterruptedException
	{
		hp.ClickonredRail();
		System.out.println(driver.getTitle());
		extentTest.pass("Test Passed");
	}
}