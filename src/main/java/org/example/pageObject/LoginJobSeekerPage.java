package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.WBufferStrategy;

public class LoginJobSeekerPage {
    public static WebDriver webDriver;

    public LoginJobSeekerPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//a[@href='/logincandidate']")
    private WebElement masukButton;
    @FindBy(xpath = "//p[@class='font-semibold']")
    private WebElement loginCandidateLabel;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(css = ".bg-secondary")
    private WebElement loginButton;
    @FindBy(xpath = "//h1[@class='text-2xl font-bold']")
    private WebElement lowonganTerkiniLabel;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpMessage;


    public void clickMasukButton () {
        masukButton.click();
    }

    public boolean verifyLoginPage () {
        return loginCandidateLabel.isDisplayed();
    }

    public void inputEmail (String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword (String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton () {
        loginButton.click();
    }

    public boolean verifySuccessLogin () {
        return lowonganTerkiniLabel.isDisplayed();
    }

<<<<<<< Updated upstream
    public boolean verifyPopUpMessage () {
        return popUpMessage.isDisplayed();
    }
=======
>>>>>>> Stashed changes
}
