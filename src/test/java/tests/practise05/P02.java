package tests.practise05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMetodAfterMetod;

public class P02 extends TestBaseBeforeMetodAfterMetod {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
// 3. Açılır metni alın
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
// 5. Açılır pencereyi kabul edin


    @Test
    public void test1() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
    driver.findElement(By.xpath("//*[@id='button1']")).click();
// 3. Açılır metni alın
        String alertmetin=driver.switchTo().alert().getText();
        System.out.println(alertmetin);
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedmetin="I am an alert box!";
        Assert.assertEquals(alertmetin,expectedmetin);
// 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
