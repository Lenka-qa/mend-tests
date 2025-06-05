package io.loop.pages.renovate;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import io.loop.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GithubLoginPage {
    public GithubLoginPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//p[text()='GitHub']")
    public WebElement gitHubLoginButton;

    @FindBy (xpath ="//input[@id='login_field']")
    public WebElement usernameInputField;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInputField;

    @FindBy (xpath = "//input[@value='Sign in']")
    public WebElement signInButton;



    public void insertField(String field, String input){
        switch(field.toLowerCase().trim()){
            case "username":
                BrowserUtils.waitForVisibility(usernameInputField, 10).sendKeys(input);
                break;
            case "password":
                BrowserUtils.waitForVisibility(passwordInputField, 10).sendKeys(input);
                break;
            default: throw new IllegalArgumentException("No such field: " + field);
        }

    }
    public void clickButton(String button){
        switch(button.toLowerCase().trim()){
            case "login":
                BrowserUtils.waitForClickable(signInButton, 10).click();
                break;
            //default: throw new IllegalArgumentException("No such button: " + button);
            case "continue":
                try {
                    BrowserUtils.waitForClickable(signInButton, 10).click();

                } catch (Exception e) {
                    WebElement element = Driver.getDriver().findElement(By.xpath("//span[.=' Continue ']"));
                    element.click();
                }
                break;
            default: throw new IllegalArgumentException("No such button: " + button);
        }
    }
    /**
     *logins to docuport application
     * @param driver, which is initialized in the test base
     * @param role, comes from docuport constants
     * author LENKA
     */
    public void login(WebDriver driver, String role) throws InterruptedException {
        switch (role.toLowerCase()){
            case "Elena loggs in":
                usernameInputField.sendKeys(GitConstants.USERNAME_GIT);
                passwordInputField.sendKeys(GitConstants.PASSWORD_GIT);
                break;
            default: throw new InterruptedException("There is not such a role: " + role);
        }

        signInButton.click();

        if(role.toLowerCase().equals("client")){
            Thread.sleep(3000);
            WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
            cont.click();
            Thread.sleep(3000);
        }
    }
}
