package org.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{


    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement closeButton;



    public HomePage(){
        PageFactory.initElements(driver,this);
    }
}
