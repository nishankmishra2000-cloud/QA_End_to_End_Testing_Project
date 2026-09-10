package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
    private final WebDriver driver;
    private final By title = By.cssSelector(".title");
    private final By sort = By.className("product_sort_container");
    private final By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private final By cart = By.className("shopping_cart_link");
    private final By menu = By.id("react-burger-menu-btn");
    private final By logout = By.id("logout_sidebar_link");
    public ProductsPage(WebDriver driver){this.driver=driver;}
    public boolean isDisplayed(){return driver.findElement(title).isDisplayed();}
    public void sortLowToHigh(){new Select(driver.findElement(sort)).selectByValue("lohi");}
    public void addBackpack(){driver.findElement(backpack).click();}
    public void openCart(){driver.findElement(cart).click();}
    public void logout(){driver.findElement(menu).click(); driver.findElement(logout).click();}
}
