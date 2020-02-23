package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Logintests.feature",glue= {"Glue","hooks"},
tags="@tag3", monochrome=true, dryRun=false)
public class TestRunner 
{

}
