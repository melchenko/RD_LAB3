package com.company.lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    static WebDriver driver;



    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
            driver = new IEDriver();
        }
        return driver;
    }

    public static void exitDriver() {
        driver.quit();
        driver = null;
    }

    public ArrayList<String> getContents(List<WebElement> webElements){

        ArrayList<String> currentOptions = new ArrayList<>();

        for (WebElement match : webElements) {
            currentOptions.add(match.getText());
        }
        return currentOptions;
    }

    public String getTextFromWebElement(WebElement webElements){
        return webElements.getText();
    }


    public static void main(String[] args) {

        TestMain testMain = new TestMain();

        GoogleMainPage googleMainPage = new GoogleMainPage(getDriver());
        googleMainPage.goToGooglePage();
        googleMainPage.searchFor("automatization");

        GooglePageSearchRes googlePageSearchRes=new GooglePageSearchRes();

        int i = googlePageSearchRes.countOfList;



        ArrayList<String> arrayListTitles = testMain.getContents(googlePageSearchRes.getSearchTitles());
        ArrayList<String> arrayListUrles = testMain.getContents(googlePageSearchRes.getSearchUrles());
        ArrayList<String> arrayListContents = testMain.getContents(googlePageSearchRes.getSearchContents());


        ArrayList<SearchResult> list = new ArrayList <SearchResult>();


        for(int i=0; i<arrayListTitles.size(); i++){
            SearchResult SR = new SearchResult(arrayListTitles.get(i), arrayListUrles.get(i), arrayListContents.get(i));
            list.add(SR);
        }


        System.out.println("Sssstoooppp");







        exitDriver();

    }
}
