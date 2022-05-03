package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivalPage extends Utility {

    By newArrivalText = By.xpath("//h1[@id='page-title']");

    public String setNewArrivalText() {
        return getTextFromElement(newArrivalText);
    }

}
