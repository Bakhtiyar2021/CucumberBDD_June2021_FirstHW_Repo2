import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/jana/features",
        glue = "stepDef",
        plugin = {
                "jason:target/cucumber.jason"
}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
