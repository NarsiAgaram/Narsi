package com.rsc.tech.test.pages;

import com.rsc.tech.test.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DriverManager {

    @FindBy(css = ".add-to-basket-container .btn-add-to-basket")
    private WebElement basketBtn;

    @FindBy(css = ".cart-added.page-cart-added>button")
    private WebElement viewBasketBtn;

    public void addToBasket() {
        basketBtn.click();
    }

    public void goToBasket() {
        waitForElementToBeClickAble(viewBasketBtn);
        viewBasketBtn.click();
    }
}
