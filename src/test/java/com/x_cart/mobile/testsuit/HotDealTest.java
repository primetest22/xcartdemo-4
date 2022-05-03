package com.x_cart.mobile.testsuit;

import com.x_cart.mobile.pages.BestsellerProductsPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SaleProductsPage;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealTest extends TestBase {
    //objects created
    HomePage homePage = new HomePage();
    SaleProductsPage saleProductsPage = new SaleProductsPage();
    BestsellerProductsPage bestsellerProductsPage = new BestsellerProductsPage();


    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //mouse hover on hot deals
        homePage.setHotDealLink();
        Thread.sleep(1500);
        //mouse hover sale link
        homePage.setSaleLink();
        //validate sale text
        String expSaleProductText = "Sale";
        String actSaleProductText = saleProductsPage.setSaleText();
        Assert.assertEquals(actSaleProductText, expSaleProductText, "error");
        saleProductsPage.setRecommendedArrow();
        //select option Name A - Z
        saleProductsPage.setSelectAtoZ();
        //validate products displayed alphabetically
        String expAtoZText = "Name A - Z";
        String actAtoZText = saleProductsPage.setAtozText();
        Assert.assertEquals(actAtoZText, expAtoZText, "error");

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //click on hot deal
        homePage.setHotDealLink();
        Thread.sleep(1500);
        //click on sale link
        homePage.setSaleLink();
        //validate text sale
        String expSaleProductText = "Sale";
        String actSaleProductText = saleProductsPage.setSaleText();
        Assert.assertEquals(actSaleProductText, expSaleProductText, "error");
        saleProductsPage.setRecommendedArrow();
        //select option price low high from dropdown
        saleProductsPage.setLowHigh();
        String explHText = "Price Low - High";
        String actlHText = saleProductsPage.setLowHighText();
        Assert.assertEquals(actlHText, explHText, "error");

    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {

        //click on hot deals
        homePage.setHotDealLink();
        Thread.sleep(1500);

        //select sale from dropdown
        homePage.setSaleLink();

        //validate text sale
        String expSaleProductText = "Sale";
        String actSaleProductText = saleProductsPage.setSaleText();
        Assert.assertEquals(actSaleProductText, expSaleProductText, "error");
        saleProductsPage.setRecommendedArrow();
        
        //validate products displayed where highest ratings products are first
        saleProductsPage.setByRates();
        String expRateText = "Rates";
        String actRateText = saleProductsPage.setByRatesText();
        Assert.assertEquals(actRateText, expRateText, "error");

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

        homePage.setHotDealLink();
        Thread.sleep(1500);
        homePage.setBookSellerLink();
        String expBookProductText = "Bestsellers";
        String actBookProductText = bestsellerProductsPage.setBooksellerText();
        Assert.assertEquals(actBookProductText, expBookProductText, "error");
        bestsellerProductsPage.setSalerrow();
        bestsellerProductsPage.setSelectZtoA();
        String expZtoAText = "Name Z - A";
        String actZtoAText = bestsellerProductsPage.setZtoAText();
        Assert.assertEquals(actZtoAText, expZtoAText, "error");

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {

        homePage.setHotDealLink();
        Thread.sleep(1500);
        homePage.setBookSellerLink();
        String expBookProductText = "Bestsellers";
        String actBookProductText = bestsellerProductsPage.setBooksellerText();
        Assert.assertEquals(actBookProductText, expBookProductText, "error");
        bestsellerProductsPage.setSalerrow();
        bestsellerProductsPage.setByHilo();
        String exphLText = "Price High - Low";
        String acthLText = bestsellerProductsPage.setHighLowText();
        Assert.assertEquals(acthLText, exphLText, "error");

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

        homePage.setHotDealLink();
        Thread.sleep(1500);
        homePage.setBookSellerLink();
        String expBookProductText = "Bestsellers";
        String actBookProductText = bestsellerProductsPage.setBooksellerText();
        Assert.assertEquals(actBookProductText, expBookProductText, "error");
        bestsellerProductsPage.setSalerrow();
        bestsellerProductsPage.setByRates();
        String expRateText = "Rates";
        String actRateText = saleProductsPage.setByRatesText();
        Assert.assertEquals(actRateText, expRateText, "error");

    }

}
