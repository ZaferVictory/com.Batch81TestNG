package tests.day16_BeforeMetodAfterMetod_Priority_DependOfMetod;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMetodAfterMetod;

public class C03_Priority extends TestBaseBeforeMetodAfterMetod {
    /*Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    priority methodunu kullanırız
     Priority kullanmazsak default olarak 0 dır
     */
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test // Burayı 0 kabul eder
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test (priority = -1,groups = "gp1")
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
