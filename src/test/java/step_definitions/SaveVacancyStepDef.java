package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ApplyJobPage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SaveVacancyStepDef {
    private final WebDriver driver = Hooks.driver;
    ApplyJobPage applyJobPage = new ApplyJobPage(driver);
    @When("User click on Simpan button")
    public void userClickOnSimpanButton() {
        applyJobPage.clickSimpanButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("User will see message lowongan berhasil disimpan")
    public void userWillSeeMessageLowonganBerhasilDisimpan() {
        applyJobPage.verifyPopUpMessage();
    }
}
