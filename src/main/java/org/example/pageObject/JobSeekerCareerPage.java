package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSeekerCareerPage {
    public static WebDriver webDriver;

    public JobSeekerCareerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='mx-20 my-16']/div[2]/label[@class='btn bg-transparent']")
    private WebElement plusButtonCareer;
    @FindBy(xpath = "//h3[.='Riwayat Karir']")
    private WebElement riwayatKarirLabel;
    @FindBy(xpath = "//input[@name='position']")
    private WebElement positionField;
    @FindBy(xpath = "//input[@name='company_name']")
    private WebElement companyNameField;
    @FindBy(xpath = "//input[@id='mulai']")
    private WebElement startDateField;
    @FindBy(xpath = "//input[@id='berakhir']")
    private WebElement endDateField;
    @FindBy(xpath = "//div[@class='w-full min-h-screen']//div[3]//input[@class='w-28 bg-secondary cursor-pointer hover:bg-orange-500 active:bg-orange-600 p-3 rounded-md text-white self-end']")
    private WebElement addCareerButton;
    @FindBy(xpath = "//div[@class='alert alert-success my-5']")
    private WebElement successEditPopUp;

    public void clickPlusButtonCareer () {
        plusButtonCareer.click();
    }

    public boolean verifyRiwayatKarirBox () {
        return riwayatKarirLabel.isDisplayed();
    }

    public void inputCareer (String position, String companyName, String startDate, String endDate) {
        positionField.clear();
        positionField.sendKeys(position);
        companyNameField.clear();
        companyNameField.sendKeys(companyName);
        startDateField.clear();
        startDateField.sendKeys(startDate);
        endDateField.clear();
        endDateField.sendKeys(endDate);
    }

    public void clickAddCareer () {
        addCareerButton.click();
    }

//    public boolean verifySuccessPopUp () {
//        return successEditPopUp.isDisplayed();
//    }
}

