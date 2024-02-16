package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterCompanyPage {
    public static WebDriver webDriver;

    public RegisterCompanyPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[.='Employee Hiring']")
    private WebElement employeeHiringButton;
    @FindBy(xpath = "//h1[@class='text-xl font-semibold']")
    private WebElement companySignUpLabel;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullNameField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='company_name']")
    private WebElement companyNameField;
    @FindBy(xpath = "//input[@name='company_type']")
    private WebElement companyTypeField;
    @FindBy(xpath = "//input[@name='website']")
    private WebElement websiteField;
    @FindBy(xpath = "//select[@id='size']")
    private WebElement selectCompanySize;
    @FindBy(xpath = "//input[@class='p-2 lg:p-[13px] lg:w-[320px] bg-secondary cursor-pointer hover:bg-orange-500 active:bg-orange-600 text-white rounded-xl drop-shadow-md outline-none mb-4 mt-5']")
    private WebElement registerButtonCompany;
    @FindBy(xpath = "//p[@class='font-semibold']")
    private WebElement loginCompanyLabel;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpMessage;

    public void clickEmployeeHiring () {
        employeeHiringButton.click();
    }

    public boolean verifyCompanySignUpPage () {
        return companySignUpLabel.isDisplayed();
    }

    public void inputFullName (String fullName) {
        fullNameField.sendKeys(fullName);
    }

    public void inputEmail (String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword (String password) {
        passwordField.sendKeys(password);
    }

    public void inputCompanyName (String company_name) {
        companyNameField.sendKeys(company_name);
    }

    public void inputCompanyType (String company_type) {
        companyTypeField.sendKeys(company_type);
    }

    public void inputWebsite (String website) {
        websiteField.sendKeys(website);
    }

    public boolean verifyPopUpMessage () {
        return popUpMessage.isDisplayed();
    }
    public void selectCompanySize (String company_size) {
        Select sort = new Select(selectCompanySize);
        sort.selectByVisibleText(company_size);
    }

    public void clickRegisterButtonCompany () {
        registerButtonCompany.click();
    }

    public boolean verifyLoginCompanyPage () {
        return loginCompanyLabel.isDisplayed();
    }

    public boolean fieldRequiredMessage (String message) {
        String fieldRequired = "//p[contains(text(),'" + message + "')]";
        return webDriver.findElement(By.xpath(fieldRequired)).isDisplayed();
    }
 }
