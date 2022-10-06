package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversıtyPage {
    public WebUniversıtyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//*[@type='text']")
    public WebElement adNewToDo;

@FindBy(xpath = "//li")
    public List<WebElement> todosWebelement;

@FindBy(xpath = "//*[@class='fa fa-trash']")
    public List<WebElement> deleteButtonsWebelement;

@FindBy(xpath = "//li")
    public List<WebElement> newtodosWebelement;


}
