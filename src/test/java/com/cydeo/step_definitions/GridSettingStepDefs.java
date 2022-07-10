package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackHomePage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VytrackVehiclePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class GridSettingStepDefs {

    Actions actions = new Actions(Driver.getDriver());
    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackHomePage vyTrackHomePage = new VyTrackHomePage();
    VytrackVehiclePage vytrackVehiclePage = new VytrackVehiclePage();


    @Given("User is logged under vehicle feature module")
    public void userIsLoggedUnderVehicleFeatureModule() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        vyTrackLoginPage.login(ConfigurationReader.getProperty("vytrack.user34"), ConfigurationReader.getProperty("vytrack.password"));
        BrowserUtils.waitFor(3);
        actions.moveToElement(vyTrackHomePage.fleetModule).perform();
        BrowserUtils.waitFor(3);
        vyTrackHomePage.vehicleFeature.click();

    }

    @Then("User should see Grid setting on the right side of reset button")
    public void userShouldSeeGridSettingOnTheRightSideOfResetButton() {
        vytrackVehiclePage.ifButtonOnTheRight("Reset", "Grid Settings");
    }

    @Then("User sees Grid setting button on the right of the page")
    public void userSeesGridSettingButtonOnTheRightOfThePage() {

        Point location = Driver.getDriver().findElement(By.xpath("//a[@title='Reset']")).getLocation();
        System.out.println(location);

        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
        int xPos = Driver.getDriver().findElement(By.xpath("//a[@title='Reset']")).getLocation().getX();

        Assert.assertTrue("location verification failed", xPos > winWidth / 2);

    }
}
