package ParameterizeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    @Parameters({"invalidUserName", "invalidPassword"})
    @Test
    public void verifyLoginWithInvalidIDAndInvalidPassword(){
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://2take1.menu/login");
        a.manage().window().maximize();

        WebElement iD=a.findElement(By.id("name"));
        WebElement pass=a.findElement(By.id("password"));

        iD.sendKeys("invalidUserName");
        pass.sendKeys("invalidPassword");

        a.close();
    }

    @Parameters({"validUserName", "validPassword"})
    @Test
    public void verifyLoginWithValidIdIDAndValidPassword(){
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://2take1.menu/login");
        a.manage().window().maximize();

        WebElement iD=a.findElement(By.id("name"));
        WebElement pass=a.findElement(By.id("password"));

        iD.sendKeys("validUserName");
        pass.sendKeys("validPassword");

        a.close();
    }
}
