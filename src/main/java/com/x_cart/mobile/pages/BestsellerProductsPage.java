package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestsellerProductsPage extends Utility {

    By BookSellerText = By.id("page-title");
    By saleArrow = By.xpath("//span[contains(text(),'Sales')]");
    By selectZtoA = By.xpath("//div[@class='sort-box']/ul/li[5]/a[normalize-space()='Name Z - A']");
    By selectAtoZ = By.partialLinkText("Name A -");
    By ZtoAText = By.xpath("//span[contains(text(),'Name Z - A')]");

    By lowHigh = By.partialLinkText("Price Low - Hi");
    By lowHighText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By HighLowText = By.xpath("//span[contains(text(),'Price High - Low')]");
    By byRates = By.partialLinkText("Rates");
    By byRatesText = By.xpath("//span[contains(text(),'Rates')]");
    By byHilo = By.partialLinkText("Price High - L");
    By mouseonPhone = By.xpath("//img[@alt='iPhone 5S']");
    By mouseonGhostbusters = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By clkAddCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By clkAddCartGhost = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By cartText = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeX = By.xpath("//a[@class='close']");
    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//span[contains(text(),'View cart')]");

    public void setClkAddCartGhost() {
        clickOnElement(clkAddCartGhost);
    }

    public void setViewCart() {
        clickOnElement(viewCart);
    }

    public void setYourCart() {
        clickOnElement(yourCart);
    }

    public void setCloseX() {
        clickOnElement(closeX);
    }

    public String setCartText() {
        return getTextFromElement(cartText);
    }

    public void setClkAddCart() {
        clickOnElement(clkAddCart);
    }

    public void setMouseonPhone() throws InterruptedException {
        mouseHover(mouseonPhone);
    }

    public void setMouseonGhostbusters() throws InterruptedException {
        mouseHover(mouseonGhostbusters);
    }

    public void setByHilo() throws InterruptedException {
        mouseHoverAndClick(byHilo);
    }

    public String setHighLowText() {
        return getTextFromElement(HighLowText);
    }

    public String setByRatesText() {
        return getTextFromElement(byRatesText);
    }

    public void setByRates() throws InterruptedException {
        mouseHoverAndClick(byRates);
    }

    public String setLowHighText() {
        return getTextFromElement(lowHighText);
    }

    public void setLowHigh() throws InterruptedException {
        mouseHoverAndClick(lowHigh);
    }

    public String setZtoAText() {
        return getTextFromElement(ZtoAText);
    }

    public void setSelectZtoA() throws InterruptedException {
        mouseHoverAndClick(selectZtoA);
    }

    public void setSelectAtoZ() throws InterruptedException {
        mouseHoverAndClick(selectAtoZ);
    }

    public void setSalerrow() throws InterruptedException {
        mouseHover(saleArrow);
    }

    public String setBooksellerText() {
        return getTextFromElement(BookSellerText);
    }


}