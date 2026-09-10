package com.qa.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;

public class SauceDemoTests extends BaseTest {
    private void validLogin(){ new LoginPage(driver).login("standard_user","secret_sauce"); }
    @Test public void validLoginTest(){ validLogin(); Assert.assertTrue(new ProductsPage(driver).isDisplayed()); }
    @Test public void invalidLoginTest(){ LoginPage login = new LoginPage(driver); login.login("standard_user","wrong_password"); Assert.assertTrue(login.isErrorDisplayed()); }
    @Test public void sortProductsTest(){ validLogin(); ProductsPage p = new ProductsPage(driver); p.sortLowToHigh(); Assert.assertTrue(p.isDisplayed()); }
    @Test public void addProductToCartTest(){ validLogin(); ProductsPage p = new ProductsPage(driver); p.addBackpack(); p.openCart(); Assert.assertTrue(driver.getCurrentUrl().contains("cart")); }
    @Test public void logoutTest(){ validLogin(); ProductsPage p = new ProductsPage(driver); p.logout(); Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com")); }
}
