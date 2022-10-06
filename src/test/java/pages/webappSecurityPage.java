package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class webappSecurityPage {

    public webappSecurityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id='signin_button']")
    public WebElement signInButonu;

    @FindBy(xpath="//*[@id='user_login']")
    public  WebElement userNameButonu;

    @FindBy(xpath="//*[@id='user_password']")
    public WebElement paswordButonu;

    @FindBy(xpath="//*[@name='submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "(//*[text()='Online Banking'])[1]")
    public WebElement onlıneBankıng;

    @FindBy(xpath = "//*[@id='pay_bills_link']")
    public WebElement paybills;

    @FindBy(xpath = "(//*[@class='ui-state-default ui-corner-top'])[2]")
    public WebElement PurchaseForeignCurrency;

    @FindBy(xpath = "//*[@id='pc_currency']")
    public WebElement dropdownMenu;

}
