package day12_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C03_FarkliWebTable extends TestBase {

    @Test
    public void webTableTest(){

        //1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        //2. Headers da bulunan basliklari yazdirin
        List<WebElement> baslikElementleriList= driver.findElements(By.xpath("//div[@role='columnheader']"));

        for (WebElement each:baslikElementleriList
        ) {
            System.out.println(each.getText() + " ");
        }
        System.out.println("");

        //  3. 3.sutunun basligini yazdirin
        System.out.println("3. sutun basligi : "+baslikElementleriList.get(2).getText());
        //  4. Tablodaki tum datalari yazdirin
        WebElement tumBodyElementi = driver.findElement(By.xpath("//*[@class='rt-tbody']"));
        System.out.println(tumBodyElementi.getText());
        //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement> tumDatalarListesi = driver.findElements(By.xpath("//*[@role='rowgroup']/*[@role='gridcell']"));
        int sayac = 0;
        for (WebElement each:tumDatalarListesi
        ) {
            if (!each.getText().isBlank()){
                sayac++;
                System.out.println(sayac + " - " + each.getText());
            }
        }
        System.out.println("Listede bos olmayan hucre sayisi : " + sayac);

       //  6. Tablodaki satir sayisini yazdiri
        List<WebElement> satirlarList = driver.findElements(By.xpath("//div[@role='row']"));
        System.out.println("Tablodaki satir sayisi : " + satirlarList.size());


        //  7. Tablodaki sutun sayisini yazdirin
        List<WebElement> sutunlarList = driver.findElements(By.xpath("//*[@role='columnheader']"));
        System.out.println("Tablodaki sutun sayisi : " + sutunlarList.size());

        //  8. Tablodaki 3.kolonu yazdirin
        List<WebElement> ucuncuKolonElemenleri = driver.findElements(By.xpath("//*[@role='gridcell'][3]"));
        System.out.println("==============üçüncü kolon================");
        for (WebElement each: ucuncuKolonElemenleri
             ) {
            if (!each.getText().isBlank()){
                System.out.println(each.getText());
            }
        }
       //  9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
        String dinamikisimlocate;
        String dinamikMaasLocati;
        for (int i = 1; i <=; i++) {

        }


       // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin




    }

}
