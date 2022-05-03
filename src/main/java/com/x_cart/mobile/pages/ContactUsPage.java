package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {

    By contactUsText = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(text(),'Contact us')]");

    public String setContactUsText() {
        return getTextFromElement(contactUsText);
    }
}
