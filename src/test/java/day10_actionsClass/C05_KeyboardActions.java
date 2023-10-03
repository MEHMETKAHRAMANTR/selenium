package day10_actionsClass;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import utilities.TestBase;

public class C05_KeyboardActions extends TestBase {
    /*
    1- https://www.facebook.com adresine gidelim
2- Cookies kabul edin
3- Yeni hesap olustur butonuna basalim
4- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
5- Kaydol tusuna basalim
FacebookF
     */
    @Test
    public void test01(){
        driver.get("https://www.facebook.com");
        //driver.findElement(By.xpath("//button[@title=‘Allow all cookies’]"));
       // driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));

        WebElement isimkutusu= driver.findElement(By.name("firstname"));
        Actions actions=new Actions(driver);
        Faker faker =new Faker();
        String email=faker.internet().emailAddress();
        actions.click(isimkutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Oct")
                .sendKeys(Keys.TAB)
                .sendKeys("1975")
                .sendKeys(Keys.TAB)

                        .perform();



        bekle(3);


    }
}
