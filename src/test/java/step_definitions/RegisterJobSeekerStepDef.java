package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RegisterJobSeekerPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterJobSeekerStepDef {
    private final WebDriver driver = Hooks.driver;
    RegisterJobSeekerPage registerJobSeekerPage = new RegisterJobSeekerPage(driver);

    @Given("User already on JobHuntz web")
    public void userAlreadyOnJobHuntzWeb() {
        Assert.assertTrue(registerJobSeekerPage.verifyJobHuntzLabel());
        Assert.assertTrue(registerJobSeekerPage.verifyDaftarButton());
    }

    @When("User click Daftar button")
    public void userClickDaftarButton() {
        registerJobSeekerPage.clickDaftarButton();
    }

    @And("User click Candidate Sign Up button")
    public void userClickCandidateSignUpButton() {
        registerJobSeekerPage.clickCandidateSignUpButton();
    }

    @Then("User will redirected to candidate sign up button")
    public void userWillRedirectedToCandidateSignUpButton() {
        Assert.assertTrue(registerJobSeekerPage.verifyCandidateSignUpPage());
    }

    @When("User input {string}, {string}, {string}, and {string}")
    public void userInputAnd(String fullName, String email, String username, String password) {
        registerJobSeekerPage.inputFullNameField(fullName);
        registerJobSeekerPage.inputEmailField(email);
        registerJobSeekerPage.inputUserNameField(username);
        registerJobSeekerPage.inputPasswordField(password);
    }

    @And("User click Register button")
    public void userClickRegisterButton() {
        registerJobSeekerPage.clickRegisterButton();
    }

    @Then("User will be redirected to login page")
    public void userWillBeRedirectedToLoginPage() {
    }



}
