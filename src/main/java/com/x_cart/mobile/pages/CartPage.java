package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {

    By itemCart = By.xpath("//h1[@id='page-title']");
    By subTotal = By.xpath("//ul[@class='sums']//li[@class='subtotal']");
    By total = By.xpath("//ul[@class='totals']//li[@class='total']//span[@class='surcharge-cell']");
    By clkCheckout = By.xpath("//span[contains(text(),'Go to checkout')]");
    By emptyCartLink = By.xpath("//a[contains(text(),'Empty your cart')]");
    By deleteCartText = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By closeX = By.xpath("//div[@id='status-messages']//a");
    By cartEmptyText = By.xpath("//h1[contains(text(),'Your cart is empty')]");

    public String setCartEmptyText() {
        return getTextFromElement(cartEmptyText);
    }

    public void setCloseX() {
        clickOnElement(closeX);
    }

    public String setDeleteCartText() {
        return getTextFromElement(deleteCartText);
    }

    public void setEmptyCartLink() {
        clickOnElement(emptyCartLink);
    }

    public void setClkCheckout() {
        clickOnElement(clkCheckout);
    }

    public String setItemCart() {
        return getTextFromElement(itemCart);
    }

    public String setSubTotal() {
        return getTextFromElement(subTotal);
    }

    public String setTotal() {
        return getTextFromElement(total);
    }


}
