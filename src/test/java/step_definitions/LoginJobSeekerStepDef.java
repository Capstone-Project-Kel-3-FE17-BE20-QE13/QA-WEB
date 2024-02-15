package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginJobSeekerPage;
import org.example.pageObject.RegisterJobSeekerPage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginJobSeekerStepDef {
    private final WebDriver driver = Hooks.driver;
    LoginJobSeekerPage loginJobSeekerPage = new LoginJobSeekerPage(driver);
    @And("User click Masuk button")
    public void userClickMasukButton() {
        loginJobSeekerPage.clickMasukButton();
    }

    @Then("User will be redirected to login page")
    public void userWillBeRedirectedToLoginPage() {
        loginJobSeekerPage.verifyLoginPage();
    }

    @When("User input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) {
        loginJobSeekerPage.inputEmail(email);
        loginJobSeekerPage.inputPassword(password);
    }

    @And("User click Login button")
    public void userClickLoginButton() {
        loginJobSeekerPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("User will successfully login")
    public void userWillSuccessfullyLogin() {
        loginJobSeekerPage.verifySuccessLogin();
    }
}
