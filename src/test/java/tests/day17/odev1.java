package tests.day17;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.webappSecurityPage;
import utilities.Driver;

public class odev1 {
    @Test
    public void test01() {
        //Yeni bir Class Olusturun : C03_SoftAssert
        webappSecurityPage webappSecurity=new webappSecurityPage();
        //1. “http://zero.webappsecurity.com/” Adresine gidin
            Driver.getDriver().get("http://zero.webappsecurity.com/");
        //2. Sign in butonuna basin
            webappSecurity.signInButonu.click();
        //3. Login kutusuna “username” yazin
            webappSecurity.userNameButonu.sendKeys("username");
        //4. Password kutusuna “password” yazin
            webappSecurity.paswordButonu.sendKeys("password");
        //5. Sign in tusuna basin
             webappSecurity.submitButonu.click();
             Driver.getDriver().navigate().back();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
            webappSecurity.onlıneBankıng.click();
            webappSecurity.paybills.click();
        //7. “Purchase Foreign Currency” tusuna basin
            webappSecurity.PurchaseForeignCurrency.click();
        //8. “Currency” drop down menusunden Eurozone’u secin

       // webappSecurity.dropdownMenu.sendKeys("Eurozone");
        Select select=new Select(webappSecurity.dropdownMenu);
        select.selectByVisibleText("Eurozone (Euro)");
        System.out.println(select.getFirstSelectedOption().getText());
        //System.out.println(webappSecurity.dropdownMenu.getText());


        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
     SoftAssert softAssert=new SoftAssert();
        softAssert.assertNotEquals(select.getFirstSelectedOption().getText(), "Eurozone (Euro)", "Eurozone (euro) secilemedi");


        //10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"


        //softAssert.assertAll();

        /*soft assert ıle yap*/

    }


}
