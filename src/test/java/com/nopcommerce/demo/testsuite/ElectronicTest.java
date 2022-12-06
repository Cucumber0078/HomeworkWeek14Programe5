package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ElectronicTest extends BaseTest {
    Electronics electronics = new Electronics();
    @Test
            public void ashismor() throws InterruptedException {
        electronics.clickOnElectronicsMenuAndCellPhone();
        Assert.assertEquals(electronics.getCellPhoneText(), "Cell phones", "Not Matching");
        electronics.clickOnListTab();
        electronics.clickOnNokiaLumia1020();
        Assert.assertEquals(electronics.getNokiaLumiaText(),"Nokia Lumia 1020", "Text Not Matching");
        Assert.assertEquals(electronics.getPriceForNokiaLumia(),"$349.00","Price Not Matching");
        electronics.updateQuantityTo2();
        electronics.setAddToCart();
        Assert.assertEquals(electronics.getAddedToCartMessage(),"The product has been added to your shopping cart","Not Matching");
        electronics.closePopUpMessage();
        electronics.clickOnGoToCart();
        Assert.assertEquals(electronics.shoppingCartMessage(),"Shopping cart","Not Matching");



}}
