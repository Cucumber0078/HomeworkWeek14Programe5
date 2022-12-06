package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersPageTest extends BaseTest {


    ComputersPage computerPage = new ComputersPage();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computerPage.clickOnComputerAndDesktop();
        computerPage.selectZtoAFromDropDown();
        Assert.assertEquals(computerPage.gettingListOfProduct(),computerPage.gettingListBeforeSorting(),"");
    }


}