package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"}, glue= {"com.step.stepDefination"},
		plugin= {"pretty","junit:Report3"},
		dryRun= false, //bydefault its true(its run scenario those donot have step defination
		monochrome=true
		//tags= {"tag1"}
		//name= {"Login"}
		
		)


public class TestRunner {

}
