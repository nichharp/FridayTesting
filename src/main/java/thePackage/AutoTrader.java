package thePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class AutoTrader {
    private WebDriver webDriver;

    @FindBy(name = "Postcode")
    private WebElement postcodeInput;
    public void enterPostcode(String postcode) { postcodeInput.sendKeys(postcode);}

    @FindBy(xpath = "//*[@id=\'radius\']")
    private WebElement DistanceInput;
    public void pickDistance(String distance) {DistanceInput.findElement(By.name(distance));}

    @FindBy(xpath = "//*[@id=\'searchVehicles\']/div/div[3]/fieldset[2]/label")
    private WebElement untick;
    public void untickUsed() {untick.click();}

    @FindBy(xpath = "//*[@id=\'sell-my\']/li[3]/a")
    private WebElement valueCar;
    public void valueCarClick(){valueCar.click();}

    @FindBy(xpath = "//*[@id=\'js-header-nav\']/ul/li[2]/a/span")
    private WebElement sellCar;
    public void sellCarClick(){sellCar.click();}

    @FindBy(xpath = "/html/body/div/div[1]/section/div/form/span[1]/input")
    private WebElement enterreg;
    public void enterRegist(String reg){enterreg.sendKeys(reg);}

    @FindBy(xpath = "/html/body/div/div[1]/section/div/form/span[2]/input")
    private WebElement entermil;
    public void enterMilage(String mile) {entermil.sendKeys(mile);}

    @FindBy(xpath = "/html/body/div/div[1]/section/div/form/button")
    private WebElement getEval;
    public void getEvaluation(){getEval.click();}

    @FindBy(xpath = "//*[@id=\'js-header-nav\']/ul/li[5]/div[2]/a")
    private WebElement signButton;
    public void signinbutt(){signButton.click();}

    @FindBy(xpath = "//*[@id=\'js-social__signin-tab\']/span")
    private WebElement signInbutt;
    public void signInClick(){signInbutt.click();}

    @FindBy(xpath = "//*[@id=\'signin-email\']")
    private WebElement enterEmail;
    public void enterEmails(String email){enterEmail.sendKeys(email);}

    @FindBy(xpath = "//*[@id=\'signin-password\']")
    private WebElement enterPass;
    public void enterPasswd(String pass) {enterPass.sendKeys(pass);}

    @FindBy(xpath = "//*[@id=\'signInSubmit\']")
    private WebElement signingIN;
    public void signingInNow() {signingIN.click();}

    @FindBy(xpath = "//*[@id=\'js-header-nav\']/ul/li[5]/div[1]/a/i")
    private WebElement personIcon;
    public void personIconhover(){personIcon.click();}

    @FindBy(xpath = "//*[@id=\'ursSignoutForm\']/button")
    private WebElement signout;
    public void signoutButt(){signout.click();}
}
