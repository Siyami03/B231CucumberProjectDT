package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.handleCaptcha();
        amazonPage.searchbox.sendKeys("iphone");
        amazonPage.searchbox.submit();
    }

    @When("arama kutusunda samsung aratir")
    public void arama_kutusunda_samsung_aratir() {
        amazonPage.handleCaptcha();
        amazonPage.searchbox.sendKeys("samsung");
        amazonPage.searchbox.submit();
    }


    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.handleCaptcha();
        amazonPage.searchbox.sendKeys("nokia");
        amazonPage.searchbox.submit();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(url);

    }
    @When("arama kutusunda {string} aratir")
    public void arama_kutusunda_aratir(String string) {
        amazonPage.handleCaptcha();
        amazonPage.searchbox.sendKeys(string);
        amazonPage.searchbox.submit();
    }
}