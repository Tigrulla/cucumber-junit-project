package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyVerification {
    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on Etsy main page")
    public void user_is_on_etsy_main_page() {
        Driver.getDriver().get("https://www.etsy.com");
        Assert.assertEquals("title verification is failed", "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle());
    }


    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden spoon");

    }


    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchBtn.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        Assert.assertTrue("Title verification is failed", Driver.getDriver().getTitle().contains("Wooden spoon"));

    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKeyword) {
        etsyPage.searchBox.sendKeys(searchKeyword);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        Assert.assertTrue("Title verification is failed", Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
