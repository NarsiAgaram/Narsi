package com.rsc.tech.test.pages;

import com.rsc.tech.test.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(id = "searchTerm")
    private WebElement searchTxt;

    @FindBy(id = "btnSearch")
    private WebElement searchBtn;

    public static String searchedItem;

    public String isUserOnHomePage(){
       return driver.getCurrentUrl();
    }

    public void SearchProduct(String item){
        searchedItem=item;
        searchTxt.sendKeys(item);
        searchBtn.click();
    }
}
