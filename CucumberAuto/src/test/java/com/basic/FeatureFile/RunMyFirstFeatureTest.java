package com.basic.FeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = true,
		
		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",		
				"com.cucumber.listener.ExtendCucumberFormatter:target/ExtendReport.html",
		}
		)
public class RunMyFirstFeatureTest {

	
	
}
