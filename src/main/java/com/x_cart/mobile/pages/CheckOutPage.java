package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends Utility {

    By yourAccText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By email = By.id("email");
    By checkout = By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckText = By.xpath("//h1[contains(text(),' Secure Checkout')]");
    By firsName = By.id("shippingaddress-firstname");
    By lastName = By.id("shippingaddress-lastname");
    By shipStreet = By.id("shippingaddress-street");
    By shipCity = By.id("shippingaddress-custom-state");
    By profile = By.id("create_profile");
    By password = By.id("password");
    By localShip = By.id("method128");
    By cod = By.xpath("//input[@id='pmethod6' and @name='methodId']");
    By total = By.xpath("//div[@class='total clearfix']//span[@class='surcharge-cell']");
    By clkPlaceOrder = By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']");
    By thanksOrderText = By.xpath("//h1[@id='page-title']");

    public String setThanksOrderText() {
        return getTextFromElement(thanksOrderText);
    }

    public void setClkPlaceOrder() {
        clickOnElement(clkPlaceOrder);
    }

    public String setTotal() {
        return getTextFromElement(total);
    }


    public void setCod() {
        clickOnElement(cod);
    }


    public void setLocalShip() {
        WebElement LocalShipping = findElementsOnBrowser(localShip);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", LocalShipping);
        //clickOnElement(localShip);
    }

    public void setPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void setProfile() {
        clickOnElement(profile);
    }

    public void setFirsName(String fstname) {
        sendTextToElement(firsName, fstname);
    }

    public void setLastName(String lstname) {
        sendTextToElement(lastName, lstname);
    }

    public void setShipStreet(String street) {
        sendTextToElement(shipStreet, street);
    }

    public void setShipCity(String city) {
        sendTextToElement(shipCity, city);
    }


    public String setSecureCheckText() {
        return getTextFromElement(secureCheckText);
    }

    public void setCheckout() {
        clickOnElement(checkout);
    }

    public void setEmail(String eml) {
        sendTextToElement(email, eml);
    }

    public String setYourAccText() {
        return getTextFromElement(yourAccText);
    }


}
