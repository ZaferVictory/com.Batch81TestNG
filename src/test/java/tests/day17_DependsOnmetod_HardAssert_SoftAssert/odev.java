package tests.day17_DependsOnmetod_HardAssert_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class odev {
    /*
    Bir class oluşturun: DependsOnTest
    https://www.amazon.com/ adresine gidin.
    Test : Amazon ana sayfaya gittiginizi test edin.
    Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    arama yapin ve aramanizin gerceklestigini Test edin.
    Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
    $16.83 oldugunu test edin.

     */

    @Test
    public void test01() {

        AmazonPage amazonPage=new AmazonPage();

        //https://www.amazon.com/ adresine gidin.
        Driver.getDriver().get("https://amazon.com");

        //Amazon ana sayfaya gittiginizi test edin
        String expected="https://www.amazon.com/";
        String actual=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,actual);
        //1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        // ve aramanizin gerceklestigini Test edin.
        Assert.assertTrue(amazonPage.aramaSonucuWE.isDisplayed());



    }
}
