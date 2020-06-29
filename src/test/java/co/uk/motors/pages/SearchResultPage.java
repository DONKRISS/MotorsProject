package co.uk.motors.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(tagName = "h3")
    private List<WebElement> results;

    public  void isResultListDisplayed()
    {
        Assert.assertTrue(results.size()>0);
    }

    public ProductDetailPage clickOnAnyResultLink()
    {
      //  results.get(6).click();
        Random random=new Random();
        int result = random.nextInt(results.size()-1);
        results.get(result).click();
        return new ProductDetailPage(driver);
    }

}
