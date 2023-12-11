package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    public static void main(String[] args) {
        SoftAssert softAssert=new SoftAssert();
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.netflix.com/browse");
        a.manage().window().maximize();

        String webSiteTitle=a.getTitle();

        softAssert.assertTrue(a.findElement(By.xpath("//a[text()='Sign up now']")).isDisplayed());
        softAssert.assertEquals(webSiteTitle,"netflix", "Title of the website is Netflix");
        System.out.println("After Assertion massage");
            softAssert.assertAll();
        a.close();
    }
}
