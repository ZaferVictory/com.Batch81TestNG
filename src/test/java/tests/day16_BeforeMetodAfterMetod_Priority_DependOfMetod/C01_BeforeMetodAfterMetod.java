package tests.day16_BeforeMetodAfterMetod_Priority_DependOfMetod;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMetodAfterMetod;

public class C01_BeforeMetodAfterMetod extends TestBaseBeforeMetodAfterMetod {
    // TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    //Çalışma prensibi JUnit deki Before,After ile aynıdır
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test(groups = "gp1")
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}


