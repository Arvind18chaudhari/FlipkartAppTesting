package org.flipkart.pages;

import org.flipkart.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCartPage extends BaseClass {

    @FindBy(xpath = "//button//span[contains(text(),'Place Order')]")
    WebElement placeOrder;


    @FindBy(xpath = "//button[contains(text(),'+')]")
    WebElement addQty;

    @FindBy(xpath = "//button[contains(text(),'–')]//parent::div//input")
    WebElement setQty;

    @FindBy(xpath = "//div[contains(text(),'Total Amount')]/../parent::div//span//span")
    WebElement TotalAmount;

    public GoToCartPage(){
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        System.out.println("******* verifying go to cart page title *******");
        return driver.getTitle();
    }

    public void setAddOneQty(String no){
        System.out.println("******* setting qty : "+no+" *******");
        setQty.sendKeys(no);
        System.out.println("******* clicking on add qty *******");
        addQty.click();
    }

    public void getTotalAmount(){
        System.out.println(TotalAmount.getText());
    }
}
