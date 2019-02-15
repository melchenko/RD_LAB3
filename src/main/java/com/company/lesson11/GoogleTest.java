package com.company.lesson11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleTest {

// shit happens
    WebDriver driver;

    @Before
    public void before() {
        driver = TestMain.getDriver();
    }


    @After
    public void after() {
        driver.quit();
        driver = null;
    }


    @Test
    public void testGoogleContent() {
        String keyword_search = "automatization";

        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.openPage();
        googleMainPage.searchFor(keyword_search);

        GooglePageSearchRes googlePageSearchRes = new GooglePageSearchRes(driver);

        List<WebElement> listOfTitle = googlePageSearchRes.getSearchTitles();

        Assert.assertTrue(listOfTitle.size() > 0);

    }


}
