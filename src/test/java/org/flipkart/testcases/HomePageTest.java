package org.flipkart.testcases;

import org.flipkart.base.BaseClass;
import org.flipkart.pages.GoToCartPage;
import org.flipkart.pages.HomePage;
import org.flipkart.pages.IPhonePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    @Test
    public void test(){
        HomePage homePage = new HomePage();
        homePage.setCloseButton();
        Assert.assertEquals(homePage.getPageTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
        homePage.setSearchText("iphone 13");
        Assert.assertTrue(homePage.isIphone13Displayed());
        IPhonePage iPhonePage = homePage.clickOnIphone13();
        Assert.assertEquals(iPhonePage.getTitle(),"APPLE iPhone 13 ( 128 GB GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com");
        Assert.assertFalse(iPhonePage.goToCartIsNotDisplayed());
        Assert.assertTrue(iPhonePage.addToCartIsDisplayed());
        GoToCartPage goToCartPage = iPhonePage.clickOnAddToCartButton();
        Assert.assertEquals(goToCartPage.getTitle(),"Shopping Cart | Flipkart.com");
        goToCartPage.setAddOneQty("2");
        goToCartPage.getTotalAmount();

    }
}
