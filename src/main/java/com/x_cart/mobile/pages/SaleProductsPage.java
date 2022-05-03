package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SaleProductsPage extends Utility {

    By saleText = By.id("page-title");
    By recommendedArrow = By.xpath("//span[contains(text(),'Recommended')]");
    By selectAtoZ = By.xpath("//div[@class='sort-box']/ul/li[5]/a[normalize-space()='Name A - Z']");
    By AtozText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By lowHigh = By.partialLinkText("Price Low - Hi");
    By lowHighText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By byRates = By.partialLinkText("Rates");
    By byRatesText = By.xpath("//span[contains(text(),'Rates')]");

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

    public String setAtozText() {
        return getTextFromElement(AtozText);
    }

    public void setSelectAtoZ() throws InterruptedException {
        mouseHoverAndClick(selectAtoZ);
    }

    public void setRecommendedArrow() throws InterruptedException {
        mouseHover(recommendedArrow);
    }

    public String setSaleText() {
        return getTextFromElement(saleText);
    }


}