package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ApplyJobPage;
import org.example.pageObject.JobSeekerProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class UpdateJobSeekerProfileStepDef {
    private final WebDriver driver = Hooks.driver;
    JobSeekerProfilePage jobSeekerProfilePage = new JobSeekerProfilePage(driver);
    @When("User click on profile icon")
    public void userClickOnProfileIcon() throws InterruptedException {
        Thread.sleep(5000);
        jobSeekerProfilePage.clickProfileIcon();
        Thread.sleep(3000);
    }

    @And("User select profile")
    public void userSelectProfile() throws InterruptedException {
        jobSeekerProfilePage.clickProfileMenu();
        Thread.sleep(1000);
    }

    @Then("User will see details profile job seeker")
    public void userWillSeeDetailsProfileJobSeeker() {
        Assert.assertTrue(jobSeekerProfilePage.verifyJobSeekerName());
    }

    @When("User click on edit button")
    public void userClickOnEditButton() throws InterruptedException {
        jobSeekerProfilePage.clickEditButton();
        Thread.sleep(3000);
    }

    @Then("User will see edit profile box")
    public void userWillSeeEditProfileBox() {
        Assert.assertTrue(jobSeekerProfilePage.verifyEditBox());
    }

    @When("User input {string} in name field, {string} in password field, {string} in address field, and {string} in phone field")
    public void userInputInNameFieldInAddressFieldInPasswordFieldAndInPhoneField(String name, String password, String address, String phone) {
        jobSeekerProfilePage.inputFullName(name);
        jobSeekerProfilePage.inputPassword(password);
        jobSeekerProfilePage.inputAddress(address);
        jobSeekerProfilePage.inputPhone(phone);
    }

    @And("User click edit button profile")
    public void userClickEditButtonProfile() {
        jobSeekerProfilePage.clickSubmitEditButton();
    }

    @Then("User will see pop up edit profil berhasil")
    public void userWillSeePopUpEditProfilBerhasil() {
        Assert.assertTrue(jobSeekerProfilePage.successEditPopUpVerify());
    }

    @And("User input {string} in birth date field")
    public void userInputInBirthDateField(String date) {
        jobSeekerProfilePage.inputDate(date);
    }

    @And("User click on female gender")
    public void userClickOnFemaleGender() {
        jobSeekerProfilePage.clickFemaleButton();
    }
}
