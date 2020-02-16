import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
				glue = "stepDefinitions",
				strict = true,
				monochrome = true,
				plugin = {"pretty", "html:target/HTMLReport"}
)

public class TestRunner {

}
