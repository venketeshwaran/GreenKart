package com.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclass.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\mages\\eclipse-workspace\\GreenCart_Project\\src\\test\\java\\com\\feature\\greenkart.feature", 
           glue = "com.stepdefinition", 
           dryRun = false,
           monochrome = true,
            plugin = {"pretty" })
public class TestNgRunner extends AbstractTestNGCucumberTests{
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {

		driver=BaseClass.browser("chrome");
	}

}
