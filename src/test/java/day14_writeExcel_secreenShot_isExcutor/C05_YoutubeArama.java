package day14_writeExcel_secreenShot_isExcutor;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.File;

public class C05_YoutubeArama extends TestBase {
    @Test
    public void youtubeAramaTesti(){

        // bulunan videolardan ilkinin isminde bulut gectigini test edin
        // ilk videonun fotografini cekin

        // youtube ana sayfaya gidin
        driver.get("https://youtube.com");
        // ahmet bulutluöz için arama yapın
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='search']"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("Ahmet bulutluoz"+ Keys.ENTER);

        // bulunan videolardan ilkinin isminde bulut gectigini test edin
        WebElement ilkVideoIsmi = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        String expectedIcerik ="QA";
        String actualVideoIsmi = ilkVideoIsmi.getText();
        Assert.assertTrue(actualVideoIsmi.contains(expectedIcerik));

        ReusableMethods.webElementFotografCek(ilkVideoIsmi,"BULUTLUOZ");


    }
}
