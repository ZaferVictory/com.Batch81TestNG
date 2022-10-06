package tests.Practise07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversıtyPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    /*
    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.
     */

    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.


        //EXPLORATORY TESTING BU TETSIN ADI BU

        // 1) http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // 2) Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversıtyPage webUniversıtyPage=new WebUniversıtyPage();

        //Buradaki listeyi yapılacaklar listesine tek tek manuel olarak eklemek yerine toplu olarak bir loop kullanarak gönderebilmek
        //amacı ile biz olusturduk
        List<String>worklist=new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
         Actions actions=new Actions(Driver.getDriver());

        for (String w:worklist) {
           actions.click(webUniversıtyPage.adNewToDo).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }
                //lambda ıle
        //worklist.forEach(t->webUniversıtyPage.adNewToDo.sendKeys(t, Keys.ENTER));

        //3) Tüm yapılacakların üzerini çiz.
        List<WebElement> todos=webUniversıtyPage.todosWebelement;
        for (WebElement w:todos) {
            w.click();
        }



        //4) Tüm yapılacakları sil.
        List<WebElement>delete=webUniversıtyPage.deleteButtonsWebelement;
        for (WebElement w:delete) {
            w.click();
        }


        //5) Tüm yapılacakların silindiğini doğrulayın.
        Thread.sleep(2000);
        List<WebElement>newtodos=webUniversıtyPage.newtodosWebelement;
        Assert.assertEquals(0,newtodos.size());


    }



}
