package co.uk.motors.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleStep {
    WebDriver driver;

    @Given("i navigate to Motors.co.uk Homepage")
    public void i_navigate_to_Motors_co_uk_Homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://www.motors.co.uk/");

    }

    @Given("i input {string} into postcode field for buy")
    public void i_input_into_postcode_field_for_buy(String string) {

    }

    @Given("i select {string} for buy")
    public void i_select_for_buy(String string) {

    }

    @When("i click on Search")
    public void i_click_on_Search() {

    }

    @Then("search result page is displayed")
    public void search_result_page_is_displayed() {

    }

    @Given("i do not input {string} into postcode field for buy")
    public void i_do_not_input_into_postcode_field_for_buy(String string) {

    }

    @When("i should not be able click on Search")
    public void i_should_not_be_able_click_on_Search() {

    }

    @Then("a <\"Message\"> should be displayed")
    public void a_Message_should_be_displayed() {

    }



}
