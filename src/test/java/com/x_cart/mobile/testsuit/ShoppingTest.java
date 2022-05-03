package com.x_cart.mobile.testsuit;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    //object creation
    HomePage homePage = new HomePage();
    BestsellerProductsPage bestsellerProductsPage = new BestsellerProductsPage();
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForIphone5s() throws InterruptedException {
        //click on hotdeal
        homePage.setHotDealLink();
        Thread.sleep(1500);

        //click on bestsellers
        homePage.setBookSellerLink();
        String expBookProductText = "Bestsellers";
        String actBookProductText = bestsellerProductsPage.setBooksellerText();
        Assert.assertEquals(actBookProductText, expBookProductText, "error");
        bestsellerProductsPage.setSalerrow();

        //products displayed high to low price
        bestsellerProductsPage.setByHilo();
        Thread.sleep(1500);

        //add iphone 5s to cart
        bestsellerProductsPage.setMouseonPhone();
        bestsellerProductsPage.setClkAddCart();
        String expCartText = "Product has been added to your cart";
        String actCartText = bestsellerProductsPage.setCartText();
        Assert.assertEquals(actCartText, expCartText, "error");
        bestsellerProductsPage.setCloseX();
        bestsellerProductsPage.setYourCart();
        Thread.sleep(1500);
        bestsellerProductsPage.setViewCart();

        //validate product is in the cart
        String expItemText = "Your shopping cart - 1 item";
        String actItemText = cartPage.setItemCart();
        Assert.assertEquals(actItemText, expItemText, "error");

        //validate subtotal
        String expSubTotalText = "Subtotal: $299.00";
        String actSubTotalText = cartPage.setSubTotal();
        Assert.assertEquals(actSubTotalText, expSubTotalText, "error");

        //validate total
        String expTotalText = "$309.73";
        String actTotalText = cartPage.setTotal();
        Assert.assertEquals(actTotalText, expTotalText, "error");

        //click on checkout button
        cartPage.setClkCheckout();

        String expYourAccText = "Log in to your account";
        String actYourAccText = checkOutPage.setYourAccText();
        Assert.assertEquals(actYourAccText, expYourAccText, "error");
        checkOutPage.setEmail("abc12112@yahoo.com");
        checkOutPage.setCheckout();

        String expSecureText = "Secure Checkout";
        String actSecureText = checkOutPage.setSecureCheckText();
        Assert.assertEquals(actSecureText, expSecureText, "error");

        //fill all mandatory fields for checkout
        checkOutPage.setFirsName("amd");
        checkOutPage.setLastName("guj");
        checkOutPage.setShipStreet("jdkfjdkjf");
        checkOutPage.setShipCity("jkdjfkj");
        Thread.sleep(5000);

        checkOutPage.setProfile();
        Thread.sleep(3000);
        checkOutPage.setPassword("password123");
        Thread.sleep(5000);
        checkOutPage.setLocalShip();
        Thread.sleep(5000);
        checkOutPage.setCod();

        //validate total
        String expTotal2Text = "$311.03";
        String actTotal2Text = checkOutPage.setTotal();
        Assert.assertEquals(actTotal2Text, expTotal2Text, "error");
        Thread.sleep(3000);

        //click on place order button
        checkOutPage.setClkPlaceOrder();

        //validate order confirmed
        String expThanksText = "Thank you for your order";
        String actThanksText = checkOutPage.setThanksOrderText();
        Assert.assertEquals(actThanksText, expThanksText, "error");

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        homePage.setHotDealLink();
        Thread.sleep(1500);
        homePage.setBookSellerLink();
        String expBookProductText = "Bestsellers";
        String actBookProductText = bestsellerProductsPage.setBooksellerText();
        Assert.assertEquals(actBookProductText, expBookProductText, "error");
        bestsellerProductsPage.setSalerrow();

        //arranged products from a to z
        bestsellerProductsPage.setSelectAtoZ();
        Thread.sleep(3000);

        bestsellerProductsPage.setMouseonGhostbusters();

        //click on ghost buster product
        bestsellerProductsPage.setClkAddCartGhost();
        String expCartText = "Product has been added to your cart";
        String actCartText = bestsellerProductsPage.setCartText();
        Assert.assertEquals(actCartText, expCartText, "error");
        bestsellerProductsPage.setCloseX();
        bestsellerProductsPage.setYourCart();
        Thread.sleep(1500);
        bestsellerProductsPage.setViewCart();

        //validate product is in cart
        String expItemText = "Your shopping cart - 1 item";
        String actItemText = cartPage.setItemCart();
        Assert.assertEquals(actItemText, expItemText, "error");

        cartPage.setEmptyCartLink();

        //validate alert text
        String alerText = getTextFromAlert();
        Assert.assertEquals(alerText,"Are you sure you want to clear your cart?","error");

        //accept alert
        acceptAlert();

        String expDelCartText = "Item(s) deleted from your cart";
        String actDelCartText = cartPage.setDeleteCartText();
        Assert.assertEquals(actDelCartText, expDelCartText, "error");

        cartPage.setCloseX();
        Thread.sleep(3000);
        
        //validate cart is empty
        String expCartEmptyText = "Your cart is empty";
        String actCartEmptyText = cartPage.setCartEmptyText();
        Assert.assertEquals(actCartEmptyText, expCartEmptyText, "error");

    }

}
