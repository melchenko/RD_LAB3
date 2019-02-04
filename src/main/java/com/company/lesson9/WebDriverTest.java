package com.company.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximazed");

        WebDriver driver = new ChromeDriver();

        //Maximize browser window
        //      driver.manage().window().fullscreen();

//        google.com
//        driver.get("http://www.google.com");
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
//        element.sendKeys("Hello");
//        WebElement button = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
//        button.click();

        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//div//*[@class='gLFyf gsfi']"));
        element.sendKeys("facebook");
        element.submit();

        driver.findElement(By.cssSelector("h3>a[href*='login']")).click();

        //driver.findElement(By.xpath(""))

        driver.findElement(By.xpath("//*[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt' and @id='email']")).sendKeys("badlogin");

        driver.findElement(By.xpath("//*[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt' and @id='pass']")).sendKeys("badpassword");

        driver.findElement(By.id("loginbutton")).click();

        String actualText = driver.findElement(By.cssSelector("div._4rbf._53ij")).getText();


        List<String> expList= new ArrayList<>();
        driver.quit();


        String expRu = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту.";
        String expEn = "The email address or phone number that you've entered doesn't match any account.";
        String expUk = "Указана електронна адреса (або номер телефону) не пов'язана з жодним обліковим записом.";
        expList.add(expRu);
        expList.add(expEn);
        expList.add(expUk);


        String cor="No Correct";

        for(String exp: expList){
            if (actualText.contains(exp)) cor = "Correct";
        }

        System.out.println(cor);



//        WebElement button = driver.findElement(By.xpath("//div[@jsname='VlcLAe']//*[@value='Пошук Google']"));
//        button.click();


//        WebElement signIn = driver.findElement(By.linkText("Log in"));
//        signIn.click();


//


    }

}
