package com.codistan.qaclass1.orbitz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codistan.qaclass1.orbitz.OrbitzPOM;

public class OrbitzRunner {
WebDriver driver;
	//Let's go to Orbitz
	//Please create a package (com.codistan.qaclass1.orbitz) and 2 classes as ( OrbitzPOM) and (OrbitzRunner)
	//Using POM in ( OrbitzPOM) class, please create objects for (Origin, Destination,Departing, Returning and Search)
	//In (OrbitzRunner) class, Enter "Chicago" as OriginCity, "Istanbul" as DestinationCity.
	//DepartDay as November 11, 2018 and ReturnDay as November 21, 2018
	//And search for available package.
	@BeforeTest
	public void OrbitzSetup() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/kasia/Documents/Libraries/drivers/chromedriver3");
		driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
	}
	
	@Test
	public void orbitzFlightPage() {
		
		OrbitzPOM.packageOrigin(driver).sendKeys("Chicago");
		OrbitzPOM.packageDestination(driver).sendKeys("Istanbul");
		OrbitzPOM.packageDeparting(driver).sendKeys("11/11/2018");
		OrbitzPOM.packageReturning(driver).sendKeys("11/21/2018");
		OrbitzPOM.searchButton(driver).click();
		
	}
	
	
	
}

