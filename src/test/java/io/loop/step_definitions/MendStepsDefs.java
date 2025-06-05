package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.GoogleSearchPage;
import io.loop.pages.POM;
import io.loop.pages.renovate.GithubLoginPage;
import io.loop.pages.renovate.MendLoginPage;
import io.loop.utilities.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MendStepsDefs {
    GithubLoginPage githubLoginPage = new GithubLoginPage();
    MendLoginPage mendLoginPage = new MendLoginPage();
    public static final Logger LOG = LogManager.getLogger();
    POM pages = new POM();

    @Given("user on Mend Developers Portal page")
    public void user_on_mend_developers_portal_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("portal.url"));
        BrowserUtils.takeScreenshot();
    }

    @Then("user clicks GitHub to access a repository")
    public void user_clicks_git_hub_to_access_a_repository() {
        githubLoginPage.gitHubLoginButton.click();
    }

    @Then("user can see GitHub header")
    public void user_can_see_git_hub_header() {
        String expectedTitle = "Sign in to GitHub · GitHub";

        // Wait for title to match
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        // Get and assert the title
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("GitHub page title verification failed!", expectedTitle, actualTitle);

        // Optional: take screenshot
        BrowserUtils.takeScreenshot();
    }

    @Then("user enters username for GitHub")
    public void user_enters_username_for_git_hub() {
        BrowserUtils.waitForClickable(githubLoginPage.usernameInputField, DocuportConstants.EXTRA_LARGE);
        assertTrue("Login button is NOT displayed", MendLoginPage.signInButton.isDisplayed());
        githubLoginPage.usernameInputField.sendKeys(GitConstants.USERNAME_GIT);
        BrowserUtils.takeScreenshot();
        LOG.info("user enters username");
    }

    @Then("user enters password for GitHub")
    public void user_enters_password_for_git_hub() {
        githubLoginPage.passwordInputField.sendKeys(GitConstants.PASSWORD_GIT);
        BrowserUtils.takeScreenshot();
        LOG.info("user enters password");
    }

    @When("user clicks SignIn button")
    public void user_clicks_sign_in_button() {
        githubLoginPage.signInButton.click();
        BrowserUtils.takeScreenshot();
        LOG.info("user clicks SignIn button");
    }

    @Then("user should be able to see the home for organizations")
    public void user_should_be_able_to_see_the_home_for_organizations() {
        assertTrue(BrowserUtils.waitForVisibility(mendLoginPage.organizationsLink, 10).isDisplayed());
        LOG.info("Home for organizations is successfully loaded");
    }

    @Then("user clicks on badge that says User")
    public void user_clicks_on_badge_that_says_user() {
        mendLoginPage.userLink.click();
    }

    @Then("user should be able to see Renovate plan")
    public void user_should_be_able_to_see_renovate_plan() {
        assertTrue(BrowserUtils.waitForVisibility(mendLoginPage.renovatePlan, 10).isDisplayed());
        LOG.info("Renovate plan is displayed");
    }

    @Then("user clicks on Automation project link")
    public void user_clicks_on_automation_project_link() {
        mendLoginPage.projectB4.click();
    }

    @Then("user clicks on the first Done button in a Status column")
    public void user_clicks_on_the_first_done_button_in_a_status_column() {
        mendLoginPage.firstDoneButton.click();
    }

    @Then("user validates Memory Limit")
    public void user_validates_memory_limit() {
        String memoryText = mendLoginPage.memoryLimitElement.getText();
        if (memoryText.equals("3.0GB limit")) {
            System.out.println("Memory limit is correct = " + memoryText);
        } else {
            System.out.println("Memory limit is incorrect = " + memoryText);
        }
    }
    @Then("user validates Disk Limit")
    public void user_validates_disk_limit() {
        String diskText = mendLoginPage.diskLimitElement.getText();
        if (diskText.contains("15.0GB limit")) {
            System.out.println("Disk limit is correct = " + diskText);
        }else{
            System.out.println("Disk limit is incorrect = " + diskText);
        }
    }
    @Then("user validates Duration Limit")
    public void user_validates_duration_limit() {
        String durationText = mendLoginPage.durationMemoryLimit.getText();
        if (durationText.contains("30m limit")) {
            System.out.println("Duration limit is correct = " + durationText);
        } else {
            System.out.println("Duration limit is incorrect = " + durationText);
        }

    }
}


