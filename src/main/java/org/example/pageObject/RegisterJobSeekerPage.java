package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterJobSeekerPage {
    public static WebDriver webDriver;

    public RegisterJobSeekerPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//a[.='JobHuntz']")
    private WebElement jobHuntzLabel;
    @FindBy(xpath = "//a[.='Daftar']")
    private WebElement daftarButton;
    @FindBy(xpath = "//button[.='Candidate Sign Up']")
    private WebElement candidateSignUpButton;
    @FindBy(xpath = "//h1[@class='text-xl font-semibold']")
    private WebElement candidateSignUpLabel;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullNameField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@class='p-2 lg:p-[13px] lg:w-[320px] bg-secondary cursor-pointer hover:bg-orange-500 active:bg-orange-600 text-white rounded-xl drop-shadow-md outline-none mb-4 mt-16']")
    private WebElement registerButton;
    @FindBy(xpath = "//h1[@class='text-2xl font-semibold mb-4']")
    private WebElement masukLabel;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement emailHasBeenRegisteredMessage;

    public boolean verifyJobHuntzLabel () {
        return jobHuntzLabel.isDisplayed();
    }

    public boolean verifyDaftarButton () {
        return daftarButton.isDisplayed();
    }
    public void clickDaftarButton () {
        daftarButton.click();
    }

    public void clickCandidateSignUpButton () {
        candidateSignUpButton.click();
    }

    public boolean verifyCandidateSignUpPage () {
        return candidateSignUpLabel.isDisplayed();
    }

    public void inputFullNameField (String fullName) {
        fullNameField.sendKeys(fullName);
    }

    public void inputEmailField (String email) {
        emailField.sendKeys(email);
    }

    public void inputUserNameField (String username) {
        userNameField.sendKeys(username);
    }

    public void inputPasswordField (String password) {
        passwordField.sendKeys(password);
    }

    public void clickRegisterButton () {
        registerButton.click();
    }

    public boolean verifyLoginPage () {
        return masukLabel.isDisplayed();
    }

//    public boolean verifyEmailDuplicateMessage () {
////        String locatorMessage = "//div[@id='swal2-html-container']";
//        String locatorMessage = "//div[@class='swal2-html-container']";
//        return webDriver.findElement(By.xpath(locatorMessage)).isDisplayed();
//    }
//
//    public boolean verifyEmailHasBeenUsed (String message) {
//        String locatorMessage = "//div[contains(text(), '" + message + "')]";
//        return webDriver.findElement(By.xpath(locatorMessage)).isDisplayed();
//    }

    public String getEmailHasBeenRegisteredMessage () {
        return emailHasBeenRegisteredMessage.getText();
    }

    public boolean fieldRequiredMessage (String message) {
        String fieldRequired = "//p[contains(text(),'" + message + "')]";
        return webDriver.findElement(By.xpath(fieldRequired)).isDisplayed();
    }
}
