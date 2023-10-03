package day10_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C02_dragAndDrop extends TestBase {
    /*
        1- https://demoqa.com/droppable adresine gidelim
        2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
     */

    @Test

    public void test01 (){
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement suruklenecekElement=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement suruklenecekHedef=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(suruklenecekElement,suruklenecekHedef).perform();
        String expectedyazi="Dropped!";
        String actualYazi=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        Assert.assertEquals(expectedyazi,actualYazi);
        bekle(3);


    }
}
