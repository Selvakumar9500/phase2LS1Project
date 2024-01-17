package com.redbus.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// Find an element on the webpage --> we used findElement(By.locatorname("locator value"))
	
	// now we can also find element using an annotation @FindBy
	
	// synatx is : @FindBy(locatorname = "value")
	//             WebElement objectname;
	
	// this class will consist of objects and action methods
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Bus Tickets']")
	WebElement busticket;
	
	@FindBy(xpath = "//span[normalize-space()='Cab Rental']")
	WebElement cabrental;
	
	@FindBy(xpath = "//a[normalize-space()='redRail']")
	WebElement redRail;
	
	
	// we create a constructor of the current class to initiate these above objects and pass them to driver object
	// In every page class we have to write the below code
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// Write the code to perform actions on each of these above page objects
	
	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	
	
	public void Clickonbusticket()
	{
		busticket.click();
	}
	
	public void Clickoncabrental()
	{
		cabrental.click();
	}
	
	public void ClickonredRail()
	{
		redRail.click();
	}
	


}