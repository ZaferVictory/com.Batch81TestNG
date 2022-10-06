package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {
    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(),this);// Driver.getDriver() 'ı PageFactory metodu sayesınde
                                                                // ve this ıle bu class ıle ılıskılendırdım.
                                                        //thıs>>  PageFactory' nın olmazsa olmazı
    }
    //baskentler
    @FindBy(xpath="//*[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//*[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//*[@id='box3']")
    public WebElement washington;

    @FindBy(xpath = "//*[@id='box4']")
    public WebElement copenhagen;

    @FindBy(xpath = "//*[@id='box5']")
    public WebElement seoul;

    @FindBy(xpath = "//*[@id='box6']")
    public  WebElement rome;

    @FindBy(xpath = "//*[@id='box7']")
    public WebElement madrid;



    //country>> ulkeler
    @FindBy(xpath = "//*[@id='box106']")
    public WebElement ıtaly;

    @FindBy(xpath = "//*[@id='box107']")
    public WebElement spaın;

    @FindBy(xpath = "//*[@id='box101']")
    public WebElement norvay;

    @FindBy(xpath = "//*[@id='box104']")
    public WebElement denmark;

    @FindBy(xpath = "//*[@id='box105']")
    public WebElement southcorea;

    @FindBy(xpath = "//*[@id='box102']")
    public WebElement sweden;

    @FindBy(xpath = "//*[@id='box103']")
    public WebElement unıtedstates;



}
