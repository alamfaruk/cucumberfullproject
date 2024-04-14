package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features = {"C:\\Ealdatabase\\Eclips\\workspace\\cucumberfullproject\\features"},
		 glue = {"step_definitions","utilities"},
		 plugin= {
					"pretty",
					"html:C:\\Ealdatabase\\Eclips\\workspace\\cucumberfullproject\\target\\htmlReport.html",
					"json:C:\\Ealdatabase\\Eclips\\workspace\\cucumberfullproject\\target\\jsonReportfolder.json"
					
			},
		 monochrome=false,
		 dryRun=true,
		 tags="@yourstoreafinal"
		
		
		)

public class Testng_Runner  extends AbstractTestNGCucumberTests{

}
