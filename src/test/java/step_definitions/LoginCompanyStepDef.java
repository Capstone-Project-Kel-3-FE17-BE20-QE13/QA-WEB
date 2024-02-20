package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginCompanyPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;

public class LoginCompanyStepDef {
    private final WebDriver driver = Hooks.driver;
    LoginCompanyPage loginCompanyPage = new LoginCompanyPage(driver);

    @And("User click Masuk Company button")
    public void userClickMasukCompanyButton() {
        loginCompanyPage.setGotoLogincompany();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("User will be redirected to login company page")
    public void userWillBeRedirectedToLoginCompanyPage() {
        Assert.assertTrue(loginCompanyPage.verifyProfileCompany());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("User will successfully login company")
    public void userWillSuccessfullyLoginCompany() throws InterruptedException {
        Assert.assertTrue(loginCompanyPage.setVerifyLoginCompany());
        //        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Thread.sleep(5000);
    }

    @When("User click photo profile")
    public void userClickPhotoProfile() throws InterruptedException {
        Assert.assertTrue(loginCompanyPage.verifyPhotoProfile());
        loginCompanyPage.clickPhotoProfile();
        Thread.sleep(3000);
    }

    @And("User click button daftar lowongan")
    public void userClickButtonDaftarLowongan() throws InterruptedException {
        loginCompanyPage.clickButtonLowongan();
        Thread.sleep(1000);
    }

    @And("User click button add")
    public void userClickButtonAdd() {
        loginCompanyPage.clickButtonAdd();
    }

    @And("User input {string} as nama posisi, {string} as tipe kerjaan, {string} as alamat, {string} as estimasi gaji")
    public void inputData1(String posisi, String jobType, String address, String gaji) {
        loginCompanyPage.inputFieldPosisi(posisi);
        loginCompanyPage.inputFieldJobType(jobType);
        loginCompanyPage.inputFieldAddress(address);
        loginCompanyPage.inputFieldGaji(gaji);
//        loginCompanyPage.inputFieldBidangPekerjaan(bidangPekerjaan);
//        loginCompanyPage.inputFieldDeskripsi(deskripsi);
//        loginCompanyPage.inputFieldKualifikasi(kualifikasi);
    }

    @And("User click bidang pekerjaan and chose 1")
    public void userClickBidangPekerjaanAndChose() throws InterruptedException {
        loginCompanyPage.clickBidangPekerjaan();
        loginCompanyPage.clickButtonIT();
        Thread.sleep(3000);
    }

    @And("User click tambah lowongan button")
    public void userClickTambahLowonganButton() throws InterruptedException {
        loginCompanyPage.clickTambahLowongan();
        Thread.sleep(3000);
    }

//    @Then("User will see success tambah lowongan")
//    public void userWillSeeSuccessTambahLowongan() throws InterruptedException {
//        Assert.assertTrue(loginCompanyPage.verifyPopUpSuccess());
//        ;
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        Thread.sleep(3000);
//
//    }
}


