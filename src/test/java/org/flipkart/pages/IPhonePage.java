package org.flipkart.pages;

import org.flipkart.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class IPhonePage extends BaseClass {


    public IPhonePage(){
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        System.out.println("******* verifying Iphone 13 page title *******");
        return driver.getTitle();
    }
}
