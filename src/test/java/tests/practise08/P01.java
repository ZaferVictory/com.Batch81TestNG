package tests.practise08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herOkuPages;
import utilities.Driver;

import java.util.List;

public class P01 {

    herOkuPages herOkuPages;
    Actions actions=new Actions(Driver.getDriver());



    @Test
    public void test01() {

        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        //Click all the buttons and verify they are all clicked

        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        herOkuPages=new herOkuPages();
        Actions actions=new Actions(Driver.getDriver());
        //kodlarımızı yazarken clean code
        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir

        ////Click all the buttons
        herOkuPages.onBlur.click();
        herOkuPages.onClick.click();
        herOkuPages.onClick.click();
        actions.contextClick(herOkuPages.onContextMenu).doubleClick(herOkuPages.onDoubleClick).
                click(herOkuPages.onFocus).click(herOkuPages.onKeyDown).sendKeys(Keys.ENTER).
                click(herOkuPages.onKeyUp).sendKeys(Keys.ENTER).
                click(herOkuPages.onKeyPress).sendKeys(Keys.ENTER).
                moveToElement(herOkuPages.onMouseOver).
                moveToElement(herOkuPages.onMouseLeave).
                moveToElement(herOkuPages.onMouseOver).
                click(herOkuPages.onMouseDown).perform();

        //and verify they are all clicked

        List<WebElement> EventList=herOkuPages.eventTriggered;
        Assert.assertEquals(EventList.size(),11);
        
        //2.yol
        /*
        for (WebElement w:EventList) {
            w.isDisplayed();

        }

         */






    }
    @Test(dependsOnMethods ="test01" )
    public void test02() {

        List<WebElement> EventList=herOkuPages.eventTriggered;
        Assert.assertEquals(EventList.size(),11);

    }
}
