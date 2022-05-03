package com.x_cart.mobile.testsuit;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    //object creation for different pages
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewArrivalPage newArrivalPage = new NewArrivalPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {

        //click on shipping  from homepage
        homePage.setShippingLink();
        String expShippingText = "Shipping";
        String actShippingText = shippingPage.setShippingText();
        //validate text
        Assert.assertEquals(actShippingText, expShippingText, "error");

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {

        //click on New  from homepage
        homePage.setNewLink();
        String expNewArrivalText = "New arrivals";
        String actNewArrivalText = newArrivalPage.setNewArrivalText();
        //validate text
        Assert.assertEquals(actNewArrivalText, expNewArrivalText, "error");
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {

        //click on Coming soon  from homepage
        homePage.setComingSoonLink();
        String expComingSoonText = "Coming soon";
        String actComingSoonText = comingSoonPage.setComingSoonText();
        //validate text
        Assert.assertEquals(actComingSoonText, expComingSoonText, "error");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        
       //click on contact us from homepage
        homePage.setContactUsLink();
        String expContactUSText = "Contact us";
        String actContactUsText = contactUsPage.setContactUsText();
        //validate text
        Assert.assertEquals(actContactUsText, expContactUSText, "error");

    }


}
