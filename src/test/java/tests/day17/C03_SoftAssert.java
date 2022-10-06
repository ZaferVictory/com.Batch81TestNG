package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMetodAfterMetod;

public class C03_SoftAssert extends TestBaseBeforeMetodAfterMetod {
    @Test
    public void test01() {
          /*
        SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertion'ları yapıp
        bitiş olarak belirtmemiz gereken assertAll() metoduyla test metodumuzdaki bütün assertion'ları
        kontrol eder. Failed olan olursa assertion yaptığımız metodun sonuna yazdığımız mesajı bize
        konsolda verir
         */
        /*
         assertAll kadar Faile de olsa kod çalışıyor ve programı durdurmuyor, ve assertAll  a kadar olan tum hataları bize yazdırıyor
         */

        SoftAssert softassert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softassert.assertTrue(driver.getTitle().contains("Amazon"),"girdiğiniz kelimeyi icermıyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Assert.assertTrue(aramakutusu.isDisplayed(),"web elemente erısılemez");
        //4-arama kutusuna Nuella yazıp aratın
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
       softassert.assertTrue(sonuc.isDisplayed(), "sonuc web elementı goruntulenemedı");
        //6-arama sonucunun Nutella içerdigini test edin
        softassert.assertTrue(sonuc.getText().contains("Nutella"),"nutella ıcermıyor");
        softassert.assertAll();
        System.out.println("hata varsa burası calısmaz");// hata yoksa burası calısır

    }
}
