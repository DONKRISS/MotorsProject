package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;
import co.uk.motors.pages.HomePage;
import co.uk.motors.pages.ProductDetailPage;
import co.uk.motors.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ForSaleStep extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);
    ProductDetailPage productDetailPage = PageFactory.initElements(driver,ProductDetailPage.class);
    //WebDriver driver;

    @Given("i navigate to Motors.co.uk Homepage")
    public void i_navigate_to_Motors_co_uk_Homepage() {
        launchUrl();

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        driver.navigate().to("https://www.motors.co.uk/");

    }

    @Given("i enter {string} into postcode field for buy")
    public void i_enter_into_postcode_field_for_buy(String postcode) {
        homePage.enterPostcode(postcode);

    }

    @Given("i select {string} for buy")
    public void i_select_for_buy(String carmake) {
        homePage.selectCarType(carmake);

    }

    @Given("i select {string}")
    public void i_select(String carmodels) {
    homePage.selectCarModel(carmodels);
    }

    @Given("i select {string} at for sell")
    public void i_select_at_for_sell(String miniPrice) {
    homePage.selectMinPrice(miniPrice);
    }

    @Given("i select {string} in for sell")
    public void i_select_in_for_sell(String maxPrice) {
    homePage.selectMaxPrice(maxPrice);
    }

    @When("i click on more options on the page")
    public void i_click_on_more_options_on_the_page() {
        homePage.clickOnMoreOptionButton();
    }

    @When("i click on Search")
    public void i_click_on_Search() {
        searchResultPage = homePage.clickOnSearchButton();

    }
    @When("search result page is displayed")
    public void search_result_page_is_displayed() {
        searchResultPage.isResultListDisplayed();

    }

    @Then("i click on one of the results to view its detail")
    public void i_click_on_one_of_the_results_to_view_its_detail() {
        productDetailPage=searchResultPage.clickOnAnyResultLink();

    }




//    @Given("i do not input {string} into postcode field for buy")
//    public void i_do_not_input_into_postcode_field_for_buy(String errormessage) {
//      homePage.selectErrorMessage(errormessage);
//    }

    @When("i should not be able click on Search")
    public void i_should_not_be_able_click_on_Search() {

    }

    @Then("a {string} should be displayed")
    public void a_Message_should_be_displayed() {

    }


    @Given("i do not input {string} into postcode field for buy")
    public void i_do_not_input_into_postcode_field_for_buy(String string) {

    }




    @When("i select colors")
    public void i_select_colors() {

    }




}
