package com.company.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GooglePageSearchRes {

    private WebDriver driver;

    private By searchTitle = By.xpath("//h3[@class='LC20lb']");
    private By searchUrl = By.xpath("//cite[@class='iUh30']");
    private By searchContent = By.xpath("//span[@class='st']");

    public WebElement getSearchTitle(){
        return driver.findElement(searchTitle);
    }
    public List<WebElement> getSearchTitles(){
        return driver.findElements(searchTitle);
    }
    public int countOfList = getSearchTitles().size();


    public WebElement getSearchUrl(){
        return driver.findElement(searchUrl);
    }
    public List<WebElement> getSearchUrles(){
        return driver.findElements(searchUrl);
    }


    public WebElement getSearchContent(){
        return driver.findElement(searchContent);
    }
    public List<WebElement> getSearchContents(){
        return driver.findElements(searchContent);
    }


}
