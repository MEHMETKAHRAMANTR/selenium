package day12_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C02_KlasikWebTable extends TestBase {
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");



    //2.Sayfanin en altina inin

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        bekle(2);

     //3.Web table tum body’sini yazdirin
        WebElement tumBodyElementi= driver.findElement(By.xpath("//tbody"));
        System.out.println(tumBodyElementi.getText());

     //4.Web table’daki satir sayisinin 9 oldugunu test edin
        List<WebElement> satirlarListesi=driver.findElements(By.xpath("//tbody/tr"));
        int expectedSatirSayisi =7;
        int actualSatirSayisi=satirlarListesi.size();
        Assert.assertEquals(expectedSatirSayisi,actualSatirSayisi);

      //  5.Tum satirlari yazdirin

        for (int i = 0; i < satirlarListesi.size(); i++) {
            System.out.println((i+1)+". satir  :"+satirlarListesi.get(i).getText() );

        }

        // 6. Web table’daki sutun sayisinin 13 olduğunu test edin

        List<WebElement> birinciSatirDataList=driver.findElements(By.xpath("//tr[1]/td"));
        int expectedSutunSayisi=13;
        int actualsutunSayisi= birinciSatirDataList.size();
        Assert.assertEquals(expectedSutunSayisi,actualsutunSayisi);

        //7. 5.sutunu yazdirin

        List<WebElement> besincisutunDataList=driver.findElements(By.xpath("//tr/td[5]"));
        System.out.println("===========5. sütün===============");
        for (WebElement each:besincisutunDataList
             ) {
            System.out.println(each.getText());

        }


        //8.Satir ve sutun sayisini parametre olarak alip,
        //  hucredeki bilgiyi String olarak döndüren bir method olusturun
        System.out.println("========== method ile gelen datalar =========");
        System.out.println(hucredekiBilgi(3, 5));
        System.out.println(hucredekiBilgi(1,1));
    }
    public String hucredekiBilgi(int satirNo , int sutunNo){
        //    //tr[   5    ]/td[   3      ]
        String dinamikXpath = "//tr[" + satirNo + "]/td[" + sutunNo + "]";
        WebElement istenenDataElementi = driver.findElement(By.xpath(dinamikXpath));
        return istenenDataElementi.getText();
    }
}
