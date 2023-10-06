package day14_writeExcel_secreenShot_isExcutor;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {

    @Test
    public void excelTest() throws IOException {

      // 3) Adimlari takip ederek 1. sayfa 1.satira kadar gidelim

        String dosyolu="src/test/java/day13_excelOtomasyonu/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sayfa1=workbook.getSheet("Sayfa1");


      // 4) 5.hucreye yeni bir cell olusturalim

        sayfa1.getRow(0).createCell(4);


      // 5) Olusturdugumuz hucreye “Nufus” yazdiralim

        sayfa1.getRow(0).getCell(4).setCellValue("DENEME");

      // 6) 2.satir nufus kolonuna 1500000 yazdiralg
        sayfa1.getRow(1).createCell(4).setCellValue(15000000);

      // 7) 10.satir nufus kolonuna 250000 yazdiralim

        sayfa1.getRow(9).createCell(4).setCellValue("5000000");

     // 8) 15.satir nufus kolonuna 54000 yazdiralim

        sayfa1.getRow(14).createCell(4).setCellValue("540000");
      // 9) Dosyayi kaydedelim

        FileOutputStream fos=new FileOutputStream(dosyolu);
        workbook.write(fos);

      // 10)Dosyayi kapatalim
        fis.close();
        fos.close();
        workbook.close();


    }
}
