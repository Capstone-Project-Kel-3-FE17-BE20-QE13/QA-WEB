package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RegisterJobSeekerPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("User will be redirected to candidate sign up page")
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @Then("User will see message successfully registered")
    public void userWillBeSeeMessageSuccessfullyRegistered() {
        Assert.assertTrue(registerJobSeekerPage.verifyPopUpMessage());
    }

    @Then("User will see message {string}")
    public void userWillSeeMessage(String message) {
        Assert.assertEquals(registerJobSeekerPage.getPopUpMessage(), message);
    }

    @Then("User will see message under the field {string}")
    public void userWillSeeMessageUnderTheField(String message) {
        Assert.assertTrue(registerJobSeekerPage.fieldRequiredMessage(message));
    }

    @And("User click Register button with valid input")
    public void userClickRegisterButtonWithValidInput() {
        registerJobSeekerPage.clickRegisterButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("User is required to enter a valid email to register")
    public void userIsRequiredToEnterAValidEmail() {
        Assert.assertTrue(registerJobSeekerPage.verifyCandidateSignUpPage());
    }
}
