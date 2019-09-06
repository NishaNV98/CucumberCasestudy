package casestudy4;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	//@CucumberOptions( monochrome=true,plugin = { "html:myreports" }, tags = "@sanity")
	//@CucumberOptions(monochrome=true,plugin = {"pretty","json: jsonreport.json" })
	// @CucumberOptions(monochrome=true,plugin= {"html:myreports"})
@CucumberOptions(monochrome=true,plugin = {"json: case4.json" })

public class case4Runner {

}
