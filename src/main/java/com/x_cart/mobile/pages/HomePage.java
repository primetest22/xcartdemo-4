package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By shippingLink = By.xpath("//ul[@class ='nav navbar-nav top-main-menu']/descendant::span[contains(text(),'Shipping')]");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(text(),'New!')]");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(text(),'Coming soon')]");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(text(),'Contact us')]");
    By hotDealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/span[normalize-space()='Hot deals']");
    By saleLink = By.xpath("//div[@class='collapse navbar-collapse']//following::ul[2]/li[@class='leaf']/a[@href='sale_products/']/span");
    By bookSellerLink = By.linkText("Bestsellers");


    public void setBookSellerLink() throws InterruptedException {
        mouseHoverAndClick(bookSellerLink);
    }

    public void setSaleLink() throws InterruptedException {
        mouseHoverAndClick(saleLink);
    }

    public void setHotDealLink() throws InterruptedException {
        mouseHover(hotDealLink);
    }

    public void setContactUsLink() {
        clickOnElement(contactUsLink);
    }

    public void setComingSoonLink() {
        clickOnElement(comingSoonLink);
    }

    public void setNewLink() {
        clickOnElement(newLink);
    }

    public void setShippingLink() {
        clickOnElement(shippingLink);
    }


}
