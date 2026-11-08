package com.magento.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.magento",
    plugin = {"pretty", "summary",
    		"html:target/cucumber-reports/cucumber.html",
            "json:target/cucumber-reports/cucumber.json",
            "junit:target/cucumber-reports/cucumber.xml",
            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // allure reports
    },
    monochrome = false,
    publish = true,
    dryRun = false,
    tags = "@catalog"

	)
public class TestRunnerCatalog extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){ //max =10
		return super.scenarios();
	}

}