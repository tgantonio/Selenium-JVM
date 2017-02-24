package com.expedia.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.expedia.baseclasses.BaseClass;
import com.expedia.baseclasses.PageBase;
import com.expedia.helper.WaitTypes;
import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;
import com.expedia.pages.Headers.HomeHeader.Flights.FlightsTabPage;
import com.expedia.pages.Headers.HomeHeader.Flights.OneWayButtonPage;
import com.expedia.pages.Headers.HomeHeader.Flights.ReturnButtonPage;
import com.expedia.settings.BrowserSetting;
import com.expedia.settings.BrowserType;

public class FrameworkTest {
	WebDriver driver;
	PageBase base;
	HomeHeaderPage HHPage;
	FlightsTabPage FTPage;
	OneWayButtonPage OWBPage;
	ReturnButtonPage RBPage;
	
	@BeforeSuite
	public void BeforeTestRun() throws InterruptedException{
		driver = BaseClass.LaunchBrowser();
	}
	
	@BeforeClass
	public void beforeClass() {
		
		base = new PageBase(driver);
		HHPage = new HomeHeaderPage(driver);
		FTPage = new FlightsTabPage(driver);
		RBPage = new ReturnButtonPage(driver);
		OWBPage = new OneWayButtonPage(driver);
		
	}

	@Test
	public void OneWayFlightTest() throws InterruptedException {
		HHPage.HomeHeader.click();
		FTPage = HHPage.NavigateToFlightTabPage();
		OWBPage = FTPage.NavigateToOneWayButtonPage();
		OWBPage.FlyingFromTextbox.sendKeys("London");
		OWBPage.FlyingToTextbox.sendKeys("Paris");
		
		
		
		
//		HHPage.HomeHeader.click();
//		Thread.sleep(4000);
//		HHPage.FlightsTab.click();
//		FTPage.ReturnButton.click();
//		FTPage.FlyingFromTextbox.sendKeys("London");
//		FTPage.FlyingToTextbox.sendKeys("Paris");
//		FTPage.DepartingCalendar.click();
//		RBPage.ReturningCalendar.click();
//		FTPage.AdultsDropdown.click();
//		RBPage.ChildrenDropdown.click();
//		RBPage.AddAHotelCheckbox.click();
//		RBPage.AddACarCheckbox.click();
//		RBPage.SearchButton.click();
//		
//		

	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();

	}
	
	@AfterSuite
	public void AfterTestRun(){
		driver.quit();
	}

}
