package tests.day18_PageClass_ConfigrationProperties_Configreader;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //amazon sayfasına ve facebook sayfasına gıdınız
        String urlamz=ConfigReader.getProperty("amznUrl");
        String urlFace=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlamz);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();
    }
}
