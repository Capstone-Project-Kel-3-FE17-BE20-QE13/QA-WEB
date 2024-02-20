package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RegisterCompanyPage;
import org.example.pageObject.RegisterJobSeekerPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegisterCompanyStepDef {
    private final WebDriver driver = Hooks.driver;
    RegisterCompanyPage registerCompanyPage = new RegisterCompanyPage(driver);
    @And("User click Employee Hiring button")
    public void userClickEmployeeHiringButton() {
        registerCompanyPage.clickEmployeeHiring();
    }

    @Then("User will be redirected to Company Sign Up page")
    public void userWillBeRedirectedToCompanySignUpPage() {
        Assert.assertTrue(registerCompanyPage.verifyCompanySignUpPage());
    }

    @When("User input full name {string}, email {string}, password {string}, company name {string}, company type {string}, and website {string}")
    public void userInputFullNameEmailPasswordCompanyNameCompanyTypeAndWebsite(String fullName, String email, String password, String companyName, String companyType, String website) {
        registerCompanyPage.inputFullName(fullName);
        registerCompanyPage.inputEmail(email);
        registerCompanyPage.inputPassword(password);
        registerCompanyPage.inputCompanyName(companyName);
        registerCompanyPage.inputCompanyType(companyType);
        registerCompanyPage.inputWebsite(website);
    }

    @And("User choose company size {string}")
    public void userChooseCompanySize(String company_size) {
        registerCompanyPage.selectCompanySize(company_size);
    }

    @And("User click Register button for register company")
    public void userClickRegisterButtonForRegisterCompany() {
        registerCompanyPage.clickRegisterButtonCompany();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User will successfully registered")
    public void userWillSuccessfullyRegistered() {
        Assert.assertTrue(registerCompanyPage.verifyPopUpMessage());
    }

    @Then("User will see message below the field {string}")
    public void userWillSeeMessageBelowTheField(String message) {
        Assert.assertTrue(registerCompanyPage.fieldRequiredMessage(message));
    }

    @Then("User will see error message duplicate email")
    public void userWillSeeErrorMessageDuplicateEmail() {
        Assert.assertTrue(registerCompanyPage.verifyPopUpMessage());
    }
}
