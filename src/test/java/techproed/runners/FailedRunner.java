package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"

        },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinitions", "techproed/hooks"},
        dryRun = false,
        monochrome = false
)
        /*Bu classda sadece fail olan scenariolari calistiracağımız icin feature parametresine feature packaginin yolu
        yerine fail scenariolarin oldugu txt dosyasinin yolunu koyariz.
        Dosya yolu belirttigimiz icin path ten önce @ isareti koyariz ve sadece dosya icindeki fail olan sceanariolari
        calistiracağı icin bu classta tags parametresine ihtiyac yoktur         */

public class FailedRunner {
}
