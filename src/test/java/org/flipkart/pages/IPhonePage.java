package org.flipkart.pages;

import org.flipkart.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IPhonePage extends BaseClass {

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//button[contains(text(),'BUY NOW')]")
    WebElement buyNowButton;

    @FindBy(xpath = "//button[contains(text(),'GO TO CART')]")
    WebElement goToCartButton;


    public IPhonePage(){
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        System.out.println("******* verifying Iphone 13 page title *******");
        return driver.getTitle();
    }

    public boolean goToCartIsNotDisplayed(){
        System.out.println("********* verifying go to cart Button **********");
        return goToCartButton.isDisplayed();
    }

    public boolean addToCartIsDisplayed(){
        System.out.println("********* verifying add to cart Button **********");
        return addToCartButton.isDisplayed();
    }
}
