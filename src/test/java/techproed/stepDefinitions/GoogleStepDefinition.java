package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

import java.util.List;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();

    @When("arama kutusunda {string} aratilir")
    public void aramaKutusundaAratilir(String arac) {
        googlePage.searchbox.sendKeys(arac, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int second) {
        WaitUtils.waitFor(second);
    }

    @When("kullanici verilen bilgilerle arama yapar")
    public void kullaniciVerilenBilgilerleAramaYapar(DataTable data) {

        List<String> dataTableList =  data.asList();

        for (int i = 0; i < dataTableList.size(); i++) {
            googlePage.searchbox.sendKeys(dataTableList.get(i),Keys.ENTER);
            googlePage.searchbox.clear();
        }
    }

    @When("kullanici verilen bilgilerle arama yapar ikinci yol")
    public void kullaniciVerilenBilgilerleAramaYaparIkinciYol(List<String> list) {
        for(String w : list){
            googlePage.searchbox.sendKeys(w,Keys.ENTER);
            googlePage.searchbox.clear();
        }
    }
}
