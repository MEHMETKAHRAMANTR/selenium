package day10_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_MoveToElement extends TestBase {

    /*
    1- https://www.amazon.com/ adresine gidin
    2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
    3- “Create a list” butonuna basin
    4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
     */




    @Test
    public void Test01() {
        driver.get("https://www.amazon.com/");

        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        Actions actions = new Actions(driver);
        WebElement ListElementi = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        actions.moveToElement(ListElementi).perform();
        // 3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//*[text()='Create a List']")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin

        WebElement yourListElementi = driver.findElement(By.xpath("//div[@role='heading']"));
        Assert.assertTrue(yourListElementi.isDisplayed());





        bekle(3);
    }


}
