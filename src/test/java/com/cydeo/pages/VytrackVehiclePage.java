package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackVehiclePage {

    public VytrackVehiclePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;


    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingBtn;


    //userShouldSeeGridSettingOnTheRightSideOfResetButton

    public boolean ifButtonOnTheRight(String btnOne, String btnTwo) {
        boolean check = false;
        String xpath = "";
        xpath = "//a[@title='Reset']/..//preceding-sibling::a[@title='Grid Settings']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        if (element.isDisplayed()) {
            check = true;
        }
        return check;
    }



}
