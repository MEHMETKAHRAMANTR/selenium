package day06_notations_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C01_beforeAfterNotasyonları {

    WebDriver driver1;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() {
        ReusableMethods.bekle(2);
        driver1.close();
    }



    @Test
    public void amazonTest() {
        driver1.get("https://www.amazon.com.tr");
        if (driver1.getCurrentUrl().contains("amazon")) {
            System.out.println("amazon PASSED");
        } else {
            System.out.println("amazon FAILLED");
        }

    }

    @Test
    public void wiseTest() {
        driver1.get("https://www.wisequarter.com");
        if (driver1.getCurrentUrl().contains("wise")) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILLED");
        }

    }



    @Test
    public void youtubeTest() {
        driver1.get("https://www.youtube.com");
        if (driver1.getCurrentUrl().contains("best")) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILLED");
        }

    }

}
