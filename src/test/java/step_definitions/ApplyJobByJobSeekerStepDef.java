package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ApplyJobPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplyJobByJobSeekerStepDef {
    private final WebDriver driver = Hooks.driver;
    ApplyJobPage applyJobPage = new ApplyJobPage(driver);

    @When("User click on vacancy title")
    public void userClickOnVacancyTitle() throws InterruptedException {
        Thread.sleep(5000);
        applyJobPage.clickVacancyTitle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("User will see the vacancy details")
    public void userWillSeeTheVacancyDetails() {
        Assert.assertTrue(applyJobPage.verifyDescriptionLabel());
    }

    @When("User click on lamar button")
    public void userClickOnLamarButton() {
        applyJobPage.clickLamarButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("User will see message lowongan berhasil dilamar")
    public void userWillSeeMessageLowonganBerhasilDilamar() {
        Assert.assertTrue(applyJobPage.verifyPopUpMessage());
    }
}
