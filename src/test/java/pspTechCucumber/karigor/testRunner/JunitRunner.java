package pspTechCucumber.karigor.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
//@CucumberOptions(features=".\\Feature\\karigor1Home.feature",
glue="pspTechCucumber.karigor.steps",
monochrome=true,
plugin= {"pretty", "html:target/cucumber-reports"} // To generate a html report  with name in target folder
		
		
)


public class JunitRunner {

}
