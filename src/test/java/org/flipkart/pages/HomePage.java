package org.flipkart.pages;

import org.flipkart.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class HomePage extends BaseClass {
    static String parent;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement closeButton;

    @FindBy(name = "q")
    WebElement searchText;

    @FindBy(xpath = "//div[contains(text(),'APPLE iPhone 13 (Blue, 128 GB)')]")
    WebElement iPhone13;

    public HomePage(){
        PageFactory.initElements(driver,this);
        System.out.println("********** Home Page initiated **********");
    }

    public void setCloseButton(){
        closeButton.click();
        System.out.println("********** Pop up closed **********");
    }

    public String getPageTitle(){
        System.out.println("********** Verifying title **********");
        return driver.getTitle();
    }

    public void setSearchText(String searchText){
        this.searchText.sendKeys(searchText);
        this.searchText.submit();
        System.out.println("********** "+searchText+" entered **********");
    }

    public boolean isIphone13Displayed(){
        System.out.println("********** Verifying iphone13 **********");
        return iPhone13.isDisplayed();
    }

    public IPhonePage clickOnIphone13(){
        System.out.println("******** clicking on Iphone 13 blue model *******");
        parent = driver.getWindowHandle();
        iPhone13.click();
        Set<String> set = driver.getWindowHandles();
        for (String s: set) {
            if(!s.equalsIgnoreCase(parent)){
                driver.switchTo().window(s);
            }
        }
        return new IPhonePage();
    }
}
