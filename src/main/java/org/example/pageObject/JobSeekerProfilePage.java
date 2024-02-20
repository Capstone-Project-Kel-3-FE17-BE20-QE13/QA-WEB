package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSeekerProfilePage {
    public static WebDriver webDriver;

    public JobSeekerProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='dropdown dropdown-end']")
    private WebElement profileIcon;
    @FindBy(xpath = "//a[.='Profile']")
    private WebElement selectProfile;
    @FindBy(xpath = "//h1[@class='text-3xl font-bold']")
    private WebElement jobSeekerNameLabel;
    @FindBy(xpath = "//label[@class='btn w-[80px] h-10 p-1 rounded-md bg-secondary text-white']")
    private WebElement editButton;
    @FindBy(xpath = "//h3[.='Edit Data Company']")
    private WebElement editDataLabel;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullNameField;
    @FindBy(xpath ="//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='address']")
    private WebElement addressField;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneField;
    @FindBy(xpath = "//input[@id='ttl']")
    private WebElement dateField;
    @FindBy(xpath = "//input[@id='female']")
    private WebElement femaleButton;
    @FindBy(xpath = "//input[@value='Edit']")
    private WebElement submitEditButton;
    @FindBy(xpath = "//div[@class='alert alert-success my-5']")
    private WebElement successEditPopUp;

    public void clickProfileIcon () {
        profileIcon.click();
    }

    public void clickProfileMenu () {
        selectProfile.click();
    }

    public boolean verifyJobSeekerName () {
        return jobSeekerNameLabel.isDisplayed();
    }

    public void clickEditButton () {
        editButton.click();
    }

    public boolean verifyEditBox () {
        return editDataLabel.isDisplayed();
    }

    public void inputFullName (String fullName) {
        fullNameField.clear();
        fullNameField.sendKeys(fullName);
    }

    public void inputPassword (String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void inputAddress (String address) {
        addressField.clear();
        addressField.sendKeys(address);
    }

    public void inputPhone (String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void inputDate (String date) {
        dateField.clear();
        dateField.sendKeys(date);
    }

    public void clickFemaleButton () {
        femaleButton.click();
    }

    public void clickSubmitEditButton () {
        submitEditButton.click();
    }

    public boolean successEditPopUpVerify () {
        return successEditPopUp.isDisplayed();
    }

}
