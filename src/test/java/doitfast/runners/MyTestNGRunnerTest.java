package doitfast.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
                features = "src/test/resources/featureFile",
        glue = {"doitfast.pages", "doitfast.hooks", "doitfast.stepdefinations",  "doitfast.customtype" },
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        }
        //plugin = {"pretty", "summary"}
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
