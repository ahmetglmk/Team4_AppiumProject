package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:test-output/default-cucumber-reports.html",
                "json:test-output/json-reports/cucumber.json",
                "junit:test-output/htmlReport/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@2" ,
        dryRun = false


)
public class Runner {
}
