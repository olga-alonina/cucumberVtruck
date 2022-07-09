package com.cydeo.utilities.utility_driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class verify_title {
    public static void verify_title_with_containMethods
            (WebDriver driver, String exp_contain, String exp_contain2) {
        String act_title = driver.getTitle();
        System.out.println(act_title);
        Assert.assertTrue( "Test FAIL, title is not verified", act_title.contains( exp_contain ) ||
                        act_title.contains( exp_contain2 ) );
    }

    public static void verify_title_with_equalMethod(WebDriver driver, String exp_title) {
        String act_title = driver.getTitle();

        Assert.assertEquals( "Test FAIL, title is not verified", act_title, exp_title );

    }
}