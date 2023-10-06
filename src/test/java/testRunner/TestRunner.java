package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "StepDefinations" , monochrome = true, 
dryRun = false, tags ="@production")
public class TestRunner extends AbstractTestNGCucumberTests {

}
