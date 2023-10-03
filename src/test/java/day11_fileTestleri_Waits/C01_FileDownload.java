package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileDownload extends TestBase {
    @Test
    public void downloadtesti(){
    //"C:\Users\KAHRAMAN\Desktop\logo.jpg"
    /*
    2. https://the-internet.herokuapp.com/download adresine gidelim.
3. logo.jpg dosyasını indirelim
4. Dosyanın başarıyla indirilip indirilmediğini test edelim
     */

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()='logo.jpg']")).click();

        String dosyaYolu = "C:\\Users\\KAHRAMAN\\Downloads\\logo.jpg"; //eğer slaşlar arkaya yatık ise çift yazılsın. eğer ileri yatıksa tek yazılması yeterli

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));




        bekle(3);






    }
}
