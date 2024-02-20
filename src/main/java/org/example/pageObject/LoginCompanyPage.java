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
    @FindBy(xpath = "//img[@alt='Tailwind CSS Navbar component']")
    private WebElement photoProfile;
    @FindBy(xpath = "//a[.='Daftar Lowongan']")
    private WebElement buttonLowongan;
    @FindBy(xpath = "//label[@class='btn bg-transparent']")
    private WebElement buttonPlus;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement fieldPosisi;
    @FindBy(xpath = "//input[@name='job_type']")
    private WebElement fieldJobType;
    @FindBy(xpath = "//input[@name='address']")
    private WebElement fieldAddress;
    @FindBy(xpath = "//input[@name='salary_range']")
    private WebElement fieldGaji;
    @FindBy(xpath = "//select[@name='category']")
    private WebElement bidangPekerjaan;
    @FindBy(xpath = "//option[.='Teknologi Informasi dan Komputer']")
    private WebElement buttonIT;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    private WebElement fieldDeskripsi;
    @FindBy(xpath = "//textarea[@id='requirement']")
    private WebElement fieldKualifikasi;
    @FindBy(xpath = "//div[@class='alert alert-success my-5']")
    private WebElement successPopUp;
    @FindBy(xpath = "//input[@value='Tambah']")
    private WebElement buttonTambahLowongan;

    public boolean verifyPopUpSuccess(){
        return containerProfilCompany.isDisplayed();
    }
    public boolean verifyProfileCompany(){
        return containerProfilCompany.isDisplayed();
    }
    public void setGotoLogincompany(){
        gotoLogincompany.click();
    }
    public boolean setVerifyLoginCompany(){
        return verifyLoginCompany.isDisplayed();
    }
    public boolean verifyPhotoProfile(){
        return photoProfile.isDisplayed();
    }
    public void clickPhotoProfile(){
        photoProfile.click();
    }
    public void clickButtonLowongan(){
        buttonLowongan.click();
    }
    public void clickButtonAdd(){
        buttonPlus.click();
    }
    public void inputFieldPosisi(String posisi){
        fieldPosisi.sendKeys(posisi);
    }
    public void inputFieldJobType(String jobType){
        fieldJobType.sendKeys(jobType);
    }
    public void inputFieldAddress(String address){
        fieldAddress.sendKeys(address);
    }
    public void inputFieldGaji(String gaji){
        fieldGaji.sendKeys(gaji);
    }
    public void clickBidangPekerjaan(){
        bidangPekerjaan.click();
    }
    public void clickButtonIT(){
        buttonIT.click();
    }
    public void clickTambahLowongan(){
        buttonTambahLowongan.click();
    }
//    public void inputFieldBidangPekerjaan(String BidangPekerjaan){ bidangPekerjaan.sendKeys(BidangPekerjaan);}
//    public void inputFieldDeskripsi(String deskripsi){
//        fieldDeskripsi.sendKeys(deskripsi);
//    }
//    public void inputFieldKualifikasi(String kualifikasi){
//        fieldKualifikasi.sendKeys(kualifikasi);
//    }


}

