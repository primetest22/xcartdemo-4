package com.x_cart.mobile.utility;

import com.x_cart.mobile.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;


public class Utility extends ManageDriver {

    public WebElement findElementsOnBrowser(By by) {
        WebElement element = driver.findElement(by);
        return element;
    }

    //clear text/digit from webpage
    public void keyboardClear(By by) {
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(by);
        element.clear();


    }

    // this method will click on element
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    //this method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //this method will send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /************** alerts methods *********************/
    //           this method will switch to alert
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    //          ACCEPT ALERT
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    //       DISMISS ALERT
    public void dismissAlert() {

        driver.switchTo().alert().dismiss();
    }

    //       GET TEXT FROM ALERT
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    //        SEND TEXT TO ALERT
    public void sendKeysToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    /******* select class methods ***********/

    //   This method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        // WebElement dropDown = driver.findElement(by);
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //         SELECT DROPDOWN BY VALUE
    public void selectByvalueDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);

    }

    //        SELECT DROP DOWN BY INDEX
    public void selectByIndexFromDropDown(By by, int index) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByIndex(index);
    }

    //         This method will select the option by contains text

    public void selectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }

    //*************************** Window Handle Methods ***************************************//

    //             This method will close all windows

    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    //            This method will switch to parent window

    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    //            This method will find that we switch to right window

    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

    //************      MOUSE METHODS                      *********/

    //               MOUSE HOVER
    public void mouseHover(By by) throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement mouseHover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHover).build().perform();
    }

    //            MOUSE HOVER CLICK
    public void mouseHoverAndClick(By by) throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement mouseHover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHover).click().build().perform();
    }

    //            DRAG AND DROP
    public void mouseDragAndDrop(By by1, By by2) {
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(by1);
        WebElement drop = driver.findElement(by2);

        actions.dragAndDrop(drag, drop).build().perform();

    }

    //           RIGHT CLICK
    public void mouseRightClick(By by1, By by2) {

        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(by1);
        actions.contextClick(button).build().perform();
        clickOnElement(by2);

    }

    //         SLIDE WITH MOUSE IN MIDDLE (ADJUST CODE AS NEEDED)
    public void slideWithMouse(By by1, By by2) {

        Actions actions = new Actions(driver);
        WebElement mainSlider = driver.findElement(by1);

        int width = mainSlider.getSize().width;
        int halfWidth = width / 2;

        WebElement slider = driver.findElement(by2);

        actions.dragAndDropBy(slider, halfWidth, 0).build().perform();

    }

    //******************************* Assert verify Methods *************************************************//

    public void verifyElements(String displayMessage, String expectedMessage, By by) {
        String actualMessage = getTextFromElement(by);
        //Assert.assertEquals(displayMessage, expectedMessage, actualMessage);
        //Assert


    }

    //************************** Waits Methods *********************************************//

    //       This method will use to wait until  VisibilityOfElementLocated

    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }


}








