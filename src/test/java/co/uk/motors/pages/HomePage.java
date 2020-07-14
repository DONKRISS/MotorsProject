package co.uk.motors.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "PostCode")
    private WebElement searchField;

    public void enterPostcode(String postcode )
    {
        searchField.clear();
        searchField.sendKeys(postcode);
    }

    @FindBy(id = "Make")
    private WebElement carMake;

    public void selectCarType(String carMakes)
    {
        selectElementByVisibleText(carMake,carMakes);
    }

   @FindBy(id = "Model")
    private WebElement carmodels;

     public void  selectCarModel(String carmodel)
     {
         selectElementByVisibleText(carmodels,carmodel);
     }


@FindBy(id="MinPrice")
    private WebElement minPrice;

     public void  selectMinPrice(String minimumPrice)
     {
         selectElementByVisibleText(minPrice,minimumPrice);
     }

    @FindBy(id="MaxPrice")
    private WebElement maxPrice;

    public void  selectMaxPrice(String maximumPrice)
    {
        selectElementByVisibleText(maxPrice,maximumPrice);
    }

    @FindBy(className = "sp__btn-count")
    private WebElement searchButton;

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public void isSubmitButtonEnabled()
    {
        Assert.assertTrue(searchButton.isEnabled());

    }

    @FindBy(css = ".btn.btn--3rd.btn--ghost.adv")
    private WebElement moreOptionButton;
    public void   clickOnMoreOptionButton()
    {
        moreOptionButton.click();
    }












}
