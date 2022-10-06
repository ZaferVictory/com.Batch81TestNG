package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class hepsiBuradaPages {
    public hepsiBuradaPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronik;

    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTablet;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-xEXsQvaJD0cslMw9rBZM']")
    public List<WebElement> bilgisayarTabletlistesi;
}
