package tests.day19_SingletonPattern_NegativeTest_PozitifTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PozitifTest {
    @Test
    public void poztiftest() {
        // Bir Class olustur : PositiveTest
        // 2) Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        // login butonuna bas
        HmcPage hotelmycampPage=new HmcPage();
        hotelmycampPage.login.click();
        // test data username: manager ,  test data password : Manager1!
        //hotelmycampPage.username.sendKeys(ConfigReader.getProperty("username"));
        // hotelmycampPage.password.sendKeys(ConfigReader.getProperty("password"));
        // hotelmycampPage.ikincilogin.click();

        //password kısmına gırılen 2.yontem
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        /*2.yontem dogru mu sor*/
        // String actualUrl=Driver.getDriver().getCurrentUrl();
        // String expectedUrl="https://www.hotelmycamp.com/Admin/UserAdmin";
        // Assert.assertTrue(expectedUrl.contains(actualUrl));

        Assert.assertTrue(hotelmycampPage.girisyapıldı.isDisplayed());


    }
}
