package helpers;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/homePage.feature",
        glue = {"helpers","classpath/stepDefinition"},

        plugin =  {"html:target/nourdine_Cucumber_report/HTML_Report.html","json:target/nourdine_Cucumber_report/json_report.json"},
        monochrome = true


)






public class Runner {
}
