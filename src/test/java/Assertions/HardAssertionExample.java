package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertionExample {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.netflix.com/browse");
        a.manage().window().maximize();

        String webSiteTitle=a.getTitle();
        System.out.println("Before Assertion massage");
        Assert.assertFalse(a.findElement(By.xpath("//a[text()='Sign up now']")).isDisplayed());
        Assert.assertEquals(webSiteTitle,"netflix", "Title of the website is Netflix");
        System.out.println("After Assertion massage");
        a.close();
    }
}
