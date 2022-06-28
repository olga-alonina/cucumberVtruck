package com.vytrack.utilities.utility_driver;

import com.vytrack.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

//    TC : Create utility method
//   1. Create a new class called BrowserUtils
//   2. Create a method to make Multiple Windows logic re-usable 3. When method is called, it should switch window and verify
//    title.

//    Method info:
//   • Name: switchWindowAndVerify
//   • Return type: void
//   • Arg1: WebDriver
//   • Arg2: String expectedInUrl
//   • Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl,String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            driver.switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed!");
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
    public static void logInVytrack(){
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(
                ConfigurationReader.getProperty( "truckDriver" ) );
        loginPage.password.sendKeys( ConfigurationReader.getProperty( "password" ) );
        loginPage.login.click();
    }
    public static void verify_title_with_containMethods(String exp_contain, String exp_contain2) {
        String act_title = Driver.getDriver().getTitle();
        System.out.println( act_title );
        org.junit.Assert.assertTrue( "Test FAIL, title is not verified", act_title.contains( exp_contain ) ||
                act_title.contains( exp_contain2 ) );
    }

    public static void verify_title_with_equalMethod(String exp_title) {
        String act_title = Driver.getDriver().getTitle();
        org.junit.Assert.assertEquals( "Test FAIL, title is not verified", exp_title, act_title );

    }
}

