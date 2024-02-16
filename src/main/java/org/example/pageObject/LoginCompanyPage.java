package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCompanyPage {
    public static WebDriver webDriver;

    public LoginCompanyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
 // profile company
    @FindBy(xpath = "//div[@class='py-5 px-8 sm:py-[35px] sm:px-[90px] bg-white rounded-lg']")
    private WebElement containerProfilCompany;

    @FindBy(xpath = "//a[@href='/logincompany']")
    private WebElement gotoLogincompany;
    @FindBy(xpath = "//div[@class='flex items-center gap-5 mb-10']")
    private WebElement verifyLoginCompany;




    public boolean verifyProfileCompany(){
        return containerProfilCompany.isDisplayed();
    }
    public void setGotoLogincompany(){
        gotoLogincompany.click();
    }
    public boolean setVerifyLoginCompany(){
        return verifyLoginCompany.isDisplayed();
    }
}

