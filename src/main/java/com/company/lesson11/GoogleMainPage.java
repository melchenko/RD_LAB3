package com.company.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {
    private WebDriver driver;

    private By searchField = By.xpath("//input[contains(@class, 'gLFyf gsfi')]");
    private By searchButton = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToGooglePage() {
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }

    public void searchFor(String textForSearch) {
        getSearchField().sendKeys(textForSearch);
        //getSearchField().sendKeys(Keys.ESCAPE);
        getSearchButton().submit();
    }

}


