package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "demo1.feature",
        glue = "stepdefinition",
        plugin = "html:reports/demo1.html",
        monochrome = true,
        tags="@register1"


)
public class runner {
}
