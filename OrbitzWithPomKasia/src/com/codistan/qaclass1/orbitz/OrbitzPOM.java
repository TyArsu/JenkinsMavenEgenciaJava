package com.codistan.qaclass1.orbitz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrbitzPOM {
	//Let's go to Orbitz
	//Please create a package (com.codistan.qaclass1.orbitz) and 2 classes as ( OrbitzPOM) and (OrbitzRunner)
	//Using POM in ( OrbitzPOM) class, please create objects for (Origin, Destination,Departing, Returning and Search)
	//In (OrbitzRunner) class, Enter "Chicago" as OriginCity, "Istanbul" as DestinationCity.
	//DepartDay as November 11, 2018 and ReturnDay as November 21, 2018
	//And search for available package.
	
	public static WebElement element = null;

	public static WebElement packageOrigin(WebDriver driver) {
		element = driver.findElement(By.id("package-origin"));
		return element;
	}
	

	public static WebElement packageDestination(WebDriver driver) {
		element = driver.findElement(By.id("package-destination"));
		return element;
	}

	public static WebElement packageDeparting(WebDriver driver) {
		element = driver.findElement(By.id("package-departing"));
		return element;
	}

	public static WebElement packageReturning(WebDriver driver) {
		element = driver.findElement(By.id("package-returning"));
		return element;
	}

	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}

	
}