package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyJobPage {
    public static WebDriver webDriver;

    public ApplyJobPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//p[.='buruh baik']")
    private WebElement vacancyTitle;
    @FindBy(xpath = "//h1[.='Deskripsi']")
    private WebElement descriptionVacancy;
    @FindBy(xpath = "//button[@class='w-[80px] p-1 rounded-md bg-secondary text-white']")
    private WebElement lamarButton;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpMessage;
    @FindBy(xpath = "//button[@class='w-[80px] p-1 rounded-md bg-main text-white']")
    private WebElement simpanButton;


    public void clickVacancyTitle () {
        vacancyTitle.click();
    }

    public boolean verifyDescriptionLabel () {
        return descriptionVacancy.isDisplayed();
    }

    public void clickLamarButton() {
        lamarButton.click();
    }

    public void clickSimpanButton() {
        simpanButton.click();
    }

    public boolean verifyPopUpMessage () {
        return popUpMessage.isDisplayed();
    }


}
