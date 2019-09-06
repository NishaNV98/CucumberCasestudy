package casestudy3;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	//@CucumberOptions( monochrome=true,plugin = { "html:myreports" }, tags = "@sanity")
	//@CucumberOptions(monochrome=true,plugin = {"pretty","json: jsonreport.json" })
	// @CucumberOptions(monochrome=true,plugin= {"html:myreports"})
@CucumberOptions(monochrome=true,plugin = {"json: case3.json" })
public class case3Runner {

}
