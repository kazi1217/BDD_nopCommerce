package runnerB;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/kaziarahman/BDD_Practice/src/test/java/featureB/Login.feature"
        ,glue={"stepsA"}
        ,monochrome = true //display the console output in readable format
        //,dryRun = true      // checking if mapping is in place
        //, tags = "~@sanityTest"
        // , tags = "~@SmokeTest"
        , plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/Cucumber.html"}
)

public class TestRunnerB {
}