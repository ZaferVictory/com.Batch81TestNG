package tests.day17_DependsOnmetod_HardAssert_SoftAssert;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverİlkTest {

    @Test
    public void test01() {
        // testbase class'ina extend ederek kullandigimiz driver yerine artik
// Driver class'indan kullanacagimiz getDriver() static methodunu kullaniriz

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
