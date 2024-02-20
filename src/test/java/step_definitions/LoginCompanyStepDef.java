package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
    public void userWillSuccessfullyLoginCompany() {
        Assert.assertTrue(loginCompanyPage.setVerifyLoginCompany());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
}

