package tests.day19_SingletonPattern_NegativeTest_PozitifTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeTest {
    @Test
    public void negatiftest() {
        /*
        1 ) Bir Class olustur : NegativeTest
        2) Bir test method olustur NegativeLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna bas
        test data username: manager1 ,  test data password : manager1!
                Degerleri girildiginde sayfaya girilemedigini test et

         */

        // 1 ) Bir Class olustur : NegativeTest
        //        2) Bir test method olustur NegativeLoginTest()
        //        https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        //        login butonuna bas
        HmcPage hotelmycampPage=new HmcPage();
        hotelmycampPage.login.click();
        //        test data username: manager1 ,  test data password : manager1!
        HmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //                Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(HmcPage.girisYapilamadi.isDisplayed());

        // sayfayı kapatınız
        Driver.closeDriver();

    }
}
