package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefile/openswaglabs.feature", glue = "stepdefinition", stepNotifications = true, monochrome = true)
public class Runnerclass {
	
}
