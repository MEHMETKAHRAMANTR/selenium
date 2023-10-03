package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_fileUploadTesti extends TestBase {
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile butonuna basalim
        //text.txt dosyasini secelim.
        /*
            insan olarak dosya secimi icin
            chooseFile butonuna bastiktan sonra
            acilan windows dosya penceresinden
            istedigimiz dosyayi secip yukleriz.
            Selenium'da otomasyon ile bu islemi yapmak icin
            chooseFile butonu locate edilip,
            bu webelement'e sendKeys(yuklenecekDosyaninDosyaYolu); yapilir
         */



        WebElement uploadButtonElementi= driver.findElement(By.id("file-upload"));
        String dinamikDosyaYolu=System.getProperty("user.dir")+"/src/test/java/day11_fileTestleri_Waits/text";
        uploadButtonElementi.sendKeys(dinamikDosyaYolu);

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploadedElementi=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedElementi.isDisplayed());



    }

}
