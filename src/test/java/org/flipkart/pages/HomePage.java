package org.flipkart.pages;

import org.flipkart.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement closeButton;

    @FindBy(name = "q")
    WebElement searchText;

    @FindBy(xpath = "//div[contains(text(),'APPLE iPhone 13 (Blue, 128 GB)')]")
    WebElement iPhone13;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void setCloseButton(){
        closeButton.click();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void setSearchText(String searchText){
        this.searchText.sendKeys(searchText);
        this.searchText.submit();
    }

    public boolean isIphone13Displayed(){
        return iPhone13.isDisplayed();
    }
}
