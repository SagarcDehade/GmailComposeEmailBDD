package stepRunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
	features= {"src/test/java/featureFiles/GmailComposeEmail.feature"},
	glue= {"stepDefinitioFiles"},             //package name 
	plugin= {"pretty",
			"html:target/cucumber-reports",
			"json:target/jsonReport.json",
			"junit:target/xmlReport.xml"
			
	},
			publish=true
)


public class GmailcomposeEmailRunner {

}
