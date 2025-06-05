package io.loop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MendUtils {




    public class mendUtils {

        /**
         *logins to docuport application
         * @param driver, which is initialized in the test base
         * @param role, comes from docuport constants
         * author lenka
         */
        public static void login(WebDriver driver, String role) throws InterruptedException {
            driver.get(ConfigurationReader.getProperties("portal.url"));
            WebElement loginField = driver.findElement(By.xpath("//input[@id='login_field']"));
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
            WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        }
}
    }
