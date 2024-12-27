package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/FEATURES",
		glue="org.steps",
		publish = true,
		plugin = {"pretty", "html:target/output.html", "junit:target/output.xml"},
		monochrome=true,
		dryRun =false
		
		)
public class TestRunner {

}
