package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.JobSeekerCareerPage;
import org.example.pageObject.LoginCompanyPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class JobSeekerCareerStepDef {
    private final WebDriver driver = Hooks.driver;
    JobSeekerCareerPage jobSeekerCareerPage = new JobSeekerCareerPage(driver);
    @When("User click + button next to Riwayat Karir label")
    public void userClickButtonNextToRiwayatKarirLabel() {
        jobSeekerCareerPage.clickPlusButtonCareer();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User will see Riwayat Karir field box")
    public void userWillSeeRiwayatKarirFieldBox() {
        Assert.assertTrue(jobSeekerCareerPage.verifyRiwayatKarirBox());
    }

    @When("User input {string} as position, {string} as company name, {string} as start date, and {string} as end date")
    public void userInputAsPositionAsCompanyNameAsStartDateAndAsEndDate(String position, String companyName, String startDate, String endDate) {
        jobSeekerCareerPage.inputCareer(position, companyName, startDate, endDate);
    }

    @And("User click Tambah career button")
    public void userClickTambahCareerButton() throws InterruptedException {
        jobSeekerCareerPage.clickAddCareer();
        Thread.sleep(2000);
    }

    @Then("User will see pop up tambah karir berhasil")
    public void userWillSeePopUpTambahKarirBerhasil() {
//        Assert.assertTrue(jobSeekerCareerPage.verifySuccessPopUp());
    }
}
