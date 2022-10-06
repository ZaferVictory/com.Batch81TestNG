package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){// Constructer olusturup public yapmamız gerekır
        PageFactory.initElements(Driver.getDriver(),this);// bu class dakı driver driver classındakı driver dır dedı
                                                                // bu class dakı anlamına gelıyor

    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small'])")
    public WebElement aramaSonucuWE;


}
