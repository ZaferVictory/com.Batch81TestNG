package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMetodAfterMetod;

public class C01_DependsOnMetod extends TestBaseBeforeMetodAfterMetod {
    @Test
    public void test01() {
        driver.get("https://wamazon1.com");

    }

    @Test(dependsOnMethods = "test01")//test1 ile baglantılıo oldugu ıcın hatalı oldugu ıcın bunlarda calısmayacak direk youtube calısacak
    public void test02() {
        driver.get("https://facebook.com");

    }

    @Test(dependsOnMethods = "test02")//test2 ile baglantılıo oldugu ıcınhatalı oldugu ıcın bunlarda calısmayacak direk youtube calısacak
    public void test03() {
        driver.get("https://bestbuy.com");

    }

    @Test(priority = -1)
    public void test04() {
        driver.get("https://youtube.com");

    }
}
