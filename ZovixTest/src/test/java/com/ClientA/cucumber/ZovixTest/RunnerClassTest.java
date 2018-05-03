package com.ClientA.cucumber.ZovixTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"}
		,features = {"src/test/features"}
		,dryRun = false
		,monochrome = true
		,tags = {"@TC_001, @TC_002"}
		)

public class RunnerClassTest {

}
