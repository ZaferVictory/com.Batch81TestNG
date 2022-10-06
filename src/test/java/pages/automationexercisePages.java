package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class automationexercisePages {
    public automationexercisePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
