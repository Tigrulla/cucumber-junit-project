package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VyTrackHomePage {

    public VyTrackHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "//span[@class='title title-level-1']")
//    public List<WebElement> allModules;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']//span[contains(text(),'Fleet')]")
    public WebElement fleetModule;

    @FindBy(xpath = "//li[@class='dropdown-menu-single-item first']//span[text()='Vehicles']")
    public WebElement vehicleFeature;

    @FindBy(css = "#user-menu>a")
    public WebElement username;


}