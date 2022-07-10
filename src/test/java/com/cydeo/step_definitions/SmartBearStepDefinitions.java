package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User logged in SmartBear Tester account with username {string} and password {string} and on Order page")
    public void user_logged_in_smart_bear_tester_account_with_username_and_password_and_on_order_page(String userName, String password) {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return\n" +
                "Url=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
        smartBearPage.login(userName, password);
    }

    @When("User fills out all required forms as followed")
    public void user_fills_out_all_required_forms_as_followed() {
        smartBearPage.orderTab.click();
    }

    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {

        Select select = new Select(smartBearPage.productDropDown);
        select.selectByValue("FamilyAlbum");
    }

    @When("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBearPage.productQuantity.sendKeys(quantity);
    }

    @When("User enters {string} to costumer name")
    public void userEntersToCostumerName(String customerName) {
        smartBearPage.customerName.sendKeys(customerName);
    }

    @When("User enters {string} to street")
    public void userEntersToStreet(String streetName) {
        smartBearPage.streetName.sendKeys(streetName);
    }

    @When("User enters {string} to city")
    public void userEntersToCity(String cityName) {
        smartBearPage.cityName.sendKeys(cityName);
    }

    @When("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBearPage.stateName.sendKeys(state);
    }

    @When("User enters {string} for zip code")
    public void userEntersForZipCode(String zipCode) {
        smartBearPage.zipCode.sendKeys(zipCode);
    }

    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.cardTypeVisa.click();
    }

    @When("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        smartBearPage.cardNumberInput.sendKeys(cardNumber);
    }

    @When("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String expirationDate) {
        smartBearPage.expirationDate.sendKeys(expirationDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.process.click();
    }

    @And("User clicks view all orders")
    public void userClicksViewAllOrders() {
        smartBearPage.viewAllOrders.click();
    }

    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        Assert.assertTrue(smartBearPage.customerNameFromOrders.getText().contains("John Wick"));
    }

}
