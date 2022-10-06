package tests.day21;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.hepsiBuradaPages;
import utilities.Driver;

import java.io.IOException;

public class HomeWork {
    //Hepsiburada sayfasına gidiniz
//Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
//Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
//Sayfayı kapatalım

    @Test
    public void test01() throws InterruptedException, IOException {

        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");

        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        hepsiBuradaPages hepsiburadaPage = new hepsiBuradaPages();
        Actions actions = new Actions(Driver.getDriver());
/*
        for (int i = 0; i <= 66; i++) {
            hepsiburadaPage.elektronik.click();
            actions.moveToElement(hepsiburadaPage.bilgisayarTablet).perform();
            hepsiburadaPage.bilgisayarTablet.get().click();
            ReusableMethods.getScreenshot("hepsiburada.");
            Assert.assertTrue(hepsiburadaPage.tiklananSayfa.isEnabled());
            Driver.getDriver().navigate().back();

        }

        //Sayfayı kapatalım
        Driver.closeDriver();

 */
    }
}


