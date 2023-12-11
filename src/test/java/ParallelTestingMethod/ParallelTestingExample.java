package ParallelTestingMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingExample {

    @Test
    public void netflix() {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.netflix.com/");
        a.manage().window().maximize();
        a.close();
    }
    @Test
    public void disneyHotStar() {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.hotstar.com/in");
        a.manage().window().maximize();
        a.close();
    }
    @Test
    public void jioCInema() {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.jiocinema.com/");
        a.manage().window().maximize();
        a.close();
    }
    @Test
    public void discord() {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://discord.com/");
        a.manage().window().maximize();
        a.close();
    }

}
