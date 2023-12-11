package MavenPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleMaven {

    @Test
    public void VerifyYatraWebsite(){
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.yatra.com/bus-booking");
        a.manage().window().maximize();

        //Thread.sleep(3000);
        a.close();
    }

    @Test
    public void VerifyCarDekhoWebsite()  {
        System.setProperty("WebDriver.chrome.driver", "F:\\Classes\\Softwear testing\\Softwear tool\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver a = new ChromeDriver();
        a.get("https://www.cardekho.com/");
        a.manage().window().maximize();

        //Thread.sleep(3000);
        a.close();
    }
}
