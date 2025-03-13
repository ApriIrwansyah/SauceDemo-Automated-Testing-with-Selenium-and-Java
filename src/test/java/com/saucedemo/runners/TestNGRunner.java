package com.saucedemo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
    features 		= "./src/test/resources/features",
    glue 			= "com.saucedemo.tests",
    plugin 			= {"pretty", "html:target/reports/cucumber-reports-TestNG.html"},
    monochrome 		= true
)
@Test
public class TestNGRunner extends AbstractTestNGCucumberTests {
}

//C:\Users\admin\eclipse-workspace\project_bootcamp_training_saucedemo
