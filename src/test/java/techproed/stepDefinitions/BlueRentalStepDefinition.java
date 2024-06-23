package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.WaitUtils;

import java.util.List;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }


    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalPage.loginButton.click();
    }


    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }

    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password,Keys.ENTER);

    }

    @Then("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        Assert.assertNotEquals("Login",blueRentalPage.loginVerify.getText());
    }

    @And("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable dataTable) {

        //1 . yol
        List< List<String>  > emailPassword = dataTable.asLists();
        System.out.println("emailPassword = " + emailPassword);
        /*
        emailPassword = [[email, password], [sam.walker@bluerentalcars.com, sami], [john_doe@gmail.com, johndoe], [johnson@bluerentalcars.com, johnson]]
         */

        for (int i = 1; i <emailPassword.size() ; i++) {

            String email =  emailPassword.get(i).get(0);
            String password =  emailPassword.get(i).get(1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().back();
        }

        //2.yol
        for (int i = 1; i < dataTable.asLists().size(); i++) {

            String email =  dataTable.row(i).get(0);
            String password =  dataTable.row(i).get(1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().back();
        }

    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olunur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlunur(String sheetName) {

        String path ="src/test/resources/adminTestData.xlsx";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);

        for (int i = 1; i <=excelUtils.rowCount() ; i++) {

            String email = excelUtils.getCellData(i,0);
            String password = excelUtils.getCellData(i,1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);

            WaitUtils.waitFor(1);

            Driver.getDriver().navigate().back();

        }

    }
}