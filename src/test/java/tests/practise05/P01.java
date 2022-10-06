package tests.practise05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMetodAfterMetod;

public class P01 extends TestBaseBeforeMetodAfterMetod {
    @Test
    public void test01() {
        // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//fill the firstname
   driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("mehmet");
//fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kar");
//check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();
//check the experience
        driver.findElement(By.xpath("//*[@id='exp-1']")).click();
//fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("11.12.2025");
//choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
//choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();
//choose your continent -> Antartica
       WebElement dropdownContinent= driver.findElement(By.xpath("//*[@id='continents']"));
       Select select=new Select(dropdownContinent);
       select.selectByVisibleText("Antartica");
       //2.yontem
       // driver.findElement(By.xpath("//*[@id='continents']")).sendKeys("Antartica");

//choose your command  -> Browser Commands
driver.findElement(By.xpath("//*[@id='selenium_commands']/option[1]")).click();
//click submit button
driver.findElement(By.xpath("//*[@id='submit']")).click();

    }

}
