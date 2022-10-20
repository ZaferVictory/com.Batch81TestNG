package tests.day18_PageClass_ConfigrationProperties_Configreader;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.facebookPage;
import utilities.Driver;

public class C01_PageClassFacebookTest {
    /*
    https://www.facebook.com/ adresine gidin
    POM’a uygun olarak email, sifre kutularini ve giris yap
    butonunu locate edin
    Faker class’ini kullanarak email ve sifre degerlerini
    yazdirip, giris butonuna basin
    Basarili giris yapilamadigini test edin

     */

    @Test
    public void test01() {

        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //    POM’a uygun olarak email, sifre kutularini ve giris yap
        //    butonunu locate edin

        facebookPage facebookPage=new facebookPage();
        Faker faker=new Faker();
        SoftAssert softAssert=new SoftAssert();

        //    Faker class’ini kullanarak email ve sifre degerlerini
        //    yazdirip, giris butonuna basin
        facebookPage.facebookEmail.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.login.click();

        //    Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapılmadı.isDisplayed());


    }
}
