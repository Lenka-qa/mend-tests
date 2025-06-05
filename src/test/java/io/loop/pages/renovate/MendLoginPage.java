package io.loop.pages.renovate;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MendLoginPage {
    public MendLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[text()='GitHub']")
    public WebElement gitHubLoginButton;

    @FindBy(xpath = "//input[@id='login_field']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@value='Sign in']")
    public static WebElement signInButton;

    @FindBy(xpath = "//h5[text()='Your organizations']")
    public WebElement organizationsLink;

    @FindBy(xpath = "//span[text()='User']")
    public WebElement userLink;

    @FindBy(xpath = "//p[contains(normalize-space(.), 'Renovate plan: Community (Free)')]")
    public WebElement renovatePlan;

    @FindBy (xpath = "//span[text()='AutomationProjectB4']" )
    public WebElement projectB4;

    @FindBy (xpath = "(//span[text()='DONE' and contains(@class, 'MuiChip-label')])[1]\n")
    public WebElement firstDoneButton;

    @FindBy (xpath = "//p[text()='0.6GB (of 3.0GB limit)']")
    public WebElement memoryLimitElement;

    @FindBy (xpath = "//p[contains(text(), '15.0GB limit')]")
    public WebElement diskLimitElement;

    @FindBy (xpath = "//p[contains(text(), '14s') and contains(., '30m limit')]")
    public WebElement durationMemoryLimit;


}


